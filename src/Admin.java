public class Admin extends Anggota{
    public Admin(String nama, String email, String telepon, String alamat){
        super(nama, email, telepon, alamat);
    }
    public void tambahBuku(Perpustakaan perpustakaan, Buku buku){
        perpustakaan.tambahBuku(buku);
        System.out.println(" Admin " + getNama() + " menambahkan buku : " + buku.getJudul());
    }
}
