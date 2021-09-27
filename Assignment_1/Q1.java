interface Animals{
    public void sound();
    public void type();
    public void age();
}

abstract class Dog {
    //Regular method
    public static void bark(){
        System.out.println("Bark");
    }
    //Abstract Method
    public abstract void age();
}

class Dobberman extends Dog{
    //Defining Abstract method
    public void age(){
        System.out.println("5 years old");
    }
}

class Cat implements Animals{
    public void sound(){
       System.out.println("Meow"); 
    }
    public void type(){
       System.out.println("Omnivore"); 
    }
    public void age(){
        System.out.println("The age is: ");
    };
} 

class Persian extends Cat{
    public void age(){
        System.out.print("2 years old");
    }
}

class Q1{
    public static void main(String args[]){
        Dobberman d = new Dobberman();
        Persian p = new Persian();
        d.bark();
        d.age();
        p.sound();
        p.type();
        p.age();
    }
}