package br.ufrj.dcc.archsimulator.model;

public interface Registrador {
	public void setValor(boolean[] valor) throws Exception;
	public void setValor(int valor)throws Exception;
	public int getValorDecimal();
	public boolean [] getValor();
	public String getStringBinario();
}
