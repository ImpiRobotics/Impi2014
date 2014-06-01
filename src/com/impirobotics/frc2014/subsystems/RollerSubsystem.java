package com.impirobotics.frc2014.subsystems;

import com.impirobotics.frc2014.ImpiLib;
import com.impirobotics.frc2014.RobotMap;
import com.impirobotics.frc2014.commands.roller.Roller_Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RollerSubsystem  extends Subsystem {
    private Talon leftMotor;
    private Talon rightMotor;
    
    public RollerSubsystem() {
        leftMotor =  new Talon(RobotMap.PWM__ROLLER__LEFT_MOTOR);
        rightMotor =  new Talon(RobotMap.PWM__ROLLER__RIGHT_MOTOR);
        
        LiveWindow.addActuator("Roller", "Left Motor", leftMotor);
        LiveWindow.addActuator("Roller", "Right Motor", rightMotor);
    }
    public void initDefaultCommand() {
        setDefaultCommand(new Roller_Joystick());
    }

    public void updateStatus() {
    }

    public void set(double speed) {
        double outputSpeed = ImpiLib.clamp(speed, -1.0, 1.0);
        leftMotor.set(outputSpeed);
        rightMotor.set(-outputSpeed);
    }
}
