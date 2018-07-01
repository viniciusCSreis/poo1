/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.EntradaDeDados;
import aulapratica01poo1.abstratos.Funcionario;
import aulapratica01poo1.interfaces.Pesquisador;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Professor extends Funcionario implements Pesquisador,Serializable{
    private String titulo;
    private String areaDePesquisa;
    private int numeroHorasAula;    
    private double valorHoraAula;
    
    public String getTipo(){return this.getClass().getName();}

    public String getTitulo() {
        return titulo;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public int getNumeroHorasAula() {
        return numeroHorasAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }
    
    public boolean setTitulo(String titulo) {
       

        if(titulo.length()== 0)
        {
            return false;
        }
        
        if (titulo.toUpperCase().charAt(0) == 'M'
                || titulo.toUpperCase().charAt(0) == 'D') {
            this.titulo = titulo;
            return true;
        } else {
            System.out.println("Escolha inválida.");
            return false;

        }

    }
     
    public boolean setAreaDePesquisa(String areaDePesquisa){
        
        if(areaDePesquisa.length()>0)
        {
            this.areaDePesquisa=areaDePesquisa;
            return true;
        }
        
        System.out.println("Area de Pesquisa Inválida.");
        return false;
    }
    
    public boolean setNumeroHorasAula(int numeroHorasAula) {
        if(numeroHorasAula>0)
        {
            this.numeroHorasAula = numeroHorasAula;
            return true;
        }
        System.out.println("Numero de Horas Aulas inválido.");
        return false;
    }
    
    
    public boolean setValorHoraAula(double valorHoraAula) {
        if(valorHoraAula>0)
        {
            this.valorHoraAula = valorHoraAula;
            return true;
        }
        System.out.println("Valor de hora aula inválido.");
        return false;
    }
    
   
    
    
    public double calcSalario()
    {
        return super.getSalario() + (numeroHorasAula * valorHoraAula);
    }
    
   
   
            
            
    public void lerDados()
    {
        
        super.lerDados();
        
        System.out.println("Professor");
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Digite a  titulação do Professor:");
            System.out.println("Escolha:");
            System.out.println("M:Mestre");
            System.out.println("D:Doutor");
        }while(!setTitulo(s.nextLine()));
        
        do{
            System.out.println("Digite o area da pesquisa  do Professor:");
        }
        while(!setAreaDePesquisa(s.nextLine()));
        
        do{
            System.out.println("Digite o Numeros de horas por aula");
        }
        while(!setNumeroHorasAula(EntradaDeDados.lerInteiro()));
        
        do{
            System.out.println("Digite o valor por hora aula");
        }
        while(!setValorHoraAula(EntradaDeDados.lerDouble()));
    }
    public void mostrarDados()
    {
        super.mostrarDados();
        
        switch(this.titulo.charAt(0))
        {
            case 'M':
                System.out.println("Titulo:Mestre");
                break;
            case 'D':
                System.out.println("Titulo:Dotutor");
                break;
        }
        System.out.println("Area de Pesquisa: "+this.areaDePesquisa);
        System.out.println("Numero de Horas Aula:"+this.numeroHorasAula);
        System.out.println("Valor Hora Aula:"+this.valorHoraAula);
        
        
    }
}
