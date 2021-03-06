package br.ufrj.dcc.archsimulator.model;

public class RegistradorSemSinal implements Registrador {

private boolean []valor;
	
	public RegistradorSemSinal()
	{
		valor = new boolean[Constantes.TAMANHO_REGISTRADORES];
	}
	
	public void setValor(boolean []valor) throws Exception
	{
		if(valor.length != Constantes.TAMANHO_REGISTRADORES) {
			throw new Exception("Tamanho do dado a ser salvo no registrador" +
					"incompatível com a largura do mesmo!");
		} else {
			this.valor = valor;
		}
	}
	
	public void setValor(int valor) throws Exception
	{
		if((valor >= (Math.pow(2, Constantes.TAMANHO_REGISTRADORES-1))) ||valor <= ((-1)*(Math.pow(2, Constantes.TAMANHO_REGISTRADORES)))  ) {
			throw new Exception("Tamanho do dado a ser salvo no registrador" +
					"incompatível com a largura do mesmo!");
		} else {
			if(valor < 0) {
				valor+=Math.pow(2,Constantes.TAMANHO_REGISTRADORES-1);
				int i = Constantes.TAMANHO_REGISTRADORES - 1,j=0;
				while(valor > 0) {
					if(valor>= Math.pow(2, i)) {
						this.valor[j] = true;
						valor-= Math.pow(2, i--);
						j++;
					} else {
						this.valor[j] = false;
						j++;
						i--;
					}
				}
				this.valor[0] = true;
			} else {
				this.valor[0] = false;
				int i = Constantes.TAMANHO_REGISTRADORES - 2, j=1;
				while(valor > 0) {
					if(valor>= Math.pow(2, i)) {
						this.valor[j] = true;
						valor-= Math.pow(2, i--);
						j++;
					} else {
						this.valor[j] = false;
						i--;
						j++;
					}
				}
			}
		}
	}
	
	public boolean[] getValor()
	{
		return this.valor;
	}
	
	public int getValorDecimal()
	{
		int valor = 0,i,j;
		for( i=Constantes.TAMANHO_REGISTRADORES-1,j=0;i>0;i--,j++) {
			if(this.valor[i]) valor+=Math.pow(2, j);
		}
		if(this.valor[0]) {
			valor+=Math.pow(2, Constantes.TAMANHO_REGISTRADORES-1);
			valor-= Math.pow(2, Constantes.TAMANHO_REGISTRADORES);
		}
		return valor;
	}
	
	public String getStringBinario()
	{
		String string = new String("");
		
		for(int i=0;i< this.valor.length;i++) {
			if(this.valor[i]) {
				string += "1";
			} else {
				string += "0";
			}
		}
		
		return string;
	}
}
