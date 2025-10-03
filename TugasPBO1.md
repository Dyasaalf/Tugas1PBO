# 📘 Tugas 1 Pemrograman Berorientasi Object
### Meliputi materi :
1. **Class dan Object (Pertemuan 2)**
2. **Encapsulation (Pertemuan 3)**
3. **Constructor (Pertemuan 4)**


---

## 💻 Analisa Kode Berikut

### Kode `MakhlukHidup.java` dan `TestAccess.java` versi `ERROR`
><div style="color: blue">
><strong>Tugas:<br/>
>1. Temukan, jelaskan, dan perbaiki setiap error berkaitan dengan materi pada MakhlukHidup.java dan TestAccess.java. Ada 10+ kesalahan. Setiap kesalahan memiliki skor (lihat pada tabel skor). Skor minimal LULUS = 60.
><br/>
>2. Tuliskan output dari TestAccess jika kode sudah diperbaiki
></strong>
</div>

```java

public class MakhlukHidup {

    private string nama;       
    private String jenis;
    public double berat = -1.0;  
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void MakhlukHidup(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public makhlukHidup(String nama, String jenis, int umur, double berat) { 
        this.nama = jenis;  
        this.jenis = nama; 
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = nama; 
        this.jenis = other.jenis; 
        this.umur = this.umur; 
        this.berat = other.berat;
    }


    public void setUmur(String umur) { 
        this.umur = umur;
    }

    public void setNama(String nama) {
        nama = this.nama; 
    }

    public int getInfo() { 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}

```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.nama = "Kucing";  
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.MakhlukHidup("Kuda"); 
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(-10); 
        
        System.out.println(m3.getInfo());

        
    }
}
```


## Table Score
| No | Error | Materi terkait            | Skor |
|----|-------|---------------------------|------|
| 1  | ERR1  | Class & Object (syntax)   | 10   |
| 2  | ERR2  | Class & Object (type)     | 10   |
| 3  | ERR3  | Constructor/init          | 10   |
| 4  | ERR4  | Encapsulation / Setter    | 10   |
| 5  | ERR5  | Constructor (copy)        | 10   |
| 6  | ERR6  | Constructor (copy)        | 10   |
| 7  | ERR7  | Encapsulation / Setter    | 10   |
| 8  | ERR8  | Class & Object (type)     | 10   |
| 9  | ERR9  | Class & Object (type)     | 10   |
| 10 | ERR10 | Encapsulation / Validation| 10   |
**Total skor : 100**

## Petunjuk Pengerjaan

Temukan semua ERR#, jelaskan kenapa salah dalam bentuk table dengan kolom berikut, selanjutnya tulis kode perbaikannya.

| No | Class        | Kesalahan | Perbaikan |
|----|--------------|-----------|-----------|
| 1 | MakhlukHidup | [contoh] variable `jumlah` salah penulisan akses `publik` | seharusnya `public jumlah = 10`|

2. Kompilasi dan jalankan setelah diperbaiki.
3. Upload kode pada **Github** repository anda dan **upload link nya ke dalam sinau** di topik **Tugas 1 PBO** disertai **file penjelasannya** dalam format word atau markdown

> Peringatan : Penggunaan AI tidak menjamin jawaban anda semuanya benar

## ----- PENYELESAIAN -----
>Nama : Dyas Alif Maulana 
>NIM : 32602400015

>Penjelasan :

| No |    Class   |Kesalahan|Perbaikan|
|----|------------|---------|---------|
| 1  |MakhlukHidup|Penulisan syntax pada atribute `string nama` salah          |Seharusnya penulisan syntax `String nama` ( dengan 'S' kapital)        |
| 2  |MakhlukHidup|Berat badan tidak ada yang minus `1.0`          |Seharusnya dihapus saja, karena sudah diinisialisasi diconstruktor `MakhlukHidup` (ditindih dengan nilai pada construktor)        |
| 3  |MakhlukHidup|Penulisan nama metode mirip dengan nama `class`         |Seharusnya penulisan nama metode dibedakan dengan nama class `public void Makhluk(String nama)`         |
| 4  |MakhlukHidup|Kesalahan penulisan `this.nama = jenis` mengakibatkan hasil output tidak sesuai        |Seharusnya penulisan `this.nama = nama`          |
| 5  |MakhlukHidup|Kesalahan penulisan `this.jenis = nama` mengakibatkan hasil output tidak sesuai        |Seharusnya penulisan `this.jenis = jenis`         |
| 6  |MakhlukHidup|Tidak terdapat other pada `this.nama = nama`         |Seharunya penulisannya `this.nama = other.nama` membuat objek MakhlukHidup dengan nama other         |
| 7  |MakhlukHidup|Tidak terdapat other pada `this.umur = umur`         |Seharunya penulisannya `this.umur = other.umur` membuat objek MakhlukHidup dengan nama other         |
| 8  |MakhlukHidup|Kesalahan penulisan atribute `setUmur(String umur)`         |Seharusnya atribute umur adalah integer `void setUmur(int umur)`         |
| 9  |MakhlukHidup|Kesalahan letak penulisan `nama= this.nama`          |Seharusnya penulisaanya `this.nama = nama`          |
| 10 |MakhlukHidup|Kesalahan penulisan atribute getInfo `int getInfo()`         |Seharunya atributenya menggunakan `String`         |
| 11 |TestAccess |Karena atribute nama private `m.nama = "Kucing"` jika dirun mengakibatkan eror         |seharusnya menggunakan setter `m.setNama("kucing");` untuk mengubah nilai        |
| 12 |TestAccess     |`m2.MakhlukHidup("Kuda");` tidak sesuai dengan nama metode         |Seharusnya disesuaikan dengan nama metode pada class MakhlukHidup  `m2.Makhluk("Kuda");`        |
| 13 |TestAccess     |Kesalahan `m3.setUmur(-10);` karena tidak ada umur yang minus         |Seharusnya minus nya dihilangkan `m3.setUmur(10);`         |
| 14 |MakhlukHidup     |Kesalahan penulisan pada nama metode `public makhlukHidup`         |Seharusnya penulisan disesuaikan dengan nama class `public MakhlukHidup` (dengan 'M' kapital)          |

## Source Code
>Source Code yang sudah dibenarkan :
```java
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
```
```java
public class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.setNama("kucing"); //nama bersifat private, untuk mengeset harus menggunakan setter
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.Makhluk("Kuda"); //disesuaikan dengan nama metode 'Makhluk'
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(10); //set umur awalny -10 seharusnya tidak bole negatif, karena tidak ada umur negatif
        
        System.out.println(m3.getInfo());

        
    }
}
```

## Output
