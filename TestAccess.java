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
