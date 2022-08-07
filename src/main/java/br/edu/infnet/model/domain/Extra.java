package br.edu.infnet.model.domain;

public class Extra extends Conta {
	private Integer numeroDeParcelas;
	private boolean pagamentoLote;
	private boolean pagamentoUnico;

	public Extra() {
	}

	public Extra(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	@Override
	public String toString() {
		return "Quantidade de Parcelas: " + numeroDeParcelas + "\n é pagamento em lote? " + pagamentoLote
				+ "\n é pagamento único? " + pagamentoUnico + "\n" + super.toString();
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public boolean isPagamentoLote() {
		return pagamentoLote;
	}

	public void setPagamentoLote(boolean pagamentoLote) {
		this.pagamentoLote = pagamentoLote;
	}

	public boolean isPagamentoUnico() {
		return pagamentoUnico;
	}

	public void setPagamentoUnico(boolean pagamentoUnico) {
		this.pagamentoUnico = pagamentoUnico;
	}

}