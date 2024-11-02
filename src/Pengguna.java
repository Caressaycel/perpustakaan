public class Pengguna extends Anggota{
    public Pengguna(String nama, String email, String telepon, String alamat){
        super(nama, email, telepon, alamat);
    }
    public void pinjamBuku(Perpustakaan perpustakaan, Buku buku){
        perpustakaan.pinjamBuku(buku, this);
    }
    public void kembalikanBuku(Perpustakaan perpustakaan, Buku buku){
        perpustakaan.kembalikanBuku(buku, this);
    }
}
