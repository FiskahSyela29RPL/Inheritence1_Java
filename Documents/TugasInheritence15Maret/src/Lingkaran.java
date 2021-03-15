
//membuat program menghitung luas, lingkaran
   public class Lingkaran {
   // private instance variables
   private int jari;
   private String warna;

   // Constructors
   public Lingkaran() {
      this.jari = 34;
      this.warna = "Hitam";
   }
   
   public Lingkaran(int jari) {
      this.jari = jari;
      this.warna = "Hitam";
   }
   public Lingkaran(int jari, String warna) {
      this.jari = jari;
      this.warna = warna;
   }

   // membuat setter dan getter dari private 
   public double getRadius() {
      return this.jari;
   }
   public String getColor() {
      return this.warna;
   }
   public void setRadius(int jari) {
      this.jari = jari;
   }
   public void setColor(String color) {
      this.warna = warna;
   }

   //agar string bisa di return ke string tanpa adanya perubahan
   public String toString() {
      return "Jari-jari lingkaran adalah"+jari+"warna lingkaran adalah" +warna+"";
   }

   /** Returns the area of this Lingkaran */
   public double getArea() {
      return jari * jari * Math.PI;
   }
}



