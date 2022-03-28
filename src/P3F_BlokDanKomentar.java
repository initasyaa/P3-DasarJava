import java.text.NumberFormat;

public class P3F_BlokDanKomentar {
    public static void main(String[] args) {
        NumberFormat nf =NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        int nilai[][]=new int [2][3];
        nilai[0][0]=85;
        nilai[0][1]=81;
        nilai[0][2]=78;
        nilai[1][0]=65;
        nilai[1][1]=73;
        nilai[1][2]=71;
        String MK[]= {"RPL","PBO"};
        double rtrtMK[]=new double[nilai.length];
        for (int i= 0;i<nilai.length;i++){
            for (int j=0;j<nilai[0].length;j++){
                rtrtMK[i] += nilai[i][j];
            }
            rtrtMK[i]/=nilai[0].length;
        }
        System.out.println("Nilai Mata Kuliah\n");
        System.out.println("MK\tMinggu\tMinggu2\tMinggu3\tRataRata");
        for (int i= 0;i<nilai.length;i++){
            System.out.print(MK[i]+"\t");
            for (int j=0;j<nilai[0].length;j++){
                System.out.print(nilai [i][j]+"\t");
            }
            System.out.print(nf.format((rtrtMK[i])+"\n"));
        }
    }
}