import static java.lang.Math.round;

public class P3A_BlokDanKomentar {
    public static void main(String[] args) {
        double varDouble =2.37;
        long roundResult = round(varDouble);
        System.out.printf("Pembulatan round %.2f adalah %d\n", varDouble, roundResult);

        varDouble = 2.49;
        roundResult = round(varDouble);
        System.out.printf("Pembulatan floor %.2f adalah %d\n",varDouble, roundResult);
    }
}
