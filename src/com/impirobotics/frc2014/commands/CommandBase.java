package com.impirobotics.frc2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.impirobotics.frc2014.OI;
import com.impirobotics.frc2014.subsystems.BallCollectorSubsystem;
import com.impirobotics.frc2014.subsystems.ChassisSubsystem;
import com.impirobotics.frc2014.subsystems.PneumaticsSubsystem;
import com.impirobotics.frc2014.subsystems.RollerSubsystem;
import com.impirobotics.frc2014.subsystems.ShooterSubsystem;

public abstract class CommandBase extends Command {

    public static OI oi;

    public static BallCollectorSubsystem ballCollectorSubsystem = new BallCollectorSubsystem();
    public static ChassisSubsystem chassisSubsystem = new ChassisSubsystem();
    public static PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
    public static RollerSubsystem rollerSubsystem = new RollerSubsystem();
    public static ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

    public static void init() {
        oi = new OI();

        SmartDashboard.putData(ballCollectorSubsystem);
        SmartDashboard.putData(chassisSubsystem);
        SmartDashboard.putData(pneumaticsSubsystem);
        SmartDashboard.putData(rollerSubsystem);
        SmartDashboard.putData(shooterSubsystem);
     }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
