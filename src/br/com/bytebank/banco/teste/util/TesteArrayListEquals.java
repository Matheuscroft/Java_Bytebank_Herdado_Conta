package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
//      Conta cc1 = new ContaCorrente(22, 22);
//      Conta cc2 = new ContaCorrente(22, 22);
//      
//      boolean igual = cc1.ehIgual(cc2);
//      System.out.println(igual);
		
		//List<String> argumentos = Arrays.asList(args);

		List<Conta> lista = new ArrayList<Conta>();
		//List<Conta> lista1 = new Vector<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        System.out.println("J? existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
}

}
