package ru.netology.radio;

public class Radio {


    private int currentVolume;
    private int currentRadioStation = 10;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {

    }

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
        maxRadioStation = currentRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }


    public void pressNextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void pressVolumeUp() {
        setCurrentVolume(currentVolume + 1);

    }

    public void pressVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }

}
