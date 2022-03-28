public class P3E_BlokDanKomentar {
    public static void main(String[] args) {

        int nilai[]=new int[3];
        nilai[0]=70;
        nilai[1]=80;
        nilai[2]=65;
        double rtrt = 0;
        for (int i = 0; i < nilai.length;i++){
            rtrt +=nilai[i];
        }
        rtrt/= nilai.length;
        System.out.println("Nilai rata rata = "+rtrt);
    }
}