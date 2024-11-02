public class Main {
    public static void main(String[] args) {

        Perpustakaan perpustakaan= new Perpustakaan();

        Buku buku1 = new BukuFiksi("Hujan","Tere liye","Gramedia", "2019", "5");
        Buku buku2 = new BukuNonFiksi("Berani tidak disukai", "Fumitake Koga", "Gramedia","2018", "7");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Anggota admin = new Admin("Agnes", "agnespeaaa@gmail.com", "08754433365", "Bantul");
        Anggota pengguna = new Pengguna("Alya", "alyaaaa@gmail.com", "0823546577","sleman");
        perpustakaan.tambahAnggota(admin);
        perpustakaan.tambahAnggota(pengguna);

        perpustakaan.tampilkanInfo();

        ((Pengguna) pengguna).pinjamBuku(perpustakaan, buku1);
        ((Pengguna) pengguna).pinjamBuku(perpustakaan, buku2);

        perpustakaan.tampilkanInfo();
        ((Pengguna) pengguna).kembalikanBuku(perpustakaan, buku1);
        ((Pengguna) pengguna).kembalikanBuku(perpustakaan, buku2);
        perpustakaan.tampilkanInfo();
    }
}