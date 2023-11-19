// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.GyroSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class GyroCommand extends CommandBase {

  private final GyroSubsystem gyroSubsystem;
  private final ElevatorSubsystem elevatorSubsystem;
  private final double angle;

  public GyroCommand(GyroSubsystem GyroSubsystem, double angle, ElevatorSubsystem elevatorSubsystem ) {
    this.gyroSubsystem = GyroSubsystem;
    this.elevatorSubsystem = elevatorSubsystem;
    this.angle = angle;
    addRequirements(GyroSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Im just going to use 90 for the prompt
    if (angle == 90) {
        new ElevatorCommand(elevatorSubsystem, .5);
    }
    else {
        new ElevatorCommand(elevatorSubsystem, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
