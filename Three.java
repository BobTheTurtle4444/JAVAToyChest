//This command figures out the age of a kitten and makeds it grow

public class Three {
   public void kittenAge() {
      int age = 3; //age is a local variable. Here age = 3
      age = age + 4; 
      System.out.println("Kitten age is : " + age);
   }
 
   public static void main(String args[]) {
      Three test = new Three();
      test.kittenAge(); 
   }
}
