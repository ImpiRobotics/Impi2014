package com.impirobotics.frc2014.commands.autonomous;

import com.impirobotics.frc2014.commands.CommandBase;
import com.impirobotics.frc2014.commands.ballcollector.*;
import com.impirobotics.frc2014.commands.chassis.*;
import com.impirobotics.frc2014.commands.shooter.*;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Autonomous_OneBallDriveDistance extends CommandGroup {
    
    public Autonomous_OneBallDriveDistance() {
        addSequential(new Chassis_DriveDistance(-0.4, 60.));
        addSequential(new WaitCommand(1.0));
        addParallel(new BallCollector_ArmForward());
        addSequential(new WaitCommand(2.0));
        addParallel(new Shooter_UnlockLatch());
        addSequential(new WaitCommand(1.0));
        addParallel(new BallCollector_ArmBack());
        addSequential(new WaitCommand(1.0));
    }

    protected void interrupted() {
        CommandBase.chassisSubsystem.drive(0.0, 0.0);
        CommandBase.rollerSubsystem.set(0.0);
    }
}
