/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ansasaghir
 */

public abstract class Phone {
	TextBehaviour textBehaviour;
	PhotoBehaviour photoBehaviour;

	public Phone() {
	}

	public void setTextBehaviour(TextBehaviour newTextBehaviour) {
		textBehaviour = newTextBehaviour
                        ;
	}

	public void setPhotoBehaviour(PhotoBehaviour newPhotoBehaviour) {
		photoBehaviour = newPhotoBehaviour;
	}
        
  public void call(){
      System.out.println("I am making a call");
  }

	abstract void display();

	public void makeText() {
		textBehaviour.text();
	}

	public void takePicture() {
		photoBehaviour.takePicture();
	}

	
}