package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetCurrentRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-1);
        radio.setCurrentRadioStation(11);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPressNextRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        radio.pressNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        radio.pressNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(11);
        radio.pressNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPressPrevRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        radio.pressPrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetToMaxRadioStation() {
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxRadioStation(-1);
        radio.setMaxRadioStation(0);
        radio.setMaxRadioStation(11);
        assertEquals(11, radio.getMaxRadioStation());
    }

    @Test
    public void shouldGetToMinStation() {
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setMinRadioStation(-1);
        radio.setMinRadioStation(0);
        radio.setMinRadioStation(11);
        assertEquals(11, radio.getMinRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(100, radio.getCurrentVolume());

        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMinVolume() {
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldGetMaxVolume() {
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setMaxVolume(100);
        radio.setMinVolume(1);
        assertEquals(1, radio.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setMinVolume(1);
        radio.setMaxVolume(101);
        assertEquals(101, radio.getMaxVolume());
    }

    @Test
    public void shouldPressVolumeUp() {
        radio.setCurrentVolume(4);
        radio.pressVolumeUp();
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.pressVolumeUp();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldPressVolumeDown() {
        radio.setCurrentVolume(4);
        radio.pressVolumeDown();
        assertEquals(3, radio.getCurrentVolume());

        radio.pressVolumeDown();
        assertEquals(2, radio.getCurrentVolume());
    }


}
