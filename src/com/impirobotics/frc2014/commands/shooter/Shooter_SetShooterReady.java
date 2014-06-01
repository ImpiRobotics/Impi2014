package com.impirobotics.frc2014.commands.shooter;

import com.impirobotics.frc2014.commands.CommandBase;

public class Shooter_SetShooterReady extends CommandBase {
    
    public Shooter_SetShooterReady() {
        requires(shooterSubsystem);
    }

    protected void initialize() {
        shooterSubsystem.setShooterReady(true);
    }

    protected void execute() {
        shooterSubsystem.setShooterReady(true);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
