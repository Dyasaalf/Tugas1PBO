public class MakhlukHidup {

    private String nama;       //atribute String harus besar 'S'
    private String jenis;
    public double berat = -1.0;  //berat badan tidak logis ketika negatif, dan inisialisasi nya sudah ada pada construktor MakhlukHidup
    private int umur;


    public MakhlukHidup() {         
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void Makhluk(String nama) { //bukan constractor, nama metode seharusnya jangan mirip nama class
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public MakhlukHidup(String nama, String jenis, int umur, double berat) { //nama metode 'm' kecil
        this.nama = nama;  // hasil ouotputnya salah, terbalik karena menggunakan jenis
        this.jenis = jenis; //hasil ouotputnya salah, terbalik karena menggunakan nama
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama; //awalnya this.nama = this.nama seharusnya this.nama=other.nama
        this.jenis = other.jenis; 
        this.umur = other.umur;      //awalnya this.umur = this.umur seharusnya this.umur=other. umur
        this.berat = other.berat;
    }


    public void setUmur(int umur) { //atribute awalnya 'string' harusnya tipe data nya 'int'
        this.umur = umur;
    }

    public void setNama(String nama) { //terbalik 'nama= this.nama' , seharusnya 'this.nama= nama'
        this.nama = nama; 
    }

    public String getInfo() {      //karna atribute awalnya int, sehharusnya menggunakan String
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}