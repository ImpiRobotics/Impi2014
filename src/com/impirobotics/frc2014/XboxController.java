package com.impirobotics.frc2014;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XboxController extends Joystick {
    public Button buttonA;
    public Button buttonB;
    public Button buttonX;
    public Button buttonY;
    public Button buttonLeft;
    public Button buttonRight;
    public Button buttonSelect;
    public Button buttonStart;
    public Button buttonLeftStick;
    public Button buttonRightStick;
    
    public XboxController(int port) {
        super(port);
    
        buttonA = new JoystickButton(this, 1);
        buttonB = new JoystickButton(this, 2);
        buttonX = new JoystickButton(this, 3);
        buttonY = new JoystickButton(this, 4);
        buttonLeft = new JoystickButton(this, 5);
        buttonRight = new JoystickButton(this, 6);
        buttonSelect = new JoystickButton(this, 7);
        buttonStart = new JoystickButton(this, 8);
        buttonLeftStick = new JoystickButton(this, 9);
        buttonRightStick = new JoystickButton(this, 10);
    }
    
    public double getLeftX() {
        return getRawAxis(1);
    }
    
    public double getLeftY() {
        return getRawAxis(2);
    }

    public double getRightX() {
        return getRawAxis(4);
    }
    
    public double getRightY() {
        return getRawAxis(5);
    }
    
    public double getDpadX() {
        return getRawAxis(6);
    }
    
    public double getTriggers() {
        return getRawAxis(3);
    }
}
