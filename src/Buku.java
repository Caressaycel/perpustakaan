public abstract class Buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private int tahun;
    private int stok;

    public Buku(String judul, String penulis, String penerbit, int tahun, int stok){
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.stok = stok;
    }

    public String getJudul(){
        return judul;
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public abstract String getJenisBuku();
}
