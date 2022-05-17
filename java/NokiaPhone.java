/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ansasaghir
 */
public class NokiaPhone extends Phone {

	public NokiaPhone() {

		photoBehaviour = new PhotoNoWay();
		textBehaviour = new TextWithButtons();

	}

	public void display() {
		System.out.println("I am a Nokia phone");
	}
}
