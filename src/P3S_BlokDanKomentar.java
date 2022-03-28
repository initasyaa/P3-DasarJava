import java.util.ArrayList;

public class P3S_BlokDanKomentar {
    public static void main(String[] args) {
        ArrayList<String>cars= new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); //mencetak arraylist

        //mengakses elemen arraylis pake konven nfor
        for (int i=0;i<cars.size();i++){
            System.out.printf("%s",cars.get(i));
        }
        System.out.println();

        //mengakses elemen arraylis pake for each
        for (String car:cars){
            System.out.printf("%s",car);
        }
        System.out.println();

        //mengakses elemen arraylis pake fungsional for each
        cars.forEach((car)->{
            System.out.printf("%s",car);
        });
        System.out.println();
    }
}