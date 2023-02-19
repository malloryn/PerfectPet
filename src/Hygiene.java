public class Hygiene extends Attribute {

    public String petState() {
  
      if (attributeValue < 0) {
        stateStr = "Disgusting";
      }
        
      else if (attributeValue >= 0 && attributeValue < 4) {
        stateStr = "Dirty";
      }
        
      else if (attributeValue >= 4 && attributeValue < 7) {
        stateStr = "A Little Dirty";
      }
  
      else if (attributeValue >= 7 && attributeValue < 10) {
        stateStr = "Clean";
      }
  
      else if (attributeValue >= 10) {
        stateStr = "Polished to Perfection";
      }
  
      else {
      }
      // return the state of the pet
      return stateStr;
    } // end petState method
    
  } // end Hygiene