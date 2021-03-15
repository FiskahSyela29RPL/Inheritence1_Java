
import static javax.swing.Spring.height;

//sub class dari lingkaran
public class Cylinder extends Lingkaran {

    // private instance variable
   private double tinggi;

   // Constructors
   public Cylinder() {
      super();  // invoke superclass' constructor Lingkaran()
      this.tinggi = 1.0;
   }
   public Cylinder(double tinggi) {
      super();  // invoke superclass' constructor Lingkaran()
      this.tinggi = tinggi;
   }
   public Cylinder(double tinggi, int jari) {
      super(jari);  // invoke superclass' constructor Lingkaran(radius)
      this.tinggi = tinggi;
   }
   public Cylinder(double tinggi, int jari, String warna) {
      super(jari, warna);  // invoke superclass' constructor Lingkaran(radius, color)
      this.tinggi = tinggi;
   }

   // Getter and Setter
   public double getHeight() {
      return this.tinggi;
   }
   public void setHeight(double height) {
      this.tinggi = tinggi;
   }
   //mengubah luas dan menambahkan variabel tinggi
   @Override
   public double getArea() {
      return 2*Math.PI*getRadius()*tinggi + 2*super.getArea();
   }
   
   public double getVolume() {
      return super.getArea()*tinggi;   
   }
   //mengoverride mthod dan mengubah menjadi silinder
   @Override
   public String toString() {
      return "Cylinder" + super.toString() + ",tinggi=" + tinggi + "";   
   }
}


