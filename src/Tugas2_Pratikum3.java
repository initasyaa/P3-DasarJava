import java.util.Scanner;

public class Tugas2_Pratikum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil_input, tot_prev = 0, bil1 = 0, bil2 = 1, bil_ulang = 0;

        System.out.print("Masukkan berapa deret Fibonacci = ");
        bil_input = sc.nextInt();

        System.out.print(bil_input+" Deret Fibonanci = ");
        System.out.print(tot_prev);

        while(bil_ulang <= bil_input) {
            tot_prev = bil1+bil2;
            bil2 = bil1;
            bil1 = tot_prev;

            System.out.print(" "+tot_prev);
            bil_ulang++;
        }
    }
}