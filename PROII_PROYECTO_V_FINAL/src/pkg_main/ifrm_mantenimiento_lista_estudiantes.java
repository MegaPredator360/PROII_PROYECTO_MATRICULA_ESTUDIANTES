package pkg_main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkg_matricula.Estudiantes;

public class ifrm_mantenimiento_lista_estudiantes extends javax.swing.JInternalFrame {
    
    ArrayList<Estudiantes> listaEstudiantes;
    Estudiantes estudiantes;
    String nombre_estudiantes;
    String numero_cedula;
    int edad;
    String nombre_encargado;
    String numero_telefono;
    String direccion;
    String grado_cursar;
    String forma_pago;
    int monto_pago;
    int curso_costo;
    int pago_pendientes;
    int meses_pendientes;
    int pago_total;
    String cursos_adicionales;
    DefaultTableModel tablaEstudiantes;

    public ifrm_mantenimiento_lista_estudiantes() {
        initComponents();
        estudiantes = new Estudiantes();
        listaEstudiantes = estudiantes.leerArchivo();
        nombre_estudiantes = "";
        numero_cedula = "";
        edad = 0;
        nombre_encargado = "";
        numero_telefono = "";
        direccion = "";
        grado_cursar = "";
        forma_pago = "";
        monto_pago = 0;
        curso_costo = 0;
        pago_pendientes = 0;
        meses_pendientes = 0;
        pago_total = 0;
        cursos_adicionales = "";
        cargarComboEdad();
        cargarTablaEstudiantes();
        actualizarTablaEstudiantes();
    }

    public void cargarTablaEstudiantes(){
        tablaEstudiantes = new DefaultTableModel();
        tablaEstudiantes.addColumn("Estudiante");
        tablaEstudiantes.addColumn("Cedula");
        tablaEstudiantes.addColumn("Edad");
        tablaEstudiantes.addColumn("Encargado");
        tablaEstudiantes.addColumn("Telefono");
        tablaEstudiantes.addColumn("Dirección");
        tablaEstudiantes.addColumn("Grado");
        tablaEstudiantes.addColumn("Forma de Pago");
        tablaEstudiantes.addColumn("Cursos Adicionales");
        tablaEstudiantes.addColumn("Pago Total");
        tablaEstudiantes.addColumn("Meses Pendientes");
        this.tbl_estudiantes_matriculados.setModel(tablaEstudiantes);
    }
    
    public void actualizarTablaEstudiantes(){
        tablaEstudiantes.setRowCount(0);
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Object[] fila = {listaEstudiantes.get(i).getNombre_estudiantes(), listaEstudiantes.get(i).getNumero_cedula(), listaEstudiantes.get(i).getEdad(), listaEstudiantes.get(i).getNombre_encargado(), listaEstudiantes.get(i).getNumero_telefono(), listaEstudiantes.get(i).getDireccion(), listaEstudiantes.get(i).getGrado_cursar(), listaEstudiantes.get(i).getForma_pago(), listaEstudiantes.get(i).getCursos_adicionales(), listaEstudiantes.get(i).getPago_total(), listaEstudiantes.get(i).getMeses_pendientes()};
            tablaEstudiantes.addRow(fila);
        }
    }
    
    public void estructurarArchivo(){
        String informacion = "";
        for (int i = 0; i < tbl_estudiantes_matriculados.getRowCount(); i++) {
            informacion += tbl_estudiantes_matriculados.getValueAt(i, 0) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 1) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 2) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 3) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 4) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 5) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 6) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 7) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 8) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 9) + "/" + tbl_estudiantes_matriculados.getValueAt(i, 10) + "\n";
        }
        estudiantes.guardarArchivo(informacion);
    }
    
    public void cargarComboEdad() {
        for (int i = 0; i < 121; i++) {
            cbx_edad.addItem(String.valueOf(i));
        }
    }
    
    public void limitePrekinder() {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_agregar_estu = new javax.swing.JButton();
        btn_eliminar_estu = new javax.swing.JButton();
        btn_modificar_estu = new javax.swing.JButton();
        btn_buscar_estu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_estudiantes_matriculados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre_estu = new javax.swing.JTextField();
        txt_numero_cedula = new javax.swing.JTextField();
        cbx_grado = new javax.swing.JComboBox<>();
        txt_nombre_encargado = new javax.swing.JTextField();
        txt_numero_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        cbx_edad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbx_pago = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbx_cursos_add = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Lista de Estudiantes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        btn_agregar_estu.setText("Agregar Estudiante");
        btn_agregar_estu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_estuActionPerformed(evt);
            }
        });

        btn_eliminar_estu.setText("Eliminar Estudiante");
        btn_eliminar_estu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_estuActionPerformed(evt);
            }
        });

        btn_modificar_estu.setText("Modificar Estudiante");
        btn_modificar_estu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_estuActionPerformed(evt);
            }
        });

        btn_buscar_estu.setText("Buscar Estudiante");
        btn_buscar_estu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_estuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_modificar_estu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar_estu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregar_estu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar_estu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregar_estu)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar_estu)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar_estu)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar_estu)
                .addGap(54, 54, 54))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiantes Matriculados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        tbl_estudiantes_matriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_estudiantes_matriculados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_estudiantes_matriculadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_estudiantes_matriculados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del estudiante:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Numero de cedula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre del encargado:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Direccion:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Grado a cursar:");

        cbx_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prekinder", "Kinder", "Primero Grado", "Segundo Grado", "Tercer Grado", "Cuarto Grado", "Quinto Grado", "Sexto Grado" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Forma de pago:");

        cbx_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual - ₡1.575.000 anual", "Mensual - ₡134.000 mensual" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cursos adicionales:");

        cbx_cursos_add.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Mandarín", "Alemán", "Ambos" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_nombre_estu)
                        .addComponent(txt_numero_cedula)
                        .addComponent(txt_nombre_encargado)
                        .addComponent(txt_numero_telefono)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbx_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbx_cursos_add, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbx_pago, javax.swing.GroupLayout.Alignment.LEADING, 0, 147, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre_estu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numero_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbx_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombre_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_numero_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbx_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbx_cursos_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_estuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_estuActionPerformed
        nombre_estudiantes = txt_nombre_estu.getText();
        numero_cedula = txt_numero_cedula.getText();
        edad = Integer.parseInt(cbx_edad.getSelectedItem().toString());
        nombre_encargado = txt_nombre_encargado.getText();
        numero_telefono = txt_numero_telefono.getText();
        direccion = txt_direccion.getText();
        grado_cursar = cbx_grado.getSelectedItem().toString();
        forma_pago = cbx_pago.getSelectedItem().toString();
        cursos_adicionales = cbx_cursos_add.getSelectedItem().toString();
        
        if (forma_pago == "Mensual - ₡134.000 mensual") {
            monto_pago = 134000;
            meses_pendientes = 12;
        } else {
            monto_pago = 1575000;
            meses_pendientes = 0;
        }
        
        if (cursos_adicionales == "Ninguno"){
            curso_costo = 0;
        } else { if (cursos_adicionales == "Mandarín" || cursos_adicionales == "Alemán"){
                curso_costo = 54000;
                } else { if (cursos_adicionales == "Ambos"){
                    curso_costo = 108000;
                }
            }
        }
        
        pago_total = monto_pago + curso_costo;
        
        estudiantes = new Estudiantes(nombre_estudiantes, numero_cedula, edad, nombre_encargado, numero_telefono, direccion, grado_cursar, forma_pago, cursos_adicionales, pago_total, meses_pendientes);
        if (grado_cursar == "Prekinder") {
            if (edad < 4) {
                JOptionPane.showMessageDialog(null, "El estudiante no cumple la edad requerida para Matricular");
                }   
            }   else {
                listaEstudiantes.add(estudiantes);
                actualizarTablaEstudiantes();
        } 
         
        
    }//GEN-LAST:event_btn_agregar_estuActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        estructurarArchivo();
    }//GEN-LAST:event_formInternalFrameClosed

    private void tbl_estudiantes_matriculadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_estudiantes_matriculadosMouseClicked
        int fila = tbl_estudiantes_matriculados.rowAtPoint(evt.getPoint());
        txt_nombre_estu.setText(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 0)));
        txt_numero_cedula.setText(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 1)));
        cbx_edad.setSelectedIndex(Integer.parseInt(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 2))));
        txt_nombre_encargado.setText(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 3)));
        txt_numero_telefono.setText(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 4)));
        txt_direccion.setText(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 5)));
        cbx_grado.setSelectedItem(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 6)));
        cbx_pago.setSelectedItem(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 7)));
        cbx_cursos_add.setSelectedItem(String.valueOf(tbl_estudiantes_matriculados.getValueAt(fila, 8)));
    }//GEN-LAST:event_tbl_estudiantes_matriculadosMouseClicked

    private void btn_eliminar_estuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_estuActionPerformed
        int fila = tbl_estudiantes_matriculados.getSelectedRow();
        if (fila >= 0) {
            tablaEstudiantes.removeRow(fila);
        }
        else {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados");
        } 
    }//GEN-LAST:event_btn_eliminar_estuActionPerformed

    private void btn_modificar_estuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_estuActionPerformed
        int fila = tbl_estudiantes_matriculados.getSelectedRow();
        if (fila >= 0) {
            tbl_estudiantes_matriculados.setValueAt(txt_nombre_estu.getText(), fila, 0);
            tbl_estudiantes_matriculados.setValueAt(txt_numero_cedula.getText(), fila, 1);
            tbl_estudiantes_matriculados.setValueAt(String.valueOf(cbx_edad.getSelectedItem()), fila, 2);
            tbl_estudiantes_matriculados.setValueAt(txt_nombre_encargado.getText(), fila, 3);
            tbl_estudiantes_matriculados.setValueAt(txt_numero_telefono.getText(), fila, 4);
            tbl_estudiantes_matriculados.setValueAt(txt_direccion.getText(), fila, 5);
            tbl_estudiantes_matriculados.setValueAt(String.valueOf(cbx_grado.getSelectedItem()), fila, 6);
            tbl_estudiantes_matriculados.setValueAt(String.valueOf(cbx_pago.getSelectedItem()), fila, 7);
            tbl_estudiantes_matriculados.setValueAt(String.valueOf(cbx_cursos_add.getSelectedItem()), fila, 8);
        }
        else {
            JOptionPane.showMessageDialog(this, "No hay datos seleccionados");
        }
    }//GEN-LAST:event_btn_modificar_estuActionPerformed

    private void btn_buscar_estuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_estuActionPerformed
        boolean encontrado = false;
        if (txt_numero_cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite un codigo a buscar");
        } else {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                if (listaEstudiantes.get(i).getNumero_cedula().equals(txt_numero_cedula.getText())) {
                    JOptionPane.showMessageDialog(this, listaEstudiantes.get(i).toString());
                    encontrado = true;
                }
            }
            if (!encontrado) JOptionPane.showMessageDialog(this, "No encontrado");
        }
    }//GEN-LAST:event_btn_buscar_estuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_estu;
    private javax.swing.JButton btn_buscar_estu;
    private javax.swing.JButton btn_eliminar_estu;
    private javax.swing.JButton btn_modificar_estu;
    private javax.swing.JComboBox<String> cbx_cursos_add;
    private javax.swing.JComboBox<String> cbx_edad;
    private javax.swing.JComboBox<String> cbx_grado;
    private javax.swing.JComboBox<String> cbx_pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_estudiantes_matriculados;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre_encargado;
    private javax.swing.JTextField txt_nombre_estu;
    private javax.swing.JTextField txt_numero_cedula;
    private javax.swing.JTextField txt_numero_telefono;
    // End of variables declaration//GEN-END:variables
}
