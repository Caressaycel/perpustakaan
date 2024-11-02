import java.util.Date;

public class Peminjaman extends Transaksi{
    public Peminjaman(Buku buku, Anggota anggota, Date tanggal){
        super(buku, anggota, tanggal);
    }
}
