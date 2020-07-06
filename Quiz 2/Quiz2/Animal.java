package Quiz2;

public class Animal
{
   private String name ="";
   
   public Animal(String name) 
   {   this.name = name;  }
   
   public void setName ( String name )
   {  this.name = name;  }
   
   public String getName()
   {  return name;  }
   
   public void introduceYourself()  
   {   System.out.println("Moor.I am an animal.");  }
}

class Cat extends Animal
{
   
   public Cat(String name)
   {  super (name);  }
   
   public void introduceYourself()
   {  System.out.println("Meow.I am a cat.My name is "+ getName() + "." );  }
}

class Dog extends Animal
{
   public Dog (String name)
   {  super (name);  }
   
   public void introduceYourself()
   {  System.out.println("Woof.I am a dog.My name is "+ getName() + "." );  }
}  
