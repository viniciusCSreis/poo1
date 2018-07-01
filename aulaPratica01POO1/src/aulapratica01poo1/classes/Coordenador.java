/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.EntradaDeDados;
import aulapratica01poo1.abstratos.Funcionario;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Coordenador extends Funcionario implements Serializable
{
    private String cargo;
    private String departamento;
    private double salarioBase;
    private static double valorHoraExtra;
    private double quantidadeHoraExtra;

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }
    
    
    
    public boolean setCargo(String cargo){
        
        if(cargo.length()>0)
        {
            this.cargo=cargo;
            return true;
        }
        
        System.out.println("Cargo Inválido.");
        return false;
    }
    public boolean setDepartamento(String departamento){
        
        if(departamento.length()>0)
        {
            this.departamento=departamento;
            return true;
        }
        
        System.out.println("Departamento Inválido.");
        return false;
    }
    
    public static boolean setValorHoraExtra(double valor) {
        if(valor>0)
        {
            valorHoraExtra = valor;
            return true;
        }
        System.out.println("Valor Hora Extra inválida");
        return false;
    }
    
    public boolean setSalarioBase(double salarioBase) {
        if(salarioBase>0)
        {
            this.salarioBase = salarioBase;
            return true;
        }
        System.out.println("Salario Base inválido");
        return false;
    }

    
    public boolean setQuantidadeHoraExtra(double quantidadeHoraExtra) {
        if(quantidadeHoraExtra>0)
        {
            this.quantidadeHoraExtra = quantidadeHoraExtra;
            return true;
        }
        System.out.println("Quantidade Hora Extra inválida");
        return false;
    }

    public static double getValorHoraExtra() {
        return valorHoraExtra;
    }

    
    
    
    
    
    
    public double calcSalario()
    {
        return salarioBase + (valorHoraExtra * quantidadeHoraExtra);
    }
    
    public double calcSalario(double quantHoras, double valorHora)
    {
        return this.salarioBase + ( quantHoras + valorHora );
    }

   
    
    public void lerDados()
    {
        
        super.lerDados();
        
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Digite o cargo:");
        }while(!setCargo(s.nextLine()));
        do{
            System.out.println("Digite o departamento:");
        }while(!setDepartamento(s.nextLine()));
        
        do{
            System.out.println("Digite o salario Base:");
        } while(!setSalarioBase(EntradaDeDados.lerDouble()));
        
        do{
            System.out.println("Digite o valor da hora extra:");
        } while(!setValorHoraExtra(EntradaDeDados.lerDouble()));
        
        do{
            System.out.println("Digite a quantiade de hora extra:");
        } while(!setQuantidadeHoraExtra(EntradaDeDados.lerDouble()));
    }
    public void mostrarDados()
    {
        super.mostrarDados();
        
        System.out.println("Cargo: "+this.cargo);        
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salario Base: "+this.salarioBase);
        System.out.println("Valor da hora extra: "+this.valorHoraExtra);
        System.out.println("Quantiade de hora extra: "+this.quantidadeHoraExtra);
        
    }
    
}
