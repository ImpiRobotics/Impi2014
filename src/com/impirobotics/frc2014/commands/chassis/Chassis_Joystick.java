package com.impirobotics.frc2014.commands.chassis;

import com.impirobotics.frc2014.ImpiLib;
import com.impirobotics.frc2014.RobotMap;
import com.impirobotics.frc2014.XboxController;
import com.impirobotics.frc2014.commands.CommandBase;

public class Chassis_Joystick extends CommandBase {
    
    private static final double DRIVER_JOYSTICK_DEADZONE = 0.05;

    public Chassis_Joystick() {
        requires(chassisSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
        XboxController driverController = oi.getDriverController();
        
        double straightAxis = -driverController.getLeftY();
        straightAxis = ImpiLib.signedSquare(ImpiLib.deadzone(straightAxis,DRIVER_JOYSTICK_DEADZONE));
        
        double turnAxis = driverController.getRightX();
        turnAxis = ImpiLib.signedSquare(ImpiLib.deadzone(turnAxis,DRIVER_JOYSTICK_DEADZONE));
        
        chassisSubsystem.haloDrive(straightAxis, turnAxis);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        chassisSubsystem.drive(0.0, 0.0);
    }

    protected void interrupted() {
        chassisSubsystem.drive(0.0, 0.0);
    }
}
