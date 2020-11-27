package com.afs.tdd;

import com.afs.command.MoveCommand;
import com.afs.command.RoverCommand;
import com.afs.command.TurnLeftCommand;
import com.afs.command.TurnRightCommand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_y_plus_1_when_execute_command_given_0_0_N_M() {
        // given
        MoveCommand command = new MoveCommand();
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_x_plus_1_when_execute_command_given_0_0_E_M() {
        // given
        MoveCommand command = new MoveCommand();
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_return_y_minus_1_when_execute_command_given_0_0_S_M() {
        // given
        MoveCommand command = new MoveCommand();
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_x_minus_1_when_execute_command_given_0_0_W_M() {
        // given
        MoveCommand command = new MoveCommand();
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_N_to_E_direction_when_execute_command_given_0_0_N_R() {
        // given
        TurnRightCommand command = new TurnRightCommand();
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_return_E_to_S_direction_when_execute_command_given_0_0_E_R() {
        // given
        TurnRightCommand command = new TurnRightCommand();
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }


    @Test
    void should_return_S_to_W_direction_when_execute_command_given_0_0_S_R() {
        // given
        TurnRightCommand command = new TurnRightCommand();
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_W_to_N_direction_when_execute_command_given_0_0_W_R() {
        // given
        TurnRightCommand command = new TurnRightCommand();
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_N_to_W_direction_when_execute_command_given_0_0_N_L() {
        // given
        TurnLeftCommand command = new TurnLeftCommand();
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_return_W_to_S_direction_when_execute_command_given_0_0_W_L() {
        // given
        TurnLeftCommand command = new TurnLeftCommand();
        MarsRover marsRover = new MarsRover(0, 0, "W");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_return_S_to_E_direction_when_execute_command_given_0_0_S_L() {
        // given
        TurnLeftCommand command = new TurnLeftCommand();
        MarsRover marsRover = new MarsRover(0, 0, "S");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_return_E_to_N_direction_when_execute_command_given_0_0_E_L() {
        // given
        TurnLeftCommand command = new TurnLeftCommand();
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_return_E_to_N_and_location_0_1_direction_when_execute_multiple_commands_given_0_0_E_LM() {
        // given
        List<RoverCommand> commands = new ArrayList<>();
        commands.add(new TurnLeftCommand());
        commands.add(new MoveCommand());
        MarsRover marsRover = new MarsRover(0, 0, "E");

        // when
        marsRover.executeCommands(commands);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
