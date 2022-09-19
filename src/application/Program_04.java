package application;

/** FIXME OLHA TANTO QUE SOU VELHO EM JAVA -> UNIVERSIDADE XTI */ 
/** FIXME O CARA POSTOU ESSAS VÍDEO AULAS EM @since 2011 */
/** @author LUCAS ROCHA -> VOLTANDO A ATIVA */
/** @since DESDE DE 2014 */
/**@version 1.0*/

public class Program_04 {

	public static void main(String[] args) {

		/** FIXME REGEX */
		/** FIXME -> MODIFICADORES */
		/**(?i) -> IGNORA MAIÚSCULA E MINÚSCULA */
		/**(?x) -> IGNORA COMENTARIOS */ 
		/**(?m) -> MULTINHAS (?s) -> DOTTAL*/
       
		String texto_01 = "LUCAS ROCHA DOS SANTOS";
		System.out.println(texto_01.matches("LUCAS ROCHA DOS SANTOS"));
		
		System.out.println(texto_01.matches("(?im)LUCAS rocha dos Santos"));
		System.out.println("\n\n");
		
		/**FIXME EXPRESSÕES PARA METACARACTERES*/
		/**\d DIGITOS [0-9]*/
		/**\D NÃO e DIGITOS [^0-9]*/
		/**\s ESPAÇOS [ \t\n\x0B\f\r]*/
		/**\S NÃO ESPAÇO [^\s]*/
		/**\w LETRA [a-zA-Z_0-9]*/
		/**\W NÃO E LETRA */
		
		System.out.println("OCORRENCIA DE UM CARACTER QUALQUER " + "@".matches("."));
		System.out.println("OCORRENCIA DE UM CARACTER DIGITO " + "22".matches("\\d\\d"));
		System.out.println("OCORRENCIA DE UM CARACTER LETRA E DIGITOS " + "A4C".matches("\\w"));
		System.out.println("OCORRENCIA DE UM CARACTER ESPAÇOS " + "A4C".matches("\\s"));
		System.out.println("OCORRENCIA DE UM CARACTER QUALQUER " + "A4C".matches("..."));
		System.out.println("OCCORENCIA DE UM CARACTER NÃO DIGITO " + "F".matches("\\D"));
		System.out.println("OCCORENCIA DE UM CARACTER NÃO LETRA " + "@".matches("\\W"));
		System.out.println("\n\n");

		String regexCPF = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
		String cpFulano = "159.589.456-08";
		System.out.println("VALIDANDO CPF REGEX " + cpFulano.matches(regexCPF));
		
		
		/**FIXME QUANTIFICADORES*/
		/** X{n} X, EXATAMENTE N VEZES */
		/** X{n,} X, PELO MENOS N VEZES*/
		/** X{x, m} X, PELO MENOS n MAS NÃO MAIS QUE M VEZES*/
		/** X? X, 0 OU 1 VEZ*/
		/** X* X, 0 OU + VEZES*/
		/** X+ X, 1 OU + VEZES*/
		
		System.out.println("\n\n");
		System.out.println("OCORRENCIA DE DOIS DIGITOS " + "22".matches("\\d{2}"));
		System.out.println("OCORRENCIA DE PELO MENOS DOIS DIGITOS " + "22".matches("\\d{2,}"));
		System.out.println("OCORRENCIA DE PELO MENOS DOIS DIGITOS E NO MAXIMO 5 " + "123456".matches("\\d{2,5}"));
		System.out.println("OCORRENCIA DE PELO MENOS UM CARACTER 0 OU 1 VEZES " + "P".matches(".?"));
		System.out.println("OCORRENCIA DE PELO MENOS UM CARACTER 0 OU + VEZES " + "2Fusca".matches(".*"));
		System.out.println("OCORRENCIA DE PELO MENOS UM CARACTER 1 OU + VEZES " + "2Fusca".matches(".+"));
		
		System.out.println("\n\n");
		System.out.println("VALIDANDO CPF NOVAMENTE " + cpFulano.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}"));
		System.out.println("AGORA VALIDANDO CEP " + "38770-000".matches("\\d{5}-\\d{3}"));
		
		/**FIXME METACARACTER DE FRONTEIRA*/
		/** ^ INCIA*/
		/** $ FINALIZA*/
		/** | OU*/
		
		System.out.println("COMECA COM E TERMINA COM 1 OU MAIS CARACTER " + "Pier21".matches("^Pier.*"));
		System.out.println("ELE COMECA COM 1 OU + QUALQUER CARACTER E TERMINA COM " + "Pier21".matches(".*$21"));
		System.out.println("SEM TEM TAL CARACTER NO MEIO DO TEXTO " + "TEM JAVA AQUI".matches(".*JAVA.*"));
		System.out.println("SEM TEM TAL CARACTER NO MEIO DO TEXTO " + "TEM JAVA AQUI".matches("^TEM.*AQUI$"));
		System.out.println("SE TEM DETERMINADO CARACTER " + "SIM".matches("SIM|NAO"));
		
		/**FIXME AGRUPADORES*/
		/**[...] AGRUPAMENTO*/
		/**[a-z] ALCANCE*/
		/**[a-e][i-u] UNIÃO*/
		/**[a-z&&][aeiou]] INTERSEÇÃO*/
		/**[^abc] Execeção*/
		/**[a-z&&][^m-p]] SUBTRACAO*/
		/**\x Fuga Literal*/
		
		System.out.println(" " + "x".matches("[a-z]"));
		System.out.println(" " + "A".matches("[a-z]"));
		System.out.println(" " + "2".matches("[a-z]"));
		System.out.println(" " + "2".matches("[0-9]"));
		System.out.println(" " + "true".matches("[tT]rue"));
		System.out.println(" " + "True".matches("[tT]rue"));
		System.out.println(" " + "True".matches("[tT]rue|[yY]es"));
		System.out.println(" " + "yes".matches("[tT]rue|[yY]es"));
		System.out.println(" " + "Lucas".matches("[A-Z][a-zA-Z]"));
		System.out.println(" " + "olho".matches("[^abc]lho"));
		System.out.println(" " + "crau".matches("cr[ae]u"));
		
		System.out.println("VALIDACAO EMAIL " + "lucasrocha@outlook.com.br".matches("\\w+@\\w+\\.\\w+\\.\\w{2,3}"));
		
	}
}
