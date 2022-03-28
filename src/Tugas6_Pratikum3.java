import java.util.Scanner;
public class Tugas6_Pratikum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        System.out.print("Kalimat : ");
        String kal=scan.nextLine();
        System.out.print("Karakter yang dicari: ");
        char kar=scan.next().charAt(0);
        System.out.print("Karakter "+kar+" terdapat pada index ke ");while (i<kal.length()) {
            i=kal.indexOf(kar, i);
            if(i==-1)
                break;
            System.out.print(i+", ");
            i++;
        }
        System.out.println("");
    }
}