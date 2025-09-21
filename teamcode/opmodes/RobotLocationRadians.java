package org.firstinspires.ftc.teamcode.opmodes;

public class RobotLocationRadians {
    double angleRadians;

    public RobotLocationRadians(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }
    // Public class method that returns heading between -pi/2 radians and +pi/2 radians converted to degrees
    public double getHeading(){
        double angle = this.angleRadians;
        while(angle > Math.PI){
            angle -= 2*Math.PI;
        }
        while (angle < -Math.PI){
            angle += 2*Math.PI;
        }
        return Math.toDegrees(angle);
    }

    @Override
    public String toString(){
        return "RobotLocation: angle (" + angleRadians +")";
    }

    public void turn(double angleChangeDegrees){
        angleRadians += Math.toRadians(angleChangeDegrees);
    }
    public void setAngle(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }
}
