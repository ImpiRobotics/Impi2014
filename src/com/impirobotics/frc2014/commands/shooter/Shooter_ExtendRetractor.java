package com.impirobotics.frc2014.commands.shooter;

import com.impirobotics.frc2014.commands.CommandBase;

public class Shooter_ExtendRetractor extends CommandBase {
    
    public Shooter_ExtendRetractor() {
        requires(shooterSubsystem);
    }

    protected void initialize() {
        shooterSubsystem.extendRetractor();
    }

    protected void execute() {
        shooterSubsystem.extendRetractor();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
