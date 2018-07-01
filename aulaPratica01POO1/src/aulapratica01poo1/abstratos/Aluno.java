/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.abstratos;

import aulapratica01poo1.interfaces.Pesquisador;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public abstract class Aluno extends Pessoa implements Pesquisador,Serializable{
    private String matricula;
    private int situacao;

    public int getSituacao() {
        
        return situacao;
    }
   
    public String getTipo(){return this.getClass().getName();};
    
    public String getMatricula()
    {
        return this.matricula;
    }
    public boolean setSituacao(String situacao)
    {
        
        if(situacao.length()==0)
            return false;
        switch(situacao.toUpperCase().charAt(0))
        {
            case 'M':
                this.situacao=1;
                return true;                
            case 'T':
                this.situacao=2;
                return true;
            case 'D':
                this.situacao=3;
                return true;
            default:
                System.out.println("Escolha inválida.");
                return false;
        }
    }
    public boolean setMatriula(String matricula)
    {
        if(matricula.length() > 0)
        {
            this.matricula = matricula;
            return true;
        }else
        {
            System.out.println("Matricula inválida");
            return false;
        }
    }
    public void lerDados()
    {
        super.lerDados();

        
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Digite a Matricula do Aluno:");
        }while(!setMatriula(s.nextLine()));
        
        do{
            System.out.println("Digite a Situação:");
            System.out.println("Escolha:");
            System.out.println("M:matriculado");
            System.out.println("T:trancado");
            System.out.println("D:desligado");
        }while(!setSituacao(s.nextLine()));
        
        
        
    }
    public void mostrarDados()
    {
        
        super.mostrarDados();        
        System.out.println("Matricula do Aluno:"+this.matricula);
        switch(this.situacao)
        {
            case 1:
                System.out.println("Situação Matriculado");
                break;
            case 2:
                System.out.println("Situação Trancado");
                break;
            case 3:
                System.out.println("Situação Desligado");
                break;
        }
    }
}
