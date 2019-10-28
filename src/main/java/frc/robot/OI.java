package frc.robot;

import frc.robot.Robot;
import frc.robot.commands.*;
import frc.robot.subsystems.SubsystemJoystick;

public class OI {
    public OI(){
        Robot.joystick.whenHeld(SubsystemJoystick.d_B, new CommandIntakeCargo());
        Robot.joystick.whenHeld(SubsystemJoystick.d_X, new CommandIntakeHatch());
        
    }
}