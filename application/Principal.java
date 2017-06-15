/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import core.GameManager;
import core.ResourceManager;


/**
 *
 * @author Fer
 */
public class Principal extends javax.swing.JFrame {
    int value;
    GameManager gameData;
    public Principal(GameManager gameData) {
        this.setResizable(false);
        //this.setLocationRelativeTo(null);
      
        value = 0;
        this.gameData = gameData;
        initComponents();  
        setImage(gameData.iconname);
        labelUser.setText(gameData.username);
        labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
        labelOopyies.setText(Integer.toString(gameData.resources.getOopyies()));
        
        labelDiaAtual.setText(Integer.toString(gameData.turns.getCurrentTurn()));
        labelDiadePagamento.setText(Integer.toString(gameData.turns.getNextPayTurn()));
    }

           
    private void setImage(int image){
        if(image == 0){
            labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CatBig.png")));
        }else if(image == 1){
            labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManBig.png")));
        
        }else if(image == 2){
            labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaskBig.png")));
        
        }
        
    }
    
//    
//     public class atualiza implements ActionListener{
//         public void actionPerformed(ActionEvent evt){
//        int n = value;
//        if(n<100){
//            n++;
//                
//        }else{
//          labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
//           timer.stop();
//           value  = 0;
//           timer.start();
//        }
//     
//         
//         }
//     }
//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRecursos = new javax.swing.JButton();
        btnLojaVirtual = new javax.swing.JButton();
        btnTrocasDiarias = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        btnTurno = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        labelOopyies = new javax.swing.JLabel();
        labelCriatividade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDiaAtual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDiadePagamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CatBig.png"))); // NOI18N

        jLabel2.setText("Usuario:");

        jLabel3.setText("Oopyies:");

        jLabel4.setText("Criatividade:");

        btnRecursos.setText("Recursos");
        btnRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosActionPerformed(evt);
            }
        });

        btnLojaVirtual.setText("Loja Virtual");
        btnLojaVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLojaVirtualActionPerformed(evt);
            }
        });

        btnTrocasDiarias.setText("Trocas Diárias");
        btnTrocasDiarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocasDiariasActionPerformed(evt);
            }
        });

        btnMapa.setText("Mapa");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        btnTurno.setFont(new java.awt.Font("Apple Color Emoji", 0, 14)); // NOI18N
        btnTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nascerdosol.png"))); // NOI18N
        btnTurno.setText("Iniciar Dia");
        btnTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnoActionPerformed(evt);
            }
        });

        labelUser.setText("nome");

        labelOopyies.setText("0");

        labelCriatividade.setText("0");

        jLabel1.setText("Dia Atual:");

        labelDiaAtual.setText("0");

        jLabel5.setText("Proximo Dia de Pagamento:");

        labelDiadePagamento.setText("19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 289, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLojaVirtual)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTrocasDiarias)
                        .addGap(131, 131, 131))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelImage)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(labelDiaAtual)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMapa)
                                .addComponent(btnRecursos)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUser)
                                    .addComponent(labelOopyies)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelDiadePagamento))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(labelCriatividade))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelUser))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelOopyies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelCriatividade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelDiaAtual)
                            .addComponent(jLabel5)
                            .addComponent(labelDiadePagamento))
                        .addGap(18, 18, 18)
                        .addComponent(labelImage)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecursos)
                            .addComponent(btnLojaVirtual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrocasDiarias)
                            .addComponent(btnMapa))
                        .addGap(37, 37, 37)))
                .addComponent(btnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Recursos(gameData, 0).setVisible(true); 
    }//GEN-LAST:event_btnRecursosActionPerformed

    private void btnLojaVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLojaVirtualActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new LojaVirtual(gameData).setVisible(true);
        
    }//GEN-LAST:event_btnLojaVirtualActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new MapaParaUso(gameData).setVisible(true);
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnTrocasDiariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocasDiariasActionPerformed
        this.dispose();
        new TrocasDiarias(gameData).setVisible(true);
    }//GEN-LAST:event_btnTrocasDiariasActionPerformed

    private void btnTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Turno(gameData).setVisible(true);
    }//GEN-LAST:event_btnTurnoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
   
    
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLojaVirtual;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnRecursos;
    private javax.swing.JButton btnTrocasDiarias;
    private javax.swing.JButton btnTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelCriatividade;
    private javax.swing.JLabel labelDiaAtual;
    private javax.swing.JLabel labelDiadePagamento;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelOopyies;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables
}
