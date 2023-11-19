// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.sensors.WPI_PigeonIMU;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class GyroSubsystem extends SubsystemBase {
  /** Creates a new GyroSubsystem. */

  static WPI_PigeonIMU gyro1 = new WPI_PigeonIMU(0);


  public GyroSubsystem() {}

  public static double getAngle() {
    return gyro1.getAngle();
  }

}
