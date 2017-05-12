package ficha;

import java.util.Scanner;

public class Caracteristicas {
	static void stats(){
		Scanner tcl=new Scanner(System.in);
		int fue, con, des, agi, per, intl, pod, vol;
		String sn;
		boolean correcto=false;
		
		Stat jug1=new Stat();
		
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
		
	//	jug1.setCaracteristicas(fue, con, des, agi, per, intl, pod, vol);
		
		System.out.println("Los stats de jugador 1 son ");
		System.out.println(jug1.getFue()+" "+jug1.getCon()+" "+jug1.getDes()+" "+jug1.getAgi()+" "+jug1.getPer()+" "+jug1.getIntl()+" "+jug1.getPod()+" "+jug1.getVol());
	}
}
