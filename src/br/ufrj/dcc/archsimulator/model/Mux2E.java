package br.ufrj.dcc.archsimulator.model;

public class Mux2E {
	
	public int mux(int sinal,int ... entradas) throws Exception 
	{
		if(sinal > 1 || sinal < 0 || entradas.length !=2) {
			throw new Exception("Numero de entradas e/ou sinal " +
					"enviado para o mux inválidos");
		}
		return entradas[sinal];
	}
	
	public boolean []mux(int sinal, boolean[] ... entradas) throws Exception 
	{
		if(sinal > 1 || sinal < 0 || entradas.length !=2) {
			throw new Exception("Numero de entradas e/ou sinal " +
					"enviado para o mux inválidos");
		}
		return entradas[sinal];
	}
}
