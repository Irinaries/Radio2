package ru.netology;

public class Radio {
    private int maxCurrentStationNumber = 9;
    private int minCurrentStationNumber = 0;
    private int currentStationNumber = minCurrentStationNumber;

    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int soundVolume = minSoundVolume;

    public Radio() {

    }

    public Radio(int sizeStation) {
        maxCurrentStationNumber = minCurrentStationNumber + sizeStation - 1;
        maxSoundVolume = minSoundVolume + sizeStation;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getMaxCurrentStationNumber() {
        return maxCurrentStationNumber;
    }

    public int getMinCurrentStationNumber() {
        return minCurrentStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber >= 9) {
            return;
        }
        if (newCurrentStationNumber <= 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume >= 100) {
            return;
        }
        if (newSoundVolume <= 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void maxCurrentStationNumber() {
        currentStationNumber = 9;
    }


    public void nextStationNumber() {
        if (currentStationNumber == 0) {
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }


    public void prevStationNumber() {
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;

    }


    public void maxSoundVolume() {
        soundVolume = 1;
    }

    public void moreSoundVolume() {
        if (soundVolume == 0) {
            return;
        }
        soundVolume = soundVolume + 1;
    }


    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}
