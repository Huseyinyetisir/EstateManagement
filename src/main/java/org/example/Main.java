package org.example;

import org.example.model.House;
import org.example.repository.Estate;
import org.example.service.EstateService;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        EstateService estateService = new EstateService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Real Estate Service Menu:");
            System.out.println("1. Get total price of houses");
            System.out.println("2. Get total price of villas");
            System.out.println("3. Get total price of summer houses");
            System.out.println("4. Get total price of all houses");
            System.out.println("5. Get average area of houses");
            System.out.println("6. Get average area of villas");
            System.out.println("7. Get average area of summer houses");
            System.out.println("8. Get average area of all houses");
            System.out.println("9. Filter houses by room and living room count");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double housePrice = estateService.getTotalPriceOfHouses();
                    System.out.println("Total price of houses: $" + housePrice);
                    break;
                case 2:
                    double villaPrice = estateService.getTotalPriceOfVillas();
                    System.out.println("Total price of villas: $" + villaPrice);
                    break;
                case 3:
                    double summerHousePrice = estateService.getTotalPriceOfSummerHouses();
                    System.out.println("Total price of summer houses: $" + summerHousePrice);
                    break;
                case 4:
                    double totalHousePrice = estateService.getTotalPriceOfAllEstates();
                    System.out.println("Total price of all estates: $" + totalHousePrice);
                    break;
                case 5:
                    double houseArea = estateService.getAverageAreaOfHouses();
                    System.out.println("Average area of houses: " + houseArea + " sq.m");
                    break;
                case 6:
                    double villaArea = estateService.getAverageAreaOfVillas();
                    System.out.println("Average area of villas: " + villaArea + " sq.m");
                    break;
                case 7:
                    double summerHouseArea = estateService.getAverageAreaOfSummerHouses();
                    System.out.println("Average area of summer houses: " + summerHouseArea + " sq.m");
                    break;
                case 8:
                    double totalArea = estateService.getAverageAreaOfAllHouses();
                    System.out.println("Average area of all estates: " + totalArea + " sq.m");
                    break;
                case 9:
                    System.out.print("Enter room count: ");
                    int numberOfRooms = scanner.nextInt();
                    List<Estate> filteredHouses = estateService.filterHousesByRoomAndLivingRoom(numberOfRooms);
                    System.out.println("Filtered houses:");
                    for (Estate house : filteredHouses) {
                        System.out.println("Price: $" + house.getPrice() + ", Area: " + house.getArea() + " sq.m");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }


}