package org.team2399.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team2399.robot.OI;
import org.team2399.robot.Robot;
import org.team2399.robot.subsystems.QuadMotor;

/**
 *
 */
public class AxisInput extends Command {
	private QuadMotor quadmotor;
	private OI oi;
	
	public AxisInput(QuadMotor q, OI o) {
		// Use requires() here to declare subsystem dependencies
		quadmotor = q;
		oi = o;
		requires(quadmotor);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		quadmotor.setPercent(oi.getLeft());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
