package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard8;

@Disabled
@TeleOp()
public class GyroMotorSpeedOpmode extends OpMode {
    ProgrammingBoard8 board = new ProgrammingBoard8();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        // scales motor speed based on heading angle
        double headingDegrees = board.getHeading(AngleUnit.DEGREES);
        double motorSpeed = Range.scale(headingDegrees, -180, 180, -1.0, 1.0);

        telemetry.addData("Our Heading (degrees)", headingDegrees);
        telemetry.addData("Motor Speed", motorSpeed);

        board.setMotorSpeed(motorSpeed);

    }
}
