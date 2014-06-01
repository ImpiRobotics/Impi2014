package com.impirobotics.frc2014.commands.autonomous;

import com.impirobotics.frc2014.commands.CommandBase;

public class Autonomous_None extends CommandBase {
    
    public Autonomous_None() {
    }

    protected void initialize() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }

    protected void execute() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }

    protected void interrupted() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }
}
