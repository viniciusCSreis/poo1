/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.EntradaDeDados;
import aulapratica01poo1.abstratos.Curso;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Disciplina implements Serializable {
    private int codigo;
    private String nome;
    private int carga_horaria;
    private Professor professor;
    private Curso curso;
    
    public Disciplina()
    {
        
    }
    public Disciplina(Curso curso)
    {
        this.curso=curso;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Curso getCurso() {
        return curso;
    }
    
    
    
    public boolean setCurso(String curso)
    {
       
        
        if(curso.length()==0)
            return false;
        switch(curso.toUpperCase().charAt(0))
        {
            case '1':
                this.curso=new CursoGraduacao();
                return true;
            case '2':
                this.curso=new CursoPosGraduacao();
                return true;
            default:
                System.out.println("Escolha inválida");
                return false;
            
        }
        
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
     
    public boolean setCarga_horaria(int carga_horaria)
    {
        if(carga_horaria > 0)
        {
            this.carga_horaria = carga_horaria;
            return true;
        }else
        {
            System.out.println("Carga Horaria inválida.");
            return false;
        }
    }
   
    
    public void lerDados()
    {
        
     
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Digite o código da Disciplina:");
        }while(!setCodigo(EntradaDeDados.lerInteiro()));
        do{
            System.out.println("Digite o nome da Disciplina:");
        }while(!setNome(s.nextLine()));
        do{     
            System.out.println("Digite o carga horario da Disciplina:");
        }while(!setCarga_horaria(EntradaDeDados.lerInteiro()));
        
        do{
            System.out.print("Digite o curso:");
            System.out.println("Escolha:");
            System.out.println("1:Curso Graduação");
            System.out.println("2:Curso Pos Graduação");
        }while(!setCurso(s.nextLine()));
        curso.lerDados();
        
        System.out.println("---Digite o professor da Disciplina:---");
        this.professor = new Professor();
        this.professor.lerDados();
        
        
    }
    public void mostrarDados()
    {
        
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Carga Horaria: "+this.carga_horaria);
        curso.mostrarDados();
        professor.mostrarDados();
    }

    public int getCodigo() {
        return this.codigo;
    }
}
