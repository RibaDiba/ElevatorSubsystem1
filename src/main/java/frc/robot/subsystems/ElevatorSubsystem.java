// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
  /** Creates a new ElevatorSubsystem. */

  private CANSparkMax motor1 = new CANSparkMax(0, MotorType.kBrushless);
  private CANSparkMax motor2 = new CANSparkMax(0, MotorType.kBrushless);


  public ElevatorSubsystem() {}

  public void setMotors(double leftSpeed, double rightSpeed) {
    motor1.set(leftSpeed);
    motor2.set(-rightSpeed);
  }
}
