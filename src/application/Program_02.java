package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program_02 {
	public static void main(String[] args) {
      
		String langs = "JAVA, PYTHON, RUBY, JAVASCRIPT, PHP, C#, SQL";
        String[] myLangs = langs.split(",");
        List<String> listLangs = Arrays.asList(myLangs);
        Consumer<Object> print = System.out::println;
        
        System.out.println("String com mais de 5 caracters ......");
        listLangs.stream().filter(c -> c.length() > 5).map(c -> c.toLowerCase()).forEach(print);
       
        System.out.println("String com menos de 5 caracters ......");
        listLangs.stream().filter(c -> c.length() < 5).map(c -> c.toLowerCase()).forEach(print);
	}
}
