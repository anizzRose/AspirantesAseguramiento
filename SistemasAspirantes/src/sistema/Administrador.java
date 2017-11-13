
package sistema;

import ConexionSQLBD.BDAspirantes;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import selecciones.Aspirante;

public class Administrador extends java.awt.Frame {
 
 
     int longitudBytes;
    ArrayList<Aspirante>aspirante;
    BDAspirantes ba= new BDAspirantes();
    public Administrador() {
        initComponents();
        Limpiar();
        ListadeAspirantes();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_appat = new javax.swing.JTextField();
        txt_apmat = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_generacion = new javax.swing.JTextField();
        txt_tematesis = new javax.swing.JTextField();
        txt_carrera = new javax.swing.JTextField();
        txt_dirtesis = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_aspirantes = new javax.swing.JTable();
        btn_modifica = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_busqueda = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        btn_foto = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        txt_fotos = new javax.swing.JTextField();
        btn_generarlista = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Nombre");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Administrador de Aspirantes");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Apellido Materno");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Teléfono Celular");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("Carrera");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Generación");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("Tema de Tesis");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setText("Director de Tesis");

        jPanel4.setLayout(null);

        lbl_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fotoMouseClicked(evt);
            }
        });
        jPanel4.add(lbl_foto);
        lbl_foto.setBounds(20, 10, 160, 160);

        tabla_aspirantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_aspirantes);

        btn_modifica.setText("Modificar");
        btn_modifica.setBorderPainted(false);
        btn_modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setActionCommand("Agregar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_busqueda.setText("Busqueda");
        btn_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busquedaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("Matricula");

        btn_foto.setText("Subir Foto");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        lblfoto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblfoto.setText("Fotos");

        btn_generarlista.setText("Generar Lista");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_appat)
                                    .addComponent(txt_apmat)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_correo)
                                    .addComponent(txt_celular)
                                    .addComponent(txt_generacion)
                                    .addComponent(txt_carrera)
                                    .addComponent(txt_tematesis)
                                    .addComponent(txt_dirtesis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 283, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btn_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_generarlista, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_appat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_generacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tematesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dirtesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_generarlista, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ListadeAspirantes(){
     aspirante=ba.ListaAspirantes();
     DefaultTableModel tabla=(DefaultTableModel)tabla_aspirantes.getModel();
     for(Aspirante as :aspirante){
    tabla.addRow(new Object[]{as.getMatricula(), as.getNombre(), as.getApelPaterno(),as.getApelMaterno(),as.getCorreo(),as.getCelular(),as.getGeneracion(),as.getCarrera(),as.getTemTesis(),as.getDirTesis()});
     }
}

public void Limpiar(){
     DefaultTableModel tabla= (DefaultTableModel)tabla_aspirantes.getModel();
     for(int i=tabla.getRowCount()-1;i>0;i--){
         tabla.removeRow(i);
     }
}
 
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        Aspirante aspi= new Aspirante();
   
      aspi.setMatricula(txt_matricula.getText());
      aspi.setNombre(txt_nombre.getText());
      aspi.setApelPaterno(txt_appat.getText());
      aspi.setApelMaterno(txt_apmat.getText());
      aspi.setCorreo(txt_correo.getText());
      aspi.setCelular(txt_celular.getText());
      aspi.setCarrera(txt_carrera.getText());
      aspi.setGeneracion(txt_generacion.getText());
      aspi.setTemTesis(txt_tematesis.getText());
      aspi.setDirTesis(txt_dirtesis.getText());
       if (!"".equals(txt_matricula.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_appat.getText())&& !"".equals(txt_apmat.getText())&& !"".equals(txt_correo.getText())&& !"".equals(txt_celular.getText())
        && !"".equals(txt_tematesis.getText())&& !"".equals(txt_carrera.getText())&& !"".equals(txt_dirtesis.getText())&& !"".equals(lbl_foto.getIcon())){
           ba.InsertarAspirantes(aspi);
           Limpiar();
           ListadeAspirantes();
           JOptionPane.showMessageDialog(this,"Datos Guardados del aspirante en la DB ", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Es obligatorio todo los campos del aspirante", "", JOptionPane.ERROR_MESSAGE);
        }
           
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
        this.txt_nombre.setText("");
        this.txt_appat.setText("");
        this.txt_apmat.setText("");
        this.txt_matricula.setText("");
        this.txt_correo.setText("");
        this.txt_celular.setText("");
        this.txt_generacion.setText("");
        this.txt_tematesis.setText("");
        this.txt_carrera.setText("");
        this.txt_dirtesis.setText("");
        this.txt_fotos.setText("");
        this.lbl_foto.setText("");
        this.lblfoto.setText("");
        this.tabla_aspirantes.clearSelection();  
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
  // TODO add your handling code here:
        //Creamos nuestra variable archivo en la cual podremos usar todos los metodos de la clase jFileChooser
        JFileChooser archivo = new JFileChooser();
        //Si deseamos crear filtros para la selecion de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)", "jpg","jpeg");
        //Si deseas que se muestre primero los filtros usa la linea q esta abajo de esta.
        //archivo.setFileFilter(filtro);
        // Agregamos el Filtro pero cuidado se mostrara despues de todos los archivos
        archivo.addChoosableFileFilter(filtro);
        // Colocamos titulo a nuestra ventana de Seleccion
        archivo.setDialogTitle("Abrir Archivo");
        //Si deseamos que muestre una carpeta predetermina usa la siguiente linea
        File ruta = new File("C:/");
        //Le implementamos a nuestro ventana de seleccion
         archivo.setCurrentDirectory(ruta);
         //Abrimos nuestra Ventana de Selccion
        int ventana = archivo.showOpenDialog(null);
        //hacemos comparacion en caso de aprete el boton abrir
        if(ventana == JFileChooser.APPROVE_OPTION)
        {
            //Obtenemos la ruta de nuestra imagen seleccionada
            File file = archivo.getSelectedFile();
            //Lo imprimimos en una caja de texto para ver su ruta
            txt_fotos.setText(String.valueOf(file));
            //de cierto modo necesitamos tener la imagen para ello debemos conocer la ruta de dicha imagen
            Image foto= getToolkit().getImage(txt_fotos.getText());
            //Le damos dimension a nuestro label que tendra la imagen
            foto= foto.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
            //Imprimimos la imagen en el label
            lbl_foto.setIcon(new ImageIcon(foto));
        }     
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void lbl_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fotoMouseClicked
JFileChooser se = new JFileChooser();
     FileInputStream fis;
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);       
        int estado = se.showOpenDialog(null);
        if(estado == JFileChooser.APPROVE_OPTION)
        {
            try {
                
                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();
                
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lbl_foto.getWidth(), lbl_foto.getHeight(), Image.SCALE_DEFAULT);
                lbl_foto.setIcon(new ImageIcon(icono));
                lbl_foto.updateUI(); 
                
            } catch (FileNotFoundException ex) {ex.printStackTrace();}
            catch (IOException ex){ex.printStackTrace();}
        }
    }//GEN-LAST:event_lbl_fotoMouseClicked

    private void btn_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busquedaActionPerformed
        CartasAspirantes aspirante= new CartasAspirantes();
        aspirante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_busquedaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busqueda;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_generarlista;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTable tabla_aspirantes;
    private javax.swing.JTextField txt_apmat;
    private javax.swing.JTextField txt_appat;
    private javax.swing.JTextField txt_carrera;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dirtesis;
    private javax.swing.JTextField txt_fotos;
    private javax.swing.JTextField txt_generacion;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tematesis;
    // End of variables declaration//GEN-END:variables
}
