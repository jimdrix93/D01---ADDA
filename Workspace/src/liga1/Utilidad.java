package liga1;

public class Utilidad {
	
	public static Integer calculaRecompensasNoFinal(Integer x, Integer y, Casilla[][] matriz){
		Integer res = 0;
		
		if(y<matriz[x].length){
			if(y%2==0){
				if(x==matriz.length-1){
					res+=calculaRecompensasNoFinal(x,y+1,matriz);
				}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo())){
					res+=calculaRecompensasNoFinal(x+1, y, matriz)+1;
					
				}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo()))){
					res+=calculaRecompensasNoFinal(x+1, y, matriz)-1;
	
				}else{
					res+=calculaRecompensasNoFinal(x+1, y, matriz);
					
				}	
			}
			if(y%2!=0){
				if(x==0){
					res+=calculaRecompensasNoFinal(x,y+1,matriz);
				}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo())){
					res+=calculaRecompensasNoFinal(x-1, y, matriz)+1;
				}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo()))){
					res+=calculaRecompensasNoFinal(x-1, y, matriz)-1;
				}else{
					res+=calculaRecompensasNoFinal(x-1, y, matriz);
				}
					
				
			}
		}
		return res;
	}
	
	public static Integer calculaRecompensasFinal(Integer x, Integer y, Casilla[][] matriz, Integer acum){
		Integer res = acum;
		if(y<matriz[x].length){
			if(y%2==0){
				if(x==matriz.length-1){
					res=calculaRecompensasFinal(x,y+1,matriz, acum);
				}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo())){
					res=calculaRecompensasFinal(x+1, y, matriz, acum+1);
				}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo()))){
					res=calculaRecompensasFinal(x+1, y, matriz,acum-1);
				}else{
					res=calculaRecompensasFinal(x+1, y, matriz,acum);
				}	
			}
			if(y%2!=0){
				if(x==0){
					res=calculaRecompensasFinal(x,y+1,matriz, acum);
				}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo())){
					res=calculaRecompensasFinal(x-1, y, matriz, acum+1);
				}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo()))){
					res=calculaRecompensasFinal(x-1, y, matriz, acum-1);
				}else{
					res=calculaRecompensasFinal(x-1, y, matriz, acum);
				}
					
				
			}
		}
		return res;
	}
	
	public static Integer CalculaRecompensasIterativo(Casilla[][] matriz){
		Integer res=0;
		for(int i=0;i<matriz.length-1;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(j==0 || j%2==0){
					int i2=i+1;
					if(i2==matriz.length){
						res+=0;
					}
					if(matriz[i][j].getInclinacion()>matriz[i+1][j].getInclinacion()
							&& matriz[i][j].getTipo().equals(matriz[i+1][j].getTipo())){
						res+=1;
					}
					if(matriz[i][j].getInclinacion()>matriz[i+1][j].getInclinacion()
							&& !(matriz[i][j].getTipo().equals(matriz[i+1][j].getTipo()))){
						res+=-1;
					}
				}
		
			}
		}
		for(int i=matriz.length-1;i>0;i--){
			for(int j=0;j<matriz[i].length;j++){
				if(j%2!=0){
					int i3=i-1;
					if(i3<0){
						res+=0;
					}
					if(matriz[i][j].getInclinacion()>matriz[i3][j].getInclinacion()
							&& matriz[i][j].getTipo().equals(matriz[i3][j].getTipo())){
						res+=1;
					}
					if(matriz[i][j].getInclinacion()>matriz[i3][j].getInclinacion()
							&& !(matriz[i][j].getTipo().equals(matriz[i3][j].getTipo()))){
						res+=-1;
					}
				}
			}
		}
		return res;
	}
}
