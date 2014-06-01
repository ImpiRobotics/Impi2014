package com.impirobotics.frc2014.commands.autonomous;

import com.impirobotics.frc2014.commands.CommandBase;
import com.impirobotics.frc2014.commands.ballcollector.*;
import com.impirobotics.frc2014.commands.chassis.*;
import com.impirobotics.frc2014.commands.shooter.*;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Autonomous_OneBallDriveTimed extends CommandGroup {
    
    public Autonomous_OneBallDriveTimed() {
        addSequential(new Chassis_Drive(-0.4, -0.5));
        addSequential(new WaitCommand(2.0));
        addSequential(new Chassis_Drive(0.0, 0.0));
        addSequential(new WaitCommand(2.0));
        addParallel(new BallCollector_ArmForward());
        addSequential(new WaitCommand(2.0));
        addParallel(new Shooter_Autofire());
        addParallel(new BallCollector_ArmBack());
    }

    protected void interrupted() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }
}
