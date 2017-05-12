package combate;
import java.util.Scanner;
import dados.Dice;

public class Ataque {

	private static Scanner tecl;
	public static void main(String[] args) {
		Dice dado=new Dice();
		tecl = new Scanner(System.in);
		int hatq, hdef, ta;
		int tatq, tdef, result;
		double redon;
		
		//Recoge los valores de Ataque, Defensa y TA
		System.out.println("Ataque");
		hatq=tecl.nextInt();
		
		System.out.println("Defensa");
		hdef=tecl.nextInt();
		
		System.out.println("TA");
		ta=tecl.nextInt()*10+20;
		
		System.out.println("");
		
		//Tirada de ataque
		System.out.print("Tirada del atacante: ");
		tatq=dado.d100();
		
		
		//Tirada de defensa
		System.out.print("Tirada del defensor: ");
		tdef=dado.d100();
		
		System.out.println("");
		System.out.print("Resultado: ");
		result=(tatq+hatq)-(tdef+hdef);
		System.out.println("("+tatq+"+"+hatq+")-("+tdef+"+"+hdef+")=  "+result);
		
		if (result>0){
			System.out.println(">  Atacante gana!");
			
			if (result-ta>10){
				redon=result*0.1;
				result=(int)redon*10;
				
				System.out.println("Resultado final: "+result);
				
				System.out.println(">  Introduce el daño de tu arma");
				int dmg=tecl.nextInt();
				
				dmg=(dmg*(result-ta))/100;
				
				System.out.println(">  Daño: "+dmg+" ("+(result-ta)+"%)");
			}else{
				System.out.println(">  Resultado final: "+result+" Adversario a la defensiva");
			}
			
			}else if(result<0 && result>-10){
				System.out.println(">  Defensor gana! ("+result+")");
			}else{
				result/=2;
				redon=result%5;
				result-=(int)redon;
				result*=-1;
				System.out.println(">  Contraataque ("+result+")");
			}
	}
}