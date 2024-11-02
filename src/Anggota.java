public class Anggota {
    private String nama;
    private String email;
    private String telepon;
    private String alamat;

    public Anggota(String nama, String email, String telepon, String alamat){
        this.nama = nama;
        this.email = email;
        this.telepon = telepon;
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public String getTelepon(){
        return telepon;
    }
    public String getAlamat(){
        return alamat;
    }
}
