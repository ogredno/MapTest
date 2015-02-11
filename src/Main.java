import java.util.*;

public class Main {
    public static void main(String args[]) {
        MapTest maptest = new MapTest();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            maptest.menu();
            int choise = scanner.nextInt();
            if (choise <= 0 || choise > 3) break;
            switch (choise) {
                case 1: {
                    maptest.setMap(maptest.setFio(), maptest.setBal());
                    break;
                }
                case 2: {
                    maptest.output();
                    break;
                }
                case 3: {
                    maptest.outputSort();
                    break;
                }
            }
        }
    }
}
