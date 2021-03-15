
package Tugas2Overload;

public class Main {
    
    public static void main(String[] args) {
        
        
        mahasiswa maha1 = new mahasiswa("Alnov");

        mahasiswa maha2 = new mahasiswa("Alnov","195410118");

        mahasiswa maha3 = new mahasiswa("Alnov","195410118","Laki-Laki");

        mahasiswa maha4 = new mahasiswa("Alnov","195410118","Laki-Laki", "082258127794");

 

        maha1.Biodata();

        System.out.println();

        maha2.Biodata();

        System.out.println();

        maha3.Biodata();

        System.out.println();

        maha4.Biodata();
        
    }
   
}
