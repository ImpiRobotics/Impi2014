package com.impirobotics.frc2014.commands.pneumatics;

import com.impirobotics.frc2014.commands.CommandBase;

public class Pneumatics_Start extends CommandBase {
 
    public Pneumatics_Start() {
        requires(pneumaticsSubsystem);
    }

    protected void initialize() {
        pneumaticsSubsystem.start();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
