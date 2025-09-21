package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.mechanisms.TestItem;

public class TestDigitalChannel extends TestItem{
    private DigitalChannel digitalChannel;

    public TestDigitalChannel(String description, DigitalChannel channel){
        super(description);
        this.digitalChannel = channel;
    }

    @Override
    public void run(boolean on, Telemetry telemetry){
        telemetry.addData("Sensor state: ", digitalChannel.getState());
    }
}

