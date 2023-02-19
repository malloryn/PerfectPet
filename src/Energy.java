public class Energy extends Attribute {

    public String petState() {
  
      if (attributeValue < 0) {
        stateStr = "Exhausted";
      }
        
      else if (attributeValue >= 0 && attributeValue < 4) {
        stateStr = "Sleepy";
      }
        
      else if (attributeValue >= 4 && attributeValue < 7) {
        stateStr = "A Bit Tired";
      }
  
      else if (attributeValue >= 7 && attributeValue < 10) {
        stateStr = "Awake";
      }
  
      else if (attributeValue >= 10) {
        stateStr = "Energized";
      }
  
      else {
      }
      // return the state of the pet
      return stateStr;
    } // end petState method
  
  } // end Energy 