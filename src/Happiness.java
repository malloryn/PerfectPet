public class Happiness extends Attribute {

    public String petState() {
  
      if (attributeValue < 0) {
        stateStr = "Miserable";
      }
        
      else if (attributeValue >= 0 && attributeValue < 4) {
        stateStr = "Sad";
      }
        
      else if (attributeValue >= 4 && attributeValue < 7) {
        stateStr = "Lonely";
      }
  
      else if (attributeValue >= 7 && attributeValue < 10) {
        stateStr = "Content";
      }
  
      else if (attributeValue >= 10) {
        stateStr = "Extremely Happy";
      }
  
      else {
      }
      // return the state of the pet
      return stateStr;
    } // end petState method
    
  } // end Happiness