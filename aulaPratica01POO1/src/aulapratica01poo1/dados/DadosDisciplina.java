/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.Disciplina;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosDisciplina implements Serializable{
	private static ArrayList<Disciplina> dados = new ArrayList<Disciplina>();
	static
        {
            
            dados = (ArrayList<Disciplina>)Persist.recuperar("Disciplina.dat");
            if (dados == null)
                dados = new ArrayList<Disciplina>();
            
        } 

    public static ArrayList<Disciplina> getDados() {
        return dados;
    }
        
        public static void salvar()
        {
            Persist.gravar(dados, "Disciplina.dat");
        }
    
	public static void cadastrar(Disciplina a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "Disciplina.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
                
		for (Disciplina objeto : dados){
                        System.out.println("\n---\nDisciplina\n---");
			objeto.mostrarDados();
		}
	}
	public static Disciplina buscar(int codigo){
		Disciplina a = null;
		for(Disciplina objeto : dados){
			if(objeto.getCodigo()==codigo){
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
                    Persist.gravar(dados, "Disciplina.dat");
                }
                return false;
	}
        public static void alterar(int i, Disciplina d)
        {
       
             
             dados.get(i).setNome(d.getNome());
             dados.get(i).setCodigo(d.getCodigo());
             dados.get(i).setCarga_horaria(d.getCarga_horaria());
                  
              Persist.gravar(dados, "Disciplina.dat");
        //persist.salvarDados(dados)
        
        }
}
