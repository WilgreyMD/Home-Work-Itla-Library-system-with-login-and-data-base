/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Interface;

import com.logica.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wilgrey-MD
 */
public class UsuarioGiu extends javax.swing.JFrame {
    Conexion conexion = new Conexion();
    
    public UsuarioGiu(){
        
        initComponents();
        
        mostrarTabla("");
       
    }
    
    
    
   public void mostrarTabla(String valor){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre Del Libro");
    modelo.addColumn("Generos");
    modelo.addColumn("Descriocion");
    modelo.addColumn("Autor Del Libro");
    modelo.addColumn("Editorial");
    modelo.addColumn("Año De Lanzamiento");
    
    try (Connection guardarConexin = conexion.Conectar();
         PreparedStatement consulta = guardarConexin.prepareStatement(
                 "SELECT Nombre_Libro, Genero, Descripcion, Autor_libro, Editorial_libro, fecha_de_publicacion " +
                 "FROM LIBROS " +
                 "WHERE CONCAT(Nombre_Libro, ' ', Genero, ' ', Descripcion, ' ', Autor_libro, ' ', Editorial_libro, ' ', fecha_de_publicacion) " +
                 "LIKE ?")) {
        
        consulta.setString(1, "%" + valor + "%");
        ResultSet resutadoDeConsulta = consulta.executeQuery();
        
        while(resutadoDeConsulta.next()){
            Object[] datos = {
                resutadoDeConsulta.getString("Nombre_Libro"),
                resutadoDeConsulta.getString("Genero"),
                resutadoDeConsulta.getString("Descripcion"),
                resutadoDeConsulta.getString("Autor_libro"),
                resutadoDeConsulta.getString("Editorial_libro"),
                resutadoDeConsulta.getString("fecha_de_publicacion")
            };
            modelo.addRow(datos);
        }
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    
    showTabla.setModel(modelo);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTabla = new javax.swing.JTable();
        txtLibroName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Boton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLibroAutor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Boton1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtLibroYear = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Boton2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtLibroEditorial = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Boton3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        genero1 = new javax.swing.JRadioButton();
        genero2 = new javax.swing.JRadioButton();
        genero3 = new javax.swing.JRadioButton();
        genero4 = new javax.swing.JRadioButton();
        Boton4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        genero5 = new javax.swing.JRadioButton();
        showBooksPanel = new javax.swing.JPanel();
        showBooks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(132, 167, 161));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(46, 138, 153));

        jPanel3.setBackground(new java.awt.Color(31, 110, 140));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/leyendo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtApellido.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setText("--");

        txtName.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setText("--");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        showTabla.setBackground(new java.awt.Color(102, 102, 102));
        showTabla.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        showTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(showTabla);

        txtLibroName.setBackground(new java.awt.Color(132, 167, 161));
        txtLibroName.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        txtLibroName.setForeground(new java.awt.Color(0, 0, 0));
        txtLibroName.setText("Nombre Del Libro");
        txtLibroName.setBorder(null);
        txtLibroName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLibroNameMousePressed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Boton.setBackground(new java.awt.Color(45, 91, 121));

        jLabel2.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar por Nombre");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout BotonLayout = new javax.swing.GroupLayout(Boton);
        Boton.setLayout(BotonLayout);
        BotonLayout.setHorizontalGroup(
            BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BotonLayout.setVerticalGroup(
            BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        txtLibroAutor.setBackground(new java.awt.Color(132, 167, 161));
        txtLibroAutor.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        txtLibroAutor.setForeground(new java.awt.Color(0, 0, 0));
        txtLibroAutor.setText("Autor Libro");
        txtLibroAutor.setBorder(null);
        txtLibroAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLibroAutorMousePressed(evt);
            }
        });
        txtLibroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroAutorActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        Boton1.setBackground(new java.awt.Color(45, 91, 121));

        jLabel3.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar por Autor");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Boton1Layout = new javax.swing.GroupLayout(Boton1);
        Boton1.setLayout(Boton1Layout);
        Boton1Layout.setHorizontalGroup(
            Boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        Boton1Layout.setVerticalGroup(
            Boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        txtLibroYear.setBackground(new java.awt.Color(132, 167, 161));
        txtLibroYear.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        txtLibroYear.setForeground(new java.awt.Color(0, 0, 0));
        txtLibroYear.setText("Año De Lanzamiento");
        txtLibroYear.setBorder(null);
        txtLibroYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLibroYearMousePressed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Boton2.setBackground(new java.awt.Color(45, 91, 121));

        jLabel4.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar por Año");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Boton2Layout = new javax.swing.GroupLayout(Boton2);
        Boton2.setLayout(Boton2Layout);
        Boton2Layout.setHorizontalGroup(
            Boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Boton2Layout.setVerticalGroup(
            Boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        txtLibroEditorial.setBackground(new java.awt.Color(132, 167, 161));
        txtLibroEditorial.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        txtLibroEditorial.setForeground(new java.awt.Color(0, 0, 0));
        txtLibroEditorial.setText("Editorial");
        txtLibroEditorial.setBorder(null);
        txtLibroEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLibroEditorialMousePressed(evt);
            }
        });
        txtLibroEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroEditorialActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Boton3.setBackground(new java.awt.Color(45, 91, 121));

        jLabel5.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buscar Por Editorial");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Boton3Layout = new javax.swing.GroupLayout(Boton3);
        Boton3.setLayout(Boton3Layout);
        Boton3Layout.setHorizontalGroup(
            Boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Boton3Layout.setVerticalGroup(
            Boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(14, 41, 84));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona Genero", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lexend Deca", 0, 18))); // NOI18N

        grupoGenero.add(genero1);
        genero1.setText("Realismo mágico, novela");
        genero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero1ActionPerformed(evt);
            }
        });

        grupoGenero.add(genero2);
        genero2.setText("Novela romántica, sátira social");
        genero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero2ActionPerformed(evt);
            }
        });

        grupoGenero.add(genero3);
        genero3.setText("Novela de desarrollo, comedia");
        genero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero3ActionPerformed(evt);
            }
        });

        grupoGenero.add(genero4);
        genero4.setText("Novela de desarrollo, drama");
        genero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero4ActionPerformed(evt);
            }
        });

        Boton4.setBackground(new java.awt.Color(45, 91, 121));

        jLabel6.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buscar Por Genero");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Boton4Layout = new javax.swing.GroupLayout(Boton4);
        Boton4.setLayout(Boton4Layout);
        Boton4Layout.setHorizontalGroup(
            Boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(Boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Boton4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        Boton4Layout.setVerticalGroup(
            Boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(Boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        grupoGenero.add(genero5);
        genero5.setText("Realismo mágico, filosofía");
        genero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(genero1)))
                .addGap(62, 62, 62))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genero5)
                    .addComponent(genero2)
                    .addComponent(genero4)
                    .addComponent(genero3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(genero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genero2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genero3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genero4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genero5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        showBooksPanel.setBackground(new java.awt.Color(14, 41, 84));

        showBooks.setFont(new java.awt.Font("Lexend Deca", 0, 14)); // NOI18N
        showBooks.setForeground(new java.awt.Color(153, 153, 153));
        showBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showBooks.setText("Mostrar todos los libros");
        showBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showBooksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showBooksMousePressed(evt);
            }
        });

        javax.swing.GroupLayout showBooksPanelLayout = new javax.swing.GroupLayout(showBooksPanel);
        showBooksPanel.setLayout(showBooksPanelLayout);
        showBooksPanelLayout.setHorizontalGroup(
            showBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showBooksPanelLayout.setVerticalGroup(
            showBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBooksPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLibroName)
                        .addGap(285, 285, 285))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLibroEditorial)
                                    .addComponent(txtLibroYear)
                                    .addComponent(txtLibroAutor))
                                .addGap(38, 38, 38)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLibroName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtLibroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtLibroYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtLibroEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero3ActionPerformed

    private void genero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero4ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void txtLibroNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroNameMousePressed
       if(txtLibroName.getText().equals("Nombre Del Libro")){
           txtLibroName.setText("");
       }
       
       if(txtLibroAutor.getText().equals("")){
           txtLibroAutor.setText("Autor Libro");
       }
       
       if(txtLibroYear.getText().equals("")){
           txtLibroYear.setText("Año De Lanzamiento");
       }
       
       if(txtLibroEditorial.getText().equals("")){
           txtLibroEditorial.setText("Editorial");
       }

    }//GEN-LAST:event_txtLibroNameMousePressed

    private void txtLibroEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroEditorialActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       
       if(txtLibroName.getText().equals("")){
           txtLibroName.setText("Nombre Del Libro");
       }
       
       if(txtLibroAutor.getText().equals("")){
           txtLibroAutor.setText("Autor Libro");
       }
       
       if(txtLibroYear.getText().equals("")){
           txtLibroYear.setText("Año De Lanzamiento");
       }
       
       if(txtLibroEditorial.getText().equals("")){
           txtLibroEditorial.setText("Editorial");
       }
       
    }//GEN-LAST:event_jPanel1MousePressed

    private void txtLibroYearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroYearMousePressed
        
               
       if(txtLibroName.getText().equals("")){
           txtLibroName.setText("Nombre Del Libro");
       }
       
       if(txtLibroAutor.getText().equals("")){
           txtLibroAutor.setText("Autor Libro");
       }
       
       if(txtLibroYear.getText().equals("Año De Lanzamiento")){
           txtLibroYear.setText("");
       }
       
       if(txtLibroEditorial.getText().equals("")){
           txtLibroEditorial.setText("Editorial");
       }
       
    }//GEN-LAST:event_txtLibroYearMousePressed

    private void txtLibroEditorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroEditorialMousePressed
               
       if(txtLibroName.getText().equals("")){
           txtLibroName.setText("Nombre Del Libro");
       }
       
       if(txtLibroAutor.getText().equals("")){
           txtLibroAutor.setText("Autor Libro");
       }
       
       if(txtLibroYear.getText().equals("")){
           txtLibroYear.setText("Año De Lanzamiento");
       }
       
       if(txtLibroEditorial.getText().equals("Editorial")){
           txtLibroEditorial.setText("");
       }
    }//GEN-LAST:event_txtLibroEditorialMousePressed

    private void txtLibroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroAutorActionPerformed
        
    }//GEN-LAST:event_txtLibroAutorActionPerformed

    private void txtLibroAutorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroAutorMousePressed
              
       if(txtLibroName.getText().equals("")){
           txtLibroName.setText("Nombre Del Libro");
       }
       
       if(txtLibroAutor.getText().equals("Autor Libro")){
           txtLibroAutor.setText("");
       }
       
       if(txtLibroYear.getText().equals("")){
           txtLibroYear.setText("Año De Lanzamiento");
       }
       
       if(txtLibroEditorial.getText().equals("")){
           txtLibroEditorial.setText("Editorial");
       }
    }//GEN-LAST:event_txtLibroAutorMousePressed

    private void showBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBooksMouseEntered
       showBooksPanel.setBackground(new Color (31, 110, 140));
       showBooks.setForeground(Color.BLACK);
    }//GEN-LAST:event_showBooksMouseEntered

    private void showBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBooksMouseExited
       showBooksPanel.setBackground(new Color (14, 41, 84));
       showBooks.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_showBooksMouseExited

    private void showBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBooksMousePressed
        mostrarTabla("");
    }//GEN-LAST:event_showBooksMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
    
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre Del Libro");
    modelo.addColumn("Generos");
    modelo.addColumn("Descripción");
    modelo.addColumn("Autor Del Libro");
    modelo.addColumn("Editorial");
    modelo.addColumn("Año De Lanzamiento");

    try (Connection guardarConexion = conexion.Conectar();
         PreparedStatement consulta = guardarConexion.prepareStatement(
                 "SELECT Nombre_Libro, Genero, Descripcion, Autor_libro, Editorial_libro, fecha_de_publicacion " +
                 "FROM LIBROS " +
                 "WHERE Nombre_Libro " +
                 "LIKE ?")) {

        consulta.setString(1, "%"+txtLibroName.getText()+"%");
        ResultSet resultadoDeConsulta = consulta.executeQuery();

        while (resultadoDeConsulta.next()) {
            Object[] datos = {
                resultadoDeConsulta.getString("Nombre_Libro"),
                resultadoDeConsulta.getString("Genero"),
                resultadoDeConsulta.getString("Descripcion"),
                resultadoDeConsulta.getString("Autor_libro"),
                resultadoDeConsulta.getString("Editorial_libro"),
                resultadoDeConsulta.getString("fecha_de_publicacion")
            };

            modelo.addRow(datos);
        }

        showTabla.setModel(modelo);
    }catch(SQLException ex){
        System.out.println(ex);
    }catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioGiu.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre Del Libro");
    modelo.addColumn("Generos");
    modelo.addColumn("Descripción");
    modelo.addColumn("Autor Del Libro");
    modelo.addColumn("Editorial");
    modelo.addColumn("Año De Lanzamiento");

    try (Connection guardarConexion = conexion.Conectar();
         PreparedStatement consulta = guardarConexion.prepareStatement(
                 "SELECT Nombre_Libro, Genero, Descripcion, Autor_libro, Editorial_libro, fecha_de_publicacion " +
                 "FROM LIBROS " +
                 "WHERE Autor_libro " +
                 "LIKE ?")) {

        consulta.setString(1, "%"+txtLibroAutor.getText()+"%");
        ResultSet resultadoDeConsulta = consulta.executeQuery();

        while (resultadoDeConsulta.next()) {
            Object[] datos = {
                resultadoDeConsulta.getString("Nombre_Libro"),
                resultadoDeConsulta.getString("Genero"),
                resultadoDeConsulta.getString("Descripcion"),
                resultadoDeConsulta.getString("Autor_libro"),
                resultadoDeConsulta.getString("Editorial_libro"),
                resultadoDeConsulta.getString("fecha_de_publicacion")
            };

            modelo.addRow(datos);
        }

        showTabla.setModel(modelo);
    }catch(SQLException ex){
        System.out.println(ex);
    }catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioGiu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre Del Libro");
    modelo.addColumn("Generos");
    modelo.addColumn("Descripción");
    modelo.addColumn("Autor Del Libro");
    modelo.addColumn("Editorial");
    modelo.addColumn("Año De Lanzamiento");

    try (Connection guardarConexion = conexion.Conectar();
         PreparedStatement consulta = guardarConexion.prepareStatement(
                 "SELECT Nombre_Libro, Genero, Descripcion, Autor_libro, Editorial_libro, fecha_de_publicacion " +
                 "FROM LIBROS " +
                 "WHERE fecha_de_publicacion " +
                 "LIKE ?")) {

        consulta.setString(1, "%"+txtLibroYear.getText()+"%");
        ResultSet resultadoDeConsulta = consulta.executeQuery();

        while (resultadoDeConsulta.next()) {
            Object[] datos = {
                resultadoDeConsulta.getString("Nombre_Libro"),
                resultadoDeConsulta.getString("Genero"),
                resultadoDeConsulta.getString("Descripcion"),
                resultadoDeConsulta.getString("Autor_libro"),
                resultadoDeConsulta.getString("Editorial_libro"),
                resultadoDeConsulta.getString("fecha_de_publicacion")
            };

            modelo.addRow(datos);
        }

        showTabla.setModel(modelo);
    }catch(SQLException ex){
        System.out.println(ex);
    }catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioGiu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MousePressed
    
    private String generoSeleccionado(){
        
        if(genero1.isSelected()){
            return genero1.getText();
        }
        
        if(genero2.isSelected()){
            return  genero2.getText();
        }
                
        if(genero3.isSelected()){
            return  genero3.getText();
        }
        
        if(genero4.isSelected()){
            return  genero4.getText();
        }
        
        if(genero5.isSelected()){
            return  genero5.getText();
        }
        
        return null;
    }
    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre Del Libro");
        modelo.addColumn("Generos");
        modelo.addColumn("Descripción");
        modelo.addColumn("Autor Del Libro");
        modelo.addColumn("Editorial");
        modelo.addColumn("Año De Lanzamiento");

        try (Connection guardarConexion = conexion.Conectar();
             PreparedStatement consulta = guardarConexion.prepareStatement(
                     "SELECT Nombre_Libro, Genero, Descripcion, Autor_libro, Editorial_libro, fecha_de_publicacion " +
                     "FROM LIBROS " +
                     "WHERE Editorial_libro " +
                     "LIKE ?")) {

            consulta.setString(1, "%"+txtLibroEditorial.getText()+"%");
            ResultSet resultadoDeConsulta = consulta.executeQuery();

            while (resultadoDeConsulta.next()) {
                Object[] datos = {
                    resultadoDeConsulta.getString("Nombre_Libro"),
                    resultadoDeConsulta.getString("Genero"),
                    resultadoDeConsulta.getString("Descripcion"),
                    resultadoDeConsulta.getString("Autor_libro"),
                    resultadoDeConsulta.getString("Editorial_libro"),
                    resultadoDeConsulta.getString("fecha_de_publicacion")
                };

                modelo.addRow(datos);
            }

            showTabla.setModel(modelo);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(UsuarioGiu.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre Del Libro");
        modelo.addColumn("Generos");
        modelo.addColumn("Descripción");
        modelo.addColumn("Autor Del Libro");
        modelo.addColumn("Editorial");
        modelo.addColumn("Año De Lanzamiento");

        try (Connection guardarConexion = conexion.Conectar();
             PreparedStatement consulta = guardarConexion.prepareStatement(
                     "SELECT Nombre_Libro, Genero, Descripcion, Autor_libro, Editorial_libro, fecha_de_publicacion " +
                     "FROM LIBROS " +
                     "WHERE Genero " +
                     "LIKE ?")) {

            consulta.setString(1, "%"+generoSeleccionado()+"%");
            ResultSet resultadoDeConsulta = consulta.executeQuery();

            while (resultadoDeConsulta.next()) {
                Object[] datos = {
                    resultadoDeConsulta.getString("Nombre_Libro"),
                    resultadoDeConsulta.getString("Genero"),
                    resultadoDeConsulta.getString("Descripcion"),
                    resultadoDeConsulta.getString("Autor_libro"),
                    resultadoDeConsulta.getString("Editorial_libro"),
                    resultadoDeConsulta.getString("fecha_de_publicacion")
                };

                modelo.addRow(datos);
            }

            showTabla.setModel(modelo);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(UsuarioGiu.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jLabel6MousePressed

    private void genero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero1ActionPerformed

    private void genero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero2ActionPerformed

    private void genero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioGiu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioGiu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioGiu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioGiu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioGiu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boton;
    private javax.swing.JPanel Boton1;
    private javax.swing.JPanel Boton2;
    private javax.swing.JPanel Boton3;
    private javax.swing.JPanel Boton4;
    private javax.swing.JRadioButton genero1;
    private javax.swing.JRadioButton genero2;
    private javax.swing.JRadioButton genero3;
    private javax.swing.JRadioButton genero4;
    private javax.swing.JRadioButton genero5;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel showBooks;
    private javax.swing.JPanel showBooksPanel;
    private javax.swing.JTable showTabla;
    public javax.swing.JLabel txtApellido;
    private javax.swing.JTextField txtLibroAutor;
    private javax.swing.JTextField txtLibroEditorial;
    private javax.swing.JTextField txtLibroName;
    private javax.swing.JTextField txtLibroYear;
    public javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables
}
