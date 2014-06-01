package com.impirobotics.frc2014.commands.autonomous;

import com.impirobotics.frc2014.commands.CommandBase;
import com.impirobotics.frc2014.commands.ballcollector.*;
import com.impirobotics.frc2014.commands.chassis.*;
import com.impirobotics.frc2014.commands.roller.*;
import com.impirobotics.frc2014.commands.shooter.*;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Autonomous_TwoBallDriveTimed extends CommandGroup {
    
    public Autonomous_TwoBallDriveTimed() {
	addSequential(new Chassis_Drive(-0.45, -0.5));
	addSequential(new WaitCommand(1.8));
	addSequential(new Chassis_Drive(0., 0.));
	addParallel(new BallCollector_ArmForward());
	addSequential(new WaitCommand(0.5));
	addParallel(new Shooter_Autofire());
	addParallel(new Roller_Set(-1.0));
	addSequential(new WaitCommand(0.25));
	addSequential(new Chassis_Drive(0.5, 0.4));
	addSequential(new WaitCommand(2.1));
	addSequential(new Chassis_Drive(0.0, 0.0));
	addSequential(new WaitCommand(1.0));
	addParallel(new BallCollector_ArmBack());
	addSequential(new WaitCommand(0.5));
	addSequential(new Chassis_Drive(-0.45, -0.5));
	addSequential(new WaitCommand(1.8));
	addParallel(new Roller_Set(0.0));
	addSequential(new Chassis_Drive(0., 0.));
	addSequential(new WaitCommand(0.5));
	addParallel(new BallCollector_ArmForward());
	addSequential(new WaitCommand(1.0));
	addParallel(new Shooter_Autofire());
    }

    protected void interrupted() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }
}
