package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetRequiredStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.decreaseCurrentStation();
        int expected = 1;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.decreaseCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        int expected = 6;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseCurrentVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }
}