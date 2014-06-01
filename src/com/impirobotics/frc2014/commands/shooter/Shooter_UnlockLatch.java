package com.impirobotics.frc2014.commands.shooter;

import com.impirobotics.frc2014.commands.CommandBase;

public class Shooter_UnlockLatch extends CommandBase {
    
    public Shooter_UnlockLatch() {
        requires(shooterSubsystem);
    }

    protected void initialize() {
        shooterSubsystem.setShooterReady(false);
        shooterSubsystem.unlockLatch();
    }

    protected void execute() {
        shooterSubsystem.setShooterReady(false);
        shooterSubsystem.unlockLatch();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
