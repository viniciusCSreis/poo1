/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.layout.adicionar;

import aulapratica01poo1.classes.AlunoGraduacao;
import aulapratica01poo1.classes.CursoGraduacao;
import aulapratica01poo1.dados.DadosAlunoGraduacao;
import aulapratica01poo1.dados.DadosCursoGraduacao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author vinic
 */
public class AdicionarAlunoGraduacao extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarAlunoGraduacao
     */
    public AdicionarAlunoGraduacao() {
        initComponents();
        listarCursosExistentes();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CadastrarCurso = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        codigoCurso = new javax.swing.JTextField();
        nomeCurso = new javax.swing.JTextField();
        duracaoCurso = new javax.swing.JTextField();
        graduacao = new javax.swing.JPanel();
        graduacaoL = new javax.swing.JRadioButton();
        graduacaoB = new javax.swing.JRadioButton();
        graduacaoT = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        SelecionarCurso = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        situacao = new javax.swing.JPanel();
        matriculado = new javax.swing.JRadioButton();
        trancado = new javax.swing.JRadioButton();
        desligado = new javax.swing.JRadioButton();
        Curso = new javax.swing.JPanel();
        cadastrar = new javax.swing.JRadioButton();
        selecionar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adicionar Aluno Graduação:");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Matricula:");

        jLabel5.setText("Situação:");

        jLabel6.setText("Curso:");

        CadastrarCurso.setVisible(false);

        jLabel7.setText("Cadastrar Novo Curso de Graduação:");

        jLabel8.setText("Codigo:");

        jLabel9.setText("Nome:");

        jLabel10.setText("Duração:");

        jLabel11.setText("Graduação:");

        codigoCurso.setToolTipText("");

        buttonGroup3.add(graduacaoL);
        graduacaoL.setText("Licenciatura");
        graduacaoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graduacaoLActionPerformed(evt);
            }
        });

        buttonGroup3.add(graduacaoB);
        graduacaoB.setText("Bacharel");
        graduacaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graduacaoBActionPerformed(evt);
            }
        });

        buttonGroup3.add(graduacaoT);
        graduacaoT.setText("Tecnologo");

        javax.swing.GroupLayout graduacaoLayout = new javax.swing.GroupLayout(graduacao);
        graduacao.setLayout(graduacaoLayout);
        graduacaoLayout.setHorizontalGroup(
            graduacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graduacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graduacaoB)
                .addGap(75, 75, 75)
                .addComponent(graduacaoL)
                .addGap(75, 75, 75)
                .addComponent(graduacaoT)
                .addContainerGap())
        );
        graduacaoLayout.setVerticalGroup(
            graduacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graduacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(graduacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graduacaoB)
                    .addComponent(graduacaoL)
                    .addComponent(graduacaoT))
                .addContainerGap())
        );

        javax.swing.GroupLayout CadastrarCursoLayout = new javax.swing.GroupLayout(CadastrarCurso);
        CadastrarCurso.setLayout(CadastrarCursoLayout);
        CadastrarCursoLayout.setHorizontalGroup(
            CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarCursoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(66, 66, 66)
                        .addComponent(codigoCurso))
                    .addGroup(CadastrarCursoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(72, 72, 72)
                        .addComponent(nomeCurso))
                    .addGroup(CadastrarCursoLayout.createSequentialGroup()
                        .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duracaoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                                .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        CadastrarCursoLayout.setVerticalGroup(
            CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(codigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(duracaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SelecionarCurso.setVisible(false);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Selecionar Curso:");

        javax.swing.GroupLayout SelecionarCursoLayout = new javax.swing.GroupLayout(SelecionarCurso);
        SelecionarCurso.setLayout(SelecionarCursoLayout);
        SelecionarCursoLayout.setHorizontalGroup(
            SelecionarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelecionarCursoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
        );
        SelecionarCursoLayout.setVerticalGroup(
            SelecionarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelecionarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelecionarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelecionarCursoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        buttonGroup1.add(matriculado);
        matriculado.setText("Matriculado");

        buttonGroup1.add(trancado);
        trancado.setText("Trancado");
        trancado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trancadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(desligado);
        desligado.setText("Desligado");
        desligado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desligadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout situacaoLayout = new javax.swing.GroupLayout(situacao);
        situacao.setLayout(situacaoLayout);
        situacaoLayout.setHorizontalGroup(
            situacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(situacaoLayout.createSequentialGroup()
                .addComponent(matriculado)
                .addGap(75, 75, 75)
                .addComponent(trancado)
                .addGap(75, 75, 75)
                .addComponent(desligado)
                .addGap(75, 75, 75))
        );
        situacaoLayout.setVerticalGroup(
            situacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(situacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(matriculado)
                .addComponent(trancado)
                .addComponent(desligado))
        );

        buttonGroup2.add(cadastrar);
        cadastrar.setText("Cadastrar Novo Curso");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        buttonGroup2.add(selecionar);
        selecionar.setText("Selecionar Curso Existente");
        selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CursoLayout = new javax.swing.GroupLayout(Curso);
        Curso.setLayout(CursoLayout);
        CursoLayout.setHorizontalGroup(
            CursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(selecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        CursoLayout.setVerticalGroup(
            CursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(selecionar)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SelecionarCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CadastrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(matricula)
                                    .addComponent(cpf))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(CadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelecionarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trancadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trancadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trancadoActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        CadastrarCurso.setVisible(true);
        SelecionarCurso.setVisible(false);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarActionPerformed
        CadastrarCurso.setVisible(false);
        SelecionarCurso.setVisible(true);
    }//GEN-LAST:event_selecionarActionPerformed

    private void graduacaoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graduacaoLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graduacaoLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int erros=0;          
        Color colorError= new Color(255, 77, 77);  
        
        tirrarColorError();
        
        //armazenando dados em variaveis locais
        AlunoGraduacao a = new AlunoGraduacao();
        String nome = this.nomeAluno.getText();
        String cpf = this.cpf.getText();
        String matricula = this.matricula.getText();
        String situacao="";
        
        //filtrar dados
        if(matriculado.isSelected())situacao="M";
        else if(trancado.isSelected())situacao="T";
        else if(desligado.isSelected())situacao="D";
        else
        {
            erros++;
            this.situacao.setBackground(colorError);
        }
      
        //set nome AlunoGraduacao
        if(!a.setNome(nome))
        {
            erros++;
            this.nomeAluno.setBackground(colorError);
        }
        //set CPF AlunoGraduacao
        if(!a.setCpf(cpf))
        {
            erros++;
            this.cpf.setBackground(colorError);
        }
        //set Matricula AlunoGraduaco
        if(!a.setMatriula(matricula))
        {
            erros++;
            this.matricula.setBackground(colorError);
        }
        //set Situação
        a.setSituacao(situacao);
        
        //cadastrar curso
        if(cadastrar.isSelected())
        {
            //armazenado dados em variaveis locais
            int codigoCurso=0; 
            String nomeCurso=this.nomeCurso.getText();
            int duracao=0;
            String graduacao=""; 
            
            //lendo apenas int codigo curso
            try{ 
                codigoCurso=Integer.parseInt(this.codigoCurso.getText()); 
            }
            catch(Exception e){
                erros++;
                this.codigoCurso.setBackground(colorError);
            }
            //lendo apenas int duracaoCurso
            try{
                duracao=Integer.parseInt(this.duracaoCurso.getText());
                
            }catch(Exception e){
                erros++;
                this.duracaoCurso.setBackground(colorError);
            }
            //lendo graduacao
            if(graduacaoB.isSelected())graduacao="B";
            else if(graduacaoL.isSelected())graduacao="L";
            else if(graduacaoT.isSelected())graduacao="T";
            else
            {
                erros++;
                this.graduacao.setBackground(colorError);
            }
            
            //armazenando dados no cursoGraduacao
            CursoGraduacao c =new CursoGraduacao();           
            //codigo
            if(!c.setCodigo(codigoCurso))
            {
                erros++;
                this.codigoCurso.setBackground(colorError);
            } 
            //nome
            if(!c.setNome(nomeCurso))
            {
                erros++;
                this.nomeCurso.setBackground(colorError);
            }
            //duracao
            if(!c.setDuracao(duracao))
            {
                erros++;
                this.duracaoCurso.setBackground(colorError);
            }
            //
            //graduação
            c.setGraduacao(graduacao);
            if(erros==0)
            {
                DadosCursoGraduacao.cadastrar(c);
                JOptionPane.showMessageDialog(null, "Curso cadastro realizado com sucesso!");
            }
            a.setCursoGraduacao(c);
            
            
            
        }
        //
        else if(selecionar.isSelected())
        {
            if (jList1.getSelectedIndex() > -1)
            {
                ArrayList<CursoGraduacao> dados=DadosCursoGraduacao.getDados(); 
                CursoGraduacao c = dados.get(jList1.getSelectedIndex());            
                a.setCursoGraduacao(c);
            }
            else
            {
                erros++;
                JOptionPane.showMessageDialog(null,"Nenhum curso selecionado.");
            }
        }
        //não selecionar cadastrar ou selecionar
        else
        {
            erros++;
            Curso.setBackground(colorError);
            
        }
        
        if(erros==0)
        {
            DadosAlunoGraduacao.cadastrar(a);
            JOptionPane.showMessageDialog(null, "Aluno cadastro realizado com sucesso!");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void desligadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desligadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desligadoActionPerformed

    private void graduacaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graduacaoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graduacaoBActionPerformed
    
    private void listarCursosExistentes()
    {

        DefaultListModel modelo = new DefaultListModel();
        //nomes = new JList(modelo);

        jList1.setModel(modelo);
        
        for (CursoGraduacao c: DadosCursoGraduacao.getDados())
        {
           
            modelo.addElement("["+c.getCodigo()+"]"+c.getNome());
        }
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarAlunoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarAlunoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarAlunoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarAlunoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarAlunoGraduacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastrarCurso;
    private javax.swing.JPanel Curso;
    private javax.swing.JPanel SelecionarCurso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton cadastrar;
    private javax.swing.JTextField codigoCurso;
    private javax.swing.JTextField cpf;
    private javax.swing.JRadioButton desligado;
    private javax.swing.JTextField duracaoCurso;
    private javax.swing.JPanel graduacao;
    private javax.swing.JRadioButton graduacaoB;
    private javax.swing.JRadioButton graduacaoL;
    private javax.swing.JRadioButton graduacaoT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matricula;
    private javax.swing.JRadioButton matriculado;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JRadioButton selecionar;
    private javax.swing.JPanel situacao;
    private javax.swing.JRadioButton trancado;
    // End of variables declaration//GEN-END:variables

    private void tirrarColorError() {
        
        Color colorJpanelPadrao=new Color(240,240,240);
        
        nomeAluno.setBackground(Color.white);
        cpf.setBackground(Color.white);
        matricula.setBackground(Color.white);
        codigoCurso.setBackground(Color.white);
        nomeCurso.setBackground(Color.white);
        duracaoCurso.setBackground(Color.white);
        
        Curso.setBackground(colorJpanelPadrao);
        graduacao.setBackground(colorJpanelPadrao);
        situacao.setBackground(colorJpanelPadrao);
        
        
    }
}
