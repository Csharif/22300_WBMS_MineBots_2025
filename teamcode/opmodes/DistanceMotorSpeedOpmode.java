package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard7;

@Disabled
@TeleOp()
public class DistanceMotorSpeedOpmode extends OpMode {
    ProgrammingBoard7 board = new ProgrammingBoard7();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        double distanceCM = board.getDistance(DistanceUnit.CM);

        // Stop motor once distance detected less than 10cm
        if (distanceCM < 10.0){
            board.setMotorSpeed(0.0);
        } else {
            board.setMotorSpeed(0.5);
        }
        telemetry.addData("Distance (CM)", distanceCM);
        //telemetry.addData("Distance (IN)", board.getDistance(DistanceUnit.INCH));
    }
}
