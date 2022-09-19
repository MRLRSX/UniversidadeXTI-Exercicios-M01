package application;

public class Program_01 {
	
	public static void main(String[] args) {
         
		
		/**
		 * FIXME RELEMBRANDO 
		 * 
		 * */
		
		String texto01 = "Esse Texto Server";
		String texto02 = "Para Teste de Operações";
		
		String texto03 = texto01.concat(" ").concat(texto02);
		System.out.println(texto03);
		
		System.out.println(texto01.endsWith("es"));
		System.out.println(texto01.startsWith("Es"));
		System.out.println(texto01.equals("Esse texto"));
		System.out.println(texto01.length());
		System.out.println(texto01.charAt(0));
		System.out.println(texto01.indexOf("Texto"));
		System.out.println(texto01.lastIndexOf("e"));
		System.out.println(texto01.isEmpty());
		System.out.println(texto01.isBlank());
		System.out.println(texto03.regionMatches(0, texto01, 0, texto01.length()));
		
		String texto04 = texto03.substring(5, texto03.length());
		System.out.println(texto04);
		
		String texto05 = texto03.replace('e','?');
		System.out.println(texto05);
		
		String texto06 = texto03.trim();
		System.out.println(texto06);
		
		String texto07 = texto03.replaceAll(" ", "X");
		System.out.println(texto07);
		
		
	}
}
