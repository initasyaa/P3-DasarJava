import java.util.HashMap;

public class P3V_BlokDanKomentar {
    public static void main(String[] args) {
        //buat objek hashmap
        HashMap<Integer,String>days=new HashMap<>();

        //mengisi nilai objek
        days.put(1,"Minggu");
        days.put(2,"Senin");
        days.put(3,"Selasa");
        days.put(4,"Rabu");
        days.put(5,"Kamis");
        days.put(6,"Jumat");
        days.put(7,"Sabtu");

        //cetak
        System.out.println("isi objek days: "+days);
        System.out.println("hari kedua: "+days.get(2));

        //ubah minggu ke ahad
        days.put(1,"ahad");

        //ubah rabu jadi rabo
        days.replace(4,"Rabo");

        //cetak semua
        System.out.println("isi objek days: "+days);

        //hapus malming <-- jombli detected :D
        days.remove(1);
        System.out.println("isi objek days : "+days);

        //hapus semua hari <-- oh tidak kiamat donk!
        days.clear();
        System.out.println("isi objek days : "+days);
    }
}