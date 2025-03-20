public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", "10002", "Informatika", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Andi", "10003", "Sistem Informasi", 2.8);

        System.out.println("Data Mahasiswa 1 = ");
        mhs1.tampilkanInfo();
        System.out.println("Lulus: " + mhs1.cekLulus());

        System.out.println("\nData Mahasiswa 2 = ");
        mhs2.tampilkanInfo();
        System.out.println("Lulus: " + mhs2.cekLulus());
    }
}
