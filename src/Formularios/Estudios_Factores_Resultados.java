/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Abyss
 */
public class Estudios_Factores_Resultados extends javax.swing.JFrame {
    public Connection con = null;
    public Statement st=null;
    public String bd = "Mastologia";   
    //asegurate de cambiar esto por el nombre tu usuario en mysql
    public String login = "root"; 
    //aqui escribe la contraseña de ese usuario
    public String password = "luna16";
    public String url = "jdbc:mysql://localhost/"+bd;
    /** Creates new form JExploacion_Estudios */
    /**
     * Creates new form Estudios_Factores_Resultados
     */
    public Estudios_Factores_Resultados() {
        initComponents();
        
        java.util.Calendar fecha = Calendar.getInstance();
              
        
        JDFechaUltra.setDate(fecha.getTime());
        JDFechaMasto.setDate(fecha.getTime());
        try {
        
        Class.forName("org.gjt.mm.mysql.Driver");
        con = DriverManager.getConnection(url, login, password);
        if (con != null)
        {
            System.out.println("Yeah, hemos conectado con  "+url+" ... Ok");
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //conn.close();
        }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Rayos!!! Hubo un problema al conectar con la base" + url);
        }catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDFechaUltra = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        chk_Mamas_Densas = new javax.swing.JCheckBox();
        chk_Protesis = new javax.swing.JCheckBox();
        chk_CuerposExtraños = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        chk_Benigno = new javax.swing.JCheckBox();
        chk_Maligno = new javax.swing.JCheckBox();
        chk_Atipia = new javax.swing.JCheckBox();
        chk_Estudio_Mastologia = new javax.swing.JCheckBox();
        chk_Estudio_Ultrasonido = new javax.swing.JCheckBox();
        chk_BIRADS_Masto = new javax.swing.JCheckBox();
        chk_BIRADS_Ultra = new javax.swing.JCheckBox();
        chk_No_estudios = new javax.swing.JCheckBox();
        JDFechaMasto = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Factores de Riesgo Asociado");

        chk_Mamas_Densas.setText("Mamas Densas");

        chk_Protesis.setText("Protesis");

        chk_CuerposExtraños.setText("Cuerpos extraños en mama");

        jLabel2.setText("Resultado de Patologia");

        chk_Benigno.setText("Benigno");

        chk_Maligno.setText("Maligno");

        chk_Atipia.setText("Atipia");

        chk_Estudio_Mastologia.setText("Mastografia");

        chk_Estudio_Ultrasonido.setText("Ultrasonido");

        chk_BIRADS_Masto.setText("BIRADS");

        chk_BIRADS_Ultra.setText("BIRADS");

        chk_No_estudios.setText("No hay estudios");

        jLabel7.setText("Estudios");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk_Estudio_Ultrasonido)
                                .addGap(18, 18, 18)
                                .addComponent(JDFechaUltra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk_Estudio_Mastologia)
                                .addGap(18, 18, 18)
                                .addComponent(JDFechaMasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk_BIRADS_Masto)
                                .addGap(18, 18, 18)
                                .addComponent(chk_No_estudios))
                            .addComponent(chk_BIRADS_Ultra)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk_Mamas_Densas)
                        .addGap(18, 18, 18)
                        .addComponent(chk_Protesis)
                        .addGap(18, 18, 18)
                        .addComponent(chk_CuerposExtraños))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk_Benigno)
                        .addGap(18, 18, 18)
                        .addComponent(chk_Maligno)
                        .addGap(18, 18, 18)
                        .addComponent(chk_Atipia))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_Estudio_Mastologia)
                    .addComponent(chk_BIRADS_Masto)
                    .addComponent(chk_No_estudios)
                    .addComponent(JDFechaMasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk_Estudio_Ultrasonido)
                        .addComponent(JDFechaUltra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chk_BIRADS_Ultra))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_Mamas_Densas)
                    .addComponent(chk_Protesis)
                    .addComponent(chk_CuerposExtraños))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_Benigno)
                    .addComponent(chk_Maligno)
                    .addComponent(chk_Atipia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        int MASTOGRAFIA=0, ULTRASONIDO=0, BIRADSMASTO=0, BIRADSULTRA=0, NOESTUDIOS=0,maxId=0;
        String FECHAMASTO, FECHAULTRA;
        
        int MAMASDENSAS=0, PROTESIS=0, CUERPOEXTRAOMAMA=0;
        
        int RESULTPATOBENIGNO=0, RESULTPATOMALIGNO=0, RESULTPATOATIPIA=0;
         
        String FECHA_CITA;
        int RESULTADOPATBENIGNA=0, RESULTADOSOSPECHOSA=0, ENVIO_ONCO=0, ENVIO_CLIN_PAT_BENIGNA=0, ENVIO_SEGUIMIENTO_ANUAL=0;       
        
        DateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
        
        if (chk_Estudio_Mastologia.isSelected() == true) { MASTOGRAFIA = 1;  }
        if (chk_Estudio_Ultrasonido.isSelected() == true) { ULTRASONIDO = 1;  }
        if (chk_BIRADS_Masto.isSelected() == true) { BIRADSMASTO = 1; }
        if (chk_BIRADS_Ultra.isSelected() == true) { BIRADSULTRA = 1; }
        if (chk_No_estudios.isSelected() == true) { NOESTUDIOS = 1; }
         FECHAMASTO = myformat.format(JDFechaMasto.getDate());
         FECHAULTRA = myformat.format(JDFechaUltra.getDate());
        
        if (chk_Mamas_Densas.isSelected() == true) { MAMASDENSAS = 1; }
        if (chk_Protesis.isSelected() == true) { PROTESIS = 1; }
        if (chk_CuerposExtraños.isSelected() == true) { CUERPOEXTRAOMAMA = 1; }
        
        if (chk_Benigno.isSelected() == true) { RESULTPATOBENIGNO = 1; }
        if (chk_Maligno.isSelected() == true) { RESULTPATOMALIGNO = 1; }
        if (chk_Atipia.isSelected() == true) { RESULTPATOATIPIA = 1; }
                
        try{
            Statement sentencia = null;
            ResultSet resultados = null;
            sentencia=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            resultados = sentencia.executeQuery("SELECT MAX(`IdDatos_Paciente`) as maxid FROM `Datos_Paciente`" );
//            
            while( resultados.next() )
            {
                maxId = resultados.getInt("maxid");
            }
            String query = "INSERT INTO `Estudios`(`IdDatos_PacienteFK`, `Mastografia`, `Ultrasonido`, `Fecha_Mastografia`, `Fecha_Ultrasonido`, `BIRADS_Mastografia`, `BIRADS_Ultrasonido`, `No_Estudio`) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, maxId);
            preparedStmt.setInt(2, MASTOGRAFIA);
            preparedStmt.setInt(3, ULTRASONIDO);
            preparedStmt.setString(4, FECHAMASTO);
            preparedStmt.setString(5, FECHAULTRA);
            preparedStmt.setInt(6, BIRADSMASTO);
            preparedStmt.setInt(7, BIRADSULTRA);
            preparedStmt.setInt(8, NOESTUDIOS);
            
            preparedStmt.execute();  
          

            query = "INSERT INTO `Factores`(`IdDatos_PacienteFK`, `Mamas_Densas`, `Protesis`, `Cuerpos_Extraños`, `Benigno`, `Maligno`, `Atipia`) "
                    + "VALUES (?,?,?,?,?,?,?)";
            preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, maxId);
            preparedStmt.setInt(2, MAMASDENSAS);
            preparedStmt.setInt(3, PROTESIS);
            preparedStmt.setInt(4, CUERPOEXTRAOMAMA);
            preparedStmt.setInt(5, RESULTPATOBENIGNO);
            preparedStmt.setInt(6, RESULTPATOMALIGNO);
            preparedStmt.setInt(7, RESULTPATOATIPIA);
            preparedStmt.execute();  
              
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Rayos!!! Hubo un problema al conectar con la base");
        }    

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Estudios_Factores_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudios_Factores_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudios_Factores_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudios_Factores_Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudios_Factores_Resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker JDFechaMasto;
    private org.jdesktop.swingx.JXDatePicker JDFechaUltra;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chk_Atipia;
    private javax.swing.JCheckBox chk_BIRADS_Masto;
    private javax.swing.JCheckBox chk_BIRADS_Ultra;
    private javax.swing.JCheckBox chk_Benigno;
    private javax.swing.JCheckBox chk_CuerposExtraños;
    private javax.swing.JCheckBox chk_Estudio_Mastologia;
    private javax.swing.JCheckBox chk_Estudio_Ultrasonido;
    private javax.swing.JCheckBox chk_Maligno;
    private javax.swing.JCheckBox chk_Mamas_Densas;
    private javax.swing.JCheckBox chk_No_estudios;
    private javax.swing.JCheckBox chk_Protesis;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
