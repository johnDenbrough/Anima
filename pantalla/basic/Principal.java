package basic;

import java.awt.EventQueue;
/**
 * 
 * @author John Denbrough
 * @version 0.1
 */
public class Principal  {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}