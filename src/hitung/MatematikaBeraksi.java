
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika ilham = new Matematika(8,2);
        
        System.out.println("Hasil Penjumlahan : " + ilham.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + ilham.setPengurangan());
        System.out.println("Hasil Perkalian : " + ilham.setPerkalian());
        System.out.println("Hasil Pembagian : " + ilham.setPembagian());
    }
}
