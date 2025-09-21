package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class ClassMethodOpMode extends OpMode {

    @Override
    public void init() {
    }

    // returnDataType name(parameters)
    double squareInputWithSign(double input){
        double output = input*input;
        if(input < 0){
            output = output * -1;
        }
        return output;
    }
    /****
    void setMotorSpeed(double speed){
        motor.set(speed);
    }
    boolean isSensorPressed(){
        return touchSensor.isPressed();
    }
    double min(double x, double y){
        if(x < y){
            return x;
        }
        return y;
    }****/
    @Override
    public void loop() {
        double leftAmount = gamepad1.left_stick_x;
        double fwdAmount = -gamepad1.left_stick_y;

        telemetry.addData("Before X", leftAmount);
        telemetry.addData("Before Y", fwdAmount);

        leftAmount = squareInputWithSign(leftAmount);
        fwdAmount = squareInputWithSign(fwdAmount);

        telemetry.addData("After X", leftAmount);
        telemetry.addData("After Y", fwdAmount);
    }
}
