/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.ProjetoPesquisa;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosProjetoPesquisa {
    private static ArrayList<ProjetoPesquisa> dados = new ArrayList<ProjetoPesquisa>();

        public static ArrayList<ProjetoPesquisa> getDados() {
            return dados;
        }
	
        
         static
        {
            
            dados = (ArrayList<ProjetoPesquisa>)Persist.recuperar("ProjetoPesquisa.dat");
            if (dados == null)
                dados = new ArrayList<ProjetoPesquisa>();
            
        } 
	public static void cadastrar(ProjetoPesquisa a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "ProjetoPesquisa.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
                
		for (ProjetoPesquisa objeto : dados){
                        System.out.println("\n---\nProjeto de Pesquisa\n---");
			objeto.mostrarDados();
		}
	}
	public static ProjetoPesquisa buscar(String Codigo){
		ProjetoPesquisa a = null;
		for(ProjetoPesquisa objeto : dados){
			if(objeto.getCodigo().equals(Codigo)){
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
                    DadosProjetoPesquisa.salvar();
                    return true;
                }
                return false;
	}
        public static void salvar()
        {
            Persist.gravar(dados, "ProjetoPesquisa.dat");
        }
}
