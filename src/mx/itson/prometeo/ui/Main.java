/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package mx.itson.prometeo.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mx.itson.prometeo.entidades.Articulo;
import mx.itson.prometeo.entidades.Dato;
import mx.itson.prometeo.enumeradores.Descuento;

/**
 *
 * @author franc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        lblPlaza = new javax.swing.JLabel();
        lblCaja = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblGracias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArticulos = new javax.swing.JTable();
        btnSeleccione = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlaza.setText("plaza");

        lblCaja.setText("caja");

        lblFecha.setText("fecha");

        lblHora.setText("hora");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane3.setViewportView(tblCliente);

        lblGracias.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblGracias.setText("gracias");

        tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "IVA", "Descuento", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tblArticulos);

        btnSeleccione.setText("seleccione..");
        btnSeleccione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccioneActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione el archivo a cargar :");

        lblEmpresa.setText("Empresa");

        lblCodigo.setText("Codigo");

        lbldireccion.setText("direccion");

        lblLocalidad.setText("localidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocalidad)
                            .addComponent(lblEmpresa)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCaja)
                                    .addComponent(lblPlaza))
                                .addGap(18, 18, 18)
                                .addComponent(lblFecha)
                                .addGap(18, 18, 18)
                                .addComponent(lblHora))
                            .addComponent(lbldireccion)
                            .addComponent(lblCodigo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 211, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleccione, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblGracias))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodigo)
                .addGap(9, 9, 9)
                .addComponent(lbldireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLocalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlaza)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaja)
                    .addComponent(lblFecha)
                    .addComponent(lblHora))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lblGracias)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccioneActionPerformed

        try{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                byte archivoBytes[] = Files.readAllBytes(archivo.toPath());

                String contenido = new String(archivoBytes, StandardCharsets.UTF_8);

                Dato dato = new Dato().deserializar(contenido);

                lblEmpresa.setText(dato.getEmpresa());
                lblCodigo.setText(dato.getCodigo());
                lbldireccion.setText(dato.getDireccion());
                lblLocalidad.setText(dato.getLocalidad().toUpperCase());
                lblPlaza.setText(dato.getPlaza());
                lblCaja.setText(dato.getCaja());
                lblFecha.setText(dato.getFecha());
                lblHora.setText(dato.getHora());
                lblGracias.setText("GRACIAS POR SU COMPRA");

                DefaultTableModel modeloArticulos = (DefaultTableModel) tblArticulos.getModel();
                modeloArticulos.setRowCount(0);

                Locale local = new Locale("es","MX");
                NumberFormat formatomoneda = NumberFormat.getCurrencyInstance(local);
                dato.getArticulos().sort((mov1, mov2) -> mov1.getNombre().compareTo(mov2.getNombre()));

                double Monto=0;
                double total =0;
                for(Articulo d: dato.getArticulos()){

                    if(d.getDescuento() == Descuento.APLICA){
                        total +=  d.getPrecio();

                        modeloArticulos.addRow(new Object[]  {d.getNombre(), formatomoneda.format(d.getPrecio()), formatomoneda.format(d.getIva() ), d.getDescuento(), formatomoneda.format(total) });

                    }else if (d.getDescuento() == Descuento.______){
                        total +=  d.getPrecio();
                        modeloArticulos.addRow(new Object[]  {d.getNombre(), formatomoneda.format(d.getPrecio()), formatomoneda.format(d.getIva()), d.getDescuento(),  formatomoneda.format(total)});

                    }

                    DefaultTableModel modeloCliente = (DefaultTableModel) tblCliente.getModel();
                    modeloCliente.setRowCount(0);
                    modeloCliente.addRow(new Object[]  { "EFECTIVO: "+ formatomoneda.format(dato.getCliente().getEfectivo())

                    });

                    modeloCliente.addRow(new Object[]  { "TARJETA : NO "

                    });

                    modeloCliente.addRow(new Object[]  { "RECARGA : PAQUETE AMIGO  " +  formatomoneda.format(dato.getCliente().getRecarga())

                    });

                    modeloCliente.addRow(new Object[]  { "MONTO A PAGAR "+ formatomoneda.format(total +dato.getCliente().getRecarga() )

                    });
                    modeloCliente.addRow(new Object[]  { "CAMBIO : "+ formatomoneda.format(dato.getCliente().getEfectivo()-total+ dato.getCliente().getRecarga() )

                    });

                }

                {
                }

                System.out.println(contenido);

            }

        }catch(Exception ex){
            System.out.println("Ocurrio un error "+ ex.getMessage());
        }

    }//GEN-LAST:event_btnSeleccioneActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccione;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCaja;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGracias;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblPlaza;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JTable tblArticulos;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
