public class Hunger extends Attribute {

    public String petState() {
  
      if (attributeValue < 0) {
        stateStr = "Starving";
      }
        
      else if (attributeValue >= 0 && attributeValue < 4) {
        stateStr = "Hungry";
      }
  
      else if (attributeValue >= 4 && attributeValue < 7) {
        stateStr = "Looking for Scraps";
      }
  
      else if (attributeValue >= 7 && attributeValue < 10) {
        stateStr = "Content";
      }
  
      else if (attributeValue >= 10) {
        stateStr = "Stuffed";
      }
  
      else {
      }
      // return the state of the pet
      return stateStr;
    } // end petState method
    
  } // end Hunger