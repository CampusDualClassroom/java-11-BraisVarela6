package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());




        if (redRemote.isOn()){
            redRemote.turnOff();
            System.out.println("La TV se acaba de apagar");
        } else {
            redRemote.turnOn();
            System.out.println("La TV se acaba de encender");
        }

        redRemote.channelUp();

        do {
            redRemote.channelDown();
        } while (redRemote.getChannel() >= 0);

        redRemote.volumeUp();

        do {
            redRemote.volumeDown();
        } while (redRemote.getVolume() >= 0);


        redRemote.turnOff();
    }

}