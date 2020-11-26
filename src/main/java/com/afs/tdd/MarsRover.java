package com.afs.tdd;

import javax.naming.ldap.Control;
import java.util.Arrays;
import java.util.List;

public class MarsRover implements RoverProgram {
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";

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

    @Override
    public void executeCommand(RoverCommand command) {
        command.execute(this);
    }

    @Override
    public void executeCommands(List<RoverCommand> commands) {
        commands.forEach(this::executeCommand);
    }
}
