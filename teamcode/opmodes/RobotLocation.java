package org.firstinspires.ftc.teamcode.opmodes;

public class RobotLocation {
    double angle;

    public RobotLocation(double angle){
        this.angle = angle;
    }
    // Public class method that returns heading between -180 degrees and +180 degrees
    public double getHeading(){
        double angle = this.angle;
        while(angle > 180){
            angle -= 360;
        }
        while (angle < -180){
            angle += 360;
        }
        return angle;
    }

    @Override
    public String toString(){
        return "RobotLocation: angle (" + angle +")";
    }

    public void turn(double angleChange){
        angle += angleChange;
    }
    public void setAngle(double angle){
        this.angle = angle;
    }
}
