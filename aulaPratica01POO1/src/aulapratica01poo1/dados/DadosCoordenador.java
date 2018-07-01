/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.Coordenador;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosCoordenador {
	private static ArrayList<Coordenador> dados = new ArrayList<Coordenador>();
        
	static
        {
            
            dados = (ArrayList<Coordenador>)Persist.recuperar("Coordenador.dat");
            if (dados == null)
                dados = new ArrayList<Coordenador>();
            
        } 
	public static void cadastrar(Coordenador a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "Coordenador.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
		for (Coordenador objeto : dados){
                        System.out.println("\n---\nCoordenador:\n---");
			objeto.mostrarDados();
		}
	}
	public static Coordenador buscar(String CPF){
		Coordenador a = null;
		for(Coordenador objeto : dados){
			if(objeto.getCPF().equals(CPF)){
				a=objeto;
				break;
			}
		}
		return a;
	}
        
        public static ArrayList<Coordenador> getDados() {
            return dados;
        }
        
	public static boolean excluir(int i)
        {
		if(i > -1)
                {
                    dados.remove(i);
                    DadosCoordenador.salvar();
                    return true;
                }
                
                return false;
	}
        
         public static void salvar()
        {
            Persist.gravar(dados, "Coordenador.dat");
        }
}