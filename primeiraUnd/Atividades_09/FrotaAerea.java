package primeiraUnd.Atividades_09;

public class FrotaAerea {
	private Aeronave[] frota;
	
	private void adicionarAeronave(Aeronave aero) {
		frota[frota.length] = aero;
		System.out.println("Adicionando uma aeronave");
	}

	public Aeronave[] getFrota() {
		return frota;
	}

	public void setFrota(Aeronave[] frota) {
		this.frota = frota;
	}

	public FrotaAerea(Aeronave[] frota) {
		super();
		this.frota = frota;
	}

	public void exibirFrota() {
		System.out.println("A frota possui " + frota.length + " aeronave(s)");
	}
}
