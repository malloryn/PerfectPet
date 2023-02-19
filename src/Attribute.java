import java.io.*;

public abstract class Attribute implements Serializable {

  int attributeValue = 6;  
  String stateStr = "Default State";

  public abstract String petState();
  
  public void setValue(int val) {
    
    this.attributeValue = val;
  }
  
  public int getValue() {

    return this.attributeValue;
  }

  public void incValue() {

    attributeValue++;
  }
  
  public void decValue() {

    attributeValue--;
  }

} // end Attribute