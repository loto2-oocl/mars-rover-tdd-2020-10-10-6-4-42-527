package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_y_plus_1_when_execute_command_given_0_0_N_M() {
        // given
        String command = "M";
        MarsRover marsRover = new MarsRover(0, 0, "N");

        // when
        marsRover.executeCommand(command);

        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
