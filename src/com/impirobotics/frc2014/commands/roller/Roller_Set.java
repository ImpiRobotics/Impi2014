package com.impirobotics.frc2014.commands.roller;

import com.impirobotics.frc2014.commands.CommandBase;

public class Roller_Set extends CommandBase {

    private double speed;
 
    public Roller_Set(double speed) {
        requires(rollerSubsystem);
       
        this.speed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
        rollerSubsystem.set(speed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        rollerSubsystem.set(0.0);
    }

    protected void interrupted() {
        rollerSubsystem.set(0.0);
    }
}
