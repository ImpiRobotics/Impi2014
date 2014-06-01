package com.impirobotics.frc2014;

import com.impirobotics.frc2014.commands.CommandBase;
import com.impirobotics.frc2014.commands.autonomous.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Impi2014 extends IterativeRobot {

    private Command autonomousCommand;
    private SendableChooser autoChooser;
    private boolean registeredButtons = false;
    private static final boolean useAutoChooser = true;

    public void robotInit() {
        CommandBase.init();
        SmartDashboard.putData(Scheduler.getInstance());
        
        if (useAutoChooser) {
            autoChooser = new SendableChooser();
            autoChooser.addDefault("One ball auto", new Autonomous_OneBallDriveTimed());
            autoChooser.addObject("Two ball auto", new Autonomous_TwoBallDriveTimed());
            SmartDashboard.putData("Autonomous mode", autoChooser);
        } else {
            autonomousCommand = new Autonomous_OneBallDriveTimed();
        }
}

    public void autonomousInit() {
        if (useAutoChooser) {
            autonomousCommand = (Command) autoChooser.getSelected();
        }
        autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        autonomousCommand.cancel();
        
        if (!registeredButtons) {
            CommandBase.oi.setManualButtonCommands();
            registeredButtons = true;
        }
        updateStatus();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        updateStatus();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }

    public void updateStatus() {
        CommandBase.ballCollectorSubsystem.updateStatus();
        CommandBase.chassisSubsystem.updateStatus();
        CommandBase.shooterSubsystem.updateStatus();
        CommandBase.rollerSubsystem.updateStatus();
        CommandBase.pneumaticsSubsystem.updateStatus();
    }
}
