/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.Professor;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosProfessor {
	private static ArrayList<Professor> dados = new ArrayList<Professor>();

        public static ArrayList<Professor> getDados() {
            return dados;
        }
        
        
	
        
        static
        {
            
            dados = (ArrayList<Professor>)Persist.recuperar("Professor.dat");
            if (dados == null)
                dados = new ArrayList<Professor>();
            
        } 
	public static void cadastrar(Professor a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "Professor.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
		for (Professor objeto : dados){
                        System.out.println("\n---\nProfessor\n---");
			objeto.mostrarDados();
		}
	}
	public static Professor buscar(String CPF){
		Professor a = null;
		for(Professor objeto : dados){
			if(objeto.getCPF().equals(CPF)){
				a=objeto;
				break;
			}
		}
		return a;
	}
        
	 public static boolean excluir(int index){
		if(index>-1)
                {
                    dados.remove(index);
                    Persist.gravar(dados, "Professor.dat");
                }
                return false;
	}
      
        
	
         public static void salvar()
        {
            Persist.gravar(dados, "Professor.dat");
        }
         
        
        
        
}
