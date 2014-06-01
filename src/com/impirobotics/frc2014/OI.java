package com.impirobotics.frc2014;

import com.impirobotics.frc2014.commands.ballcollector.*;
import com.impirobotics.frc2014.commands.oi.*;
import com.impirobotics.frc2014.commands.shooter.*;

import edu.wpi.first.wpilibj.command.WaitCommand;

public class OI {
    private XboxController driverController;
    private XboxController buttonsController;

    public OI() {
        driverController = new XboxController(RobotMap.PORT__OI__DRIVER_CONTROLLER);
        buttonsController = new XboxController(RobotMap.PORT__OI__BUTTONS_CONTROLLER);
    }
    
    public XboxController getDriverController() {
        return driverController;
    }

    public XboxController getButtonsController() {
        return buttonsController;
    }

    public void setManualButtonCommands() {
        buttonsController.buttonA.whenPressed(new BallCollector_ArmBack());
        buttonsController.buttonB.whenPressed(new BallCollector_ArmForward());
        buttonsController.buttonX.whenPressed(new Shooter_RetractRetractor());
        buttonsController.buttonY.whenPressed(new Shooter_ExtendRetractor());
        buttonsController.buttonLeft.whenPressed(new Shooter_LockLatch());
        buttonsController.buttonRight.whenPressed(new Shooter_UnlockLatch());
        buttonsController.buttonSelect.whenPressed(new OI_ManualMode());
        buttonsController.buttonStart.whenPressed(new OI_AutomaticMode());
        buttonsController.buttonLeftStick.whenPressed(new WaitCommand(0.0));
        buttonsController.buttonRightStick.whenPressed(new Shooter_Autofire());
    }
    
    public void setAutomaticButtonCommands() {
        buttonsController.buttonA.whenPressed(new BallCollector_ArmBack());
        buttonsController.buttonB.whenPressed(new BallCollector_ArmForward());
        buttonsController.buttonX.whenPressed(new WaitCommand(0.0));
        buttonsController.buttonY.whenPressed(new WaitCommand(0.0));
        buttonsController.buttonLeft.whenPressed(new WaitCommand(0.0));
        buttonsController.buttonRight.whenPressed(new Shooter_Autofire());
        buttonsController.buttonSelect.whenPressed(new OI_ManualMode());
        buttonsController.buttonStart.whenPressed(new OI_AutomaticMode());
        buttonsController.buttonLeftStick.whenPressed(new WaitCommand(0.0));
        buttonsController.buttonRightStick.whenPressed(new WaitCommand(0.0));
    }
}

