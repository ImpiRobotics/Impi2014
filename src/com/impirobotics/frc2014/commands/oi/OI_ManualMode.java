package com.impirobotics.frc2014.commands.oi;

import com.impirobotics.frc2014.commands.CommandBase;

public class OI_ManualMode extends CommandBase {
    
    public OI_ManualMode() {
    }

    protected void initialize() {
        oi.setManualButtonCommands();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
