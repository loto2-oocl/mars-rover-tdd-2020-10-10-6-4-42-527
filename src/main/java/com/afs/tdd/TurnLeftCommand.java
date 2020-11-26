package com.afs.tdd;

public class TurnLeftCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        switch (rover.getDirection()) {
            case MarsRover.NORTH:
                rover.setDirection(MarsRover.WEST);
                break;
            case MarsRover.WEST:
                rover.setDirection(MarsRover.SOUTH);
                break;
            case MarsRover.SOUTH:
                rover.setDirection(MarsRover.EAST);
                break;
            case MarsRover.EAST:
                rover.setDirection(MarsRover.NORTH);
                break;
            default:
                break;
        }
    }
}
