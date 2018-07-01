/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.dados;

import aulapratica01poo1.classes.Tecnico;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public abstract class DadosTecnico {
	private static ArrayList<Tecnico> dados = new ArrayList<Tecnico>();

    public static ArrayList<Tecnico> getDados()
    {
        return dados;
    }
    
    public static boolean excluir(int i)
    {
		if(i  > - 1)
                {
                    dados.remove(i);
                    DadosTecnico.salvar();
                    return true;
                }
                
                return false;
	}
        
        public static void salvar()
        {
            Persist.gravar(dados, "Tecnico.dat");
        }
    
    
       static
        {
            
            dados = (ArrayList<Tecnico>)Persist.recuperar("Tecnico.dat");
            if (dados == null)
                dados = new ArrayList<Tecnico>();
            
        } 
	public static void cadastrar(Tecnico a ){
		dados.add(a);
		System.out.println("Total de dados inseridos");
		System.out.println(dados.size());
                boolean r = Persist.gravar(dados, "Tecnico.dat");
                System.out.println("Gravação:"+r);
	}
	public static void listar(){
		for (Tecnico objeto : dados){
                        System.out.println("\n---\nTecnico\n---");
			objeto.mostrarDados();
		}
	}
	public static Tecnico buscar(String CPF){
		Tecnico a = null;
		for(Tecnico objeto : dados){
			if(objeto.getCPF().equals(CPF)){
				a=objeto;
				break;
			}
		}
		return a;
	}
         public static void alterar(int i, Tecnico t)
        {
       
             
             dados.get(i).setCargo(t.getCargo());
             dados.get(i).setDepartamento(t.getDepartamento());
             dados.get(i).setSalarioBase(t.getSalarioBase());
                dados.get(i).setValorHoraExtra(t.getValorHoraExtra());
            dados.get(i).setQuantidadeHoraExtra(t.getQuantidadeHoraExtra());
              
                  
              Persist.gravar(dados, "Disciplina.dat");
        //persist.salvarDados(dados)
        
        }
	
}
