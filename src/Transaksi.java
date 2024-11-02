import java.util.Date;

abstract class Transaksi {
    private Buku buku;
    private Anggota anggota;
    private Date tanggal;


    public Transaksi(Buku buku, Anggota anggota, Date tanggal){
        this.buku = buku;
        this.anggota = anggota;
        this.tanggal = tanggal;
    }
    public Buku getBuku(){
        return buku;
    }
    public  Anggota getAnggota(){
        return anggota;
    }
    public Date getTanggal(){
        return tanggal;
    }
}
