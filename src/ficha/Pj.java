package ficha;
import java.util.Scanner;
public class Pj{

	public static void main(String[] args) {
		Scanner tcl=new Scanner(System.in);
		int n;
		
		Stat jug1=new Stat();
		
		System.out.println("Qué quieres hacer?");
		System.out.println("Introducir stats");
		System.out.println("Introducir datos de combate");
		n=tcl.nextInt();
		
		switch(n){
		case 1: caract();
		System.out.println("Los stats de jugador 1 son ");
		break;
		case 2: hcombat();
		
		}
		
		//jug1.setStat();
		
		System.out.println("Los stats de jugador 1 son ");
		System.out.println(jug1.getFue()+" "+jug1.getCon()+" "+jug1.getDes()+" "+jug1.getAgi()+" "+jug1.getPer()+" "+jug1.getIntl()+" "+jug1.getPod()+" "+jug1.getVol());
			
		System.out.println("Las habilidades de combate de jugador 1 son ");
		System.out.println(jug1.getHatq()+" "+jug1.getHdef()+" "+jug1.getTa()+" "+jug1.getTurno()+" "+jug1.getDmg());
		
		
		tcl.close();
	}
	
	static int[] caract(){
		Scanner tcl=new Scanner(System.in);
		int fue, con, des, agi, per, intl, pod, vol;
		String sn;
		boolean correcto=false;
		
		do{
			System.out.println("Características");
			System.out.println(" ");
			
			System.out.println("Fuerza");
			fue=tcl.nextInt();
			
			System.out.println("Constitución");
			con=tcl.nextInt();
			
			System.out.println("Destreza");
			des=tcl.nextInt();
			
			System.out.println("Agilidad");
			agi=tcl.nextInt();
			
			System.out.println("Percepción");
			per=tcl.nextInt();
			
			System.out.println("Inteligencia");
			intl=tcl.nextInt();
			
			System.out.println("Poder");
			pod=tcl.nextInt();
			
			System.out.println("Voluntad");
			vol=tcl.nextInt();
			
			
			System.out.println(" ");
			
			System.out.println("FUE "+fue+"   PER "+per);
			System.out.println("CON "+con+"   INT "+intl);
			System.out.println("DES "+des+"   POD "+pod);
			System.out.println("AGI "+agi+"   VOL "+vol);
			
			System.out.println(" ");
			
			System.out.println("Es correcto? s/n");
			sn=tcl.next();
			
			if(sn.equalsIgnoreCase("s")){
				correcto=true;
			}
		}while(correcto==false);
		
		int[] stat = {fue, con, des, agi, per, intl, pod, vol};
		
        return stat;
	}
	
	static void hcombat(){
		Scanner tcl=new Scanner(System.in);
		int hatq, hdef, ta, turno, dmg;
		String sn;
		boolean correcto=false;
		
		do{
			System.out.println("Habilidades de Combate");
			System.out.println(" ");
			
			System.out.println("Ataque");
			hatq=tcl.nextInt();
			
			System.out.println("Defensa");
			hdef=tcl.nextInt();
			
			System.out.println("Armadura");
			ta=tcl.nextInt();
			
			System.out.println("Turno");
			turno=tcl.nextInt();
			
			System.out.println("Daño Base");
			dmg=tcl.nextInt();
			
			System.out.println(" ");
			
			System.out.println("Ataque: "+hatq);
			System.out.println("Defensa: "+hdef);
			System.out.println("Armadura: "+ta);
			System.out.println("Turno: "+turno);
			System.out.println("Daño Base: "+dmg);
			
			System.out.println(" ");
			
			System.out.println("Es correcto? s/n");
			sn=tcl.next();
			
			if(sn.equalsIgnoreCase("s")){
				correcto=true;
			}
		}while(correcto==false);
		

	}	
	
	
}