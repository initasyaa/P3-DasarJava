import java.util.HashMap;
import java.util.Map;

public class BukuHasMap {
    public static void main(String[] args) {
        // mmebuat objek hashmap
        HashMap<String, buku> books = new HashMap<>();

        // membuat objek buku
        buku bukuJava = new buku("Tutorial Java", "Petani Kode");
        buku bukuKotlin = new buku("Pemogrman Kotlin", "Petani Kode");
        buku bukuAndroid = new buku("Pemograman Android", "Petani Kode");

        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotling", bukuKotlin);
        books.put("android", bukuAndroid);

        //print key
        System.out.println("\nDaftar key : ");
        for (String i : books.keySet()) {
            System.out.println(i);
        }

        // print values
        System.out.println("\nDaftar values : ");
        for (buku aBook : books.values()) {
            System.out.println("Title : " + aBook.getTitle() + ",Author :" + aBook.getAuthor());
        }

        // cetak semua buku
        for (Map.Entry b : books.entrySet()) {
            buku buku = (buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        }
    }
}