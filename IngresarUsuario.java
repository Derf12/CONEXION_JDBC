/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PA1_P2_TAREA2_DARWIN_ROMERO;
import PA1_P2_TAREA2_DARWIN_ROMERO.PRINCIPAL_CONECCION;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class IngresarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form IngresarUsuario
     */
    public IngresarUsuario() {
        initComponents();
      
    setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXT_NOMBRE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_APELLIDO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_PESO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JBC_SEXO = new javax.swing.JComboBox<>();
        JBC_DEPARTA = new javax.swing.JComboBox<>();
        JBC_MUNICIPIO = new javax.swing.JComboBox<>();
        JB_GUARDAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JB_MODIFICAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("NOMBRE ");

        TXT_APELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_APELLIDOActionPerformed(evt);
            }
        });

        jLabel3.setText("APELLIDO");

        jLabel4.setText("PESO");

        JBC_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otros ", "Masculino ", "Femenino" }));

        JBC_DEPARTA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atlántida,", "Choluteca,", "Colón, ", "Comayagua,", "Copán, ", "Cortes,", "El Paraíso, ", "Francisco Morazán,", "Gracias a Dios,", "Intibucá,", "Islas de la Bahía,", "La Paz, ", "Lempira, ", "Ocotepeque,", "Olancho,", "Santa Bárbara, ", "Valle, ", "Yoro," }));

        JBC_MUNICIPIO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " La Ceiba", " Choluteca", "Trujillo", " Comayagua", "Santa Rosa de Copán", " San Pedro de Sula", "Yuscarán", " Tegucigalpa", " Puerto Lempira", " La Esperanza", " Roatán", "La Paz", "Gracias", " Nuevo Ocotepeque", " Juticalpa", "Santa Bárbara", "Nacaome", " Yoro" }));

        JB_GUARDAR.setText("ACTUALIZAR");
        JB_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_GUARDARActionPerformed(evt);
            }
        });

        jButton1.setText("BUSQUEDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JB_MODIFICAR.setText("MODIFICAR");
        JB_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_MODIFICARActionPerformed(evt);
            }
        });

        jLabel5.setText("SEXO");

        jLabel6.setText("DEPARTAMENTO");

        jLabel7.setText("MUNICIPIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBC_SEXO, 0, 273, Short.MAX_VALUE)
                            .addComponent(TXT_APELLIDO)
                            .addComponent(TXT_NOMBRE)
                            .addComponent(TXT_ID)
                            .addComponent(TXT_PESO)
                            .addComponent(JBC_DEPARTA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBC_MUNICIPIO, 0, 273, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JB_MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TXT_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBC_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBC_DEPARTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBC_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_MODIFICAR)
                    .addComponent(JB_GUARDAR)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PRINCIPAL_CONECCION.AbrirConexionDB();
                                    
    }//GEN-LAST:event_formWindowOpened

    private void JB_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GUARDARActionPerformed
    PreparedStatement Sentencia;
    
        String sql = "INSERT INTO" + " HUMANO(ID, NOMBRE, APELLIDO, PESO, SEXO, DEPARTAMENTO, MUNICIPIO)"
        +" VALUES(?,?,?,?,?,?,?)";  
        try{
         Sentencia= PRINCIPAL_CONECCION.Conexion.prepareStatement(sql);
         Sentencia.setString(1,TXT_ID.getText());
         Sentencia.setString(2,TXT_NOMBRE.getText());
         Sentencia.setString(3,TXT_APELLIDO.getText());
         Sentencia.setString(4,TXT_PESO.getText());
         Sentencia.setString(5,JBC_SEXO.getSelectedItem().toString());
         Sentencia.setString(6,JBC_DEPARTA.getSelectedItem().toString());
          Sentencia.setString(7,JBC_MUNICIPIO.getSelectedItem().toString());
         Sentencia.executeUpdate();
         System.out.println(sql); 
         JOptionPane.showMessageDialog(null, " La Informacion a sido Guardada");
         Sentencia.close();
      } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, " Error"+ex);
    } 
        
    }//GEN-LAST:event_JB_GUARDARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   Mostrar From=new Mostrar(); 
   From.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JB_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MODIFICARActionPerformed
 FileInputStream fi;
   PreparedStatement Sentencia;
        String sql = "UPDATE HUMANO"+" SET NOMBRE = ?,  APELLIDO = ?, PESO = ?, SEXO = ?, DEPARTAMENTO = ?, MUNICIPIO = ? "
          +"WHERE ID = ? " ;
        try{
       
         Sentencia= PRINCIPAL_CONECCION.Conexion.prepareStatement(sql);
         Sentencia.setString(1,TXT_NOMBRE.getText());
         Sentencia.setString(2,TXT_APELLIDO.getText());
         Sentencia.setString(3,TXT_PESO.getText());
         Sentencia.setString(4,JBC_SEXO.getSelectedItem().toString());
         Sentencia.setString(5,JBC_DEPARTA.getSelectedItem().toString() ); 
         Sentencia.setString(6,JBC_MUNICIPIO.getSelectedItem().toString() ); 
         Sentencia.setString(7,TXT_ID.getText());
         Sentencia.executeUpdate();
         System.out.println(sql); 
         JOptionPane.showMessageDialog(null, " La Informacion a sido MODIFICADA");
        }catch(SQLException ex){
            System.out.println("error"+ex.getMessage());
        }catch(Exception ex){
            System.out.println("errorr"+ex.getMessage());
        } 
    }//GEN-LAST:event_JB_MODIFICARActionPerformed

    private void TXT_APELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_APELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_APELLIDOActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> JBC_DEPARTA;
    public static javax.swing.JComboBox<String> JBC_MUNICIPIO;
    public static javax.swing.JComboBox<String> JBC_SEXO;
    private javax.swing.JButton JB_GUARDAR;
    private javax.swing.JButton JB_MODIFICAR;
    public static javax.swing.JTextField TXT_APELLIDO;
    public static javax.swing.JTextField TXT_ID;
    public static javax.swing.JTextField TXT_NOMBRE;
    public static javax.swing.JTextField TXT_PESO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
