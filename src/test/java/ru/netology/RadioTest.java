package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxStation(12);
        assertEquals(12, radio.getMaxStation());

    }

    @Test
    public void shouldIncreaseWithNewMaxStation() {
        radio.setMaxStation(12);
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(11, radio.getCurrentStation());

    }

    @Test
    public void shouldSetRequiredStation() {
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        radio.setCurrentStation(6);
        radio.increaseCurrentStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfLimit() {
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfOverLimit() {
        radio.setCurrentStation(12);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        radio.setCurrentStation(7);
        radio.decreaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfLimit() {
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfUnderLimit() {
        radio.setCurrentStation(-10);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        radio.setCurrentVolume(110);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        radio.setCurrentVolume(-100);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}

