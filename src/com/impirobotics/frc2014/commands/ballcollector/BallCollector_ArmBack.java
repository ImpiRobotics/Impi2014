package com.impirobotics.frc2014.commands.ballcollector;

import com.impirobotics.frc2014.commands.CommandBase;

public class BallCollector_ArmBack extends CommandBase {
    
    public BallCollector_ArmBack() {
        requires(ballCollectorSubsystem);
    }

    protected void initialize() {
        ballCollectorSubsystem.armBack();
    }

    protected void execute() {
        ballCollectorSubsystem.armBack();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
