package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxStation(6);
        assertEquals(6, radio.getMaxStation());
    }

    @Test
    public void shouldIncreaseWithNewMaxStation() {
        radio.setMaxStation(14);
        radio.setCurrentStation(13);
        radio.increaseCurrentStation();
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldSetRequiredStation() {
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfLimit() {
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfOverLimit() {
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        radio.setCurrentStation(2);
        radio.decreaseCurrentStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfLimit() {
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfUnderLimit() {
        radio.setCurrentStation(-1);
        radio.decreaseCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        radio.setCurrentVolume(-1);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}

