/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ansasaghir
 */
public class Landline extends Phone {
	public Landline() {
		setTextBehaviour(new TextNoWay());
		setPhotoBehaviour(new PhotoNoWay());
	}
        
	public void display() {
		System.out.println("I'm a landline");
	}
}
