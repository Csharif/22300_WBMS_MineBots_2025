package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard4;
@Disabled
@TeleOp()
public class MotorGamepadOpmode2 extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
       double motorSpeed = gamepad1.left_stick_y;

       board.setMotorSpeed(motorSpeed);

       telemetry.addData("Motor Speed", motorSpeed);
       telemetry.addData("Motor rotations", board.getMotorRotations());
    }
}
