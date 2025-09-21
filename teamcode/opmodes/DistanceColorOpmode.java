package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard7;

@Disabled
@TeleOp()
public class DistanceColorOpmode extends OpMode {
    ProgrammingBoard7 board = new ProgrammingBoard7();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        telemetry.addData("Amount red", board.getAmountRed());
        telemetry.addData("Amount blue", board.getAmountBlue());
        telemetry.addData("Amount green", board.getAmountGreen());
        telemetry.addData("Distance (CM)", board.getDistance(DistanceUnit.CM));
        telemetry.addData("Distance (IN)", board.getDistance(DistanceUnit.INCH));
    }
}
