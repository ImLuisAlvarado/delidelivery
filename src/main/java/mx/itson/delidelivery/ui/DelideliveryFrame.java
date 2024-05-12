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
import mx.itson.delidelivery.entities.Delidelivery;
import mx.itson.delidelivery.entities.Product;
import mx.itson.delidelivery.business.Operation;
/**
 *
 * @author HP
 */
public class DelideliveryFrame extends javax.swing.JFrame {

    /**
     * Creates new form Delidelivery
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelBusinessName = new javax.swing.JLabel();
        labelBusinessAddress = new javax.swing.JLabel();
        labelBusinessPhoneNumber = new javax.swing.JLabel();
        labelBusinessEmailAddress = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelOrderStatus = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelPayMethod = new javax.swing.JLabel();
        labelOrderId = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelClientName = new javax.swing.JLabel();
        labelClientAddress = new javax.swing.JLabel();
        labelClientAddressReferences = new javax.swing.JLabel();
        labelClientPhoneNumber = new javax.swing.JLabel();
        labelClientEmailAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        labelActionButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelDiscount = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelComision = new javax.swing.JLabel();
        labelShipping1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 761));

        jPanel2.setBackground(new java.awt.Color(151, 0, 5));

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PEDIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(166, 166, 166)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(225, 224, 224));

        labelBusinessName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessName.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessName.setText("NOMBRE:");

        labelBusinessAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessAddress.setText("DIRECCIÓN:");

        labelBusinessPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessPhoneNumber.setText("TELEFONO:");

        labelBusinessEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBusinessEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelBusinessEmailAddress.setText("CORREO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBusinessName)
                    .addComponent(labelBusinessAddress)
                    .addComponent(labelBusinessEmailAddress)
                    .addComponent(labelBusinessPhoneNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBusinessName)
                .addGap(18, 18, 18)
                .addComponent(labelBusinessAddress)
                .addGap(18, 18, 18)
                .addComponent(labelBusinessPhoneNumber)
                .addGap(18, 18, 18)
                .addComponent(labelBusinessEmailAddress)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(225, 224, 224));

        labelOrderStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelOrderStatus.setForeground(new java.awt.Color(0, 0, 0));
        labelOrderStatus.setText("ESTADO:");

        labelDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDate.setForeground(new java.awt.Color(0, 0, 0));
        labelDate.setText("FECHA:");

        labelPayMethod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPayMethod.setForeground(new java.awt.Color(0, 0, 0));
        labelPayMethod.setText("METODO DE PAGO:");

        labelOrderId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelOrderId.setForeground(new java.awt.Color(0, 0, 0));
        labelOrderId.setText("ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDate)
                    .addComponent(labelOrderStatus)
                    .addComponent(labelPayMethod)
                    .addComponent(labelOrderId))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(labelOrderId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDate)
                .addGap(18, 18, 18)
                .addComponent(labelPayMethod)
                .addGap(18, 18, 18)
                .addComponent(labelOrderStatus)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(225, 224, 224));

        labelClientName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientName.setForeground(new java.awt.Color(0, 0, 0));
        labelClientName.setText("NOMBRE:");

        labelClientAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelClientAddress.setText("DIRECCIÓN:");

        labelClientAddressReferences.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientAddressReferences.setForeground(new java.awt.Color(0, 0, 0));
        labelClientAddressReferences.setText("REFERENCIAS:");

        labelClientPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        labelClientPhoneNumber.setText("TELEFONO:");

        labelClientEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClientEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelClientEmailAddress.setText("CORREO:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelClientAddressReferences)
                    .addComponent(labelClientName)
                    .addComponent(labelClientAddress)
                    .addComponent(labelClientPhoneNumber)
                    .addComponent(labelClientEmailAddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelClientAddress)
                .addGap(18, 18, 18)
                .addComponent(labelClientAddressReferences)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelClientPhoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelClientEmailAddress)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        productsTable.setBackground(new java.awt.Color(225, 224, 224));
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        productsTable.setGridColor(new java.awt.Color(12, 68, 172));
        jScrollPane1.setViewportView(productsTable);

        labelActionButton.setBackground(new java.awt.Color(12, 68, 172));
        labelActionButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelActionButton.setForeground(new java.awt.Color(255, 255, 255));
        labelActionButton.setText("Seleccionar...");
        labelActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelActionButtonActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Información del cliente");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(119, 119, 119))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(12, 68, 172));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información del negocio");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Detalles del pedido");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        labelSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        labelSubtotal.setText("Subtotal:");

        labelDiscount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDiscount.setForeground(new java.awt.Color(0, 0, 0));
        labelDiscount.setText("Descuento: ");

        labelIva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelIva.setForeground(new java.awt.Color(0, 0, 0));
        labelIva.setText("IVA:");

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("TOTAL:");

        labelComision.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelComision.setForeground(new java.awt.Color(0, 0, 0));
        labelComision.setText("Comisión:");

        labelShipping1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelShipping1.setForeground(new java.awt.Color(0, 0, 0));
        labelShipping1.setText("Cobro de envío:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelActionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(labelSubtotal))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(labelComision))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelIva)
                                    .addGap(242, 242, 242)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDiscount)
                                        .addComponent(labelTotal)))
                                .addComponent(labelShipping1)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelShipping1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelActionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelComision, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDiscount)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelActionButtonActionPerformed
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
              
              
              for(Product p : delidelivery.getOrder().getProduct()){
                  model.addRow(new Object[]{
                      
                      p.getName(),
                      p.getQuantity(),
                      //Operation.discount(p.isDiscountTicket(), p.getQuantity(), p.getPrice()),
                      //Operation.productTotal(Operation.discount(p.isDiscountTicket(), p.getQuantity(), p.getPrice()), p.getQuantity())
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
    }//GEN-LAST:event_labelActionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mx.itson.delidelivery.entities.Delidelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mx.itson.delidelivery.entities.Delidelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mx.itson.delidelivery.entities.Delidelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mx.itson.delidelivery.entities.Delidelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelideliveryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton labelActionButton;
    private javax.swing.JLabel labelBusinessAddress;
    private javax.swing.JLabel labelBusinessEmailAddress;
    private javax.swing.JLabel labelBusinessName;
    private javax.swing.JLabel labelBusinessPhoneNumber;
    private javax.swing.JLabel labelClientAddress;
    private javax.swing.JLabel labelClientAddressReferences;
    private javax.swing.JLabel labelClientEmailAddress;
    private javax.swing.JLabel labelClientName;
    private javax.swing.JLabel labelClientPhoneNumber;
    private javax.swing.JLabel labelComision;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelOrderId;
    private javax.swing.JLabel labelOrderStatus;
    private javax.swing.JLabel labelPayMethod;
    private javax.swing.JLabel labelShipping1;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable productsTable;
    // End of variables declaration//GEN-END:variables
}
