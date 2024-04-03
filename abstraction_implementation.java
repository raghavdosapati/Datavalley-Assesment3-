//this is one way to implement abstraction in java with "extends" keywords by the help of inheritance.

abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
class Something extends Animal {
  public void animalSound() {        //abstract method body is here
    System.out.println("The Something says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Something s = new Something(); // Create a Pig object
    s.animalSound();
    s.sleep();
  }
}

//This is another way to implement abstraction with the help of "interfaces".

interface Animal {
  public void animalSound(); 
  public void sleep(); 
}

class Something implements Animal {
  public void animalSound() {
    System.out.println("The Something says: wee wee");    //body of abstract method
  }
  public void sleep() {
    System.out.println("Zzz");                            //body of abstract sleep method
  }
}

class Main {
  public static void main(String[] args) {
    Something s = new Something();  
    s.animalSound();
    s.sleep();
  }
}
