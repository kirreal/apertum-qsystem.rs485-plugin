/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TestRS.java
 *
 * Created on May 5, 2012, 3:43:53 PM
 */
package ru.apertum.cbrs485.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import ru.evgenic.rxtx.serialPort.ISerialPort;
import ru.evgenic.rxtx.serialPort.RxtxSerialPort;

/**
 *
 * @author Evgeniy Egorov
 */
public class TestRS extends javax.swing.JFrame {

    /** Creates new form TestRS */
    public TestRS() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonSend = new javax.swing.JButton();
        textFieldData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        spinnerAdress = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spinnerBlink = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        comboBoxSpeed = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        comboBoxBits = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        checkBoxParity = new javax.swing.JCheckBox();
        comboBoxStopBits = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        textFieldPortName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buttonRefesh = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Тест RS гирлянды клиентских табло");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Заслать в порт"));

        buttonSend.setText("Отослать");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        jLabel5.setText("<html>Введите в поле строку для отсыла в порт.<br> первым байтом едет 1 - начало сообшения,<br> второй байт это адрес табло 32-127,<br> третий байт это режим мигания 32-не мигаем, 33-мигаем постоянно, х=[34, 127]-мигнем столько и просто показываем ,<br> потом какое-то количество байт-34 - тело сообщения,<br> в конце завершающий байтик - 7");

        textAreaLog.setColumns(20);
        textAreaLog.setRows(5);
        jScrollPane1.setViewportView(textAreaLog);

        jLabel6.setText("1");

        spinnerAdress.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)127), Byte.valueOf((byte)1)));

        jLabel7.setText("7");

        spinnerBlink.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)127), Byte.valueOf((byte)1)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(buttonSend, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerBlink, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spinnerAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(spinnerBlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Параметры порта"));

        comboBoxSpeed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9600", "14400", "19200", "38400", "57600", "115200", "128000", "921600" }));

        jLabel1.setText("Скорость порта");

        comboBoxBits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8" }));

        jLabel2.setText("Биты данных");

        checkBoxParity.setText("Четность");

        comboBoxStopBits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));

        jLabel3.setText("Стоповые биты");

        textFieldPortName.setText("Обнови!!!");

        jLabel4.setText("Имя порта");

        buttonRefesh.setText("Обновить");
        buttonRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefeshActionPerformed(evt);
            }
        });

        buttonSave.setText("Сохранить");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldPortName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxParity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxBits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxSpeed, 0, 89, Short.MAX_VALUE)
                            .addComponent(comboBoxStopBits, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonRefesh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(buttonSave)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxParity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxStopBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPortName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRefesh)
                    .addComponent(buttonSave))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        textAreaLog.setText("");
        textAreaLog.append("Содаем порт..");
        final ISerialPort port;
        try {
            port = new RxtxSerialPort(textFieldPortName.getText());
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this,
                    "Порт не создался. " + ex,
                    "Отсыл",
                    JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(ex);
        }
        textAreaLog.append("  OK\n");
        port.setSpeed(Integer.parseInt((String) comboBoxSpeed.getSelectedItem()));
        port.setDataBits(Integer.parseInt((String) comboBoxBits.getSelectedItem()));
        port.setParity(checkBoxParity.isSelected() ? 1 : 0);
        port.setStopBits(Integer.parseInt((String) comboBoxStopBits.getSelectedItem()));


        final byte[] mess = ("123" + textFieldData.getText() + "e").getBytes();
        mess[0] = 1;
        mess[1] = (Byte) spinnerAdress.getModel().getValue();
        mess[2] = (Byte) spinnerBlink.getModel().getValue();
        mess[mess.length - 1] = 7;

        textAreaLog.append("Отсылаем..");
        try {
            port.send(mess);
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this,
                    "В порт не отослалось. " + ex,
                    "Отсыл",
                    JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(ex);
        }
        textAreaLog.append("  OK\n");

    }//GEN-LAST:event_buttonSendActionPerformed

    private void buttonRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefeshActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Выберите файл конфигурации");
        fc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return !f.isFile() || f.getAbsolutePath().endsWith(".property");
            }

            @Override
            public String getDescription() {
                return "Файлы свойств (*.cfg)";
            }
        });


        fc.setCurrentDirectory(new File("config"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            FileInputStream fis;
            try {
                propFile = fc.getSelectedFile();
                fis = new FileInputStream(propFile);
                props = new Properties();
                props.load(fis);
                fis.close();
            } catch (IOException ex) {
                System.err.println(ex);
                return;
            }
            textFieldPortName.setText(props.getProperty("port.name", "COM1"));
            checkBoxParity.setSelected(props.getProperty("port.parity", "0").equals("1"));
            comboBoxSpeed.setSelectedItem(props.getProperty("port.speed", "6900"));
            comboBoxBits.setSelectedItem(props.getProperty("port.bits", "8"));
            comboBoxStopBits.setSelectedItem(props.getProperty("port.stopbits", "1"));
        }
    }//GEN-LAST:event_buttonRefeshActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if (propFile != null) {
            try {
                final FileOutputStream out = new FileOutputStream(propFile);

                props.setProperty("port.name", textFieldPortName.getText());
                props.setProperty("port.parity", checkBoxParity.isSelected() ? "1" : "0");
                props.setProperty("port.speed", comboBoxSpeed.getSelectedItem().toString());
                props.setProperty("port.bits", comboBoxBits.getSelectedItem().toString());
                props.setProperty("port.stopbits", comboBoxStopBits.getSelectedItem().toString());
                props.store(out, "Save from test app.");
            } catch (IOException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this,
                        "Файл конфигурации НЕ сохранен. " + ex,
                        "Сохранение",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_buttonSaveActionPerformed
    File propFile = null;
    Properties props = null;

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
            java.util.logging.Logger.getLogger(TestRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TestRS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRefesh;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSend;
    private javax.swing.JCheckBox checkBoxParity;
    private javax.swing.JComboBox comboBoxBits;
    private javax.swing.JComboBox comboBoxSpeed;
    private javax.swing.JComboBox comboBoxStopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerAdress;
    private javax.swing.JSpinner spinnerBlink;
    private javax.swing.JTextArea textAreaLog;
    private javax.swing.JTextField textFieldData;
    private javax.swing.JTextField textFieldPortName;
    // End of variables declaration//GEN-END:variables
}