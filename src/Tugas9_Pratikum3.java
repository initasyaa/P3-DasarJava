import java.util.Scanner;

public class Tugas9_Pratikum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        System.out.print("Masukkan nama pertama: ");
        String kal1=scan.nextLine();
        System.out.print("Masukkan nama kedua : ");
        String kal2=scan.nextLine();
        String kal3=kal2.substring(0, kal2.indexOf(" ")+1)+kal1.substring(kal1.indexOf(" ")+
                1, kal1.length());String kal4=kal1.substring(0, kal1.indexOf(" ")+1)+
                kal2.substring(kal2.indexOf(" ")+1, kal2.length());System.out.println("\nSting nama pertama :"+kal3);
        System.out.println("Sting nama kedua :"+kal4);
    }
}