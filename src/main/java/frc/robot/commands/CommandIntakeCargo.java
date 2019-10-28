package frc.robot.commands;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.Robot;

public class CommandIntakeCargo extends Command {
  
  private double;
  public boolean a = true;

  public CommandIntakeCargo(double speed) {
    super(Robot.intakeCargo);
  }
  
  protected void initialize() {
    if (a) {
      Robot.intakeCargo.intakeCargo(0.4);
  } else {
      Robot.intakeCargo.intakeCargo(-0.4);
  }
     a = !a;
  }
  
  protected void execute(){
  }

  @Override
	protected boolean isFinished() {
		return false;
	}

  @Override
	protected void end() {
    Robot.intakeCargo.stop();
  }
  
}