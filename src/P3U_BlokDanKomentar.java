import java.util.ArrayList;

public class P3U_BlokDanKomentar {
    public static void main(String[] args) {
        //buat objek array list
        ArrayList kantongAjaib = new ArrayList();

        //mengisi kanton gajaib denga 5  benda
        kantongAjaib.add("senter pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.123);
        kantongAjaib.add(true);
        //menghapus
        kantongAjaib.remove("tikus");
        //menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);
        //menampilkan
        System.out.println("Kantong ajaib berisi " +kantongAjaib.size()+"item");
    }
}