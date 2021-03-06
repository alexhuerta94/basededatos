
package paquete;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static paquete.test.getConnection;

/**
 *
 * @author Alejandro Huerta González
 */
public class productos extends javax.swing.JFrame {

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
         
            //JOptionPane.showMessageDialog(null,"Conexion Establecida");
        }catch (Exception e){
            System.out.println(e);
            
        }
        return con;
    }
 
    
    private void limpiarCajas(){
        
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtColor.setText(null);
        cbxTamaño.setSelectedIndex(0);
        txtPrecio.setText(null);
        txtStock.setText(null);
        txtHora.setText(null);
        jdFecha.setDate(null);
        //ps.setString(7,((JTextField)jdFecha.getDateEditor().getUiComponent()).getText());
        
        
    }
    public productos() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cbxTamaño = new javax.swing.JComboBox<>();
        txtStock = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        txtHora = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Codigo del Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel4.setText("Color");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel5.setText("Tamaño");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel6.setText("Precio (unidad)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jLabel7.setText("Stock");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jLabel8.setText("Fecha Hora de Registro");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 220, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 220, -1));
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 220, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 220, -1));

        cbxTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA EL TAMAÑO", "EXTRA CHICO", "CHICO", "MEDIANO", "GRANDE", "EXTRA GRANDE" }));
        getContentPane().add(cbxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 220, -1));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 220, -1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 780, -1, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 780, -1, -1));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 780, -1, -1));

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 780, -1, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 70, -1));

        jdFecha.setDateFormatString("yyyy/MM/dd HH:mm:ss");
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 220, -1));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 190, -1));

        jLabel9.setText("Fecha Hora de Registro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 780, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Nuevo chems.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM productos WHERE Id=?");
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            
            
            int res = ps.executeUpdate();
            
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Producto Eliminado");
                   limpiarCajas();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al Eliminar Producto");
                    limpiarCajas();
                }
                con.close();
                
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
  Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM productos WHERE cod_produc = ?");
            ps.setString(1, txtCodigo.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtID.setText(rs.getString("ID"));
                txtCodigo.setText(rs.getString("cod_produc"));
                txtNombre.setText(rs.getString("nombre"));
                txtColor.setText(rs.getString("color"));
                txtPrecio.setText(rs.getString("preuni"));
                txtStock.setText(rs.getString("stock"));
                cbxTamaño.setSelectedItem(rs.getString("tamaño"));
                txtHora.setText(rs.getString("fechareg"));
                
            }else{
                JOptionPane.showMessageDialog(null,"El producto no existe, intenta otra vez");
            }
            
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO productos(cod_produc, nombre, color, tamaño, preuni, stock, fechareg) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtColor.getText());
            ps.setString(4, cbxTamaño.getSelectedItem().toString());
            ps.setString(5, txtPrecio.getText());
            ps.setString(6, txtStock.getText());
            ps.setString(7,((JTextField)jdFecha.getDateEditor().getUiComponent()).getText());
            
            int res = ps.executeUpdate();
            
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Producto Guardado");
                    limpiarCajas();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar Producto");
                    limpiarCajas();
                }
                con.close();
                
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM productos WHERE cod_produc = ?");
            ps.setString(1, txtCodigo.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtID.setText(rs.getString("ID"));
                txtCodigo.setText(rs.getString("cod_produc"));
                txtNombre.setText(rs.getString("nombre"));
                txtColor.setText(rs.getString("color"));
                cbxTamaño.setSelectedItem(rs.getString("tamaño"));
                txtPrecio.setText(rs.getString("preuni"));
                txtStock.setText(rs.getString("stock"));
                jdFecha.setDateFormatString("MM/yyyy/dd");
                txtHora.setText(rs.getString("fechareg"));
                
                
            }else{
                JOptionPane.showMessageDialog(null,"El producto no existe, intenta otra vez");
            }
            
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
     
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("UPDATE productos SET cod_produc=?, nombre=?, color=?, tamaño=?,preuni=?, stock=?, fechareg=? WHERE Id=?");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtColor.getText());
            ps.setString(4, cbxTamaño.getSelectedItem().toString());
            ps.setString(5, txtPrecio.getText());
            ps.setString(6, txtStock.getText());
            ps.setString(8, txtID.getText());
            ps.setString(7,((JTextField)jdFecha.getDateEditor().getUiComponent()).getText());
            
            int res = ps.executeUpdate();
            
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Producto Modificado");                                                                                                                                                                                                                 
                  
                }else{
                    JOptionPane.showMessageDialog(null, "Error al Modificara Producto");
                    limpiarCajas();
                }
                con.close();
                
        } catch(Exception e){
            System.err.println(e);
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxTamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
