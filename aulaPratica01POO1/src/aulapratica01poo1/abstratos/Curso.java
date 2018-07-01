/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.abstratos;

import aulapratica01poo1.classes.Disciplina;
import aulapratica01poo1.EntradaDeDados;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author vinic
 */
public abstract class Curso implements Serializable{
    private int  codigo;
    private String nome;
    private double duracao;
    private ArrayList <Disciplina>disciplinas=new ArrayList<Disciplina>();
    
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    
    public boolean setDisciplinas(Disciplina d)
    {
        if(d!=null)
        {
            this.disciplinas.add(d);
            return true;
        }
        System.out.println("Disciplina inválida.");
        return false;
    }
    public void mostrarDisciplinas(){
        //percorrer o arraylist “disciplinas” chamando mostrarDados() de
        //cada disciplina
        for (Disciplina d: disciplinas)
        d.mostrarDados();
    }
    public void removerDisciplina(Disciplina d) {
        //remover um objeto “d” do arraylist de disciplinas
        disciplinas.remove(d);
    }

        
    public boolean setCodigo(int codigo)
    {
        if(codigo > 0)
        {
            this.codigo = codigo;
            return true;
        }else
        {
            System.out.println("Codigo inválido.");
            return false;
        }
    }
    
    public boolean setNome(String nome)
    {
        if(nome.length() > 0)
        {
            this.nome=nome;
            return true;
        }
        System.out.println("Nome inváido");
        return false;
    }
    
    public boolean setDuracao(double duracao)
    {
        if(duracao > 0)
        {
            this.duracao = duracao;
            return true;
                  
        }
        System.out.println("Duração inváido");
        return false;
    }
    public void lerDados()
    {
        
        System.out.println("Curso");
        
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Digite o código do curso:");
        }while(!setCodigo(EntradaDeDados.lerInteiro()));
        do{
            System.out.println("Digite o nome do curso:");
        }while(!setNome(s.nextLine()));
                
        do{
            System.out.println("Digite o duração em horas do curso:");
        }while(!setDuracao(EntradaDeDados.lerDouble()));
        
    }
     public void mostrarDados()
    {
        
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Ducaração: "+this.duracao);
        mostrarDisciplinas();
    }

}
