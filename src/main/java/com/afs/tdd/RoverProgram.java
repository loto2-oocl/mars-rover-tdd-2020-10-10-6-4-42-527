package com.afs.tdd;

import java.util.List;

public interface RoverProgram {
    void executeCommands(List<RoverCommand> commands);

    void executeCommand(RoverCommand command);
}
