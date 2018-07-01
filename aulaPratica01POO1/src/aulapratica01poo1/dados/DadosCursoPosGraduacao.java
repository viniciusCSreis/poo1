/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.CursoPosGraduacao;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosCursoPosGraduacao implements Serializable{
	private static ArrayList<CursoPosGraduacao> dados = new ArrayList<CursoPosGraduacao>();
	static
        {
            
            dados = (ArrayList<CursoPosGraduacao>)Persist.recuperar("CursoPosGraduacao.dat");
            if (dados == null)
                dados = new ArrayList<CursoPosGraduacao>();
            
        } 

    public static ArrayList<CursoPosGraduacao> getDados() {
        return dados;
    }
        
	public static void cadastrar(CursoPosGraduacao a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "CursoPosGraduacao.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
                
		for (CursoPosGraduacao objeto : dados){
                        System.out.println("\n---\nCurso Pos Graduação:\n---");
			objeto.mostrarDados();
		}
	}
	public static CursoPosGraduacao buscar(int codigo){
		CursoPosGraduacao a = null;
		for(CursoPosGraduacao objeto : dados){
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
                    DadosCursoPosGraduacao.salvar();
                    return true;
                }
                return false;
	}
        public static void salvar()
        {
            Persist.gravar(dados, "CursoPosGraduacao.dat");
        }
}
