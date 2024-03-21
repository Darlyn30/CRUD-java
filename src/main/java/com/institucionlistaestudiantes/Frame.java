
package com.institucionlistaestudiantes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Frame extends javax.swing.JFrame {
    
    ConexionDB con = new ConexionDB();
    Connection conexion = con.conectar();
    public Frame() {
        initComponents();
        mostrarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        boxStatus = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/darlyn/Downloads/trash.png")); // NOI18N
        jMenuItem1.setText("eliminar");
        jMenuItem1.setComponentPopupMenu(jPopupMenu1);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 60));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 140, 60));

        txtLast.setBackground(new java.awt.Color(255, 255, 255));
        txtLast.setForeground(new java.awt.Color(0, 0, 0));
        txtLast.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(txtLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 50));

        boxStatus.setForeground(new java.awt.Color(0, 0, 0));
        boxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-", "SOLTERO", "CASADO" }));
        boxStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO CIVIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.add(boxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 50));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("REGISTRAR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("ACTUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 370));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MUESTRA DE DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Sans", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 320, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO datosPersona VALUES (?,?,?,?)");
            ps.setString(1, txtId.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtLast.getText());
            ps.setString(4, boxStatus.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            mostrarDatos();
            limpiar();
        } catch(SQLException ex){
            System.out.println("Error al registrar dato " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            PreparedStatement ps = conexion.prepareStatement("UPDATE datosPersona set id='"+txtId.getText()+"', nombre= '"+txtNombre.getText()+"', apellido='"+txtLast.getText()+"', estado_civil='"+boxStatus.getSelectedItem()+"' where id='"+txtId.getText()+"'");
            int indice = ps.executeUpdate();
            
            if(indice > 0){
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrarDatos();
                limpiar();
            } else if(indice == 0){
                JOptionPane.showMessageDialog(null, "NO PUEDES CAMBIAR EL ID");
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono fila");
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS " + ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        
        int fila =this.dataTable.getSelectedRow();
        this.txtId.setText(this.dataTable.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.dataTable.getValueAt(fila, 1).toString());
        this.txtLast.setText(this.dataTable.getValueAt(fila, 2).toString());
        this.boxStatus.setSelectedItem(this.dataTable.getValueAt(fila, 3));
    }//GEN-LAST:event_dataTableMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
//        btnUpdate.setEnabled(false);
//        btnAdd.setEnabled(true);
//        limpiar();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Estas seguro que deseas eliminar cliente", "salir", JOptionPane.YES_NO_CANCEL_OPTION) == 0){
            try {
                PreparedStatement ps = conexion.prepareStatement("DELETE FROM datosPersona where id='"+txtId.getText()+"'");
                int indice = ps.executeUpdate();
                if(indice >0){
                    mostrarDatos();
                } else {
                    System.out.println("no ha seleccionado fila");
                }
            }catch(SQLException ex){
                System.out.println("Error al eliminar datos " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    private void mostrarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("ESTADO");
        dataTable.setModel(modelo);
        String consultasSQL = "SELECT * FROM datosPersona";
        String data[] = new String[6];
        Statement st;
        try {
            st = conexion.createStatement();
            ResultSet resultado = st.executeQuery(consultasSQL);
            while(resultado.next()){
                
                data[0] = resultado.getString(1);
                data[1] = resultado.getString(2);
                data[2] = resultado.getString(3);
                data[3] = resultado.getString(4);
                modelo.addRow(data);
            }
        } catch(SQLException ex){
            System.out.println("Error al mostar los datos " + ex.getMessage());
        }
    }
    
    private void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtLast.setText("");
        boxStatus.setSelectedIndex(0);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxStatus;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable dataTable;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
