package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    // room should be occupied and dirty
    public void checkin_shouldMarkRoom_asDirtyAndOccupied() {
        // arrange
        Room room = new Room(4, 100,  true, true);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    // room should be NOT occupied and dirty
    public void checkout_shouldMarkRoom_asDirtyAndNotOccupied() {
        // arrange
        Room room = new Room(4, 100,  false, true);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    // room should be NOT occupied and NOT dirty
    public void cleanRoom_shouldMarkRoom_asNotDirtyAndNotOccupied() {
        // arrange
        Room room = new Room(4, 100,  false, false);

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }




}