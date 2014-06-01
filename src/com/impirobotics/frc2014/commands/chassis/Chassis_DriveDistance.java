package com.impirobotics.frc2014.commands.chassis;

import com.impirobotics.frc2014.ImpiLib;
import com.impirobotics.frc2014.commands.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Chassis_DriveDistance extends CommandBase {
    
    private static final double K_P = 1.;
    private static final double MAX_SPEED_DELTA = 0.2;

    private double speed;
    private double distance;
    
    public Chassis_DriveDistance(double speed, double distance) {
        requires(chassisSubsystem);
        
        this.speed = speed;
        this.distance = distance;
    }

    protected void initialize() {
        chassisSubsystem.resetEncoders();
        chassisSubsystem.drive(speed, speed);
    }

    protected void execute() {
        double leftDistance = chassisSubsystem.getLeftEncoderDistance();
        double rightDistance = chassisSubsystem.getRightEncoderDistance();
        double delta = ImpiLib.clamp(K_P*(leftDistance-rightDistance), -MAX_SPEED_DELTA, MAX_SPEED_DELTA);
        
        double left = ImpiLib.clamp(speed-delta/2.0, -10, 1.0);
        double right = ImpiLib.clamp(speed+delta/2.0, -10, 1.0);
        chassisSubsystem.drive(left, right);
        
        SmartDashboard.putNumber("Left Encoder", leftDistance);
        SmartDashboard.putNumber("Right Encoder", rightDistance);
        SmartDashboard.putNumber("Delta", delta);
        SmartDashboard.putNumber("Left Speed", left);
        SmartDashboard.putNumber("Right Speed", right);
    }

    protected boolean isFinished() {
        return Math.abs(chassisSubsystem.getLeftEncoderDistance() + chassisSubsystem.getRightEncoderDistance())/2.0 >= distance;
    }

    protected void end() {
        chassisSubsystem.drive(0.0, 0.0);
    }

    protected void interrupted() {
        chassisSubsystem.drive(0.0, 0.0);
    }
}
