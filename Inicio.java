/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;

public class Inicio extends javax.swing.JFrame {
    String Nombre="Juan", Clave="123";
  
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
   /* public void buscar(){
        try{
            URL url=new URL(http://localhost/Api/Index.php);
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        tfclave = new javax.swing.JTextField();
        JLnombre = new javax.swing.JLabel();
        JLabelcontrasena = new javax.swing.JLabel();
        lEntrada = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Imagenes/777.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 330, 320));

        tfnombre.setName("tfnombre"); // NOI18N
        getContentPane().add(tfnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 330, 80));

        tfclave.setName("tfclave"); // NOI18N
        tfclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfclaveActionPerformed(evt);
            }
        });
        getContentPane().add(tfclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 320, 70));

        JLnombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLnombre.setText("Nombre");
        JLnombre.setName("jlnombre"); // NOI18N
        getContentPane().add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, 80));

        JLabelcontrasena.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLabelcontrasena.setText("Contrasena");
        JLabelcontrasena.setName("jlclave"); // NOI18N
        getContentPane().add(JLabelcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 150, 60));

        lEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Imagenes/iniciar.jpg"))); // NOI18N
        lEntrada.setName("login"); // NOI18N
        lEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lEntradaMouseClicked(evt);
            }
        });
        getContentPane().add(lEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 190, 80));

        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Imagenes/6666.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfclaveActionPerformed
     
    }//GEN-LAST:event_tfclaveActionPerformed

    private void lEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEntradaMouseClicked
       Menu ventana=new Menu();
        
         HttpClient cliente=new HttpClient(new OnHttpRequestComplete(){
         @Override
         public void onComplete(Response status)
         {
            
             if(status.isSuccess())
            {
                try{
                    JSONObject a=new JSONObject(status.getResult());
                    String nombreBd=a.getJSONObject("0").get("nombre").toString();
                    String direccionBd=a.getJSONObject("0").get("direccion").toString();
                    if(tfnombre.getText().toString().equals(nombreBd) && tfclave.getText().toString().equals(direccionBd)){
                        ventana.setVisible(true);
                    }
                    else{
                            JOptionPane.showMessageDialog(null, "Los datos no son corretcs");
                            }
                }catch(JSONException e){   
                }
            
            }
           /*throw new UnsupportedOperationException("Not suported yet.");*/  
         }
     });
         String nombre=tfnombre.getText().toString();
         String direccion=tfclave.getText().toString();
         cliente.excecute("http://localhost/Api/log.php?nombre="+nombre+"&direccion="+direccion+""); 
        
    }//GEN-LAST:event_lEntradaMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelcontrasena;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lEntrada;
    private javax.swing.JTextField tfclave;
    private javax.swing.JTextField tfnombre;
    // End of variables declaration//GEN-END:variables
}
