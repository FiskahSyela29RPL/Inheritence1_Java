
package Tugas2Overload;

public class Mahasiswi extends Mahasiswa{
    
    
    //mmebuat class mahasiswi dan mengganti parameter dari method yang ada didalamnya
    //menggunakan extends agar tidak perlu mendeklarasikan methods biodata
     public Mahasiswi(){

        this.nama = "Dila";

        this.nim = "195410116";

        this.jk = " Perempuan";

        this.no_telp = "08226625133";
    }

    public Mahasiswi(String nama){

        this.nama = nama;

        nim = "195410116";

        jk = "Perempuan";

        no_telp = "08226625133";

    }

    public Mahasiswi(String nama, String nim){

        this.nama = nama;

        this.nim = nim;

        jk = "Perempuan";

        no_telp = "08226625133";

    }

    public Mahasiswi(String nama, String nim, String jk){

        this.nama = nama;

        this.nim = nim;

        this.jk = jk;

        no_telp = "08226625133";

    }

    public Mahasiswi(String nama, String nim, String jk, String no_telp){

        this.nama = nama;

        this.nim = nim;

        this.jk = jk;

        this.no_telp = no_telp;

    }
}
