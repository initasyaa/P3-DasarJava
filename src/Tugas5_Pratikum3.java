public class Tugas5_Pratikum3 {
    public static void main(String[] args) {
        char[] matKul ={'p','e','m','r','o','g','r','a','m','a','n','b','e','r','b','a','s','i','s','o','b','y','e','k'};
        int j =0;
        for (int i = 0; i < matKul.length; i++) {
            //System.out.println("data ke : "+i+" = "+matKul[i]);
            if (matKul[i]=='a'){
                j+=1;
            }
        }
        System.out.println("hitunglah jmlah huruf a pada array berikut");
        System.out.println("{'p','e','m','r','o','g','r','a','m','a','n','b','e','r','b','a','s','i','s','o','b','y','e','k'}");
        System.out.println("huruf a sebanyak : "+j);
    }
}
