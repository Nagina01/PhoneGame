/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ansasaghir
 */
public class PhoneGame {
	private static PhoneGame uniqueInstance;
 
	private PhoneGame() {
		System.out.println("Game Starting");
		
	}
 
	public static PhoneGame getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new PhoneGame();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public void getPhones() {
		NokiaPhone	myNokia = new NokiaPhone();
		
		Landline	myLandline = new Landline();
 
		Smartphone	mySmartphone = new Smartphone();

    //all phones can make a phone call
    myNokia.call();
		mySmartphone.call();
		myLandline.call();

    
    //only some phones can take a picture
		myNokia.takePicture();
		mySmartphone.takePicture();
		myLandline.takePicture();

    //only some phones can make a text
		mySmartphone.makeText();	
    myNokia.makeText();

    //change the text behaviour of the Nokia
		myNokia.setTextBehaviour(new PredictedText());
		myNokia.makeText();
	}
}

