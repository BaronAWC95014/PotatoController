package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandBase;

import java.util.function.BooleanSupplier;

public class PivotRaiseCommand extends CommandBase {

    private final PivotSubsystem pivotSubsystem;
    private final BooleanSupplier slowMode;
    public PivotRaiseCommand(PivotSubsystem pivotSubsystem, BooleanSupplier slowMode){
        this.pivotSubsystem = pivotSubsystem;
        this.slowMode = slowMode;
    }

    @Override
    public void execute(){
        pivotSubsystem.raise(slowMode.getAsBoolean());
    }

    @Override
    public void end(boolean interrupted){
        pivotSubsystem.stop();
    }
}
