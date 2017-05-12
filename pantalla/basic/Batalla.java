package basic;

public class Batalla {
	/**
	* Realiza los cálculos necesarios de Ataque - Defensa y redondea el resultado
	* en grupos de 10 hacia abajo.
	* @param atq int ataque del personaje
	* @param def int defensa del personaje
	* @return resultado del ataque
	*/
	static int Ataque(int atq, int def) {
		int result = atq - def;
		double redon = result * 0.1;
		result = (int) redon * 10;
		return result;
	}
	/**
	 * Atacante: jugador<br/>
	 * Realiza los cálculos para saber el resultado del combate
	 * <ul>
	 * 	<li>El ataque impacta
	 * 		<ul>
	 * 			<li>El adversario recibe daño</li>
	 * 			<li>El adversario pierde la posibilidad de atacar (a la defensiva)</li>
	 * 		</ul>
	 * 	</li>
	 * 	<li>El ataque Falla</li>
	 * 	<li>Se produce contraataque</li>
	 * </ul>
	 * @param result int recibe el resultado del ataque calculado.
	 * @see Batalla#Ataque(int, int) Ataque
	 */
	static void PjAtaque(int result) {
		double redon;
		int ta, dmg;
		while(Integer.parseInt(Ventana.tfAtqAcciones.getText())>0){
			ta = Integer.parseInt(Ventana.tfDefTa.getText()) * 10 + 20;
	
			Ventana.tfAtqAcciones.setText((String.valueOf(Integer.parseInt(Ventana.tfAtqAcciones.getText()) - 1)));
	
			if (result > 0) {
				Ventana.tfDefAcciones.setText("0");
				Ventana.taBatalla.setText(Ventana.taBatalla.getText()+"El ataque impacta "+result + "\n");

				if ((result - ta) >= 10) {
					dmg = (Integer.parseInt(Ventana.tfAtqDmg.getText()) * (result - ta)) / 100;
					Ventana.taBatalla.setText(Ventana.taBatalla.getText()+Ventana.txtMon.getText()+ " recibe: "+ dmg + " [" + (result - ta) + "%] \n");
					Ventana.tfDefPv.setText(String.valueOf(Integer.parseInt(Ventana.tfDefPv.getText())-dmg));
				} else {
					Ventana.taBatalla.setText(Ventana.taBatalla.getText()+Ventana.txtMon.getText()+" a la defensiva: [" + (result - ta) + "]\n");
				}
	
			} else if (result <= 0 && result > -10) {
				Ventana.taBatalla.setText(Ventana.taBatalla.getText()+"¡Ha fallado! [" + result + "]\n");
	
			} else {
				result /= 2;
				redon = result % 5;
				result -= (int) redon;
				result *= -1;
				Ventana.taBatalla.setText(Ventana.taBatalla.getText()+Ventana.txtMon.getText()+" intenta contraatacar! [" + result + "]\n");

				if(Integer.parseInt(Ventana.tfDefAcciones.getText())>0){
					int atq, def;
					atq = Integer.parseInt(Ventana.tfDefAtaque.getText())+Integer.parseInt(Ventana.tfDefAtqTirada.getText());
					def = Integer.parseInt(Ventana.tfAtqDefensa.getText())+Integer.parseInt(Ventana.tfAtqDefTirada.getText());
					Batalla.mAtaque(Batalla.Ataque(atq, def));
				}else{
					Ventana.taBatalla.setText(Ventana.taBatalla.getText()+"Pero no le quedan acciones\n");
				}
			}
		}
	}
	
	static void mAtaque(int result) {
		int ta, dmg;
		double redon;
		while(Integer.parseInt(Ventana.tfDefAcciones.getText())>0){
			ta = Integer.parseInt(Ventana.tfAtqTa.getText()) * 10 + 20;
			
			Ventana.tfDefAcciones.setText(String.valueOf(Integer.parseInt(Ventana.tfDefAcciones.getText())-1));
	
			if (result > 0) {
				Ventana.tfAtqAcciones.setText("0");
				Ventana.taBatalla.setText(Ventana.taBatalla.getText()+"El ataque impacta "+result + "\n");
			
				if ((result - ta) >= 10) {
					dmg = (Integer.parseInt(Ventana.tfDefDmg.getText()) * (result - ta)) / 100;
					Ventana.taBatalla.setText(Ventana.taBatalla.getText()+Ventana.txtPj.getText()+ " recibe: "+ dmg + " [" + (result - ta) + "%] \n");
					
					Ventana.tfAtqPv.setText(String.valueOf(Integer.parseInt(Ventana.tfAtqPv.getText())-dmg));
				} else {
				
					Ventana.taBatalla.setText(Ventana.taBatalla.getText()+Ventana.txtPj.getText()+" a la defensiva: [" + (result - ta) + "]\n");

			
				}
	
			} else if (result <= 0 && result > -10) {
				Ventana.taBatalla.setText(Ventana.taBatalla.getText()+"¡Ha fallado! [" + result + "]\n");
			} else {
				result /= 2;
				redon = result % 5;
				result -= (int) redon;
				result *= -1;
				Ventana.taBatalla.setText(Ventana.taBatalla.getText()+Ventana.txtPj.getText()+" puede contraatacar! [" + result + "]\n");
				
				if(Integer.parseInt(Ventana.tfAtqAcciones.getText())>0){
					Batalla.PjAtaque(Batalla.Ataque(Integer.parseInt(Ventana.tfAtqAtaque.getText())+result, Integer.parseInt(Ventana.tfDefDefensa.getText())));
				}else{
					Ventana.taBatalla.setText(Ventana.taBatalla.getText()+"Pero no le quedan acciones\n");
				}
			}
		}
	}
}