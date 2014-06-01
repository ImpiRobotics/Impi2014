package com.impirobotics.frc2014.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.impirobotics.frc2014.RobotMap;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class BallCollectorSubsystem  extends Subsystem {
    
    private DoubleSolenoid armSolenoid;

    public BallCollectorSubsystem() {
        armSolenoid = new DoubleSolenoid(
            RobotMap.SOLENOID__BALL_COLLECTOR__ARM_SOLENOID__FORWARD,
            RobotMap.SOLENOID__BALL_COLLECTOR__ARM_SOLENOID__REVERSE);
        
        LiveWindow.addActuator("Ball Collector", "Arm Solenoid", armSolenoid);
    }
    
    public void initDefaultCommand() {
    }
    
    public void updateStatus() {
    }
    
    public void armForward() {
        armSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void armBack() {
        armSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}
