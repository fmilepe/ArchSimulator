package br.ufrj.dcc.archsimulator.model;

public class Mux4E {

	public int mux(int sinal,int ... entradas) throws Exception
	{
		if(entradas.length != 4 || sinal >3 || sinal < 0) {
			throw new Exception("Numero de entradas e/ou sinal " +
					"enviado para o mux inválidos");
		}
		return entradas[sinal];
	}
	
	public boolean []mux(int sinal,boolean[] ... entradas) throws Exception 
	{
		if(entradas.length != 4 || sinal >3 || sinal < 0) {
			throw new Exception("Numero de entradas e/ou sinal " +
					"enviado para o mux inválidos");
		}
		return entradas[sinal];
	}
}
