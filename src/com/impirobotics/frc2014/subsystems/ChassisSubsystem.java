package com.impirobotics.frc2014.subsystems;

import com.impirobotics.frc2014.ImpiLib;
import com.impirobotics.frc2014.RobotMap;
import com.impirobotics.frc2014.commands.chassis.Chassis_Joystick;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class ChassisSubsystem extends Subsystem {
    private Talon leftFrontMotor;
    private Talon leftRearMotor;
    private Talon rightFrontMotor;
    private Talon rightRearMotor;
    
    private Encoder leftEncoder;
    private Encoder rightEncoder;
    
    private static final double DRIVE_WHEEL_DIAMETER = 3.25;
    private static final double ENCODER_CYCLES_PER_REVOLUTION = 360.0;
    private static final double DISTANCE_PER_PULSE = (DRIVE_WHEEL_DIAMETER * Math.PI) / ENCODER_CYCLES_PER_REVOLUTION;
    
    public ChassisSubsystem () {
        leftFrontMotor  = new Talon(RobotMap.PWM__CHASSIS__LEFT_FRONT_MOTOR);
        leftRearMotor   = new Talon(RobotMap.PWM__CHASSIS__LEFT_REAR_MOTOR);
        rightFrontMotor = new Talon(RobotMap.PWM__CHASSIS__RIGHT_FRONT_MOTOR);
        rightRearMotor  = new Talon(RobotMap.PWM__CHASSIS__RIGHT_REAR_MOTOR);
        
        leftEncoder = new Encoder(
            RobotMap.DIO__CHASSIS__LEFT_ENCODER_A,
            RobotMap.DIO__CHASSIS__LEFT_ENCODER_B);
        leftEncoder.setDistancePerPulse(DISTANCE_PER_PULSE);
        leftEncoder.start();
        
        rightEncoder = new Encoder(
            RobotMap.DIO__CHASSIS__RIGHT_ENCODER_A,
            RobotMap.DIO__CHASSIS__RIGHT_ENCODER_B);
        rightEncoder.setDistancePerPulse(DISTANCE_PER_PULSE);
        rightEncoder.start();
        
        LiveWindow.addActuator("Chassis", "Left Front",    leftFrontMotor);
        LiveWindow.addActuator("Chassis", "Left Rear",     leftRearMotor);
        LiveWindow.addActuator("Chassis", "Right Front",   rightFrontMotor);
        LiveWindow.addActuator("Chassis", "Right Rear",    rightRearMotor);
        LiveWindow.addSensor("Chassis", "Left Encoder",  leftEncoder);
        LiveWindow.addSensor("Chassis", "Right Encoder", rightEncoder);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new Chassis_Joystick());
    }

    public void updateStatus() {
    }

    public void drive(double left, double right) {
        double leftPower = ImpiLib.clamp(left, -1.0, 1.0);
        double rightPower = -ImpiLib.clamp(right, -1.0, 1.0);

        leftFrontMotor.set(leftPower);
        leftRearMotor.set(leftPower);
        rightFrontMotor.set(rightPower);
        rightRearMotor.set(rightPower);
    }
    
    public void haloDrive(double straightAxis, double turnAxis) {
        double leftPower = straightAxis + turnAxis;
        double rightPower = straightAxis - turnAxis;
        drive(leftPower, rightPower);
    }

    public void resetEncoders() {
        leftEncoder.reset();
        rightEncoder.reset();
    }
    
    public double getLeftEncoderDistance() {
        return leftEncoder.getDistance();
    }
    
    public double getRightEncoderDistance() {
        return rightEncoder.getDistance();
    }
}
