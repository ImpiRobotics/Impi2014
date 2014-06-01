package com.impirobotics.frc2014.commands.shooter;

import com.impirobotics.frc2014.commands.CommandBase;

public class Shooter_LockLatch extends CommandBase {
    
    public Shooter_LockLatch() {
        requires(shooterSubsystem);
    }

    protected void initialize() {
        shooterSubsystem.lockLatch();
    }

    protected void execute() {
        shooterSubsystem.lockLatch();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
