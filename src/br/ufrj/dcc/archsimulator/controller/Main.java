package br.ufrj.dcc.archsimulator.controller;

import br.ufrj.dcc.archsimulator.model.Registrador;

public class Main {
	public static void main(String []args) throws Exception 
	{
		Registrador r0 = new Registrador();
		r0.setValor(-2);
		System.out.println("r0(decimal) = "+ r0.getValorDecimal());
		System.out.println("r0(binario) = " + r0.getStringBinario());
		
	}
}
