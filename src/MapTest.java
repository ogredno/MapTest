
import java.util.*;

public class MapTest {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> map = new HashMap<String, String>();

    public void menu() {
        System.out.println("1.Input student: ");
        System.out.println("2. Output info: ");
        System.out.println("3. Output sort: ");
    }

    public String setFio() {
        System.out.println("Input Surname(space)Surname: ");
        String name = scanner.nextLine();
        return name;
    }

    public String setBal() {
        System.out.println("Input bal (b1/b2/b3/b4/b5): ");
        String bal = scanner.nextLine();
        return bal;
    }

    public void setMap(String name, String bal) {
        map.put(name, bal);
    }

    public void output() {
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey() + "  " + entry.getValue());
    }

    public void outputSort() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String mas[] = entry.getValue().split("/");
            double sum = 0;
            for (int i = 0; i < mas.length; i++) {
                sum += Integer.valueOf(mas[i]);
            }
            System.out.println(entry.getKey() + "  " + (sum/5));
        }




        }

    }







