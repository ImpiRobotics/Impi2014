package com.impirobotics.frc2014.commands.oi;

import com.impirobotics.frc2014.commands.CommandBase;

public class OI_AutomaticMode extends CommandBase {
    
    public OI_AutomaticMode() {
    }

    protected void initialize() {
        oi.setAutomaticButtonCommands();
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
