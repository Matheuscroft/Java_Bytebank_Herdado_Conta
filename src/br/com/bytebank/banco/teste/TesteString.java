package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ctrl shift c - comentar várias linhas
		
		String nome = "Alura";
		
		//String outra = nome.replace("Al", "aL");
		//String outra = nome.replace('A', 'a');
		
//		char c = 'A';
//		char d = 'a';
//
//		String outra = nome.replace(c,d);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());

		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}
		
		String vazio ="    Alura    ";
		String outroVazio = vazio.trim(); 

		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio);
		System.out.println(vazio.contains("Alu"));
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);
	}

}
