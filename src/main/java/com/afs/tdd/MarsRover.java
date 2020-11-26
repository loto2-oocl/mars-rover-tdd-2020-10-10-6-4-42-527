package com.afs.tdd;

public class MarsRover {
    private final String direction;
    private final Integer locationX;
    private final Integer locationY;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public Integer getLocationX() {
        return locationX;
    }

    public Integer getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void executeCommand(String command) {
        return;
    }
}
