public class P3Q_BlokDanKomentar {
    public static void main(String[] args) {
        //character accurance in a sentence analysis
        //the string that we want to anallyze
        String s ="A prorammer gets stuck in the shower b'cause the instructions on the shampoo were : Lather,wash, and repeat.";
        System.out.println(s);
        s=s.toLowerCase();

        //counters initialization
        int vowelCount = 0;
        int consonantCount=0;

        //definition of cahracter grops
        String vowels="aeiouy";
        String consonants="bcdfghjklmnpqrstvwxz";

        //convert from string to charArray
        char c[]=s.toCharArray();

        //main loop
        for (int i = i=0;i<c.length;i++){
            if (vowels.contains(String.valueOf(c[i]))){
                vowelCount++;
            }else if (consonants.contains(String.valueOf(c[i]))){
                consonantCount++;
            }
        }

        System.out.printf("vowels:%d\n", vowelCount);
        System.out.printf("Consonants:%d\n", consonantCount);
        System.out.printf("Other chyaracters: %d\n",(c.length-(vowelCount+consonantCount)));
    }
}
