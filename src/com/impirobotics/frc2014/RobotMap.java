package com.impirobotics.frc2014;

public class RobotMap {
    // PWM
    public static final int PWM__ROLLER__RIGHT_MOTOR = 4;
    public static final int PWM__ROLLER__LEFT_MOTOR = 5;
    public static final int PWM__CHASSIS__RIGHT_FRONT_MOTOR = 6;
    public static final int PWM__CHASSIS__RIGHT_REAR_MOTOR = 7;
    public static final int PWM__CHASSIS__LEFT_FRONT_MOTOR = 8;
    public static final int PWM__CHASSIS__LEFT_REAR_MOTOR = 9;

    // Digital IO
    public static final int DIO__PNEUMATICS__COMPRESSOR = 1;
    public static final int DIO__CHASSIS__LEFT_ENCODER_A = 3;
    public static final int DIO__CHASSIS__LEFT_ENCODER_B = 4;
    public static final int DIO__CHASSIS__RIGHT_ENCODER_A = 5;
    public static final int DIO__CHASSIS__RIGHT_ENCODER_B = 6;
    public static final int DIO__SHOOTER__LIMIT_SWITCH = 8;

    // Relays
    public static final int RELAY__PNEUMATICS__COMPRESSOR = 1;

    // Solenoids
    public static final int SOLENOID__BALL_COLLECTOR__ARM_SOLENOID__FORWARD = 2;
    public static final int SOLENOID__BALL_COLLECTOR__ARM_SOLENOID__REVERSE = 1;
    public static final int SOLENOID__SHOOTER__LATCH_SOLENOID__FORWARD = 5;
    public static final int SOLENOID__SHOOTER__LATCH_SOLENOID__REVERSE = 6;
    public static final int SOLENOID__SHOOTER__RETRACTOR_SOLENOID__FORWARD = 7;
    public static final int SOLENOID__SHOOTER__RETRACTOR_SOLENOID__REVERSE = 8;

    // Joysticks
    public static final int PORT__OI__DRIVER_CONTROLLER = 1;
    public static final int PORT__OI__BUTTONS_CONTROLLER = 2;
}
