public class P3R_BlokDanKomentar {
    public static void main(String[] args) {
        //the..
        //var..
        String s = "blackholesarewheregoddividebyzero";
        System.out.printf("Original message : %s\n",s);
        String message ="";
        int shift=1;
        //convert from..
        char arrayStr[]=s.toCharArray();

        //loop..
        for (char c: arrayStr){
            int i = (int)c;
            i+=shift;
            if (i >((int)'Z')){
                i-=26;
            }
            char newChar=(char)i;
            message+=newChar;
        }
        //printing
        System.out.printf("Encrypted message: %s\n",message);
    }
}