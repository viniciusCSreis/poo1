/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;
import aulapratica01poo1.classes.AlunoGraduacao;
import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author vinic
 */
public abstract class DadosAlunoGraduacao implements Serializable {
	private static ArrayList<AlunoGraduacao> dados = new ArrayList<AlunoGraduacao>();
        
        static
        {
            
            dados = (ArrayList<AlunoGraduacao>)Persist.recuperar("AlunoGraduacao.dat");
            if (dados == null)
                dados = new ArrayList<AlunoGraduacao>();
            
            
        }
        

     public static ArrayList<AlunoGraduacao> getDados() {
         
        return dados;
     }
        
	public static void cadastrar(AlunoGraduacao a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "AlunoGraduacao.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){                
		for (AlunoGraduacao objeto : dados){
                        System.out.println("\n---\nAluno Graduação:\n---");
			objeto.mostrarDados();
                        
		}
                
	}
	public static AlunoGraduacao buscar(String matricula){
		AlunoGraduacao a = null;
		for(AlunoGraduacao objeto : dados){
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
                    DadosAlunoGraduacao.salvar();
                }
                return false;
	}
        public static void salvar()
        {
            Persist.gravar(dados, "AlunoGraduacao.dat");
        }
}
