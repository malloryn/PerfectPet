public class Pig extends Pet {

  // creating instances of attribute classes
  Hunger hun = new Hunger();
  Happiness happ = new Happiness();
  Energy ener = new Energy();
  Hygiene hyg = new Hygiene();
  
  Pig() {
    
  } // end constructor

  // implementing the abstract methods from Pet class
  public void feed() {

    // increases hunger
    hun.incValue();
    // decreases energy
    ener.decValue();
    // display the pig's state 
    System.out.println("Your pig is now: " + ener.petState() + ", " + hun.petState() + ", " + happ.petState() + ", and " + hyg.petState());

  } // end feed method

  public void play() {
    
    // increases happiness
    happ.incValue();
    // decreases energy 
    ener.decValue();
    // decreases hygiene
    hyg.decValue(); 
    // display the pig's state 
    System.out.println("Your pig is now: " + ener.petState() + ", " + hun.petState() + ", " + happ.petState() + ", and " + hyg.petState());
    
  } // end play method

  public void putToBed() {

    // increases energy
    ener.incValue();    
    // decreases hunger
    hun.decValue();
    // decreases happiness
    happ.decValue();
    // display the pig's state 
    System.out.println("Your pig is now: " + ener.petState() + ", " + hun.petState() + ", " + happ.petState() + ", and " + hyg.petState());
    
  } // end putToBed method

  public void giveBath() {
   
    // increases hygiene
    hyg.incValue();    
    // display the pig's state 
    System.out.println("Your pig is now: " + ener.petState() + ", " + hun.petState() + ", " + happ.petState() + ", and " + hyg.petState());
    
  } // end giveBath method
  
} // end Pig class