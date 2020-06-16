package com.thoughtworks;

import com.thoughtworks.domain.MarksCar;
import com.thoughtworks.domain.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarksCarTest {
    MarksCar marksCar = new MarksCar();

    @Test
    public void should_return_x_0_y_1_direction_N_given_init_position_x_0_y_0_direction_N_command_given_M() {
        //初始位置为（0，0），方向为N,发送指令为M

        Position initPosition = new Position(0,0,"N");
        String command = "M";

        Position processCommandsResult = marksCar.processCommands(initPosition,command);
        //期待值
        Position expectedPosition =  new Position(0,1,"N");


        assertEquals(expectedPosition.getLongitude(), processCommandsResult.getLongitude());
        assertEquals(expectedPosition.getLatitude(), processCommandsResult.getLatitude());
        assertEquals(expectedPosition.getOrientation(), processCommandsResult.getOrientation());

    }

//    @Test
//    public void should_return_position_given_init_position_00_and_commands_NL() {
//        //初始位置为（0，0）指令为N,发送指令为L
//        //设置初始位置和方向
//        Position initPosition = new Position("0","0","N");
//        String command = "";
//        Position processCommandsResult = marksCar.processCommands(L,command);
//        //期待值
//        Position positionExcepted = new Position();
//        positionExcepted.setLatitude("0");
//        positionExcepted.setLongitude("0");
//        positionExcepted.setOrientation("W");
//
//        assertEquals(positionExcepted, processCommandsResult);
//
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_NR() {
//        //初始位置为（0，0）指令为N,发送指令为E
//        //设置初始位置和方向
//        Position initPosition = new Position();
//        initPosition.setLongitude("0");
//        initPosition.setLatitude("0");
//        initPosition.setOrientation("N");
//        Position processCommandsResult = marksCar.processCommands(initPosition);
//        //期待值
//        Position positionExcepted = new Position();
//        positionExcepted.setLatitude("0");
//        positionExcepted.setLongitude("0");
//        positionExcepted.setOrientation("E");
//
//        assertEquals(positionExcepted, processCommandsResult);
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_SM() {
//        //初始位置为（0，0）指令为SM
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_SL() {
//        //初始位置为（0，0）指令为SL
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_SR() {
//        //初始位置为（0，0）指令为SR
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_EM() {
//        //初始位置为（0，0）指令为EM
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_EL() {
//        //初始位置为（0，0）指令为EL
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_ER() {
//        //初始位置为（0，0）指令为ER
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_WM() {
//        //初始位置为（0，0）指令为WM
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_WL() {
//        //初始位置为（0，0）指令为WL
//    }
//
//    @Test
//    public void should_return_position_given_init_position_00_and_commands_WR() {
//        //初始位置为（0，0）指令为WR
//    }


//    private Position initOrResultPosition(String longitude,String latitude,String orientation) {
//        //设置初始位置和方向
//        Position position = new Position();
//        position.setLongitude(longitude);
//        position.setLatitude(latitude);
//        position.setOrientation(orientation);
//        return position;
//    }
//
}
