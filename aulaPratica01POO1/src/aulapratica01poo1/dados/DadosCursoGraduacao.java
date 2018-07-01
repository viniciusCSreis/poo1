/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.CursoGraduacao;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosCursoGraduacao implements Serializable{
	private static ArrayList<CursoGraduacao> dados = new ArrayList<CursoGraduacao>();
	static
        {
            
            dados = (ArrayList<CursoGraduacao>)Persist.recuperar("CursoGraduacao.dat");
            if (dados == null)
                dados = new ArrayList<CursoGraduacao>();
            
        } 

    public static ArrayList<CursoGraduacao> getDados() {
        return dados;
    }
        
	public static void cadastrar(CursoGraduacao a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "CursoGraduacao.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
                
		for (CursoGraduacao objeto : dados){
                        System.out.println("\n---\nCurso Graduação:\n---");
			objeto.mostrarDados();
		}
	}
	public static CursoGraduacao buscar(int codigo){
		CursoGraduacao a = null;
		for(CursoGraduacao objeto : dados){
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
                    salvar();
                    return true;
                }
                return false;
	}
        public static void salvar()
        {
            Persist.gravar(dados, "CursoGraduacao.dat");
        }
}
