package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard5;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard6;

@Disabled
@TeleOp()
public class PotOpmode extends OpMode {
    ProgrammingBoard6 board = new ProgrammingBoard6();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        double potValue = board.getPotRange();

        telemetry.addData("Pot Angle", board.getPotAngle());
        telemetry.addData("Pot Value", board.getPotRange());

        board.setServoPosition(potValue);
    }
}
