/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2582.bet.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Add your docs here.
 */
public class DoubleButton extends Trigger {
  private final Joystick m_joy;
  private final int m_button1;
  private final int m_button2;

  /**
   * Create a new double button trigger.
   * @param joy The joystick
   * @param button1 The first button
   * @param button2 The second button
   */
  public DoubleButton(Joystick joy, int button1, int button2) {
    this.m_joy = joy;
    this.m_button1 = button1;
    this.m_button2 = button2;
  }

  @Override
  public boolean get() {
    return m_joy.getRawButton(m_button1) && m_joy.getRawButton(m_button2);
  }
}
