/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devso2;

import Adicionales.AutoCompleteJComboBox;
import Adicionales.RoundedBorder;
import Adicionales.StringSearcheable;
import Classes.Investor;
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
        
        //Listas para los cmx
        AdminsList=new ArrayList<User>();
        TableManager=new ArrayList<User>();
        ManagersList=new ArrayList<User>();
        TableAdminsList=new ArrayList<User>();
         inversionistasList=new ArrayList<Investor>();
         
         
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
        
        //config cbx managers
   ManagersList.forEach((obj) -> {vectorManagers.add(obj.Name);});
cmbProjectMnaguer.setModel(new DefaultComboBoxModel(vectorManagers));
           AutoCompleteJComboBox comboa = new AutoCompleteJComboBox(new StringSearcheable(vectorManagers),cmbProjectMnaguer);   
        modelManagers=(DefaultTableModel)tableProjectManaguers.getModel();
        
         
        
         inversionistasList.forEach((obj) -> {vectorInversiones.add(obj.Description);});
cmbProjectMnaguer.setModel(new DefaultComboBoxModel(vectorManagers));
           AutoCompleteJComboBox combo_inver = new AutoCompleteJComboBox(new StringSearcheable(vectorManagers),cmbProjectMnaguer);
        modelManagers=(DefaultTableModel)tableProjectManaguers.getModel();
        //FIN DE CONFIGS 
        
        
        
        pnlSembrado.setVisible(false);
        pnlCredito.setVisible(false);
        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(true);
        btnInfoGeneral.setSelected(true);
        //Configuración tabla sembrado
         tableSembrado.getTableHeader().setBackground(new Color(123,163,186));
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
        tableProjectManaguers.getTableHeader().setBackground(new Color(123,163,186));
        tableProjectManaguers.getTableHeader().setForeground(Color.black);
        tableProjectManaguers.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableSembrado.getColumnModel().getColumn(1).setCellRenderer(tcr);
        //End CONFIG PROJECT MANAGER
        
        //CONFIGURACIÓN TABLA ADMINS
      tableAdmins.getTableHeader().setBackground(new Color(123,163,186));
        tableAdmins.getTableHeader().setForeground(Color.black);
        tableAdmins.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableAdmins.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
        //CONFIGURACIÓN TABLA INVERSIONES
        tableInversiones.getTableHeader().setBackground(new Color(123,163,186));
        tableInversiones.getTableHeader().setForeground(Color.black);
        tableInversiones.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableInversiones.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
        //CONFIGURACIÓN TABLA CREDITO
        tableCredito.getTableHeader().setBackground(new Color(123,163,186));
        tableCredito.getTableHeader().setForeground(Color.black);
        tableCredito.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableCredito.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
        //config TABLA EGRESOS
        tableEgresos.getTableHeader().setBackground(new Color(123,163,186));
        tableEgresos.getTableHeader().setForeground(Color.black);
        tableEgresos.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableEgresos.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableEgresos.getColumnModel().getColumn(2).setCellRenderer(tcr);
        //config TABLA INGRESOS
        tableIngresos.getTableHeader().setBackground(new Color(123,163,186));
        tableIngresos.getTableHeader().setForeground(Color.black);
        tableIngresos.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableIngresos.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableEgresos.getColumnModel().getColumn(2).setCellRenderer(tcr);
        
        //config TABLA CUENTAS
        tableCuentas.getTableHeader().setBackground(new Color(123,163,186));
        tableCuentas.getTableHeader().setForeground(Color.black);
        tableCuentas.getTableHeader().setFont(new Font("InaiMathi", 0, 20));
       
        tableCuentas.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableCuentas.getColumnModel().getColumn(2).setCellRenderer(tcr);
      tableSembrado.setBackground(Color.gray);
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        menuSembrado = new javax.swing.JPopupMenu();
        btnEliminarSembrado = new javax.swing.JMenuItem();
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
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCredito = new javax.swing.JTable();
        txtCredito = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMontototalCredito = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtMontoPrestamo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        rbPorcentajePrestamo = new javax.swing.JRadioButton();
        rbMontoPrestamo = new javax.swing.JRadioButton();
        txtMontoDevolucionCredito1 = new javax.swing.JLabel();
        txtMontoDevolucionPrestamo = new javax.swing.JTextField();
        btnSalvarPrestamo = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablePrestamistas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        cmxPrestamistas = new javax.swing.JComboBox<>();
        btnAgregarPrestamista = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtTasadeInteres = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        dtFechaInicio = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        pnlCatalogo = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        btnEgresos = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableIngresos = new javax.swing.JTable();
        btnIngresos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnCuentas = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableEgresos = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableCuentas = new javax.swing.JTable();
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

        btnEliminarSembrado.setText("Eliminar");
        menuSembrado.add(btnEliminarSembrado);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLayeredPane1.setBackground(new java.awt.Color(1, 36, 57));

        pnlInfo.setBackground(new java.awt.Color(47, 51, 66));

        jLabel1.setBackground(new java.awt.Color(187, 187, 187));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Nombre del proyecto:");

        jLabel2.setBackground(new java.awt.Color(187, 187, 187));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Tipo de desarrollo:");

        jLabel3.setBackground(new java.awt.Color(187, 187, 187));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Descripción:");

        jLabel4.setBackground(new java.awt.Color(187, 187, 187));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Duración(meses):");

        jLabel5.setBackground(new java.awt.Color(187, 187, 187));
        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Fecha de inicio:");

        jLabel6.setBackground(new java.awt.Color(187, 187, 187));
        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Project Manager:");

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administradores:");

        jLabel8.setBackground(new java.awt.Color(187, 187, 187));
        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Cargar Ticket:");

        jLabel9.setBackground(new java.awt.Color(187, 187, 187));
        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Cargar Compra-venta:");

        jLabel10.setBackground(new java.awt.Color(187, 187, 187));
        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
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
        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Ubicación:");

        btnCargarCompraVenta.setBackground(new java.awt.Color(123, 163, 186));
        btnCargarCompraVenta.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCargarCompraVenta.setText("Cargar");
        btnCargarCompraVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarCompraVenta.setBorderPainted(false);
        btnCargarCompraVenta.setVerifyInputWhenFocusTarget(false);

        btnCargarTicket.setBackground(new java.awt.Color(123, 163, 186));
        btnCargarTicket.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCargarTicket.setText("Cargar");
        btnCargarTicket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarTicket.setBorderPainted(false);
        btnCargarTicket.setVerifyInputWhenFocusTarget(false);

        btnAgregarProjectManager.setBackground(new java.awt.Color(123, 163, 183));
        btnAgregarProjectManager.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnAgregarProjectManager.setText("Agregar");
        btnAgregarProjectManager.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarProjectManager.setBorderPainted(false);
        btnAgregarProjectManager.setVerifyInputWhenFocusTarget(false);
        btnAgregarProjectManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProjectManagerActionPerformed(evt);
            }
        });

        btnAgregarAdmin.setBackground(new java.awt.Color(123, 163, 186));
        btnAgregarAdmin.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
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
                .addGap(30, 30, 30)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addComponent(spnDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtcInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbProjectMnaguer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(btnAgregarProjectManager, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnAgregarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(cmbAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(pnlInfoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CargarCompraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCargarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnCargarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnCargarCompraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))))
                                .addGap(0, 93, Short.MAX_VALUE))))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnlInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbAdministradores, cmbProjectMnaguer});

        pnlInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregarAdmin, btnAgregarProjectManager});

        pnlInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCargarCompraVenta, btnCargarTicket});

        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
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
                .addGap(32, 32, 32)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbProjectMnaguer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cmbAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProjectManager)
                    .addComponent(btnAgregarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pnlInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane3, jScrollPane4});

        pnlInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregarAdmin, btnAgregarProjectManager});

        pnlInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCargarCompraVenta, btnCargarTicket});

        pnlSembrado.setBackground(new java.awt.Color(47, 51, 66));
        pnlSembrado.setPreferredSize(new java.awt.Dimension(1129, 708));

        jPanel3.setBackground(new java.awt.Color(47, 51, 66));

        btnCargarEtapas.setBackground(new java.awt.Color(123, 163, 186));
        btnCargarEtapas.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCargarEtapas.setText("Cargar Etapas");
        btnCargarEtapas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarEtapas.setBorderPainted(false);
        btnCargarEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEtapasActionPerformed(evt);
            }
        });

        btnAgregarUnidades.setBackground(new java.awt.Color(123, 163, 186));
        btnAgregarUnidades.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnAgregarUnidades.setText("Agregar Unidades");
        btnAgregarUnidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarUnidades.setBorderPainted(false);
        btnAgregarUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUnidadesActionPerformed(evt);
            }
        });

        btnCargarModelo.setBackground(new java.awt.Color(123, 163, 186));
        btnCargarModelo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCargarModelo.setText("Cargar Modelo");
        btnCargarModelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarModelo.setBorderPainted(false);
        btnCargarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarModeloActionPerformed(evt);
            }
        });

        btnCrearFinanciamiento.setBackground(new java.awt.Color(123, 163, 186));
        btnCrearFinanciamiento.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
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
                .addGap(30, 30, 30)
                .addComponent(btnAgregarUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnCargarEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnCargarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnCrearFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregarUnidades, btnCargarEtapas, btnCargarModelo, btnCrearFinanciamiento});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearFinanciamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregarUnidades, btnCargarEtapas, btnCargarModelo, btnCrearFinanciamiento});

        tableSembrado.setBackground(new java.awt.Color(127, 127, 127));
        tableSembrado.setForeground(new java.awt.Color(123, 182, 186));
        tableSembrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "# Unidad", "Etapa", "Modelo", "Tablaje", "# m2", "PV M2", "Precio venta", "Anticipo", "Monto anticipado", "Fecha anticipo", "Financiamiento", "Mensualidades", "Monto mensualidades", "Monto de cada mensualidad", "Fecha de inicio financiamiento", "Fecha final de financiamiento", "Porcentaje saldo", "Monto de saldo", "Fecha de saldo", "Fecha venta", "Fecha ultimo pago"
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
        tableSembrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSembradoMouseReleased(evt);
            }
        });
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnlCredito.setBackground(new java.awt.Color(47, 51, 66));
        pnlCredito.setPreferredSize(new java.awt.Dimension(1129, 708));

        jLabel12.setBackground(new java.awt.Color(187, 187, 187));
        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Inversionista:");

        jLabel13.setBackground(new java.awt.Color(187, 187, 187));
        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Monto de inv:");

        jLabel14.setBackground(new java.awt.Color(187, 187, 187));
        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Monto de dev:");

        cmbInversionista.setEditable(true);
        cmbInversionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInversionistaActionPerformed(evt);
            }
        });

        btnAgregarInversionista.setText("Añadir");
        btnAgregarInversionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInversionistaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setForeground(new java.awt.Color(127, 127, 127));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        buttonGroup1.add(rbPorcentajeInversion);
        rbPorcentajeInversion.setForeground(new java.awt.Color(255, 255, 255));
        rbPorcentajeInversion.setText("Porcentaje(%)");

        buttonGroup1.add(rbMontoInversion);
        rbMontoInversion.setForeground(new java.awt.Color(255, 255, 255));
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

        btnAddInversion.setBackground(new java.awt.Color(123, 163, 186));
        btnAddInversion.setText("Agregar");
        btnAddInversion.setRequestFocusEnabled(false);

        tableInversiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tableInversiones.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane5.setViewportView(tableInversiones);
        if (tableInversiones.getColumnModel().getColumnCount() > 0) {
            tableInversiones.getColumnModel().getColumn(0).setMinWidth(0);
            tableInversiones.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableInversiones.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel15.setBackground(new java.awt.Color(187, 187, 187));
        jLabel15.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Inversionistas");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSalvarCredito.setBackground(new java.awt.Color(123, 163, 186));
        btnSalvarCredito.setText("Agregar");
        btnSalvarCredito.setRequestFocusEnabled(false);

        txtMontoDevolucionCredito.setBackground(new java.awt.Color(187, 187, 187));
        txtMontoDevolucionCredito.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtMontoDevolucionCredito.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoDevolucionCredito.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtMontoDevolucionCredito.setText("Fecha de inicio:");

        jLabel19.setBackground(new java.awt.Color(187, 187, 187));
        jLabel19.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Créditos");

        jLabel17.setBackground(new java.awt.Color(187, 187, 187));
        jLabel17.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Monto total:");

        tableCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tableCredito.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane6.setViewportView(tableCredito);
        if (tableCredito.getColumnModel().getColumnCount() > 0) {
            tableCredito.getColumnModel().getColumn(0).setMinWidth(0);
            tableCredito.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCredito.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel16.setBackground(new java.awt.Color(187, 187, 187));
        jLabel16.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Crédito:");

        jLabel22.setBackground(new java.awt.Color(187, 187, 187));
        jLabel22.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Prestamista");

        jLabel23.setBackground(new java.awt.Color(187, 187, 187));
        jLabel23.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("Prestamista:");

        jLabel24.setBackground(new java.awt.Color(187, 187, 187));
        jLabel24.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("Monto de préstamo:");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel8.setForeground(new java.awt.Color(127, 127, 127));

        buttonGroup2.add(rbPorcentajePrestamo);
        rbPorcentajePrestamo.setForeground(new java.awt.Color(255, 255, 255));
        rbPorcentajePrestamo.setText("Porcentaje(%)");

        buttonGroup2.add(rbMontoPrestamo);
        rbMontoPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        rbMontoPrestamo.setText("Monto($)");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(rbPorcentajePrestamo)
                .addGap(29, 29, 29)
                .addComponent(rbMontoPrestamo))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbPorcentajePrestamo)
                .addComponent(rbMontoPrestamo))
        );

        txtMontoDevolucionCredito1.setBackground(new java.awt.Color(187, 187, 187));
        txtMontoDevolucionCredito1.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txtMontoDevolucionCredito1.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoDevolucionCredito1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtMontoDevolucionCredito1.setText("Monto de dev:");

        btnSalvarPrestamo.setBackground(new java.awt.Color(123, 163, 186));
        btnSalvarPrestamo.setText("Agregar");
        btnSalvarPrestamo.setRequestFocusEnabled(false);

        tablePrestamistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Prestamista", "Monto de préstamo", "Monto de devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePrestamistas.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane7.setViewportView(tablePrestamistas);
        if (tablePrestamistas.getColumnModel().getColumnCount() > 0) {
            tablePrestamistas.getColumnModel().getColumn(0).setMinWidth(0);
            tablePrestamistas.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablePrestamistas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cmxPrestamistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmxPrestamistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmxPrestamistasActionPerformed(evt);
            }
        });

        btnAgregarPrestamista.setText("Añadir");
        btnAgregarPrestamista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPrestamistaActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(187, 187, 187));
        jLabel25.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("tasa de interés:");

        jLabel26.setBackground(new java.awt.Color(187, 187, 187));
        jLabel26.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("meses de financiamiento:");

        javax.swing.GroupLayout pnlCreditoLayout = new javax.swing.GroupLayout(pnlCredito);
        pnlCredito.setLayout(pnlCreditoLayout);
        pnlCreditoLayout.setHorizontalGroup(
            pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel15))
                                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMontoDevolucionInversionistas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtMontoInversiones, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbInversionista, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditoLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregarInversionista, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(btnAddInversion)))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarCredito)
                                .addGap(117, 117, 117))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMontoDevolucionCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                                    .addComponent(txtTasadeInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtMontototalCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(dtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1))
                                .addGap(10, 10, 10)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditoLayout.createSequentialGroup()
                                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMontoPrestamo)
                                            .addComponent(cmxPrestamistas, 0, 140, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarPrestamista, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel22))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addComponent(txtMontoDevolucionCredito1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoDevolucionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnSalvarPrestamo))))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jLabel19)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pnlCreditoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCredito, txtMontototalCredito, txtTasadeInteres});

        pnlCreditoLayout.setVerticalGroup(
            pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbInversionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarInversionista))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtMontoInversiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtMontoDevolucionInversionistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cmxPrestamistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarPrestamista))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtMontoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoDevolucionCredito1)
                            .addComponent(txtMontoDevolucionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtMontototalCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtTasadeInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMontoDevolucionCredito)
                            .addComponent(dtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSalvarPrestamo)
                    .addComponent(btnSalvarCredito)
                    .addComponent(btnAddInversion))
                .addGap(33, 33, 33)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 180, Short.MAX_VALUE))
        );

        pnlCreditoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCredito, txtMontototalCredito, txtTasadeInteres});

        pnlCatalogo.setBackground(new java.awt.Color(47, 51, 66));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Egresos");

        btnEgresos.setBackground(new java.awt.Color(123, 163, 186));
        btnEgresos.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnEgresos.setText("Nuevo");
        btnEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresosActionPerformed(evt);
            }
        });

        tableIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Categoria", ""
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

        btnIngresos.setBackground(new java.awt.Color(123, 163, 186));
        btnIngresos.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnIngresos.setText("Nuevo");
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingresos");

        btnCuentas.setBackground(new java.awt.Color(123, 163, 186));
        btnCuentas.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCuentas.setText("Nuevo");

        jLabel21.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cuentas");

        tableEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Categoria", ""
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
        jScrollPane10.setViewportView(tableEgresos);
        if (tableEgresos.getColumnModel().getColumnCount() > 0) {
            tableEgresos.getColumnModel().getColumn(0).setMinWidth(0);
            tableEgresos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableEgresos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        tableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Categoria", ""
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
        jScrollPane11.setViewportView(tableCuentas);
        if (tableCuentas.getColumnModel().getColumnCount() > 0) {
            tableCuentas.getColumnModel().getColumn(0).setMinWidth(0);
            tableCuentas.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCuentas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnlCatalogoLayout = new javax.swing.GroupLayout(pnlCatalogo);
        pnlCatalogo.setLayout(pnlCatalogoLayout);
        pnlCatalogoLayout.setHorizontalGroup(
            pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel18)
                        .addGap(35, 35, 35)
                        .addComponent(btnEgresos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCatalogoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(40, 40, 40)
                        .addComponent(btnIngresos)
                        .addGap(46, 46, 46)))
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCatalogoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCatalogoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel21)
                        .addGap(27, 27, 27)
                        .addComponent(btnCuentas)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCatalogoLayout.setVerticalGroup(
            pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlCatalogoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCatalogoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(btnEgresos)
                    .addComponent(btnIngresos)
                    .addComponent(jLabel21)
                    .addComponent(btnCuentas))
                .addGap(61, 61, 61)
                .addGroup(pnlCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );

        jLayeredPane1.setLayer(pnlInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlSembrado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlCredito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlCatalogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(pnlSembrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 126, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(pnlCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 97, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(pnlCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 97, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(pnlSembrado, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 94, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(pnlCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 95, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(pnlCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 96, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(47, 51, 66));

        btnInfoGeneral.setBackground(new java.awt.Color(123, 163, 186));
        btnInfoGeneral.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnInfoGeneral.setText("Información General");
        btnInfoGeneral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfoGeneral.setFocusPainted(false);
        btnInfoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoGeneralActionPerformed(evt);
            }
        });

        btnCredito.setBackground(new java.awt.Color(123, 163, 186));
        btnCredito.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCredito.setText("Credito de inversionistas");
        btnCredito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCredito.setFocusPainted(false);
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btnCatalogo.setBackground(new java.awt.Color(123, 163, 186));
        btnCatalogo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnCatalogo.setText("Catálogo");
        btnCatalogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCatalogo.setFocusPainted(false);
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(123, 163, 186));
        btnGuardar.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setFocusPainted(false);

        btnSembrado.setBackground(new java.awt.Color(123, 163, 186));
        btnSembrado.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
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
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoGeneralActionPerformed
        pnlSembrado.setVisible(false);
        pnlCredito.setVisible(false);
        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(true);
        btnCredito.setBackground(new Color(123,163,186));
            btnCatalogo.setBackground(new Color(123,163,186));
            btnSembrado.setBackground(new Color(123,163,186));
             btnInfoGeneral.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_btnInfoGeneralActionPerformed

    private void btnSembradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSembradoActionPerformed
        
        pnlCredito.setVisible(false);
        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(false);
         pnlSembrado.setVisible(true);
         btnCredito.setBackground(new Color(123,163,186));
            btnCatalogo.setBackground(new Color(123,163,186));
            btnSembrado.setBackground(new Color(115,115,115));
             btnInfoGeneral.setBackground(new Color(123,163,186));
    }//GEN-LAST:event_btnSembradoActionPerformed

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed

        pnlCatalogo.setVisible(false);
        pnlInfo.setVisible(false);
         pnlSembrado.setVisible(false);
          pnlCredito.setVisible(true);
           btnCredito.setBackground(new Color(115,115,115));
            btnCatalogo.setBackground(new Color(123,163,186));
            btnSembrado.setBackground(new Color(123,163,186));
             btnInfoGeneral.setBackground(new Color(123,163,186));
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        
        pnlInfo.setVisible(false);
         pnlSembrado.setVisible(false);
          pnlCredito.setVisible(false);
          pnlCatalogo.setVisible(true);
            btnCatalogo.setBackground(new Color(115,115,115));
            btnCredito.setBackground(new Color(123,163,186));
            btnSembrado.setBackground(new Color(123,163,186));
             btnInfoGeneral.setBackground(new Color(123,163,186));
             pnlCargaDesarrollo2 a= new pnlCargaDesarrollo2();
           
            
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
        
        User o= ManagersList.stream().filter(obj -> cmbProjectMnaguer.getSelectedItem().toString().equals(obj.Name))
  .findAny()
  .orElse(null);
         TableManager.add(new User(o.Id,o.Name,o.lname,o.Password,o.Type_Id,o.Type));
      modelManagers.addRow(new Object[]{0,o.Name});
    }//GEN-LAST:event_btnAgregarProjectManagerActionPerformed

    private void btnAgregarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdminActionPerformed
        User o= AdminsList.stream().filter(obj -> cmbAdministradores.getSelectedItem().toString().equals(obj.Name))
  .findAny()
  .orElse(null);
        TableAdminsList.add(new User(o.Id,o.Name,o.lname,o.Password,o.Type_Id,o.Type));
      modelAdmins.addRow(new Object[]{0,o.Name});
    }//GEN-LAST:event_btnAgregarAdminActionPerformed

    private void cmbInversionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInversionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbInversionistaActionPerformed

    private void btnAgregarInversionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInversionistaActionPerformed
        AgregarInversionista obj= new AgregarInversionista();
        obj.setModal(true);
        obj.setVisible(true);
    }//GEN-LAST:event_btnAgregarInversionistaActionPerformed

    private void btnAgregarPrestamistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPrestamistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarPrestamistaActionPerformed

    private void cmxPrestamistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmxPrestamistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmxPrestamistasActionPerformed

    private void tableSembradoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSembradoMouseReleased
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
        evt.consume();
        menuSembrado.show(tableSembrado, evt.getX(), evt.getY());
        }    
    }//GEN-LAST:event_tableSembradoMouseReleased

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
         private DefaultTableModel modelManagers;
         private DefaultTableModel modelInversiones;
         private DefaultTableModel modelCredito;

         
    
         List<User> ManagersList; //CMB LIST
    List<User> TableManager;
    List<User> AdminsList;
     List<User> TableAdminsList;
     List<Investor> inversionistasList;
    
    Vector vectorCredito=new Vector(); 
   Vector vectorInversiones=new Vector();
    Vector vectorManagers=new Vector();
    Vector vectorAdmins=new Vector();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CargarCompraVenta;
    private javax.swing.JButton btnAddInversion;
    private javax.swing.JButton btnAgregarAdmin;
    private javax.swing.JButton btnAgregarInversionista;
    private javax.swing.JButton btnAgregarPrestamista;
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
    private javax.swing.JMenuItem btnEliminarSembrado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInfoGeneral;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnSalvarCredito;
    private javax.swing.JButton btnSalvarPrestamo;
    private javax.swing.JButton btnSembrado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbAdministradores;
    private javax.swing.JComboBox<String> cmbInversionista;
    private javax.swing.JComboBox<String> cmbProjectMnaguer;
    private javax.swing.JComboBox<String> cmxPrestamistas;
    private com.toedter.calendar.JDateChooser dtFechaInicio;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPopupMenu menuSembrado;
    private javax.swing.JPanel pnlCatalogo;
    private javax.swing.JPanel pnlCredito;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlSembrado;
    private javax.swing.JRadioButton rbMontoInversion;
    private javax.swing.JRadioButton rbMontoPrestamo;
    private javax.swing.JRadioButton rbPorcentajeInversion;
    private javax.swing.JRadioButton rbPorcentajePrestamo;
    private javax.swing.JSpinner spnDuracion;
    private javax.swing.JTable tableAdmins;
    private javax.swing.JTable tableCredito;
    private javax.swing.JTable tableCuentas;
    private javax.swing.JTable tableEgresos;
    private javax.swing.JTable tableIngresos;
    private javax.swing.JTable tableInversiones;
    private javax.swing.JTable tablePrestamistas;
    private javax.swing.JTable tableProjectManaguers;
    private javax.swing.JTable tableSembrado;
    private javax.swing.JTextField txtCargarTicket;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JLabel txtMontoDevolucionCredito;
    private javax.swing.JLabel txtMontoDevolucionCredito1;
    private javax.swing.JTextField txtMontoDevolucionInversionistas;
    private javax.swing.JTextField txtMontoDevolucionPrestamo;
    private javax.swing.JTextField txtMontoInversiones;
    private javax.swing.JTextField txtMontoPrestamo;
    private javax.swing.JTextField txtMontototalCredito;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTasadeInteres;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
