package com.impirobotics.frc2014.commands.ballcollector;

import com.impirobotics.frc2014.commands.CommandBase;

public class BallCollector_ArmForward extends CommandBase {
    
    public BallCollector_ArmForward() {
        requires(ballCollectorSubsystem);
    }

    protected void initialize() {
        ballCollectorSubsystem.armForward();
    }

    protected void execute() {
        ballCollectorSubsystem.armForward();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
