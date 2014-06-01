package com.impirobotics.frc2014.commands.shooter;

import com.impirobotics.frc2014.commands.CommandBase;

public class Shooter_ResetCatapult extends CommandBase {
    
    public Shooter_ResetCatapult() {
        requires(shooterSubsystem);
    }

    protected void initialize() {
        shooterSubsystem.extendRetractor();
    }

    protected void execute() {
        shooterSubsystem.extendRetractor();
    }

    protected boolean isFinished() {
        return shooterSubsystem.getLimitSwitchValue();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
