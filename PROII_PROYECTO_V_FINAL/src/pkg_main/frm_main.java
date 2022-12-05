package pkg_main;

public class frm_main extends javax.swing.JFrame {

    public frm_main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkp_main = new javax.swing.JDesktopPane();
        mbr_main = new javax.swing.JMenuBar();
        mnu_file = new javax.swing.JMenu();
        mitm_exit = new javax.swing.JMenuItem();
        mnu_mantenimiento = new javax.swing.JMenu();
        mitm_lista_estudiante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dkp_mainLayout = new javax.swing.GroupLayout(dkp_main);
        dkp_main.setLayout(dkp_mainLayout);
        dkp_mainLayout.setHorizontalGroup(
            dkp_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        dkp_mainLayout.setVerticalGroup(
            dkp_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        mnu_file.setText("Opciones");

        mitm_exit.setText("Salir");
        mitm_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitm_exitActionPerformed(evt);
            }
        });
        mnu_file.add(mitm_exit);

        mbr_main.add(mnu_file);

        mnu_mantenimiento.setText("Matricula");

        mitm_lista_estudiante.setText("Matricular Estudiante");
        mitm_lista_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitm_lista_estudianteActionPerformed(evt);
            }
        });
        mnu_mantenimiento.add(mitm_lista_estudiante);

        mbr_main.add(mnu_mantenimiento);

        setJMenuBar(mbr_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkp_main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkp_main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitm_lista_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitm_lista_estudianteActionPerformed
        ifrm_mantenimiento_lista_estudiantes ventanaEstudiantes = new ifrm_mantenimiento_lista_estudiantes();
        dkp_main.add(ventanaEstudiantes);
        ventanaEstudiantes.show();
    }//GEN-LAST:event_mitm_lista_estudianteActionPerformed

    private void mitm_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitm_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mitm_exitActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkp_main;
    private javax.swing.JMenuBar mbr_main;
    private javax.swing.JMenuItem mitm_exit;
    private javax.swing.JMenuItem mitm_lista_estudiante;
    private javax.swing.JMenu mnu_file;
    private javax.swing.JMenu mnu_mantenimiento;
    // End of variables declaration//GEN-END:variables
}
