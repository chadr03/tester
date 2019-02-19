/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2582.bet.commands;

import org.usfirst.frc2582.bet.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
//import sun.tools.tree.WhileStatement;

public class AutoShoot extends Command {
  public AutoShoot() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.triangle);
    requires(Robot.pistons);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    Timer a = new Timer();

    Robot.triangle.upT();
    a.delay(.75);
    Robot.pistons.push();
    a.delay(.5);
    Robot.pistons.off();
    Robot.triangle.downT();


  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    //Robot.triangle.upT();
    //Robot.pistons.wait(1000,0);
    
    //Robot.pistons.push();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.pistons.off();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
