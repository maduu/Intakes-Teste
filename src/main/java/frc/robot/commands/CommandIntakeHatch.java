package frc.robot.commands;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.Robot;

public class CommandIntakeHatch extends Command {
  
  private double;
  public boolean b = true;

  public CommandIntakeHatch(double speed) {
    super(Robot.intakeHatch);
  }
  
  protected void initialize() {
    if (b) {
      Robot.intakeHatch.intakeHatch(0.4);
  } else {
      Robot.intakeHatch.intakeHatch(-0.4);
  }
     b = !b;
  }
  
  protected void execute(){
  }

  @Override
	protected boolean isFinished() {
		return false;
	}

  @Override
	protected void end() {
    Robot.intakeHatch.stop();
  }
  
}