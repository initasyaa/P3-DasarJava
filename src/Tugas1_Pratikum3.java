public class Tugas1_Pratikum3 {
    public static void main(String[] args) {
        int nilai[]=new int[3];
        nilai[0]=81;
        nilai[1]=90;
        nilai[2]=62;
        double rtrt = 0;
        for (int i = 0; i < nilai.length;i++){
            rtrt +=nilai[i];
        }
        rtrt/= nilai.length;

        ///dua

        int nilai2[]=new int[3];
        nilai2[0]=50;
        nilai2[1]=83;
        nilai2[2]=87;
        double rtrt2 = 0;
        for (int i = 0; i < nilai2.length;i++){
            rtrt2 +=nilai2[i];
        }
        rtrt2/= nilai2.length;

        //tigaa

        int nilai3[]=new int[3];
        nilai3[0]=89;
        nilai3[1]=55;
        nilai3[2]=65;
        double rtrt3 = 0;
        for (int i = 0; i < nilai3.length;i++){
            rtrt3 +=nilai3[i];
        }
        rtrt3/= nilai3.length;

        //empvat

        int nilai4[]=new int[3];
        nilai4[0]=77;
        nilai4[1]=70;
        nilai4[2]=92;
        double rtrt4 = 0;
        for (int i = 0; i < nilai4.length;i++){
            rtrt4 +=nilai4[i];
        }
        rtrt4/= nilai4.length;

        //===
        System.out.println("NRP    Rata-rata");
        System.out.println("------------------------");
        System.out.println("1     "+rtrt);
        System.out.println("2     "+rtrt2);
        System.out.println("3     "+rtrt3);
        System.out.println("4     "+rtrt4);
    }
}