package primeiraUnd.Atividades_09;

public class Rota {
	private String origem, destino;
	private Double distancia, duracaoEstimadaHrs;
	
	public void calcularTempoRestante() {
		System.out.println("A duração restante é de: " + (duracaoEstimadaHrs-5.0) + "h");
	}
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public Double getDuracaoEstimadaHrs() {
		return duracaoEstimadaHrs;
	}

	public void setDuracaoEstimadaHrs(Double duracaoEstimadaHrs) {
		this.duracaoEstimadaHrs = duracaoEstimadaHrs;
	}

	public Rota(String origem, String destino, Double distancia, Double duracaoEstimadaHrs) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.duracaoEstimadaHrs = duracaoEstimadaHrs;
	}

	public void exibirRota() {
		System.out.println("A rota tem origem em: " + origem);
		System.out.println("E destino em: " + destino);
		System.out.println("A distância é de: " + distancia + "Km");
		System.out.println("E a duração estimada é de: " + duracaoEstimadaHrs + "h");
	}
	
}
