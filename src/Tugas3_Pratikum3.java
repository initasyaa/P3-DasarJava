import java.util.Scanner;

public class Tugas3_Pratikum3 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;

        System.out.print("Masukan bilangan ? ");
        bil=input.nextInt();

        System.out.println("----------------------------------------------");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bil+" adalah bilangan prima");
        }else {
            System.out.println(bil+" bukan termasuk bilangan prima");
        }
    }
}