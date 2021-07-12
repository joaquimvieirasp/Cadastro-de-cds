package Cadastro_cds;



public class Principal {

	public static void main(String[] args) {
		
		Titulos titulo = new Titulos();
		
		titulo.estilo = "Dance";
		titulo.artista = "Dido";
		titulo.albúm = "no angel-the remixes";
		titulo.lançamento = "2001";
		
		System.out.printf("O ano de lançamento do cd %s é %s", titulo.albúm, titulo.lançamento);
				

	}

}
