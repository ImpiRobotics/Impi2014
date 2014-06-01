package com.impirobotics.frc2014.commands.chassis;

import com.impirobotics.frc2014.commands.CommandBase;

public class Chassis_Drive extends CommandBase {
    
    private double left;
    private double right;
    
    public Chassis_Drive(double left, double right) {
        requires(chassisSubsystem);
        
        this.left = left;
        this.right = right;
    }

    protected void initialize() {
        chassisSubsystem.drive(left, right);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
