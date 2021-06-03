
package paquete;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administracion
 */
public class test extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/base_elguapo";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    public static Connection getConnection (){
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
         
            
        }catch (Exception e){
            System.out.println(e);
            
        }
        return con;
    }

    
    private void limpiarCajas(){
        
        txtUsuario.setText(null);
        txtCorreo.setText(null);
        txtPass.setText(null);
    }

    public test() {
        initComponents();
        txtID.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsul = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("USUARIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 120, 30));

        jLabel3.setText("CONTRASEÑA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 120, 30));

        jLabel4.setText("CORREO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 120, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 320, 30));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 320, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 320, 30));

        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, -1, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, -1, -1));

        btnConsul.setText("Consultar");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        txtID.setEnabled(false);
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 60, -1));

        txtId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Nuevo chems.jpeg"))); // NOI18N
        txtId.setText("jLabel1");
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1060, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
   
        Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM persona2 WHERE usuario = ?");
            ps.setString(1, txtUsuario.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtID.setText(rs.getString("ID"));
                txtUsuario.setText(rs.getString("usuario"));
                txtCorreo.setText(rs.getString("correo"));
                txtPass.setText(rs.getString("password"));
                
            }else{
                JOptionPane.showMessageDialog(null,"El usuario no existe, intenta otra vez");
            }
            
        } catch(Exception e){
            System.err.println(e);
            
        }
        
        
    }//GEN-LAST:event_btnConsulActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO persona2(usuario, correo, password) VALUES(?,?,?)" );
            ps.setString(1, txtUsuario.getText());
            ps.setString(2, txtCorreo.getText());
            ps.setString(3, txtPass.getText());
            
            int res = ps.executeUpdate();
            
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Persona Guardada");
                    limpiarCajas();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar Persona");
                    limpiarCajas();
                }
                con.close();
                
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM persona2 WHERE usuario = ?");
            ps.setString(1, txtUsuario.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtID.setText(rs.getString("ID"));
                txtUsuario.setText(rs.getString("usuario"));
                txtCorreo.setText(rs.getString("correo"));
                txtPass.setText(rs.getString("password"));
                
            }else{
                JOptionPane.showMessageDialog(null,"El usuario no existe, intenta otra vez");
            }
            
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("UPDATE persona2 SET usuario=?, correo=?, password=? WHERE Id=?");
            ps.setString(1, txtUsuario.getText());
            ps.setString(2, txtCorreo.getText());
            ps.setString(3, txtPass.getText());
            ps.setString(4, txtID.getText());
            
            int res = ps.executeUpdate();
            
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Usuario Modificado");
                  
                }else{
                    JOptionPane.showMessageDialog(null, "Error al Modificara Usuario");
                    limpiarCajas();
                }
                con.close();
                
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
   
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM persona2 WHERE Id=?");
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            
            
            int res = ps.executeUpdate();
            
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                   limpiarCajas();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al Eliminar Usuario");
                    limpiarCajas();
                }
                con.close();
                
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}