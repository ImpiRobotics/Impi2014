package com.impirobotics.frc2014.subsystems;

import com.impirobotics.frc2014.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ShooterSubsystem  extends Subsystem {
    private DoubleSolenoid latchSolenoid;
    private DoubleSolenoid retractorSolenoid;
    private DigitalInput limitSwitch;
    private boolean shooterReady = false;
   
    public ShooterSubsystem() {
        latchSolenoid = new DoubleSolenoid(
            RobotMap.SOLENOID__SHOOTER__LATCH_SOLENOID__FORWARD,
            RobotMap.SOLENOID__BALL_COLLECTOR__ARM_SOLENOID__REVERSE);
        retractorSolenoid = new DoubleSolenoid(
            RobotMap.SOLENOID__SHOOTER__RETRACTOR_SOLENOID__FORWARD,
            RobotMap.SOLENOID__SHOOTER__RETRACTOR_SOLENOID__REVERSE);
        limitSwitch = new DigitalInput(RobotMap.DIO__SHOOTER__LIMIT_SWITCH);
        
        LiveWindow.addActuator("Shooter", "Latch Solenoid", latchSolenoid);
        LiveWindow.addActuator("Shooter", "Retractor Solenoid", retractorSolenoid);
        LiveWindow.addActuator("Shooter", "Limit Switch", limitSwitch);
    }

    public void initDefaultCommand() {
    }

    public void updateStatus() {
        SmartDashboard.putBoolean("Shooter Switch", getLimitSwitchValue());
        SmartDashboard.putBoolean("Shooter Ready", isShooterReady());
    }

    public boolean getLimitSwitchValue() {
        return limitSwitch.get();
    }
    
    public void lockLatch() {
        latchSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void unlockLatch() {
        latchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void extendRetractor() {
        retractorSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void retractRetractor() {
        retractorSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public boolean isShooterReady() {
        return shooterReady;
    }
    
    public void setShooterReady(boolean shooterReady) {
        this.shooterReady = shooterReady;
    }
}
