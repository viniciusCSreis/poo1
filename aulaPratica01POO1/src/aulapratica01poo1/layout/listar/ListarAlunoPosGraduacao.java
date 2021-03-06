/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.layout.listar;

import aulapratica01poo1.classes.AlunoGraduacao;
import aulapratica01poo1.classes.AlunoPosGraduacao;
import aulapratica01poo1.dados.DadosAlunoGraduacao;
import aulapratica01poo1.dados.DadosAlunoPosGraduacao;
import aulapratica01poo1.dados.DadosDisciplina;
import aulapratica01poo1.layout.main;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class ListarAlunoPosGraduacao extends javax.swing.JFrame {

    /**
     * Creates new form ListarAlunoPosGraduacao
     */
    public ListarAlunoPosGraduacao() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Matricula", "Situação", "Curso", "Instituição", "Ano de Inico", "Ano de Fim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jToggleButton1.setText("Alterar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        tirrarColorError();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        int erros=0;
        Color colorError= new Color(255, 77, 77);

        int index=jTable1.getSelectedRow();
        if(index>-1)
        {

            //armazenando dados em variaveis locais

            AlunoPosGraduacao a =   DadosAlunoPosGraduacao.getDados().get(index);
            String nome         =   (String) jTable1.getValueAt(index, 0);
            String cpf          =   (String) jTable1.getValueAt(index, 1);
            String matricula    =   (String) jTable1.getValueAt(index, 2);
            String situacao     =   (String) jTable1.getValueAt(index, 3);
            String instituicao  =   (String) jTable1.getValueAt(index, 5);            
            int dtInicio        =   0;
            int dtFim           =   0;

            //filtrar dados
            //dtInicio
            try
            {
                dtInicio=(int) jTable1.getValueAt(index, 6);                
            }
            catch(Exception e)
            {                
                erros++;
                ColocarColorError();
            }
            //dtFim
            try
            {
                dtFim=(int) jTable1.getValueAt(index, 7);                
            }
            catch(Exception e)
            {
                erros++;
                ColocarColorError();
            }

            //set nome AlunoGraduacao
            if(!a.setNome(nome))
            {
                erros++;
                ColocarColorError();
            }
            //set CPF AlunoGraduacao
            if(!a.setCpf(cpf))
            {
                erros++;
                ColocarColorError();
            }
            //set Matricula AlunoGraduaco
            if(!a.setMatriula(matricula))
            {
                erros++;
                ColocarColorError();
            }
            //set Situação
            if(!a.setSituacao(situacao))
            {
                erros++;
                ColocarColorError();
            }
            //set instituicao
        if(!a.setInstituicao(instituicao))
        {
            erros++;
            ColocarColorError();
        }
        //set dtInicio
        if(!a.setAnoInicio(dtInicio))
        {
            erros++;
            ColocarColorError();
        }
        //set dtFim
        if(!a.setAnoFim(dtFim))
        {
            erros++;
            ColocarColorError();
        }
            if(erros==0)
            {

                DadosAlunoPosGraduacao.salvar();
                listar();
                JOptionPane.showMessageDialog(null, "Dados Alterados");

            }
            else JOptionPane.showMessageDialog(null, "Erro ao alterar dados");
        }
        else JOptionPane.showMessageDialog(null, "Por favor selecione uma linha");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(DadosAlunoPosGraduacao.excluir(jTable1.getSelectedRow()))
        {
            listar();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }else
        JOptionPane.showMessageDialog(null, "Não existe registro selecionado!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ListarAlunoPosGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAlunoPosGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAlunoPosGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAlunoPosGraduacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAlunoPosGraduacao().setVisible(true);
            }
        });
    }
    public void listar()
    {
        //1a. parte - definir modelo de dados
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
        modelo.setRowCount(0);
        //2a. parte - adicionar linhas na tabela
            //JOptionPane.showMessageDialog(null, dados.size());
        for (AlunoPosGraduacao a : DadosAlunoPosGraduacao.getDados() )
        {
            String situacao="";
            switch(a.getSituacao())
            {
                case 1:
                    situacao="Matriculado";
                    break;
                case 2:
                    situacao="Trancado";
                    break;
                case 3:
                    situacao="Desligado";
                    break;
            }
            String curso="["+a.getCursoPosGraduacao().getCodigo()+"]"+a.getCursoPosGraduacao().getNome();
           modelo.addRow(new Object[]{
                a.getNome(),
                a.getCPF(),
                a.getMatricula(),
                situacao,
                curso,
                a.getInstituicao(),
                a.getAnoInicio(),
                a.getAnoFim()


            });
           
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void tirrarColorError() {
        Color color=new Color(51,153,255);
        jTable1.setSelectionBackground(color);
    }
     private void ColocarColorError() {        
        jTable1.setSelectionBackground(main.colorError);
    }
}
