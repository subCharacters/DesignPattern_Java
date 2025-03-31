package Mediator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                smartHome.report();
                int i = scanner.nextInt();

                if (i == 1) smartHome.door.open();
                else if (i == 2) smartHome.door.close();
                else if (i == 3) smartHome.window.open();
                else if (i == 4) smartHome.window.close();
                else if (i == 5) smartHome.coolAircon.on();
                else if (i == 6) smartHome.coolAircon.off();
                else if (i == 7) smartHome.heatBoiler.on();
                else if (i == 8) smartHome.heatBoiler.off();
            } while (true);
        }
    }
}
