// This program creates an object named snowflake of the class Cat and changes its species from the default to tabby

class Cat { //This is a class

   String species = "lilac lynx siamese";

   public void changeSpecies(String species) {
      this.species = species;
         //The this keyword is used to distinguish between the class variable and the local variable.
         // this.species is lilac lynx siamese until it is changed by the local variable in this method.
      System.out.println(this.species);
   }

}

public class Two {

   public static void main(String []args) {
      Cat snowflake = new Cat(); //Snowflake is an object
      snowflake.changeSpecies("tabby");
   }
}
