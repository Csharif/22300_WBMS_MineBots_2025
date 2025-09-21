package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard9;
import org.firstinspires.ftc.teamcode.mechanisms.TestItem;

import java.util.ArrayList;
@Disabled
@TeleOp
public class TestWiring extends OpMode {
    ProgrammingBoard9 board = new ProgrammingBoard9();
    ArrayList<TestItem> tests;
    boolean wasDown, wasUp;
    int testNum;

    @Override
    public void init(){
        board.init(hardwareMap);
        tests = board.getTests();
    }

    @Override
    public void loop(){
        //Move up in the list of Test
        if(gamepad1.dpad_up && !wasUp){
            testNum--;
            if(testNum < 0){
                testNum = tests.size()-1;
            }
        }
        wasUp = gamepad1.dpad_up;

        //Move down in the list of Test
        if(gamepad1.dpad_down && !wasDown){
            testNum++;
            if(testNum >= tests.size()){
                testNum = 0;
            }
        }
        wasDown = gamepad1.dpad_down;

        //Put instructions on the telemetry
        telemetry.addLine("Use Up and Down on D-pad to cycle through choices");
        telemetry.addLine("Press A to run test");
        //Put the Test on the telemetry
        TestItem currTest = tests.get(testNum);
        telemetry.addData("Test:", currTest.getDescription());
        //Run or don't run based on "A"
        currTest.run(gamepad1.a, telemetry);
    }
}
