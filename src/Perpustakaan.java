import java.util.ArrayList;
import java.util.List;


public class Perpustakaan {
    private String nama;
    private List<Buku> daftarBuku;
    private List<Anggota> daftarAnggota;
    private List<Transaksi> daftarTransaksi;

    public Perpustakaan(){
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
        this.daftarTransaksi = new ArrayList<>();
    }
    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
    }
    public void tambahAnggota(Anggota anggota){
        daftarAnggota.add(anggota);
    }
    public void pinjamBuku(Buku buku, Anggota anggota){
        if (buku.getStok() > 0){
            buku.setStok(buku.getStok() - 1);
            Transaksi transaksi = new Peminjaman(buku, anggota);
            daftarTransaksi.add(transaksi);
            System.out.println(anggota.getNama() + "berhasil meminjam" + buku.getJudul());
        }else {
            System.out.println("Buku" + buku.getJudul() + " tidak tersedia.");
        }
    }
    public void kembalikanBuku(Buku buku, Anggota anggota){
        for (Transaksi transaksi : daftarTransaksi){
            if (transaksi instanceof  Peminjaman && transaksi.getBuku().equals(buku) && transaksi.getAnggota().equals(anggota)){
                buku.setStok(buku.getStok() + 1);
                Transaksi pengembalian = new Pengembalian(buku, anggota);
                daftarTransaksi.add(pengembalian);
                System.out.println(anggota.getNama() + " berhasil mengembalikan" + buku.getJudul());
                return;
            }
        }
        System.out.println("Transaksi peminjaman tidak ditemukan.");
    }
    public void tampilkanInfo(){
        System.out.println("Perpustakaan :" + nama);
        System.out.println("Daftar Buku :");
        for (Buku buku : daftarBuku){
            System.out.println(" - " + buku.getJudul() + " (Stok:" + buku.getStok() + ")");
        }
    }
}
