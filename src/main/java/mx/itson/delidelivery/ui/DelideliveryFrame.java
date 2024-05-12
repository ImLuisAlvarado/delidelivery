/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.delidelivery.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import mx.itson.delidelivery.business.Operation;
import mx.itson.delidelivery.entities.Delidelivery;
import mx.itson.delidelivery.entities.Product;

/**
 *
 * @author HP
 */
public class DelideliveryFrame extends javax.swing.JFrame {

    /**
     * Creates new form DelideliveryFrame
     */
    public DelideliveryFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelDiscount = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        labelOrderId = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelPayMethod = new javax.swing.JLabel();
        labelOrderStatus = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        labelClientName = new javax.swing.JLabel();
        labelClientAddress = new javax.swing.JLabel();
        labelClientAddressReferences = new javax.swing.JLabel();
        labelClientPhoneNumber = new javax.swing.JLabel();
        labelClientEmailAddress = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        labelBusinessName = new javax.swing.JLabel();
        labelBusinessAddress = new javax.swing.JLabel();
        labelBusinessPhoneNumber = new javax.swing.JLabel();
        labelBusinessEmailAddress = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        labelCommission = new javax.swing.JLabel();
        labelShipping = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(770, 761));

        jPanel1.setBackground(new java.awt.Color(151, 0, 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(695, 79));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(12, 68, 172));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Información del negocio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 29));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Información del cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(productsTable);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalles del pedido");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(12, 68, 172));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelDiscount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDiscount.setForeground(new java.awt.Color(0, 0, 0));
        labelDiscount.setText("Descuento:");

        jPanel11.setBackground(new java.awt.Color(225, 224, 224));

        labelOrderId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelOrderId.setForeground(new java.awt.Color(0, 0, 0));
        labelOrderId.setText("ID:");

        labelDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDate.setForeground(new java.awt.Color(0, 0, 0));
        labelDate.setText("FECHA:");

        labelPayMethod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPayMethod.setForeground(new java.awt.Color(0, 0, 0));
        labelPayMethod.setText("MÉTODO DE PAGO:");
        labelPayMethod.setToolTipText("");

        labelOrderStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelOrderStatus.setForeground(new java.awt.Color(0, 0, 0));
        labelOrderStatus.setText("ESTADO:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOrderId)
                    .addComponent(labelDate)
                    .addComponent(labelPayMethod)
                    .addComponent(labelOrderStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOrderId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPayMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOrderStatus)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(225, 224, 224));

        labelClientName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientName.setForeground(new java.awt.Color(0, 0, 0));
        labelClientName.setText("NOMBRE:");

        labelClientAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelClientAddress.setText("DIRECCIÓN");

        labelClientAddressReferences.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientAddressReferences.setForeground(new java.awt.Color(0, 0, 0));
        labelClientAddressReferences.setText("REFERENCIAS:");

        labelClientPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        labelClientPhoneNumber.setText("TÉLEFONO:");

        labelClientEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelClientEmailAddress.setText("CORREO:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelClientEmailAddress)
                    .addComponent(labelClientPhoneNumber)
                    .addComponent(labelClientAddressReferences)
                    .addComponent(labelClientAddress)
                    .addComponent(labelClientName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClientAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClientAddressReferences)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClientPhoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClientEmailAddress)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(225, 224, 224));

        labelBusinessName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessName.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessName.setText("NOMBRE:");

        labelBusinessAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessAddress.setText("DIRECCIÓN:");

        labelBusinessPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessPhoneNumber.setText("TÉLEFONO:");

        labelBusinessEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessEmailAddress.setText("CORREO:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBusinessName)
                    .addComponent(labelBusinessAddress)
                    .addComponent(labelBusinessPhoneNumber)
                    .addComponent(labelBusinessEmailAddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBusinessName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBusinessAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBusinessPhoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBusinessEmailAddress)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        labelSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        labelSubtotal.setText("Subtotal:");

        labelIva.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        labelIva.setForeground(new java.awt.Color(0, 0, 0));
        labelIva.setText("IVA");

        labelCommission.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCommission.setForeground(new java.awt.Color(0, 0, 0));
        labelCommission.setText("Comisión:");

        labelShipping.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelShipping.setForeground(new java.awt.Color(0, 0, 0));
        labelShipping.setText("Cobro de envío:");

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("TOTAL:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSubtotal)
                            .addComponent(labelDiscount)
                            .addComponent(labelIva)
                            .addComponent(labelCommission)
                            .addComponent(labelShipping))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(labelTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(labelSubtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCommission)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelShipping)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDiscount))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTotal)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                byte fileBytes[] = Files.readAllBytes(file.toPath());
                String content = new String(fileBytes,StandardCharsets.UTF_8);

                Delidelivery delidelivery = new Delidelivery().deserialize(content);

                //the labels are separated in order of appearance.
                labelBusinessName.setText("NOMBRE: "+delidelivery.getBusiness().getName());
                labelBusinessAddress.setText("DIRECCIÓN: "+delidelivery.getBusiness().getAddress());
                labelBusinessPhoneNumber.setText("TELEFONO: "+delidelivery.getBusiness().getPhoneNumber());
                labelBusinessEmailAddress.setText("CORREO: "+delidelivery.getBusiness().getEmailAddress());

                labelClientName.setText("NOMBRE: "+delidelivery.getClient().getName());
                labelClientAddress.setText("DIRECCIÓN: "+delidelivery.getClient().getAddress());
                labelClientAddressReferences.setText("REFERENCIAS: "+delidelivery.getClient().getAddressReferences());
                labelClientPhoneNumber.setText("TELEFONO: "+delidelivery.getClient().getPhoneNumber());
                labelClientEmailAddress.setText("CORREO: "+delidelivery.getClient().getEmailAddress());

                labelOrderId.setText("ID: "+delidelivery.getOrder().getId());
                //this will help us to give a format to hour date
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm:ss", new Locale("ES","es"));
                //in here we used the "format" method so our date could be in the SimpleDateFormat
                labelDate.setText("FECHA: "+dateFormat.format(delidelivery.getOrder().getDate()));
                labelPayMethod.setText("METODO DE PAGO: "+delidelivery.getOrder().getPayMethod());
                labelOrderStatus.setText("ESTADO: "+delidelivery.getOrder().getStatus());

                DefaultTableModel model = (DefaultTableModel)productsTable.getModel();
                model.setColumnCount(0);
                model.addColumn("PRODUCTO");
                model.addColumn("CANTIDAD");
                model.addColumn("PRECIO");
                model.addColumn("TOTAL");

                double subtotal=0;
                for(Product p : delidelivery.getOrder().getProduct()){
                    subtotal += Operation.productTotal(Operation.subtotal(p.isDiscountTicket(), p.getPrice()), p.getQuantity());
                    model.addRow(new Object[]{
                        p.getName(),
                        p.getQuantity(),
                        Operation.subtotal(p.isDiscountTicket(), p.getPrice()),
                        Operation.productTotal(Operation.subtotal(p.isDiscountTicket(), p.getPrice()), p.getQuantity())
                    });
                }
                //this block is used to resize to table so it can match the
                //content
                productsTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                TableColumnModel columnModel=productsTable.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(150);
                columnModel.getColumn(1).setPreferredWidth(80);

            }}catch(Exception ex){
                System.err.println("Ocurrió un error: "+ex.getMessage());
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DelideliveryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelideliveryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelideliveryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelideliveryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelideliveryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBusinessAddress;
    private javax.swing.JLabel labelBusinessEmailAddress;
    private javax.swing.JLabel labelBusinessName;
    private javax.swing.JLabel labelBusinessPhoneNumber;
    private javax.swing.JLabel labelClientAddress;
    private javax.swing.JLabel labelClientAddressReferences;
    private javax.swing.JLabel labelClientEmailAddress;
    private javax.swing.JLabel labelClientName;
    private javax.swing.JLabel labelClientPhoneNumber;
    private javax.swing.JLabel labelCommission;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelOrderId;
    private javax.swing.JLabel labelOrderStatus;
    private javax.swing.JLabel labelPayMethod;
    private javax.swing.JLabel labelShipping;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable productsTable;
    // End of variables declaration//GEN-END:variables
}
