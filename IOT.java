package bSLS;
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import java.awt.Dimension;

import javax.swing.JOptionPane;

public class IOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String bright = JOptionPane.showInputDialog("밝기를 입력하세요");
		
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp" );
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
				
		
	}

}
