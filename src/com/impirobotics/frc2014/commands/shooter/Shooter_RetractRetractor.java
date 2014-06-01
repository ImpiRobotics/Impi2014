package com.impirobotics.frc2014.commands.shooter;

import com.impirobotics.frc2014.commands.CommandBase;

public class Shooter_RetractRetractor extends CommandBase {
    
    public Shooter_RetractRetractor() {
        requires(shooterSubsystem);
    }

    protected void initialize() {
        shooterSubsystem.retractRetractor();
    }

    protected void execute() {
        shooterSubsystem.retractRetractor();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
