import java.util.*;
import java.io.*;

public class User implements Serializable{

  // creating a pig object
  Pig pig;
  Scanner input = new Scanner(System.in);
  boolean keepGoing = true;
  // ArrayList to store all instances of the pig
  ArrayList<Pig> pigsArray = new ArrayList<Pig>();

    public static void main(String[] args) {

      new User();
	  } // end main

    public User() {
      
      loadPet();
      userMenu();
      
    } // end constructor

  public void userMenu() {
    
    // while loop to run until exit is chosen
    while(keepGoing) {

      System.out.println("");  
      System.out.println("Welcome to Your Virtual Pet! Please select an option");
      System.out.println("");  
      System.out.println("1) Create a Pet");
      System.out.println("2) Interact with Your Pet");
      System.out.println("3) Exit System/Save Pet");
      System.out.print("Option Selected: ");
      // taking in the user's response
      String response = input.nextLine();  
      System.out.println("");

        if (response.equals("1")) {
          // send to createPet method
          createPet();
        }
  
        else if (response.equals("2")) {
          // send to interact method
          interact();
        }
  
        else if (response.equals("3")) {
  
          System.out.println("Exiting Your Virtual Pet... Have a nice day!");
          // saves the pet in ArrayList after done playing
          savePet();
          keepGoing = false;
        }
  
        else {
          System.out.println("Invalid entry. Please try again");
        }
        
    } // end while

  } // end userMenu

  public void createPet() {

    System.out.print("Enter name of new pet: ");
    String nameResponse = input.nextLine();
    // creating a reference of the Pig object
    pig = new Pig();
    // setting new name of pig and adding to ArrayList
    pig.setName(nameResponse);
    pigsArray.add(pig);
    
  } // end createPet

  public void interact() {
  
    // for loop to get each pig in the ArrayList
    System.out.println("Your Pigs:");
    for (int i = 0; i< pigsArray.size(); i++) {
      System.out.println(i + ". " + pigsArray.get(i).getName());
    }
    
    System.out.print("Please enter number associated with Pig you want to interact with: ");
    String response = input.nextLine();
    System.out.println("");
    // changes response from String to int for comparison
    int index = Integer.parseInt(response);

    while(keepGoing) {
      
      // if statement to go through options if pig exists in array
      // prints menu for interaction
      if (index < pigsArray.size()) {

          System.out.println("");
          System.out.print("Choose action to do with " + pigsArray.get(index).getName());
          System.out.println("");
          System.out.println("1) Feed");
          System.out.println("2) Play");
          System.out.println("3) Give Bath");
          System.out.println("4) Put to Bed");
          System.out.println("5) Go Back to Menu");
          System.out.print("Option Selected: ");
          // taking in the user's response
          String actionResponse = input.nextLine();  
          System.out.println("");
  
          if (actionResponse.equals("1")) {

            System.out.println("Feeding your pig some grub...");
            System.out.println("");
            // calls the method from the Pig class
            pigsArray.get(index).feed();
          }
    
          else if (actionResponse.equals("2")) {

            System.out.println("Having a mud fight with your pig...");
            System.out.println("");
            pigsArray.get(index).play();
          }
    
          else if (actionResponse.equals("3")) {

            System.out.println("Your pig is enjoying its mud bath...");
            System.out.println("");
            pigsArray.get(index).giveBath();
          }
          
          else if (actionResponse.equals("4")) {

            System.out.println("Your pig is hitting the hay...");
            System.out.println("");
            pigsArray.get(index).putToBed();
          }
            
          else if (actionResponse.equals("5")) {

            System.out.println("Sending back to menu... Your pet will be waiting for you!");
            // sends back to the user menu
            userMenu();
            keepGoing = false;
          }
    
          else {
            System.out.println("Invalid entry. Please try again");
          }
        
      } // end if
        
      else {
        System.out.println("This pig does not exist.");
        break;
      }
      
    } // end while
    
  } // end interact
  
  public void savePet(){

    try {
      FileOutputStream fo = new FileOutputStream("PetData.dat");
      ObjectOutputStream obOut = new ObjectOutputStream(fo);
      obOut.writeObject(pigsArray);
    } 
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  } // end savePet

  public void loadPet() {

    try {
	    FileInputStream fIn = new FileInputStream("PetData.dat");
	    ObjectInputStream obIn = new ObjectInputStream(fIn);
	    pigsArray = (ArrayList<Pig>)obIn.readObject();
    }
    catch (Exception e) {
	    System.out.println(e.getMessage());
    }
    
  } // end loadPet
  
} // end User class