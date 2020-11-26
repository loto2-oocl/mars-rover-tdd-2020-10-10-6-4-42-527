package com.afs.tdd;

public class MarsRover {
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    public static final String MOVE_COMMAND = "M";
    public static final String TURN_RIGHT_COMMAND = "R";
    private String direction;
    private Integer locationX;
    private Integer locationY;

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

    public void setLocationXPlusOne() {
        this.locationX += 1;
    }

    public void setLocationXMinusOne() {
        this.locationX -= 1;
    }

    public void setLocationYPlusOne() {
        this.locationY += 1;
    }

    public void setLocationYMinusOne() {
        this.locationY -= 1;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void executeCommand(String command) {
        if (command.equals(MOVE_COMMAND)) {
            this.move();
        }

        if (command.equals(TURN_RIGHT_COMMAND)) {
            this.turnRight();
        }
    }

    private void turnRight() {
        if (this.getDirection().equals(NORTH)) {
            this.setDirection(EAST);
        }
    }

    public void move() {
        if (this.getDirection().equals(NORTH)) {
            this.setLocationYPlusOne();
        }

        if (this.getDirection().equals(EAST)) {
            this.setLocationXPlusOne();
        }

        if (this.getDirection().equals(SOUTH)) {
            this.setLocationYMinusOne();
        }

        if (this.getDirection().equals(WEST)) {
            this.setLocationXMinusOne();
        }
    }
}
