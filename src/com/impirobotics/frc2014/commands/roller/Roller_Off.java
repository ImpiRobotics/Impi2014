package com.impirobotics.frc2014.commands.roller;

import com.impirobotics.frc2014.commands.CommandBase;

public class Roller_Off extends CommandBase {
    
    public Roller_Off() {
        requires(rollerSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
        rollerSubsystem.set(0.0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
