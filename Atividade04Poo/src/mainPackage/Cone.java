package mainPackage;

public class Cone {
	private double altura;
	private double raio;
	private int tipoTinta;
	
	public Cone(double altura, double raio, int tipoTinta) {
		setAltura(altura);
		setRaio(raio);
		setTipoTinta(tipoTinta);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0)
			this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio > 0)
			this.raio = raio;
	}

	public int getTipoTinta() {
		return tipoTinta;
	}

	public void setTipoTinta(int tipoTinta) {
		if(tipoTinta > 0 && tipoTinta <= 3)
				this.tipoTinta = tipoTinta;
	}

	public double geratriz() {
		return (Math.sqrt((altura*altura)+(raio*raio)));
	}
	
	public double areaLateral() {
		return 3.14 * raio * geratriz();
	}
	
	public double areaBase() {
		return 3.14 * raio * raio;
	}
	
	public double areaTotal() {
		return areaLateral() + areaBase();
	}
	
	public double litrosTinta() {
		return areaTotal()*3.45;
	}
	
	public int latas() {
		return (int) Math.ceil(litrosTinta()/18);
	}
	
	public double preco() {
		double valor = 0;
		switch(this.tipoTinta) {
			case 1:
				valor = 238.9;
				break;
			case 2:
				valor = 467.98;
				break;
			case 3:
				valor = 758.34;
		}
		
		return latas() * valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [altura=");
		builder.append(altura);
		builder.append(", raio=");
		builder.append(raio);
		builder.append(", tipoTinta=");
		builder.append(tipoTinta);
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", areaLateral()=");
		builder.append(areaLateral());
		builder.append(", areaBase()=");
		builder.append(areaBase());
		builder.append(", areaTotal()=");
		builder.append(areaTotal());
		builder.append(", litrosTinta()=");
		builder.append(litrosTinta());
		builder.append(", latas()=");
		builder.append(latas());
		builder.append(", preco()=");
		builder.append(preco());
		builder.append("]");
		return builder.toString();
	}
	
	
}
