package com.afs.command;

import com.afs.tdd.MarsRover;

public class MoveCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        if (rover.getDirection().equals(MarsRover.NORTH)) {
            rover.setLocationYPlusOne();
        }

        if (rover.getDirection().equals(MarsRover.EAST)) {
            rover.setLocationXPlusOne();
        }

        if (rover.getDirection().equals(MarsRover.SOUTH)) {
            rover.setLocationYMinusOne();
        }

        if (rover.getDirection().equals(MarsRover.WEST)) {
            rover.setLocationXMinusOne();
        }
    }
}
