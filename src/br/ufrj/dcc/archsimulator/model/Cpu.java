package br.ufrj.dcc.archsimulator.model;

import java.util.BitSet;


public class Cpu {
	//Índices dos registradores
	public static final int rdados 	= 0;
	public static final int r0 		= 1;
	public static final int r1 		= 2;
	public static final int ra 		= 3;
	public static final int pc 		= 4;
	public static final int r2 		= 5;
	public static final int r3 		= 6;
	public static final int rb 		= 7;
	public static final int ir 		= 8;
	public static final int rend 		= 9;
	
	//Componentes Eletrônicos da CPU
	public Registrador []registradores;
	public Mux2E muxMem 	= new Mux2E();
	public Mux4E muxA 		= new Mux4E();
	public Mux4E muxB 		= new Mux4E();
	
	public Cpu() {
		registradores[r0] 		= new RegistradorComSinal();
		registradores[r1] 		= new RegistradorComSinal();
		registradores[ra] 		= new RegistradorComSinal();
		registradores[pc] 		= new RegistradorSemSinal();
		registradores[r2] 		= new RegistradorComSinal();
		registradores[r3] 		= new RegistradorComSinal();
		registradores[rb] 		= new RegistradorComSinal();
		registradores[ir] 		= new RegistradorSemSinal();
		registradores[rend] 	= new RegistradorSemSinal();
		registradores[rdados] 	= new RegistradorComSinal();
	}
}
