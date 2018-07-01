/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.abstratos;
import static aulapratica01poo1.CodigosProntos.ValidarCPF.*;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public abstract class Pessoa implements Serializable{
    private String nome;
    private String CPF;
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
     
    public boolean setCpf(String Cpf)
    {
        if(Cpf.length()>=11)
        {
            if(isCPF(Cpf))
            {   
                this.CPF=imprimeCPF(Cpf);
                return true;
            }
        }
        System.out.println("CPF inváido");
        return false;
    }
    
    public void lerDados()
    {
        
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Digite o nome:");
        }while(!setNome(s.nextLine()));
        
        
        do{
            System.out.println("Digite o CPF:");
        }while(!setCpf(s.nextLine()));
       
     }
    public void mostrarDados()
    {
        
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.CPF);
        
    }
    
    public String getNome(){ return this.nome;}
    
    public String getCPF(){
        return this.CPF;
    }
}

