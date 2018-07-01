/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.AlunoPosGraduacao;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosAlunoPosGraduacao implements Serializable{
	private static ArrayList<AlunoPosGraduacao> dados = new ArrayList<AlunoPosGraduacao>();
	static
        {
            
            dados = (ArrayList<AlunoPosGraduacao>)Persist.recuperar("AlunoPosGraduacao.dat");
            if (dados == null)
                dados = new ArrayList<AlunoPosGraduacao>();
            
        } 

    public static ArrayList<AlunoPosGraduacao> getDados() {
        return dados;
    }
        
	public static void cadastrar(AlunoPosGraduacao a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "AlunoPosGraduacao.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
               
		for (AlunoPosGraduacao objeto : dados){
                        System.out.println("\n---\nAluno Pos Graduação:\n---");
			objeto.mostrarDados();
		}
	}
	public static AlunoPosGraduacao buscar(String matricula){
		AlunoPosGraduacao a = null;
		for(AlunoPosGraduacao objeto : dados){
			if(objeto.getMatricula().equals(matricula)){
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
                DadosAlunoPosGraduacao.salvar();
                return true;
            }
            return false;
	}

    public static void salvar() {
        Persist.gravar(dados, "AlunoPosGraduacao.dat");
    }
        
        
}
