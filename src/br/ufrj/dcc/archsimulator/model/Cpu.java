package br.ufrj.dcc.archsimulator.model;


public class Cpu {
	public Registrador []registradores;
	public static final int r0 = 0;
	public static final int r1 = 1;
	public static final int ra = 2;
	public static final int pc = 3;
	public static final int r2 = 4;
	public static final int r3 = 5;
	public static final int rb = 6;
	public static final int ir = 7;
	public static final int rend = 8;
	public static final int rdados = 9;
	
	
	public Cpu() {
		registradores[r0] = new RegistradorComSinal();
		registradores[r1] = new RegistradorComSinal();
		registradores[ra] = new RegistradorComSinal();
		registradores[pc] = new RegistradorSemSinal();
		registradores[r2] = new RegistradorComSinal();
		registradores[r3] = new RegistradorComSinal();
		registradores[rb] = new RegistradorComSinal();
		registradores[ir] = new RegistradorSemSinal();
		registradores[rend] = new RegistradorSemSinal();
		registradores[rdados] = new RegistradorComSinal();
	}
}
