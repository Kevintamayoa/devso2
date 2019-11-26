/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devso2;

import Adicionales.AutoCompleteJComboBox;
import Adicionales.RoundedBorder;
import Adicionales.StringSearcheable;
import Classes.User;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 146310
 */
public class NuevoDesarrollo extends javax.swing.JFrame {

    /**
     * Creates new form NuevoDesarrollo
     */
    public NuevoDesarrollo() {
        initComponents();
        AdminsList=new ArrayList<User>();
               ManagersList=new ArrayList<User>();
               TableAdminsList=new ArrayList<User>();
        AdminsList.add(new User(0,"Alex","Correa","Correa",0,"ADMI"));
         AdminsList.add(new User(1,"xcheñ","carranza","Correa",0,"ADMI"));
          AdminsList.add(new User(2,"kevin","tamayo","Correa",0,"ADMI"));
          ManagersList.add(new User(3,"Alex","Correa","Correa",1,"manager"));
         ManagersList.add(new User(4,"xcheñ","carranza","Correa",1,"manager"));
          ManagersList.add(new User(5,"kevin","tamayo","Correa",1,"manager"));
//config cbx admins
   AdminsList.forEach((obj) -> {vectorAdmins.add(obj.Name);});
cmbAdministradores.setModel(new DefaultComboBoxModel(vectorAdmins));
           AutoCompleteJComboBox combo = new AutoCompleteJComboBox(new StringSearcheable(vectorAdmins),cmbAdministradores);
    
        modelAdmins=(DefaultTableModel)tableAdmins.getModel();
        pnlSembrado.setVisible(false);
        pnlCredito.setVisible(false);
        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(true);
        btnInfoGeneral.setSelected(true);
        //Configuración tabla sembrado
         tableSembrado.getTableHeader().setBackground(Color.white);
        tableSembrado.getTableHeader().setForeground(Color.black);
        tableSembrado.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
        //Precios
        tableSembrado.getColumnModel().getColumn(6).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(7).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(8).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(9).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(11).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(13).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(14).setCellRenderer(new CurrencyCellRenderer());
        tableSembrado.getColumnModel().getColumn(18).setCellRenderer(new CurrencyCellRenderer());
        
        //Fechas
        tableSembrado.getColumnModel().getColumn(10).setCellRenderer(new TimestampCellRenderer());
         tableSembrado.getColumnModel().getColumn(15).setCellRenderer(new TimestampCellRenderer());
          tableSembrado.getColumnModel().getColumn(16).setCellRenderer(new TimestampCellRenderer());
           tableSembrado.getColumnModel().getColumn(17).setCellRenderer(new TimestampCellRenderer());
           tableSembrado.getColumnModel().getColumn(19).setCellRenderer(new TimestampCellRenderer());
         tableSembrado.getColumnModel().getColumn(20).setCellRenderer(new TimestampCellRenderer());
          tableSembrado.getColumnModel().getColumn(21).setCellRenderer(new TimestampCellRenderer());
          
        //Strings
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tableSembrado.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tableSembrado.getColumnModel().getColumn(4).setCellRenderer(tcr);
        //FIN DE TABLA SEMBRADO
        
        //CONFIGURACIÓN TABLA PROJECT MANAGER
        tableProjectManaguers.getTableHeader().setBackground(Color.white);
        tableProjectManaguers.getTableHeader().setForeground(Color.black);
        tableProjectManaguers.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableSembrado.getColumnModel().getColumn(1).setCellRenderer(tcr);
        //End CONFIG PROJECT MANAGER
        
        //CONFIGURACIÓN TABLA ADMINS
      tableAdmins.getTableHeader().setBackground(Color.white);
        tableAdmins.getTableHeader().setForeground(Color.black);
        tableAdmins.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableAdmins.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
        //CONFIGURACIÓN TABLA INVERSIONES
        tableInversiones.getTableHeader().setBackground(Color.white);
        tableInversiones.getTableHeader().setForeground(Color.black);
        tableInversiones.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableInversiones.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
        //CONFIGURACIÓN TABLA CREDITO
        tableCredito.getTableHeader().setBackground(Color.white);
        tableCredito.getTableHeader().setForeground(Color.black);
        tableCredito.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableCredito.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
        //config TABLA EGRESOS
        tableEgresos.getTableHeader().setBackground(Color.white);
        tableEgresos.getTableHeader().setForeground(Color.black);
        tableEgresos.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableEgresos.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableEgresos.getColumnModel().getColumn(2).setCellRenderer(tcr);
        //config TABLA INGRESOS
        tableIngresos.getTableHeader().setBackground(Color.white);
        tableIngresos.getTableHeader().setForeground(Color.black);
        tableIngresos.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableIngresos.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableEgresos.getColumnModel().getColumn(2).setCellRenderer(tcr);
        
        //config TABLA CUENTAS
        tableCuentas.getTableHeader().setBackground(Color.white);
        tableCuentas.getTableHeader().setForeground(Color.black);
        tableCuentas.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableCuentas.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableCuentas.getColumnModel().getColumn(2).setCellRenderer(tcr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        dtcInicio = new com.toedter.calendar.JDateChooser();
        cmbProjectMnaguer = new javax.swing.JComboBox<>();
        cmbAdministradores = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAdmins = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableProjectManaguers = new javax.swing.JTable();
        txtCargarTicket = new javax.swing.JTextField();
        CargarCompraVenta = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCargarCompraVenta = new javax.swing.JButton();
        btnCargarTicket = new javax.swing.JButton();
        txtComision = new javax.swing.JTextField();
        spnDuracion = new javax.swing.JSpinner();
        btnAgregarProjectManager = new javax.swing.JButton();
        btnAgregarAdmin = new javax.swing.JButton();
        pnlSembrado = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCargarEtapas = new javax.swing.JButton();
        btnAgregarUnidades = new javax.swing.JButton();
        btnCargarModelo = new javax.swing.JButton();
        btnCrearFinanciamiento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSembrado = new javax.swing.JTable();
        pnlCredito = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbInversionista = new javax.swing.JComboBox<>();
        txtMontoInversiones = new javax.swing.JTextField();
        txtMontoDevolucionInversionistas = new javax.swing.JTextField();
        btnAgregarInversionista = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rbPorcentajeInversion = new javax.swing.JRadioButton();
        rbMontoInversion = new javax.swing.JRadioButton();
        btnAddInversion = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableInversiones = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalvarCredito = new javax.swing.JButton();
        txtMontoDevolucionCredito = new javax.swing.JLabel();
        txtMontoDevolucion1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        rbPorcentajeCredito = new javax.swing.JRadioButton();
        rbMontoCredito = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        btnAgregarCreditos = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCredito = new javax.swing.JTable();
        cmbAgregarCredito = new javax.swing.JComboBox<>();
        txtMontoCredito = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pnlCatalogo = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        btnEgresos = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableEgresos = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableIngresos = new javax.swing.JTable();
        btnIngresos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableCuentas = new javax.swing.JTable();
        btnCuentas = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInfoGeneral = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSembrado = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLayeredPane1.setBackground(new java.awt.Color(1, 36, 57));

        pnlInfo.setBackground(new java.awt.Color(1, 36, 57));

        jLabel1.setBackground(new java.awt.Color(187, 187, 187));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del proyecto:");

        jLabel2.setBackground(new java.awt.Color(187, 187, 187));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");

        jLabel3.setBackground(new java.awt.Color(187, 187, 187));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");

        jLabel4.setBackground(new java.awt.Color(187, 187, 187));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duración(meses):");

        jLabel5.setBackground(new java.awt.Color(187, 187, 187));
        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de inicio:");

        jLabel6.setBackground(new java.awt.Color(187, 187, 187));
        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Project Manager:");

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administradores:");

        jLabel8.setBackground(new java.awt.Color(187, 187, 187));
        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargar Ticket:");

        jLabel9.setBackground(new java.awt.Color(187, 187, 187));
        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cargar Compra-venta:");

        jLabel10.setBackground(new java.awt.Color(187, 187, 187));
        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Comisión(%):");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmbProjectMnaguer.setEditable(true);
        cmbProjectMnaguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProjectMnaguerActionPerformed(evt);
            }
        });

        cmbAdministradores.setEditable(true);

        tableAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Administradores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableAdmins);
        if (tableAdmins.getColumnModel().getColumnCount() > 0) {
            tableAdmins.getColumnModel().getColumn(0).setMinWidth(0);
            tableAdmins.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableAdmins.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        tableProjectManaguers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Project Manager"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableProjectManaguers);
        if (tableProjectManaguers.getColumnModel().getColumnCount() > 0) {
            tableProjectManaguers.getColumnModel().getColumn(0).setMinWidth(0);
            tableProjectManaguers.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableProjectManaguers.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel11.setBackground(new java.awt.Color(187, 187, 187));
        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ubicación:");

        btnCargarCompraVenta.setBackground(new java.awt.Color(35, 35, 35));
        btnCargarCompraVenta.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnCargarCompraVenta.setText("Cargar");
        btnCargarCompraVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarCompraVenta.setBorderPainted(false);
        btnCargarCompraVenta.setVerifyInputWhenFocusTarget(false);

        btnCargarTicket.setBackground(new java.awt.Color(35, 35, 35));
        btnCargarTicket.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnCargarTicket.setText("Cargar");
        btnCargarTicket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarTicket.setBorderPainted(false);
        btnCargarTicket.setVerifyInputWhenFocusTarget(false);

        btnAgregarProjectManager.setBackground(new java.awt.Color(35, 35, 35));
        btnAgregarProjectManager.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnAgregarProjectManager.setText("Agregar");
        btnAgregarProjectManager.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarProjectManager.setBorderPainted(false);
        btnAgregarProjectManager.setVerifyInputWhenFocusTarget(false);
        btnAgregarProjectManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProjectManagerActionPerformed(evt);
            }
        });

        btnAgregarAdmin.setBackground(new java.awt.Color(35, 35, 35));
        btnAgregarAdmin.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        btnAgregarAdmin.setText("Agregar");
        btnAgregarAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarAdmin.setBorderPainted(false);
        btnAgregarAdmin.setVerifyInputWhenFocusTarget(false);
        btnAgregarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addComponent(spnDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUbicacion)
                                    .addComponent(txtDescripcion)
                                    .addComponent(txtCliente)
                                    .addComponent(txtNombre)
                                    .addComponent(dtcInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbProjectMnaguer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregarProjectManager, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CargarCompraVenta)
                                                    .addComponent(txtCargarTicket)
                                                    .addComponent(txtComision))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnCargarCompraVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                    .addComponent(btnCargarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnAgregarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 731, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCargarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CargarCompraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarCompraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dtcInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAgregarProjectManager, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProjectMnaguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cmbAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        pnlSembrado.setBackground(new java.awt.Color(1, 36, 57));
        pnlSembrado.setPreferredSize(new java.awt.Dimension(1129, 708));

        jPanel3.setBackground(new java.awt.Color(60, 82, 99));

        btnCargarEtapas.setBackground(new java.awt.Color(35, 35, 35));
        btnCargarEtapas.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnCargarEtapas.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarEtapas.setText("Cargar Etapas");
        btnCargarEtapas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarEtapas.setBorderPainted(false);
        btnCargarEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEtapasActionPerformed(evt);
            }
        });

        btnAgregarUnidades.setBackground(new java.awt.Color(35, 35, 35));
        btnAgregarUnidades.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnAgregarUnidades.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUnidades.setText("Agregar Unidades");
        btnAgregarUnidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarUnidades.setBorderPainted(false);
        btnAgregarUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUnidadesActionPerformed(evt);
            }
        });

        btnCargarModelo.setBackground(new java.awt.Color(35, 35, 35));
        btnCargarModelo.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnCargarModelo.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarModelo.setText("Cargar Modelo");
        btnCargarModelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarModelo.setBorderPainted(false);
        btnCargarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarModeloActionPerformed(evt);
            }
        });

        btnCrearFinanciamiento.setBackground(new java.awt.Color(35, 35, 35));
        btnCrearFinanciamiento.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnCrearFinanciamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearFinanciamiento.setText("Crear Financiamiento");
        btnCrearFinanciamiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearFinanciamiento.setBorderPainted(false);
        btnCrearFinanciamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFinanciamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnAgregarUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCargarEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCargarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregarUnidades, btnCargarEtapas, btnCargarModelo, btnCrearFinanciamiento});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregarUnidades, btnCargarEtapas, btnCargarModelo, btnCrearFinanciamiento});

        tableSembrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "# Unidad", "# Etapa", "Modelo", "Tablaje", "# m2", "PV M2", "Precio venta", "Anticipo", "Monto anticipado", "Fecha anticipo", "Financiamiento", "Mensualidades", "Monto mensualidades", "Monto de cada mensualidad", "Fecha de inicio financiamiento", "Fecha final de financiamiento", "Porcentaje saldo", "Monto de saldo", "Fecha de saldo", "Fecha venta", "Fecha ultimo pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSembrado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableSembrado.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(tableSembrado);
        if (tableSembrado.getColumnModel().getColumnCount() > 0) {
            tableSembrado.getColumnModel().getColumn(0).setMinWidth(0);
            tableSembrado.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableSembrado.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnlSembradoLayout = new javax.swing.GroupLayout(pnlSembrado);
        pnlSembrado.setLayout(pnlSembradoLayout);
        pnlSembradoLayout.setHorizontalGroup(
            pnlSembradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlSembradoLayout.setVerticalGroup(
            pnlSembradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSembradoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );

        pnlCredito.setBackground(new java.awt.Color(1, 36, 57));
        pnlCredito.setPreferredSize(new java.awt.Dimension(1129, 708));

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Inversionista:");

        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Monto de inversiones:");

        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Monto de devolución:");

        cmbInversionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarInversionista.setText("Añadir");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        rbPorcentajeInversion.setText("Porcentaje(%)");

        rbMontoInversion.setText("Monto($)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(rbPorcentajeInversion)
                .addGap(29, 29, 29)
                .addComponent(rbMontoInversion))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbPorcentajeInversion)
                .addComponent(rbMontoInversion))
        );

        btnAddInversion.setBackground(new java.awt.Color(35, 35, 35));
        btnAddInversion.setText("Agregar");
        btnAddInversion.setRequestFocusEnabled(false);

        tableInversiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Inversionista", "Monto de inversiones", "Monto de devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableInversiones);
        if (tableInversiones.getColumnModel().getColumnCount() > 0) {
            tableInversiones.getColumnModel().getColumn(0).setMinWidth(0);
            tableInversiones.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableInversiones.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel15.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel15.setText("Inversionistas");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSalvarCredito.setBackground(new java.awt.Color(35, 35, 35));
        btnSalvarCredito.setText("Agregar");
        btnSalvarCredito.setRequestFocusEnabled(false);

        txtMontoDevolucionCredito.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtMontoDevolucionCredito.setText("Monto de devolución:");

        jLabel19.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel19.setText("Creditos");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        rbPorcentajeCredito.setText("Porcentaje(%)");

        rbMontoCredito.setText("Monto($)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(rbPorcentajeCredito)
                .addGap(29, 29, 29)
                .addComponent(rbMontoCredito))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbPorcentajeCredito)
                .addComponent(rbMontoCredito))
        );

        jLabel17.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Monto de credito:");

        btnAgregarCreditos.setText("Añadir");

        tableCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Inversionista", "Monto de inversiones", "Monto de devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tableCredito);
        if (tableCredito.getColumnModel().getColumnCount() > 0) {
            tableCredito.getColumnModel().getColumn(0).setMinWidth(0);
            tableCredito.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCredito.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        cmbAgregarCredito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Creditos:");

        javax.swing.GroupLayout pnlCreditoLayout = new javax.swing.GroupLayout(pnlCredito);
        pnlCredito.setLayout(pnlCreditoLayout);
        pnlCreditoLayout.setHorizontalGroup(
            pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel15))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbInversionista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMontoInversiones)
                                    .addComponent(txtMontoDevolucionInversionistas, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarInversionista)))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAddInversion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel19))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMontoDevolucionCredito, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbAgregarCredito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMontoCredito)
                            .addComponent(txtMontoDevolucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCreditos)))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSalvarCredito)))
                .addGap(115, 115, 115))
        );
        pnlCreditoLayout.setVerticalGroup(
            pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(cmbAgregarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarCreditos))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtMontoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMontoDevolucion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMontoDevolucionCredito))
                                .addGap(28, 28, 28)
                                .addComponent(btnSalvarCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cmbInversionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarInversionista))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtMontoInversiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMontoDevolucionInversionistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(28, 28, 28)
                                .addComponent(btnAddInversion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pnlCatalogo.setBackground(new java.awt.Color(1, 36, 57));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Egresos");

        btnEgresos.setText("Nuevo");
        btnEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresosActionPerformed(evt);
            }
        });

        tableEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Descripcion", "Categoria", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tableEgresos);
        if (tableEgresos.getColumnModel().getColumnCount() > 0) {
            tableEgresos.getColumnModel().getColumn(0).setMinWidth(0);
            tableEgresos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableEgresos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        tableIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Descripcion", "Categoria", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tableIngresos);
        if (tableIngresos.getColumnModel().getColumnCount() > 0) {
            tableIngresos.getColumnModel().getColumn(0).setMinWidth(0);
            tableIngresos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableIngresos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnIngresos.setText("Nuevo");
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingresos");

        tableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Descripcion", "Categoria", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tableCuentas);
        if (tableCuentas.getColumnModel().getColumnCount() > 0) {
            tableCuentas.getColumnModel().getColumn(0).setMinWidth(0);
            tableCuentas.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCuentas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnCuentas.setText("Nuevo");

        jLabel21.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cuentas");

        javax.swing.GroupLayout pnlCatalogoLayout = new javax.swing.GroupLayout(pnlCatalogo);
        pnlCatalogo.setLayout(pnlCatalogoLayout);
        pnlCatalogoLayout.setHorizontalGroup(
            pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEgresos))
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresos))
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCuentas))
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        pnlCatalogoLayout.setVerticalGroup(
            pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCatalogoLayout.createSequentialGroup()
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCatalogoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(btnCuentas))
                                .addGap(64, 64, 64)
                                .addComponent(jScrollPane9))))
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(btnEgresos)
                            .addComponent(btnIngresos))
                        .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane8))
                            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane7)
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCatalogoLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        jLayeredPane1.setLayer(pnlInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlSembrado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlCredito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlCatalogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSembrado, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSembrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(1, 36, 57));

        btnInfoGeneral.setBackground(new java.awt.Color(35, 35, 35));
        btnInfoGeneral.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnInfoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoGeneral.setText("Información General");
        btnInfoGeneral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfoGeneral.setFocusPainted(false);
        btnInfoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoGeneralActionPerformed(evt);
            }
        });

        btnCredito.setBackground(new java.awt.Color(35, 35, 35));
        btnCredito.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnCredito.setText("Credito de inversionistas");
        btnCredito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCredito.setFocusPainted(false);
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btnCatalogo.setBackground(new java.awt.Color(35, 35, 35));
        btnCatalogo.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogo.setText("Catálogo");
        btnCatalogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCatalogo.setFocusPainted(false);
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(35, 35, 35));
        btnGuardar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setFocusPainted(false);

        btnSembrado.setBackground(new java.awt.Color(35, 35, 35));
        btnSembrado.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnSembrado.setForeground(new java.awt.Color(255, 255, 255));
        btnSembrado.setText("Sembrado");
        btnSembrado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSembrado.setFocusPainted(false);
        btnSembrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSembradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSembrado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnInfoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSembrado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGeneralActionPerformed
        pnlSembrado.setVisible(false);
        pnlCredito.setVisible(false);
        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(true);
        btnCredito.setBackground(new Color(35,35,35));
            btnCatalogo.setBackground(new Color(35,35,35));
            btnSembrado.setBackground(new Color(35,35,35));
             btnInfoGeneral.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_btnInfoGeneralActionPerformed

    private void btnSembradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSembradoActionPerformed
        
        pnlCredito.setVisible(false);
        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(false);
         pnlSembrado.setVisible(true);
         btnCredito.setBackground(new Color(35,35,35));
            btnCatalogo.setBackground(new Color(35,35,35));
            btnSembrado.setBackground(new Color(115,115,115));
             btnInfoGeneral.setBackground(new Color(35,35,35));
    }//GEN-LAST:event_btnSembradoActionPerformed

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed

        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(false);
         pnlSembrado.setVisible(false);
          pnlCredito.setVisible(true);
           btnCredito.setBackground(new Color(115,115,115));
            btnCatalogo.setBackground(new Color(35,35,35));
            btnSembrado.setBackground(new Color(35,35,35));
             btnInfoGeneral.setBackground(new Color(35,35,35));
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        
        pnlInfo.setVisible(false);
         pnlSembrado.setVisible(false);
          pnlCredito.setVisible(false);
          pnlCatalogo.setVisible(true);
            btnCatalogo.setBackground(new Color(115,115,115));
            btnCredito.setBackground(new Color(35,35,35));
            btnSembrado.setBackground(new Color(35,35,35));
             btnInfoGeneral.setBackground(new Color(35,35,35));
            
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUnidadesActionPerformed
        AgregarUnidades obj=new AgregarUnidades();
        obj.setModal(true);
        obj.setVisible(true);
    }//GEN-LAST:event_btnAgregarUnidadesActionPerformed

    private void btnCargarEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEtapasActionPerformed
       CargarEtapa obj =new CargarEtapa();
       obj.setModal(true);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCargarEtapasActionPerformed

    private void btnCargarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarModeloActionPerformed
      CargarModelo obj =new CargarModelo();
       obj.setModal(true);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCargarModeloActionPerformed

    private void btnCrearFinanciamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFinanciamientoActionPerformed
        // TODO add your handling code here:
        CrearFinanciamiento obj =new CrearFinanciamiento();
       obj.setModal(true);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCrearFinanciamientoActionPerformed

    private void btnEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEgresosActionPerformed

    private void cmbProjectMnaguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProjectMnaguerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProjectMnaguerActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnAgregarProjectManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProjectManagerActionPerformed
        
        User projectManager= ManagersList.stream().filter(obj -> cmbProjectMnaguer.getSelectedItem().toString().equals(obj.Name))
  .findAny()
  .orElse(null);
    }//GEN-LAST:event_btnAgregarProjectManagerActionPerformed

    private void btnAgregarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdminActionPerformed
        User o= AdminsList.stream().filter(obj -> cmbAdministradores.getSelectedItem().toString().equals(obj.Name))
  .findAny()
  .orElse(null);
        TableAdminsList.add(new User(o.Id,o.Name,o.lname,o.Password,o.Type_Id,o.Type));
      modelAdmins.addRow(new Object[]{0,o.Name});
    }//GEN-LAST:event_btnAgregarAdminActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoDesarrollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoDesarrollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoDesarrollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoDesarrollo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoDesarrollo().setVisible(true);
                
            }
        });
        
    }
    private DefaultTableModel sembrado;
        private DefaultTableModel modelAdmins;
    List<User> ManagersList; //CMB LIST
    
    List<User> AdminsList;
     List<User> TableAdminsList;
   
    Vector vectorManagers=new Vector();
    Vector vectorAdmins=new Vector();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CargarCompraVenta;
    private javax.swing.JButton btnAddInversion;
    private javax.swing.JButton btnAgregarAdmin;
    private javax.swing.JButton btnAgregarCreditos;
    private javax.swing.JButton btnAgregarInversionista;
    private javax.swing.JButton btnAgregarProjectManager;
    private javax.swing.JButton btnAgregarUnidades;
    private javax.swing.JButton btnCargarCompraVenta;
    private javax.swing.JButton btnCargarEtapas;
    private javax.swing.JButton btnCargarModelo;
    private javax.swing.JButton btnCargarTicket;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCrearFinanciamiento;
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnCuentas;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInfoGeneral;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnSalvarCredito;
    private javax.swing.JButton btnSembrado;
    private javax.swing.JComboBox<String> cmbAdministradores;
    private javax.swing.JComboBox<String> cmbAgregarCredito;
    private javax.swing.JComboBox<String> cmbInversionista;
    private javax.swing.JComboBox<String> cmbProjectMnaguer;
    private com.toedter.calendar.JDateChooser dtcInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pnlCatalogo;
    private javax.swing.JPanel pnlCredito;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlSembrado;
    private javax.swing.JRadioButton rbMontoCredito;
    private javax.swing.JRadioButton rbMontoInversion;
    private javax.swing.JRadioButton rbPorcentajeCredito;
    private javax.swing.JRadioButton rbPorcentajeInversion;
    private javax.swing.JSpinner spnDuracion;
    private javax.swing.JTable tableAdmins;
    private javax.swing.JTable tableCredito;
    private javax.swing.JTable tableCuentas;
    private javax.swing.JTable tableEgresos;
    private javax.swing.JTable tableIngresos;
    private javax.swing.JTable tableInversiones;
    private javax.swing.JTable tableProjectManaguers;
    private javax.swing.JTable tableSembrado;
    private javax.swing.JTextField txtCargarTicket;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMontoCredito;
    private javax.swing.JTextField txtMontoDevolucion1;
    private javax.swing.JLabel txtMontoDevolucionCredito;
    private javax.swing.JTextField txtMontoDevolucionInversionistas;
    private javax.swing.JTextField txtMontoInversiones;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
