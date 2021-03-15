
//main 
public class TestCylinder{
    
    public static void main(String[] args) {
        
      Cylinder obj1 = new Cylinder();
      
      System.out.println("Radius is " + obj1.getRadius()
         + ", Tinggi " + obj1.getHeight()
         + ", Warna " + obj1.getColor()
         + ", Luas " + obj1.getArea()
         + ", Volume " + obj1.getVolume());
      
      //mengubah nilai pke cons
      Cylinder cy2 = new Cylinder(5.0, (int) 2.0);
      System.out.println("Radius is " + cy2.getRadius()
         + ", Tinggi  " + cy2.getHeight()
         + ", Warna " + cy2.getColor()
         + ", Luas " + cy2.getArea()
         + ", Volume " + cy2.getVolume());
   }
}

