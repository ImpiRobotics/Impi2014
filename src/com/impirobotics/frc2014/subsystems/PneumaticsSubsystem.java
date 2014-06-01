package com.impirobotics.frc2014.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.impirobotics.frc2014.RobotMap;
import com.impirobotics.frc2014.commands.pneumatics.Pneumatics_Start;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class PneumaticsSubsystem  extends Subsystem {
    private Compressor compressor;
    
    public PneumaticsSubsystem () {
        compressor = new Compressor(
            RobotMap.DIO__PNEUMATICS__COMPRESSOR,
            RobotMap.RELAY__PNEUMATICS__COMPRESSOR);
        
        LiveWindow.addActuator("Pneumatics", "Compressor", compressor);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new Pneumatics_Start());
    }

    public void updateStatus() {
    }

    public void start() {
        compressor.start();
    }

    public void stop() {
        compressor.stop();
    }
}
