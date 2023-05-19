package org.example.Factory;

import org.example.enumuration.EstateType;
import org.example.model.House;
import org.example.model.SummerHouse;
import org.example.model.Villa;
import org.example.repository.Estate;

public class EstateFactory {
    public static Estate createHouse(EstateType estateType, double price, double area, int numberOfRooms) {
        switch (estateType) {
            case HOUSE:
                return new House(price, area, numberOfRooms);
            case VILLA:
                return new Villa(price, area, numberOfRooms);
            case SUMMERHOUSE:
                return new SummerHouse(price, area, numberOfRooms);
            default:
                throw new IllegalArgumentException("Invalid house type: " + estateType);
        }
    }
}
