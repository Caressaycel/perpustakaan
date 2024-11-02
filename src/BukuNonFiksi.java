public class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, String penulis, String penerbit, int tehun, int stok){
        super(judul, penulis, penerbit, tehun, stok);
    }
    @Override
    public String getJenisBuku(){
        return "Non-Fiksi";
    }
}
