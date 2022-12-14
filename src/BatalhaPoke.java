
import Pokemon.Batalha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class BatalhaPoke extends javax.swing.JFrame {

    /**
     * Creates new form Batalha
     */
    public BatalhaPoke() {
        initComponents();
        new Thread(){
            public void run(){
                try{
                for (int i = 0; i < 101; i++) {
                    Thread.sleep(60);
                    BarraCarre.setValue(i);
                    if(BarraCarre.getValue()<=50){
                        lblBarra.setText("Batalha em Progresso . . .");
                    }else if(BarraCarre.getValue()>=50){
                        lblBarra.setText("Calculando o resultado . . .");
                    }
                    
                }
                dispose(); // fecha janela atual
                //login.setVisible(true);    
                
            }catch(InterruptedException ex){
                
        }
        }
        }.start();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBarra = new javax.swing.JLabel();
        BarraCarre = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(478, 370));
        getContentPane().setLayout(null);

        lblBarra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblBarra);
        lblBarra.setBounds(0, 340, 480, 30);

        BarraCarre.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(BarraCarre);
        BarraCarre.setBounds(-10, 340, 490, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aguard.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 480, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BatalhaPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatalhaPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatalhaPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatalhaPoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatalhaPoke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraCarre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBarra;
    // End of variables declaration//GEN-END:variables
}
