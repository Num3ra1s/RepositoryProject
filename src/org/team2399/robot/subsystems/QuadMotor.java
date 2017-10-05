package org.team2399.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class QuadMotor extends Subsystem {
	private CANTalon a, b, c, d;
	
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public QuadMotor() {
		a = new CANTalon(2);
		b = new CANTalon(7);
		c = new CANTalon(5);
		d = new CANTalon(9);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
