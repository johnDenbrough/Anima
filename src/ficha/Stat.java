package ficha;

public class Stat {
	int hatq, hdef, ta, turno, dmg;
	int[] stat=new int[8];
	
	public void setStat(int fue, int con, int des, int agi, int per, int intl, int pod, int vol,int hatq, int hdef, int ta, int turno, int dmg){
		
		this.stat[0]= fue;
		this.stat[1]= con;
		this.stat[2]= des;
		this.stat[3]= agi;
		this.stat[4]= per;
		this.stat[5]= intl;
		this.stat[6]= pod;
		this.stat[7]= vol;
		this.hatq= hatq;
		this.hdef= hdef;
		this.ta= ta;
		this.turno= turno;
		this.dmg= dmg;
	}
	int getFue(){
		return stat[0];
	}
	int getCon(){
		return stat[1];
	}
	int getDes(){
		return stat[2];
	}
	int getAgi(){
		return stat[3];
	}
	int getPer(){
		return stat[4];
	}
	int getIntl(){
		return stat[5];
	}
	int getPod(){
		return stat[6];
	}
	int getVol(){
		return stat[7];
	}
	int getHatq(){
		return hatq;
	}
	int getHdef(){
		return hdef;
	}
	int getTa(){
		return ta;
	}
	int getTurno(){
		return turno;
	}
	int getDmg(){
		return dmg;
	}
		
}
