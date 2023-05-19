package org.example.service;

import org.example.Factory.EstateFactory;
import org.example.enumuration.EstateType;
import org.example.model.House;
import org.example.repository.Estate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EstateService {
    private List<Estate> houseList;
    private List<Estate> villaList;
    private List<Estate> summerHouseList;

    public EstateService() {
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();

        Random random = new Random();

        /*
         * Create instances of House using EstateFactory
         */
        for (int i = 0; i < 3; i++) {
            double price = 100000 + random.nextInt(400000);
            double area = 80 + random.nextInt(221);
            int numberOfRooms = 2 + random.nextInt(5);
            houseList.add(EstateFactory.createHouse(EstateType.HOUSE, price, area, numberOfRooms));
        }

        /*
         *Create instances of Villa using EstateFactory
         */
        for (int i = 0; i < 3; i++) {
            double price = 500000 + random.nextInt(500000);
            double area = 200 + random.nextInt(101);
            int numberOfRooms = 4 + random.nextInt(3);
            villaList.add(EstateFactory.createHouse(EstateType.VILLA, price, area, numberOfRooms));
        }


        /*
         * Create instances of SummerHouse using EstateFactory
         */
        for (int i = 0; i < 3; i++) {
            double price = 200000 + random.nextInt(200000);
            double area = 60 + random.nextInt(61);
            int numberOfRooms = 1 + random.nextInt(2);
            summerHouseList.add(EstateFactory.createHouse(EstateType.SUMMERHOUSE, price, area, numberOfRooms));
        }
    }

    /*
    * getHouseList method returns house list
    * */
    public List<Estate> getHouseList() {
        return houseList;
    }
    /*
     * getVillaList method returns villa list
     * */
    public List<Estate> getVillaList() {
        return villaList;
    }
    /*
     * getSummerHouseList method returns Summer House list
     * */
    public List<Estate> getSummerHouseList() {
        return summerHouseList;
    }

    /*
    * getTotalPriceOfHouses method returns Total Price Of Houses
    * */
    public double getTotalPriceOfHouses () {
        double total = 0;
        for (Estate house : houseList) {
            total += house.getPrice();
        }
        return total;
    }
    /*
     * getTotalPriceOfVillas method returns Total Price Of Villas
     * */
    public double getTotalPriceOfVillas () {
        double total = 0;
        for (Estate villa : villaList) {
            total += villa.getPrice();
        }
        return total;
    }
    /*
     * getTotalPriceOfSummerHouses method returns Total Price Of Summer Houses
     * */
    public double getTotalPriceOfSummerHouses () {
        double total = 0;
        for (Estate summerHouse : summerHouseList) {
            total += summerHouse.getPrice();
        }
        return total;
    }
    /*
     * getTotalPriceOfAllEstates method returns Total Price Of All Estates
     * */
    public double getTotalPriceOfAllEstates () {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }
    /*
     * getAverageAreaOfHouses returns average area Of Houses
     * */
    public double getAverageAreaOfHouses() {
        double totalArea = 0;
        for (Estate house : houseList) {
            totalArea += house.getArea();
        }
        return totalArea / houseList.size();
    }
    /*
     * getTotalPriceOfSummerHouses method returns average area Of Villas
     * */
    public double getAverageAreaOfVillas() {
        double totalArea = 0;
        for (Estate villa : villaList) {
            totalArea += villa.getArea();
        }
        return totalArea / villaList.size();
    }
    /*
     * getTotalPriceOfSummerHouses method returns average area Of Summer Houses
     * */
    public double getAverageAreaOfSummerHouses() {
        double totalArea = 0;
        for (Estate summerHouse : summerHouseList) {
            totalArea += summerHouse.getArea();
        }
        return totalArea / summerHouseList.size();
    }
    /*
     * getTotalPriceOfSummerHouses method returns Total Area Of Houses
     * */
    public double getTotalAreaOfHouses() {
        double totalArea = 0;
        for (Estate house : houseList) {
            totalArea += house.getArea();
        }
        return totalArea ;
    }
    /*
     * getTotalPriceOfSummerHouses method returns Total Area Of Villas
     * */
    public double getTotalAreaOfVillas() {
        double totalArea = 0;
        for (Estate villa : villaList) {
            totalArea += villa.getArea();
        }
        return totalArea;
    }
    /*
     * getTotalPriceOfSummerHouses method returns Total Area Of Summer Houses
     * */
    public double getTotalAreaOfSummerHouses() {
        double totalArea = 0;
        for (Estate summerHouse : summerHouseList) {
            totalArea += summerHouse.getArea();
        }
        return totalArea;
    }
    /*
     * getTotalPriceOfSummerHouses method returns Total Area Of All Estates
     * */
    public double getAverageAreaOfAllHouses () {
        int totalNumOfHouses = houseList.size() + villaList.size() + summerHouseList.size();
        double totalArea = getTotalAreaOfHouses() + getTotalAreaOfVillas() + getTotalAreaOfSummerHouses();
        return totalArea / totalNumOfHouses;
    }
    /*
     * getTotalPriceOfSummerHouses method returns Filtered Houses by Number Of Rooms
     * */
    public List<Estate> filterHousesByRoomAndLivingRoom (int numberOfRooms){
        List<Estate> filteredHouses = new ArrayList<>();
        for (Estate house : houseList) {
            if (house.getNumberOfRooms() == numberOfRooms) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }
}
