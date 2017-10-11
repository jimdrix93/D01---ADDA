package liga1;

public class CasillaImpl implements Casilla{
	private TipoCasilla tipo;
	private Integer inclinacion;
	
	public CasillaImpl(TipoCasilla t, Integer i){
		this.tipo=t;
		this.inclinacion=i;
	}
	
	public TipoCasilla getTipo(){
		return this.tipo;
	}
	
	public Integer getInclinacion(){
		return this.inclinacion;
	}
	
	
}
