/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.layout.adicionar;

import aulapratica01poo1.classes.CursoGraduacao;
import aulapratica01poo1.classes.Disciplina;
import aulapratica01poo1.dados.DadosCursoGraduacao;
import aulapratica01poo1.dados.DadosDisciplina;
import aulapratica01poo1.layout.main;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class AdicionarCursoGraduacao extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarCursoGraduacao
     */
    public AdicionarCursoGraduacao() {
        initComponents();
        listar();
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
        jPanelDisciplina = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDisciplinas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Cadastrar Novo Curso de Graduação:");

        jLabel8.setText("Codigo:");

        jLabel9.setText("Nome:");

        jLabel10.setText("Duração:");

        jLabel11.setText("Graduação:");

        codigoCurso.setToolTipText("");

        buttonGroup1.add(graduacaoL);
        graduacaoL.setText("Licenciatura");
        graduacaoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graduacaoLActionPerformed(evt);
            }
        });

        buttonGroup1.add(graduacaoB);
        graduacaoB.setText("Bacharel");

        buttonGroup1.add(graduacaoT);
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
                            .addComponent(duracaoCurso)
                            .addGroup(CadastrarCursoLayout.createSequentialGroup()
                                .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 71, Short.MAX_VALUE))))))
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

        jLabel1.setText("Selecionar Disciplinas(Utilize o Shift e o Ctrl para selecionar mais de 1):");

        jListDisciplinas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListDisciplinas);

        javax.swing.GroupLayout jPanelDisciplinaLayout = new javax.swing.GroupLayout(jPanelDisciplina);
        jPanelDisciplina.setLayout(jPanelDisciplinaLayout);
        jPanelDisciplinaLayout.setHorizontalGroup(
            jPanelDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30))
        );
        jPanelDisciplinaLayout.setVerticalGroup(
            jPanelDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graduacaoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graduacaoLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graduacaoLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        int erros=0;
        Color colorError= new Color(255, 77, 77);   
        tirrarColorError();
        
        //armazenado dados em variaveis locais 
        int codigoCurso=0; 
        String nomeCurso=this.nomeCurso.getText();
        int duracao=0;
        String graduacao=""; 
        Disciplina d = null;

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
        c.setGraduacao(graduacao);
        
        int selecionados[]=this.jListDisciplinas.getSelectedIndices();
        int disciplinasSelecionadas=selecionados.length;
        for(int i=0;i<selecionados.length;i++)
        {
            c.setDisciplinas(DadosDisciplina.getDados().get(selecionados[i]));
        }
        if(disciplinasSelecionadas==0)
        {
            erros++;
            this.jPanelDisciplina.setBackground(main.colorError);
        }
        if(erros==0)
        {
            DadosCursoGraduacao.cadastrar(c);
            JOptionPane.showMessageDialog(null, "Curso cadastro realizado com sucesso!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarCursoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCursoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCursoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCursoGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarCursoGraduacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastrarCurso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codigoCurso;
    private javax.swing.JTextField duracaoCurso;
    private javax.swing.JPanel graduacao;
    private javax.swing.JRadioButton graduacaoB;
    private javax.swing.JRadioButton graduacaoL;
    private javax.swing.JRadioButton graduacaoT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListDisciplinas;
    private javax.swing.JPanel jPanelDisciplina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeCurso;
    // End of variables declaration//GEN-END:variables

    private void tirrarColorError() {
        
        Color colorJpanelPadrao=new Color(240,240,240);
        
        codigoCurso.setBackground(Color.white);
        nomeCurso.setBackground(Color.white);
        duracaoCurso.setBackground(Color.white);        
        
        graduacao.setBackground(colorJpanelPadrao);
        
    }
    private void listar()
    {
        DefaultListModel modelo = new DefaultListModel();
        jListDisciplinas.setModel(modelo);
        
        for(Disciplina d : DadosDisciplina.getDados())
        {
            modelo.addElement(d.getNome());
        }
    }
}
