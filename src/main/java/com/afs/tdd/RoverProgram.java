package com.afs.tdd;

import com.afs.command.RoverCommand;

import java.util.List;

public interface RoverProgram {
    void executeCommands(List<RoverCommand> commands);

    void executeCommand(RoverCommand command);
}
