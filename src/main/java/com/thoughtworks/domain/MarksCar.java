package com.thoughtworks.domain;


public class MarksCar {

    public Position processCommands(Position initPosition,String command) {
        Position resultPosition = new Position();
        resultPosition.setOrientation(initPosition.getOrientation());
        resultPosition.setLongitude(initPosition.getLongitude());
        resultPosition.setLatitude(initPosition.getLatitude());
        if("N".equals(initPosition.getOrientation())){
            if("M".equals(command)){
                resultPosition.setLatitude(initPosition.getLatitude() + 1);
            }
            if("L".equals(command)){
                resultPosition.setOrientation("W");
            }
            if("R".equals(command)){
                resultPosition.setOrientation("E");
            }
        }

        if("S".equals(initPosition.getOrientation())){
            if("M".equals(command)){
                resultPosition.setLatitude(initPosition.getLatitude() - 1);
            }
            if("L".equals(command)){
                resultPosition.setOrientation("E");
            }
            if("R".equals(command)){
                resultPosition.setOrientation("W");
            }

        }

        if("E".equals(initPosition.getOrientation())){
            if("M".equals(command)){
                resultPosition.setLongitude(initPosition.getLongitude() + 1);
            }
            if("L".equals(command)){
                resultPosition.setOrientation("N");
            }
            if("R".equals(command)){
                resultPosition.setOrientation("S");
            }

        }


        if("W".equals(initPosition.getOrientation())){
            if("M".equals(command)){
                resultPosition.setLongitude(initPosition.getLongitude() - 1);
            }
//            if("L".equals(command)){
//                resultPosition.setOrientation("N");
//            }
//            if("R".equals(command)){
//                resultPosition.setOrientation("S");
//            }

        }


        return resultPosition;
    }
}
