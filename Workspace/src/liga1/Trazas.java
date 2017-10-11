package liga1;

public class Trazas {
	
public static Integer calculaRecompensasNoFinal(Integer x, Integer y, Casilla[][] matriz, Integer iteracion){
	Integer res = 0;
	iteracion++;
	if(y<matriz[x].length){
		if(y%2==0){
			if(x==matriz.length-1){
				res+=calculaRecompensasNoFinal(x,y+1,matriz, iteracion);
			}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo())){
				res+=calculaRecompensasNoFinal(x+1, y, matriz, iteracion)+1;
				System.out.println("Iteracion número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y);
			}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo()))){
				res+=calculaRecompensasNoFinal(x+1, y, matriz, iteracion)-1;
				System.out.println("Iteracion número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y);
			}else{
				res+=calculaRecompensasNoFinal(x+1, y, matriz, iteracion);
				System.out.println("Iteracion número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y);
			}	
		}
		if(y%2!=0){
			if(x==0){
				res+=calculaRecompensasNoFinal(x,y+1,matriz, iteracion);
			}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo())){
				res+=calculaRecompensasNoFinal(x-1, y, matriz, iteracion)+1;
				System.out.println("Iteracion número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y);
			}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo()))){
				res+=calculaRecompensasNoFinal(x-1, y, matriz, iteracion)-1;
				System.out.println("Iteracion número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y);
			}else{
				res+=calculaRecompensasNoFinal(x-1, y, matriz, iteracion);
				System.out.println("Iteracion número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y);
			}
				
			
		}
	}
	return res;
}

public static Integer calculaRecompensasFinal(Integer x, Integer y, Casilla[][] matriz, Integer acum, Integer iteracion){
	Integer res = acum;
	iteracion++;
	if(y<matriz[x].length){
		if(y%2==0){
			if(x==matriz.length-1){
				res=calculaRecompensasFinal(x,y+1,matriz, acum,iteracion);
			}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo())){
				res=calculaRecompensasFinal(x+1, y, matriz, acum+1, iteracion);
				System.out.println("Iteración número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y+"\n"+"Variable acum: "+acum);
			}else if(matriz[x][y].getInclinacion()> matriz[x+1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x+1][y].getTipo()))){
				res=calculaRecompensasFinal(x+1, y, matriz,acum-1, iteracion);
				System.out.println("Iteración número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y+"\n"+"Variable acum: "+acum);
			}else{
				res=calculaRecompensasFinal(x+1, y, matriz,acum, iteracion);
				System.out.println("Iteración número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y+"\n"+"Variable acum: "+acum);
			}	
		}
		if(y%2!=0){
			if(x==0){
				res=calculaRecompensasFinal(x,y+1,matriz, acum, iteracion);
			}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo())){
				res=calculaRecompensasFinal(x-1, y, matriz, acum+1, iteracion);
				System.out.println("Iteración número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y+"\n"+"Variable acum: "+acum);
			}else if(matriz[x][y].getInclinacion()> matriz[x-1][y].getInclinacion() && !(matriz[x][y].getTipo().equals(matriz[x-1][y].getTipo()))){
				res=calculaRecompensasFinal(x-1, y, matriz, acum-1, iteracion);
				System.out.println("Iteración número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y+"\n"+"Variable acum: "+acum);
			}else{
				res=calculaRecompensasFinal(x-1, y, matriz, acum, iteracion);
				System.out.println("Iteración número: "+ iteracion +"\n" + "Variable res: "+ res + "\n"+"Variable x: "+x+"\n"+"Variable y: "+y+"\n"+"Variable acum: "+acum);
			}
				
			
		}
	}
	return res;
}
}
