import java.util.Scanner;
public class Tugas8_Pratikum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        System.out.print("Masukkan kalimat: ");
        String kal=scan.nextLine(), a=kal.substring(0,1);
        kal=kal.replaceAll(Character.toString(kal.charAt(0)),
                Character.toString(kal.charAt(kal.length()-1)));
        kal=kal.substring(0, kal.length()-1)+a;
        System.out.println(kal);
    }
}