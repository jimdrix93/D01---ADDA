package liga1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casilla matriz[][] = new Casilla[13][3];
		matriz[0][0] = new CasillaImpl(TipoCasilla.ASFALTO,1);
		matriz[1][0] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[2][0] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[3][0] = new CasillaImpl(TipoCasilla.ASFALTO,3);
		matriz[4][0] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[5][0] = new CasillaImpl(TipoCasilla.ASFALTO,5);
		matriz[6][0] = new CasillaImpl(TipoCasilla.ASFALTO,6);
		matriz[7][0] = new CasillaImpl(TipoCasilla.ASFALTO,4);
		matriz[8][0] = new CasillaImpl(TipoCasilla.ASFALTO,5);
		matriz[9][0] = new CasillaImpl(TipoCasilla.ASFALTO,7);
		matriz[10][0] = new CasillaImpl(TipoCasilla.ASFALTO,6);
		matriz[11][0] = new CasillaImpl(TipoCasilla.ASFALTO,8);
		matriz[12][0] = new CasillaImpl(TipoCasilla.ASFALTO,9);
		
		matriz[0][1] = new CasillaImpl(TipoCasilla.ASFALTO,9);
		matriz[1][1] = new CasillaImpl(TipoCasilla.ASFALTO,8);
		matriz[2][1] = new CasillaImpl(TipoCasilla.ASFALTO,6);
		matriz[3][1] = new CasillaImpl(TipoCasilla.BARRO,7);
		matriz[4][1] = new CasillaImpl(TipoCasilla.ASFALTO,5);
		matriz[5][1] = new CasillaImpl(TipoCasilla.PIEDRA,4);
		matriz[6][1] = new CasillaImpl(TipoCasilla.ASFALTO,6);
		matriz[7][1] = new CasillaImpl(TipoCasilla.ASFALTO,5);
		matriz[8][1] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[9][1] = new CasillaImpl(TipoCasilla.ASFALTO,3);
		matriz[10][1] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[11][1] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[12][1] = new CasillaImpl(TipoCasilla.ASFALTO,1);
		
		matriz[0][2] = new CasillaImpl(TipoCasilla.ASFALTO,1);
		matriz[1][2] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[2][2] = new CasillaImpl(TipoCasilla.ASFALTO,2);
		matriz[3][2] = new CasillaImpl(TipoCasilla.BARRO,3);
		matriz[4][2] = new CasillaImpl(TipoCasilla.PIEDRA,2);
		matriz[5][2] = new CasillaImpl(TipoCasilla.ASFALTO,5);
		matriz[6][2] = new CasillaImpl(TipoCasilla.ASFALTO,6);
		matriz[7][2] = new CasillaImpl(TipoCasilla.PIEDRA,4);
		matriz[8][2] = new CasillaImpl(TipoCasilla.ASFALTO,5);
		matriz[9][2] = new CasillaImpl(TipoCasilla.PIEDRA,7);
		matriz[10][2] = new CasillaImpl(TipoCasilla.BARRO,6);
		matriz[11][2] = new CasillaImpl(TipoCasilla.ASFALTO,8);
		matriz[12][2] = new CasillaImpl(TipoCasilla.ASFALTO,9);
		
		Integer recompensasNoFinal = Utilidad.calculaRecompensasNoFinal(0, 0, matriz);
		System.out.println("Recompensas No Final: "+recompensasNoFinal);
		Integer recompensasFinal = Utilidad.calculaRecompensasFinal(0,0,matriz,0);
		System.out.println("Recompensas Final: "+recompensasFinal);
		Integer recompensasIterativo = Utilidad.CalculaRecompensasIterativo(matriz);
		System.out.println("Recompensas Iterativo: "+recompensasIterativo);
		
		//TRAZAS
//		Integer trazaNoFinal = Trazas.calculaRecompensasNoFinal(0, 0, matriz, 0);
//		System.out.println("Traza No Final: " + trazaNoFinal);
//		Integer trazaFinal = Trazas.calculaRecompensasFinal(0, 0, matriz, 0, 0);
//		System.out.println("Traza Final: " + trazaFinal);
	}	
}
