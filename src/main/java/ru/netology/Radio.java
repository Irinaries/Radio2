package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int soundVolume;


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }


    public int getSoundVolume() {
        return soundVolume;
    }


    public void setCurrentStationNumber(int CurrentStationNumber) {
        if (CurrentStationNumber >= 9) {
            return;
        }
        if (CurrentStationNumber <= 0) {
            return;
        }
        currentStationNumber = CurrentStationNumber;
    }

    public void setSoundVolume(int SoundVolume) {
        if (SoundVolume >= 100) {
            return;
        }
        if (SoundVolume <= 0) {
            return;
        }
        soundVolume = SoundVolume;
    }

    public void maxCurrentStationNumber() {
        currentStationNumber = 9;
    }


    public void nextStationNumber() {
        if (currentStationNumber <= 9) {
        }
        if (currentStationNumber == 0) {
            return;
        }
        currentStationNumber = currentStationNumber +1;
    }


    public void prevStationNumber() {
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;

    }


    public void maxSoundVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void moreSoundVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }


    public void increaseVolume() {
        if (soundVolume <= 100) {
            soundVolume++;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}
