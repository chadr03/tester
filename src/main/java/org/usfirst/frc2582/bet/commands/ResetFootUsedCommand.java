/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2582.bet.commands;



import org.usfirst.frc2582.bet.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ResetFootUsedCommand extends Command {
  public ResetFootUsedCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.foot);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.foot.setUsed(true);
    System.out.print("Foot Reset Vale: ");
    System.out.println(Robot.foot.isUsed());//debug to see if it is set
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  end();
  }

}
