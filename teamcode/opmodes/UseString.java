package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp()
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Curtis Sharif";
        int grade = 20;

        telemetry.addData("Hello", myName);
        telemetry.addData("Grade: ", grade);
    }

    @Override
    public void loop() {

    }
}
