package org.firstinspires.ftc.teamcode.solutions;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard8;
@Disabled
@Autonomous()
public class AutoMotorTime extends OpMode {
    enum State {
        START,
        QTR_SPEED,
        HALF_SPEED,
        THREE_QTR_SPEED,
        FULL_SPEED,
        DONE
    }
    ProgrammingBoard8 board = new ProgrammingBoard8();
    State state = State.START;
    double lastStepTime;

    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void start(){
        state = State.START;
    }

    @Override
    public void loop(){
        telemetry.addData("State", state);


        switch (state){
            case START:
                board.setMotorSpeed(0.250);
                state = State.QTR_SPEED;
                lastStepTime = getRuntime();
                break;
            case QTR_SPEED:
                if(getRuntime() >= lastStepTime + .500) {
                    board.setMotorSpeed(0.5);
                    state = State.HALF_SPEED;
                    lastStepTime = getRuntime();
                }
                break;
            case HALF_SPEED:
                if(getRuntime() >= lastStepTime + .500) {
                    board.setMotorSpeed(0.75);
                    state = State.THREE_QTR_SPEED;
                    lastStepTime = getRuntime();
                }
                break;
            case THREE_QTR_SPEED:
                if(getRuntime() >= lastStepTime + .500) {
                    board.setMotorSpeed(1.0);
                    state = State.FULL_SPEED;
                }
                break;
            case FULL_SPEED:
                if(board.isTouchSensorPressed()) {
                    board.setMotorSpeed(0.0);
                    state = State.DONE;
                }
                break;
            default:
                telemetry.addData("Auto", "Finished");
        }
    }
}
