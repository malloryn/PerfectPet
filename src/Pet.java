import java.io.*;

public abstract class Pet implements Serializable{
  
  String petName = "Default Name";

  Pet() {
    
  } // end constructor
  
  public void setName(String name) {
    
    this.petName = name;
  }
  
  public String getName() {
    
    return this.petName;
  }

  public abstract void feed();
  public abstract void play();
  public abstract void putToBed();
  public abstract void giveBath();

} // end Pet 