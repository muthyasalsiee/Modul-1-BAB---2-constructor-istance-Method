// NAMA    : MUTHYA SALSABILAH
// NIM     : 255150701111013/TI-B


class Buku {

    String JudulBuku;
    int TahunTerbit;
    Penulis[] penulis;
    String sinopsis;

   Buku(String JudulBuku, int TahunTerbit, Penulis[] penulis, String sinopsis){
    this.JudulBuku = JudulBuku;
    this.TahunTerbit = TahunTerbit;
    this.penulis = penulis;
    this.sinopsis = sinopsis;
}

Buku(String JudulBuku, int TahunTerbit, Penulis[] penulis){
    this.JudulBuku = JudulBuku;
    this.TahunTerbit = TahunTerbit;
    this.penulis = penulis;
    this.sinopsis = "apa aja yang penting tidak kurang dari 10 kata kan untuk sinopsisnya";
}

    void tampilBuku(){

        System.out.println("Judul Buku : " + JudulBuku);
        System.out.println("Tahun : " + TahunTerbit);

        System.out.print("Penulis : ");

        for(Penulis p : penulis){
            System.out.print(p.NamaPenulis + " ");
        }

        System.out.println("\nSinopsis : " + sinopsis);
        System.out.println("Jumlah kata sinopsis : " + hitungJumlahKata());
        System.out.println();
    }

    int hitungJumlahKata(){
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    double cekKesamaan(Buku bukuLain){

        int sama = 0;
        int total = 3;

        if(this.JudulBuku.equals(bukuLain.JudulBuku)){
            sama++;
        }

        if(this.TahunTerbit == bukuLain.TahunTerbit){
            sama++;
        }

        if(this.sinopsis.equals(bukuLain.sinopsis)){
            sama++;
        }

        return (sama * 100.0) / total;
    }

    Buku copy(){
        return new Buku(this.JudulBuku, this.TahunTerbit, this.penulis, this.sinopsis);
    }
}