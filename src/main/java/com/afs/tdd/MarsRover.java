package com.afs.tdd;

public class MarsRover {
    private final String direction;
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

    public void setLocationYPlusOne() {
        this.locationY += 1;
    }

    public void setLocationYMinusOne() {
        this.locationY -= 1;
    }

    public String getDirection() {
        return direction;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            if (this.getDirection().equals("N")) {
                this.setLocationYPlusOne();
            }

            if (this.getDirection().equals("E")) {
                this.setLocationXPlusOne();
            }

            if (this.getDirection().equals("S")) {
                this.setLocationYMinusOne();
            }
        }
    }
}
