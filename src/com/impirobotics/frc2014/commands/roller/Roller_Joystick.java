package com.impirobotics.frc2014.commands.roller;

import com.impirobotics.frc2014.ImpiLib;
import com.impirobotics.frc2014.XboxController;
import com.impirobotics.frc2014.commands.CommandBase;

public class Roller_Joystick extends CommandBase {

    private static final double BUTTONS_JOYSTICK_DEADZONE = 0.05;

    public Roller_Joystick() {
        requires(rollerSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
        XboxController buttonsController = oi.getButtonsController();
        
        double rollerValue = ImpiLib.deadzone(buttonsController.getLeftY(), BUTTONS_JOYSTICK_DEADZONE);
        rollerSubsystem.set(rollerValue);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        rollerSubsystem.set(0.0);
    }

    protected void interrupted() {
        rollerSubsystem.set(0.0);
    }
}
