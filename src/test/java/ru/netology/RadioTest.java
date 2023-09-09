package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio(11);
        radio.setCurrentStationNumber(5);

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(10, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStationNumber(10);

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNotSetStationNumberBelowMin() {
        Radio radio = new Radio(9);
        radio.setCurrentStationNumber(-1);

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(8, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio radio = new Radio(0);
        radio.setCurrentStationNumber(8);
        radio.maxCurrentStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(-1, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentStationNumber(5);
        radio.nextStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextMoreMaxStationNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentStationNumber(9);
        radio.nextStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }


    @Test
    public void shouldPrevStationNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentStationNumber(7);
        radio.prevStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevMinStationNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentStationNumber(7);
        radio.prevStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, radio.getCurrentStationNumber());
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio radio = new Radio(10);
        radio.setSoundVolume(54);

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(10, radio.getMaxSoundVolume());
        Assertions.assertEquals(54, radio.getSoundVolume());
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio radio = new Radio(40);
        radio.setSoundVolume(40);
        radio.maxSoundVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(40, radio.getMaxSoundVolume());
        Assertions.assertEquals(1, radio.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio radio = new Radio(54);
        radio.setSoundVolume(54);

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(54, radio.getMaxSoundVolume());
        Assertions.assertEquals(54, radio.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio radio = new Radio(100);

        radio.setSoundVolume(0);

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getSoundVolume());
    }


    @Test
    public void shouldMoreSoundVolume() {
        Radio radio = new Radio(100);
        radio.setSoundVolume(0);
        radio.moreSoundVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldMoreMaxSoundVolume() {
        Radio radio = new Radio(1);
        radio.setSoundVolume(0);

        radio.moreSoundVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(1, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getSoundVolume());
    }


    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio(7);

        radio.setSoundVolume(5);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(7, radio.getMaxSoundVolume());
        Assertions.assertEquals(4, radio.getSoundVolume());
    }
}
