package br.com.modeloArquitetura.enuns;


/**
 * Enumera��o que especifica o Sexo de uma Pessoa F�sica
 * 
 * @author Barry White
 * @since Setembro 21, 2011
 * 
 */

public enum EnumSexo {
	
	MASCULINO("M"),
	FEMININO("F");
	
	private String tipo;
	
	
	private EnumSexo(String t) {
		tipo = t;
	}


	public String getTipo() {
		return tipo;
	}


		

}
