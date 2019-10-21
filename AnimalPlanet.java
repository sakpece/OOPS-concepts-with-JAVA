
class AnimalPlanet {
 public static void main(String []args)
 {
 Animal dog= new Dog();//default call constructor & dynamic polimorphism 
 System.out.println("Dog sounds "+ dog.sound());
 Animal cat = new Cat();//default call constructor
 cat.setName("Kitty"); // setting name encapsulation 
 System.out.println(cat.getName()+ " Cat sounds "+ cat.sound());
  }
}
