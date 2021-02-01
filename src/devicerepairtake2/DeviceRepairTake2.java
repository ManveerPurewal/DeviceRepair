package devicerepairtake2;

import java.util.Scanner;

public class DeviceRepairTake2 {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Device myNewDevice = new Device("12345", "MacBook", "Mani", "Smashed Screen", "Not Started yet", 1);
        System.out.println(myNewDevice.toString());

    }

    public static void MainMenu() {
        while (true) {
            System.out.println("Please select an option");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("You chose 1");
                    break;
                    
            }
            
            
        }
    }
}
