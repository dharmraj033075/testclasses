package dharm;

public class testanimal {
	public static void main(String[] args) {
	      // Using the subclasses
	      cat cat1 = new cat();
	      cat1.greeting();
	      dog dog1 = new dog();
	      dog1.greeting();
	      bigdog bigDog1 = new bigdog();
	      bigDog1.greeting();
	       
	      // Using Polymorphism
	      animal animal1 = new cat();
	      animal1.greeting();
	      animal animal2 = new dog();
	      animal2.greeting();
	      animal animal3 = new bigdog();
	      animal3.greeting();
	      //animal animal4 = new animal();
	      
	      // Downcast
	      dog dog2 = (dog)animal2;
	      bigdog bigDog2 = (bigdog)animal3;
	      dog dog3 = (dog)animal3;
	      cat cat2 = (cat)animal1;
	      dog2.greeting(dog3);
	      dog3.greeting(dog2);
	      dog2.greeting(bigDog2);
	      bigDog2.greeting(dog2);
	      bigDog2.greeting(bigDog1);
	   }

}
