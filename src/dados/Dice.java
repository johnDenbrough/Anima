package dados;

public class Dice {
	public int d100(){
		int dado=(int)(Math.random()*100+1);
		int tirada=dado;
		int i=1;
		
		if(dado>=90){
			System.out.print("Abierta! "+tirada);
			int abierta=90;
			
			while(dado>=abierta || dado==100){
			i++;
			abierta++;
			dado=(int)(Math.random()*100+1);
			System.out.print("+"+dado);
			tirada+=dado;
			}
			
			System.out.println(" = "+tirada);
			System.out.println(i+" tiradas");
	
		}else{
			System.out.println(tirada);
		}
		return tirada;
	}
	
	public int d10(){
		int dado=(int)(Math.random()*10+1);
		
		return dado;
	}
}
