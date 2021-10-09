package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

        public static void main(String[] args) {
        	
        		//List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
            	//List<Conta> lista = new LinkedList<Conta>(); //lista linkada

        		ArrayList<Conta> lista = new ArrayList<Conta>();
        		ArrayList<String> nomes = new ArrayList<String>();

                Conta cc = new ContaCorrente(22, 11);
                lista.add(cc);

                Conta cc2 = new ContaCorrente(22, 22);
                lista.add(cc2);

                System.out.println(lista.size());
                Conta ref = lista.get(0);
                System.out.println(ref.getNumero());

                lista.remove(0);

                System.out.println("Tamanho: " + lista.size());

                Conta cc3 = new ContaCorrente(33, 311);
                lista.add(cc3);

                Conta cc4 = new ContaCorrente(33, 322);
                lista.add(cc4);

                for(int i = 0; i < lista.size(); i++) {
                    Object oRef = lista.get(i);
                    System.out.println(oRef);
                }

                System.out.println("-------");

                for(Conta conta : lista) {
                    System.out.println(conta);
                }
                
//                ArrayList lista = new ArrayList(26); //capacidade inicial
//                lista.add("RJ");
//                lista.add("SP");
//                //outros estados
//                ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista

        }
}