/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.interfaces.Pesquisador;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class ProjetoPesquisa implements Serializable {
    private String codigo;
    private String titulo;
    private String data_de_inicio;
    private String data_de_fim;
    private Professor professorResponsavel;
    private ArrayList <Pesquisador> equipe=new ArrayList<Pesquisador>();

    public String getTitulo() {
        return titulo;
    }

    public String getData_de_inicio() {
        return data_de_inicio;
    }

    public String getData_de_fim() {
        return data_de_fim;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public ArrayList<Pesquisador> getEquipe() {
        return equipe;
    }


    
    
    public void listarEquipe() {
        
        System.out.println("Equipe:");
        for(Pesquisador p : this.equipe)
        {
            System.out.println(p.getTipo()+":"+p.getNome());            
        }
    }
    public void adicionar(Pesquisador p)
    {
        this.equipe.add(p);
    }
    public void mostrarDados()
    {
        System.out.println("Codigo:"+this.codigo);
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Data de Inicio:"+this.data_de_inicio);
        System.out.println("Data de Fim:"+this.data_de_fim);
        listarEquipe();
        
    }
    public void lerDados()
    {
        Scanner s = new Scanner(System.in);        
        do System.out.println("Codigo:");while(!setCodigo(s.nextLine()));
        do System.out.println("Titulo:");while(!setTitulo(s.nextLine()));
        do System.out.println("Data de inicio:");while(!setDtInicio(s.nextLine()));
        do System.out.println("Data de fim:");while(!setDtFim(s.nextLine()));
        
        System.out.println("Professor Responsavel:");
            Professor p = new Professor();
            p.lerDados();
        
        
        
    }
    public boolean setTitulo(String titulo)
    {
        if(titulo.length()>0)
        {
            this.titulo=titulo;
            return true;
        }
        System.out.println("Titulo inválido");
        return false;
    }
    public boolean setCodigo(String codigo) {
        if(codigo.length()>0)
        {
            this.codigo=codigo;
            return true;
        }
        System.out.println("Codigo inválido");
        return false;
    }

    public boolean setDtInicio(String dtInicio) {
        if(dtInicio.length()>0)
        {
            this.data_de_inicio=dtInicio;
            return true;
        }
        System.out.println("Data inválida");
        return false;
        
    }

    public boolean setDtFim(String dtFim) {
        if(dtFim.length()>0)
        {
            this.data_de_fim=dtFim;
            return true;
        }
        System.out.println("Data inválida");
        return false;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
    
    public String getCodigo() {
        return codigo;
    }

    
    
    
}
