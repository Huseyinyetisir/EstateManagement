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

        // Create instances of House using HouseFactory
        for (int i = 0; i < 3; i++) {
            double price = 100000 + random.nextInt(400000);
            double area = 80 + random.nextInt(221);
            int numberOfRooms = 2 + random.nextInt(5);
            houseList.add(EstateFactory.createHouse(EstateType.HOUSE, price, area, numberOfRooms));
        }

        // Create instances of Villa using HouseFactory
        for (int i = 0; i < 3; i++) {
            double price = 500000 + random.nextInt(500000);
            double area = 200 + random.nextInt(101);
            int numberOfRooms = 4 + random.nextInt(3);
            villaList.add(EstateFactory.createHouse(EstateType.VILLA, price, area, numberOfRooms));
        }

        // Create instances of SummerHouse using HouseFactory
        for (int i = 0; i < 3; i++) {
            double price = 200000 + random.nextInt(200000);
            double area = 60 + random.nextInt(61);
            int numberOfRooms = 1 + random.nextInt(2);
            summerHouseList.add(EstateFactory.createHouse(EstateType.SUMMERHOUSE, price, area, numberOfRooms));
        }
    }

        public List<Estate> getHouseList() {
            return houseList;
        }

        public List<Estate> getVillaList() {
            return villaList;
        }

        public List<Estate> getSummerHouseList() {
            return summerHouseList;
        }

        public double getTotalPriceOfHouses () {
            double total = 0;
            for (Estate house : houseList) {
                total += house.getPrice();
            }
            return total;
        }

        public double getTotalPriceOfVillas () {
            double total = 0;
            for (Estate villa : villaList) {
                total += villa.getPrice();
            }
            return total;
        }

        public double getTotalPriceOfSummerHouses () {
            double total = 0;
            for (Estate summerHouse : summerHouseList) {
                total += summerHouse.getPrice();
            }
            return total;
        }

        public double getTotalPriceOfAllEstates () {
            return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
        }

        public double getAverageAreaOfHouses() {
            double totalArea = 0;
            for (Estate house : houseList) {
                totalArea += house.getArea();
            }
            return totalArea / houseList.size();
        }

        public double getAverageAreaOfVillas() {
            double totalArea = 0;
            for (Estate villa : villaList) {
                totalArea += villa.getArea();
            }
            return totalArea / villaList.size();
        }

        public double getAverageAreaOfSummerHouses() {
            double totalArea = 0;
            for (Estate summerHouse : summerHouseList) {
                totalArea += summerHouse.getArea();
            }
            return totalArea / summerHouseList.size();
        }
        public double getTotalAreaOfHouses() {
            double totalArea = 0;
            for (Estate house : houseList) {
                totalArea += house.getArea();
            }
            return totalArea ;
        }

        public double getTotalAreaOfVillas() {
            double totalArea = 0;
            for (Estate villa : villaList) {
                totalArea += villa.getArea();
            }
            return totalArea;
        }

        public double getTotalAreaOfSummerHouses() {
            double totalArea = 0;
            for (Estate summerHouse : summerHouseList) {
                totalArea += summerHouse.getArea();
            }
            return totalArea;
        }

        public double getAverageAreaOfAllHouses () {
            int totalNumOfHouses = houseList.size() + villaList.size() + summerHouseList.size();
            double totalArea = getTotalAreaOfHouses() + getTotalAreaOfVillas() + getTotalAreaOfSummerHouses();
            return totalArea / totalNumOfHouses;
        }

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
