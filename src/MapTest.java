
import java.util.*;
public class MapTest {
    Scanner scanner = new Scanner(System.in);
    Map<String,String> map=new HashMap<String, String>();

    public void menu(){
        System.out.println("1.Input student: ");
        System.out.println("2. Output info: ");
        System.out.println("2. Output sort: ");
    }

    public String setFio(){
        System.out.println("Input Surname(space)Surname: ");
        String name=scanner.nextLine();
        return name;
    }

    public String setBal(){
        System.out.println("Input bal (b1/b2/b3/b4/b5): ");
        String bal=scanner.nextLine();
        return bal;
    }

    public void setMap(String name, String bal){
        map.put(name,bal);
    }

    public void output(){
        for(Map.Entry<String, String> entry: map.entrySet())
            System.out.println(entry.getKey() + "  " + entry.getValue());
            }

    public void outputSort(){
        int sum=0;
        int res =0;
for(String k: map.keySet() ){
    for(String t: map.values()){
        String mas[]=t.split("/");

        for(int i=0; i< mas.length; i++){
            sum +=Integer.valueOf(mas[i]);
        }
        res=sum/mas.length;
    }

    System.out.println(k+"    "+res);

}

    }

    }





