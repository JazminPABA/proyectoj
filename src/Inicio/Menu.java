
package Inicio;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu6.setIcon(new javax.swing.ImageIcon("D:\\POO\\Login\\marcador-de-posicion.png")); // NOI18N
        jMenu6.setText("Punto de Venta");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon("D:\\POO\\Login\\insertar.png")); // NOI18N
        jMenu4.setText("Insertar");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jMenuItem10.setText("Insertar Usuario");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Insertar Producto");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("D:\\POO\\Login\\lupa.png")); // NOI18N
        jMenu5.setText("Buscar");
        jMenu5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jMenuItem7.setText("Usuario");
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Producto");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Venta");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\POO\\Login\\actualizado.png")); // NOI18N
        jMenu3.setText("Actualizar");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jMenuItem4.setText("Actualizar Producto");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Actualizar Usuario");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Actualizar Venta");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\POO\\Login\\borrar.png")); // NOI18N
        jMenu2.setText("Eliminar ");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jMenuItem1.setText("Eliminar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Eliminar Producto");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Eliminar Venta");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
