// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.ElevatorCommand;
import frc.robot.commands.GyroCommand;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.GyroSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {

  private final ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();
  private final GyroSubsystem gyroSubsystem = new GyroSubsystem();
  XboxController controller1 = new XboxController(0);
  Trigger buttonY = new JoystickButton(controller1, XboxController.Button.kY.value); 
  Trigger buttonX = new JoystickButton(controller1, XboxController.Button.kX.value);
  Trigger buttonA = new JoystickButton(controller1, XboxController.Button.kA.value);


  public RobotContainer(){
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    buttonX.whileTrue(new ElevatorCommand(elevatorSubsystem, .5));
    buttonY.whileTrue(new ElevatorCommand(elevatorSubsystem, -.5));
    buttonA.whileTrue(new GyroCommand(gyroSubsystem, GyroSubsystem.getAngle(), elevatorSubsystem));


  }

}
