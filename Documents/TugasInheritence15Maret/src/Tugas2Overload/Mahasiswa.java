
package Tugas2Overload;

 class mahasiswa {
     
      public String nama, nim, jk, no_telp;
      
      

     
     //mrmbuat method overloading
    public mahasiswa(){

        this.nama = "Alnov";

        this.nim = "195410118";

        this.jk = " Laki-Laki";

        this.no_telp = "082258127794";
    }

    public mahasiswa(String nama){

        this.nama = nama;

        nim = "195410118";

        jk = "Laki-Laki";

        no_telp = "082258127794";

    }

    public mahasiswa(String nama, String nim){

        this.nama = nama;

        this.nim = nim;

        jk = "Laki-Laki";

        no_telp = "082258127794";

    }

    public mahasiswa(String nama, String nim, String jk){

        this.nama = nama;

        this.nim = nim;

        this.jk = jk;

        no_telp = "082258127794";

    }

    public mahasiswa(String nama, String nim, String jk, String no_telp){

        this.nama = nama;

        this.nim = nim;

        this.jk = jk;

        this.no_telp = no_telp;

    }

    public void Biodata() {

        System.out.println("Nama : " + nama);

        System.out.println("NIM : " + nim);

        System.out.println("Jenis Kelamin : " + jk);

        System.out.println("No Telpon : " + no_telp); }
    
    

}

