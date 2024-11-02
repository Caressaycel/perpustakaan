public class BukuFiksi extends Buku {
    public BukuFiksi(String judul, String penulis, String penerbit, int tahun, int stok){
        super(judul, penulis, penerbit, tahun, stok);
    }
    @Override
    public String getJenisBuku(){
        return "Fiksi";
    }
}

