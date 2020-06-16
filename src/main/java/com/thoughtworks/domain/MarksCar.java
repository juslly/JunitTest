package com.thoughtworks.domain;


public class MarksCar {

    public Position processCommands(Position initPosition,String command) {
        Position resultPosition = initPosition;
        if("N".equals(initPosition.getOrientation())){
            if("M".equals(command)){
                resultPosition.setLatitude(initPosition.getLatitude() + 1);
            }

        }


        return resultPosition;
    }
}
