/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1;

import aulapratica01poo1.classes.FolhaPagamento;
import aulapratica01poo1.classes.Professor;
import aulapratica01poo1.classes.Disciplina;
import aulapratica01poo1.classes.AlunoGraduacao;
import aulapratica01poo1.classes.Tecnico;
import aulapratica01poo1.classes.Coordenador;
import aulapratica01poo1.classes.CursoPosGraduacao;
import aulapratica01poo1.classes.ProjetoPesquisa;
import aulapratica01poo1.classes.AlunoPosGraduacao;
import aulapratica01poo1.classes.CursoGraduacao;
import aulapratica01poo1.dados.DadosTecnico;
import aulapratica01poo1.dados.DadosCursoGraduacao;
import aulapratica01poo1.dados.DadosCursoPosGraduacao;
import aulapratica01poo1.dados.DadosProjetoPesquisa;
import aulapratica01poo1.dados.DadosDisciplina;
import aulapratica01poo1.dados.DadosCoordenador;
import aulapratica01poo1.dados.DadosProfessor;
import aulapratica01poo1.dados.DadosAlunoPosGraduacao;
import aulapratica01poo1.dados.DadosAlunoGraduacao;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class AulaPratica01POO1 {

    public static void main(String[] args) {
        
        
        
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Dados");
            System.out.println("2-Listar Dados");
            System.out.println("9-Sair");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    adicionarDados();
                    escolha=0;
                    break;
                case 2:
                    listarDados();
                    escolha=0;
                    break;
                case 9:
                    break;
                default:
                    escolha=0;
            }
        
        }while(escolha==0);
        
    }
    
    
    

    private static void adicionarDados() {
        
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Aluno");
            System.out.println("2-Adicionar Curso");
            System.out.println("3-Adicionar Disciplina");
            System.out.println("4-Adicionar Funcionario");
            System.out.println("5-Adicionar Projeto de Pesquisa");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    adicionarCurso();
                    break;
                case 3:
                    adicionar(5);                    
                    break;
                case 4:
                    adicionarFuncionario(5);
                    break;
                case 5:
                    adicionarProjetoDePesquisa();
                    break;
                case 9:
                    return;
                default:
                    escolha=0;
            }
        
        }while(escolha==0);
    }

    private static void listarDados() {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Listar Alunos");
            System.out.println("2-Listar Cursos");
            System.out.println("3-Listar Disciplina");
            System.out.println("4-Listar Funcionarios");
            System.out.println("5-Listar Projetos de Pesquisa");            
            System.out.println("6-Listar Tudo(menos Folha de Pagamento)");
            System.out.println("7-Listar Folha de Pagamento");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    listarAlunos();
                    escolha=0;
                    break;
                case 2:
                    listarCursos();
                    escolha=0;
                    break;
                case 3:
                    DadosDisciplina.listar();
                    escolha=0;
                    break;
                case 4:
                    listarFuncionarios();
                    escolha=0;
                    break;
                case 5:
                    DadosProjetoPesquisa.listar();
                    escolha=0;
                    break;                
                    
                case 6:
                    DadosAlunoGraduacao.listar();
                    DadosAlunoPosGraduacao.listar();
                    DadosCursoGraduacao.listar();
                    DadosCursoPosGraduacao.listar();
                    DadosDisciplina.listar();
                    DadosProfessor.listar();
                    DadosTecnico.listar();
                    DadosCoordenador.listar();
                    DadosProjetoPesquisa.listar();
                    escolha=0;
                    break;
                    
                case 7:
                    listarFolhaPagamento();
                    escolha=0;
                    break;
                case 9:
                    return;
                default:
                    escolha=0;
            }
        
        }while(escolha==0);
       
      
    }
        
    private static void adicionarAluno() {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Aluno Graduação");
            System.out.println("2-Adicionar Aluno PosGraduacao");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    adicionar(1);
                    break;
                case 2:
                    adicionar(2);
                    break;
                case 9:
                    adicionarDados();
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
    }
    
    private static void adicionarFuncionario(int i) {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Professor");
            System.out.println("2-Adicionar Tecnico");
            System.out.println("3-Adicionar Coordenador");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    adicionar(6);
                    break;
                case 2:
                    adicionar(7);
                    break;
                 case 3:
                    adicionar(8);
                    break;
                case 9:
                    adicionarDados();
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
    }
    
    private static void adicionarCurso() {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Curso Graduação");
            System.out.println("2-Adicionar Curso PosGraduacao");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    adicionar(3);
                    break;
                case 2:
                    adicionar(4);
                    break;
                case 9:
                    adicionarDados();
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
    }

    private static void adicionar(int p) {
        int escolha=0;
        do
        {
            switch(p)
            {
                //Adicionar Aluno Graduacao
                case 1:
                {
                    AlunoGraduacao d=new AlunoGraduacao();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosAlunoGraduacao.cadastrar(d);
                    break;
                }
                
                //Adicionar Aluno Pos Graduacao
                case 2:
                {
                    AlunoPosGraduacao d=new AlunoPosGraduacao();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosAlunoPosGraduacao.cadastrar(d);
                    break;
                }
                //Adicionar Curso Graduacao
                case 3:
                {
                    CursoGraduacao d=new CursoGraduacao();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosCursoGraduacao.cadastrar(d);
                    break;
                }
                //Adicionar Curso Pos Graduacao
                case 4:
                {
                    CursoPosGraduacao d=new CursoPosGraduacao();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosCursoPosGraduacao.cadastrar(d);
                    break;
                }
                //Adicionar Disciplina
                case 5:
                {
                    Disciplina d=new Disciplina();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosDisciplina.cadastrar(d);
                    break;
                }
                //Adicionar Professor
                case 6:
                {
                    Professor d=new Professor();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosProfessor.cadastrar(d);
                    break;
                }
                //Adicionar Tecnico
                case 7:
                {
                    Tecnico d=new Tecnico();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosTecnico.cadastrar(d);
                    break;
                }
                //Adicionar Coordenador
                case 8:
                {
                    Coordenador d=new Coordenador();
                    d.lerDados();
                    System.out.println("Cadastrado:");
                    d.mostrarDados();
                    DadosCoordenador.cadastrar(d);
                    break;
                }
                
            }
            
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Novo ?");
            System.out.println("9-sair");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    adicionar(p);
                    break;
                case 9:
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
    }

    private static void listarFuncionarios() {
         int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Listar Professor");
            System.out.println("2-Listar Tecnico");
            System.out.println("2-Listar Coordenador");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    DadosProfessor.listar();
                    escolha=0;
                    break;
                case 2:
                    DadosTecnico.listar();  
                    escolha=0;
                    break;
                 case 3:
                    DadosCoordenador.listar(); 
                    escolha=0;
                    break;
                case 9:
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
      
    }

    private static void listarCursos() {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-listar Curso Graduação");
            System.out.println("2-listar Curso PosGraduacao");
            System.out.println("3-listar Curso Graduação e PosGraduacao");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    DadosCursoGraduacao.listar();
                    escolha=0;
                    break;
                case 2:
                    DadosCursoPosGraduacao.listar();
                    escolha=0;
                    break;
                case 3:
                    DadosCursoGraduacao.listar();
                    DadosCursoPosGraduacao.listar();
                    escolha=0;
                    break;
                case 9:
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
    }

    private static void listarAlunos() {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Listar Aluno Graduação");
            System.out.println("2-Listar Aluno PosGraduacao");
            System.out.println("3-Listar Aluno Graduação e PosGraduacao");
            System.out.println("9-Voltar");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    DadosAlunoGraduacao.listar();
                    escolha=0;
                    break;
                case 2:
                    DadosAlunoPosGraduacao.listar();
                    escolha=0;
                    break;
                case 3:
                    DadosAlunoGraduacao.listar();
                    DadosAlunoPosGraduacao.listar();
                    escolha=0;
                    break;
                case 9:
                    return;
                default:
                    escolha=0;
            }

        }while(escolha==0);
        
    }   

    private static void adicionarProjetoDePesquisa() 
    {
       ProjetoPesquisa pp = new ProjetoPesquisa();
       pp.lerDados();
       int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Adicionar Aluno de Graduacao a Equipe");
            System.out.println("2-Adicionar Aluno de Pos Graduacao a Equipe");
            System.out.println("3-Adicionar Professor a Equipe");
            System.out.println("9-Sair");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    AlunoGraduacao ag=new AlunoGraduacao();
                    ag.lerDados();
                    System.out.println("Cadastrado:");
                    ag.mostrarDados();
                    pp.adicionar(ag);
                    DadosAlunoGraduacao.cadastrar(ag);
                    escolha=0;
                    break;
                case 2:
                    AlunoPosGraduacao apd =new AlunoPosGraduacao();
                    apd.lerDados();
                    System.out.println("Cadastrado:");
                    apd.mostrarDados();
                    pp.adicionar(apd);
                    DadosAlunoPosGraduacao.cadastrar(apd);
                    escolha=0;
                    break;
                case 3:
                    Professor p=new Professor();
                    p.lerDados();
                    System.out.println("Cadastrado:");
                    p.mostrarDados();
                    pp.adicionar(p);
                    DadosProfessor.cadastrar(p);
                    escolha=0;
                    break;
                case 9:
                    DadosProjetoPesquisa.cadastrar(pp);
                    break;
                default:
                    escolha=0;
            }
        
        }while(escolha==0); 
        
        
        
    }

    private static void listarFolhaPagamento() {
        int escolha=0;
        do
        {
            System.out.println("Escolha:");
            System.out.println("1-Listar folha de pagamento dos Tecnicos");
            System.out.println("2-Listar folha de pagamento dos Professores");
            System.out.println("3-Listar folha de pagamento dos Coordenadores");
            System.out.println("9-Sair");
            escolha=EntradaDeDados.lerInteiro();
            switch(escolha)
            {
                case 1:
                    FolhaPagamento fpTecnicos = new FolhaPagamento();
                    fpTecnicos.printRelatorio(DadosTecnico.getDados());
                    fpTecnicos.somaFolha(DadosTecnico.getDados());
                    escolha=0;
                    break;
                case 2:
                    FolhaPagamento fpProfessores = new FolhaPagamento();
                    fpProfessores.printRelatorio(DadosProfessor.getDados());
                    fpProfessores.somaFolha(DadosProfessor.getDados());
                    escolha=0;
                    break;
                case 3:
                    FolhaPagamento fpCoordenador = new FolhaPagamento();
                    fpCoordenador.printRelatorio(DadosCoordenador.getDados());
                    fpCoordenador.somaFolha(DadosCoordenador.getDados());
                    escolha=0;
                case 9:
                    break;
                default:
                    escolha=0;
            }
        
        }while(escolha==0);
    }
}


   



        
        
        
    
