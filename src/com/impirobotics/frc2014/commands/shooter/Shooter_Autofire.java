package com.impirobotics.frc2014.commands.shooter;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Shooter_Autofire extends CommandGroup {
    
    public Shooter_Autofire() {
        addParallel(new Shooter_UnlockLatch());
        addSequential(new WaitCommand(1.0));
        addSequential(new Shooter_ResetCatapult());
        addParallel(new Shooter_LockLatch());
        addSequential(new WaitCommand(1.0));
        addParallel(new Shooter_RetractRetractor());
        addSequential(new WaitCommand(0.5));
        addParallel(new Shooter_SetShooterReady());
    }
}
