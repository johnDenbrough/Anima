package basic;

public class Pifia {
	public static int pTurno(int tirada){
		if(tirada==1){
			tirada=-125;
		}else if(tirada==2){
			tirada=-100;
		}else if(tirada==3){
			tirada=-75;
		}
		return tirada;
	}
}
