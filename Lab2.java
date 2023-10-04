/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;
import javax.swing.*;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author sujiitramurukeshan
 */
public class Lab2 extends javax.swing.JFrame {

    /**
     * Creates new form Lab2
     */
    public Lab2() {
        initComponents();
         submitButton.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bgPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        fNameInvalid = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        lNameInvalid = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        ageInvalid = new javax.swing.JLabel();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        notSayRadio = new javax.swing.JRadioButton();
        emailTextField = new javax.swing.JTextField();
        emailInvalid = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox<>();
        countryInvalid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        genderInvalid = new javax.swing.JLabel();
        msgInvalid = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        imgButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setBackground(new java.awt.Color(204, 204, 255));
        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setText("Customer Registration Form");

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        ageLabel.setText("Age:");

        genderLabel.setText("Gender:");

        emailLabel.setText("E-mail:");

        countryLabel.setText("Country:");

        messageLabel.setText("Message:");

        fNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameTextFieldKeyTyped(evt);
            }
        });

        fNameInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        fNameInvalid.setForeground(new java.awt.Color(255, 0, 51));

        lNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyTyped(evt);
            }
        });

        lNameInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lNameInvalid.setForeground(new java.awt.Color(255, 0, 51));

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });

        ageInvalid.setBackground(new java.awt.Color(204, 204, 255));
        ageInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        ageInvalid.setForeground(new java.awt.Color(255, 0, 51));

        buttonGroup1.add(femaleRadio);
        femaleRadio.setText("Female");

        buttonGroup1.add(maleRadio);
        maleRadio.setText("Male");

        buttonGroup1.add(notSayRadio);
        notSayRadio.setText("Prefer not to say");

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
        });
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyTyped(evt);
            }
        });

        emailInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        emailInvalid.setForeground(new java.awt.Color(255, 0, 51));

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canada", "China", "India", "Japan", "Korea", "USA" }));
        countryComboBox.setSelectedIndex(-1);
        countryComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryComboBoxFocusLost(evt);
            }
        });
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });
        countryComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                countryComboBoxKeyReleased(evt);
            }
        });

        countryInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        countryInvalid.setForeground(new java.awt.Color(255, 0, 51));

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        messageTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                messageTextAreaFocusGained(evt);
            }
        });
        messageTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                messageTextAreaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(messageTextArea);

        jLabel2.setText("Please upload Photo");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        genderInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        genderInvalid.setForeground(new java.awt.Color(255, 0, 51));

        msgInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        msgInvalid.setForeground(new java.awt.Color(255, 0, 51));

        picLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imgButton.setText("Choose Image");
        imgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameLabel)
                    .addComponent(lNameLabel)
                    .addComponent(ageLabel)
                    .addComponent(genderLabel)
                    .addComponent(emailLabel)
                    .addComponent(countryLabel)
                    .addComponent(messageLabel)
                    .addComponent(jLabel2))
                .addGap(109, 109, 109)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(emailTextField)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(countryInvalid))
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(fNameTextField))
                                .addGap(18, 18, 18)
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgPanelLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel1))
                                    .addGroup(bgPanelLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(msgInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ageInvalid))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                                .addComponent(femaleRadio)
                                .addGap(18, 18, 18)
                                .addComponent(maleRadio)
                                .addGap(18, 18, 18)
                                .addComponent(notSayRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imgButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(titleLabel))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(submitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addGap(44, 44, 44)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameLabel))
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageInvalid)
                    .addComponent(ageLabel))
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(femaleRadio)
                    .addComponent(maleRadio)
                    .addComponent(notSayRadio)
                    .addComponent(genderInvalid))
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryInvalid))
                .addGap(17, 17, 17)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgInvalid))
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(imgButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                .addComponent(submitButton)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String sMsg = "Profile successfully registered for " +fNameTextField.getText()+" "+lNameTextField.getText() 
                + " of age " + ageTextField.getText()+" yrs \nfrom "+ countryComboBox.getSelectedItem().toString()+" with e-mail id "+emailTextField.getText()+" and profile message as \n\""+messageTextArea.getText()+"\"";
        JOptionPane.showMessageDialog(rootPane, sMsg, "Profile Created successfully!!", INFORMATION_MESSAGE,picLabel.getIcon());
    }//GEN-LAST:event_submitButtonActionPerformed
                            

    private void fNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_fNameTextFieldKeyTyped

    private void lNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_lNameTextFieldKeyTyped

    private void emailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isUpperCase(keych))
        {
            evt.setKeyChar(Character.toLowerCase(keych));
        }
    }//GEN-LAST:event_emailTextFieldKeyTyped

    private void fNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextFieldKeyReleased
        String sfn = fNameTextField.getText();
        boolean bflag=sfn.matches("^[A-Z ]*");
        if(bflag)
        {
            fNameInvalid.setVisible(false);    
        }
        else
        {
            fNameInvalid.setText("Please enter only alphabets");
            fNameInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_fNameTextFieldKeyReleased

    private void lNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyReleased
        String sfn = lNameTextField.getText();
        boolean bflag=sfn.matches("^[A-Z ]*");
        if(bflag)
        {
            lNameInvalid.setVisible(false);    
        }
        else
        {
            lNameInvalid.setText("Please enter only alphabets");
            lNameInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_lNameTextFieldKeyReleased

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
        String sage = ageTextField.getText();
            boolean bageflag = sage.matches("^[0-9]*");
            if(bageflag)
            {
                ageInvalid.setVisible(false); 
            }
            else
            {
                ageInvalid.setText("Please enter only alphabets");
                ageInvalid.setVisible(true);
            }
            checkinputs();
    }//GEN-LAST:event_ageTextFieldKeyReleased

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        String seml = emailTextField.getText();
            boolean bemlflag = seml.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
            if(bemlflag)
            {
                emailInvalid.setVisible(false);   
            }
            else
            {
                emailInvalid.setText("Please enter a valid email address");
                emailInvalid.setVisible(true);
            }
            checkinputs();
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void messageTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTextAreaKeyReleased
        checkinputs();
    }//GEN-LAST:event_messageTextAreaKeyReleased

    private void countryComboBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countryComboBoxKeyReleased
        checkinputs();
    }//GEN-LAST:event_countryComboBoxKeyReleased

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        checkinputs();
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        boolean bgenderflag = femaleRadio.isSelected() ||maleRadio.isSelected() ||notSayRadio.isSelected() ;
        if(bgenderflag)
        {
            genderInvalid.setVisible(false); 
            
        }
        else
        {
            genderInvalid.setText("Please choose one");
            genderInvalid.setVisible(true);
        }
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void messageTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageTextAreaFocusGained
        int scntryflg = countryComboBox.getSelectedIndex();
         if(scntryflg!=-1)
        {
            countryInvalid.setVisible(false);
            String msg= messageTextArea.getText();
            if(msg.isBlank()){
            msgInvalid.setText("Please type the message");
            msgInvalid.setVisible(true);
            }
            else{
                msgInvalid.setVisible(false);
            }
            
        }
        else
        {
            countryInvalid.setText("Please choose one");
            countryInvalid.setVisible(true);
        }
    }//GEN-LAST:event_messageTextAreaFocusGained

    private void countryComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryComboBoxFocusLost
        int scntryflg = countryComboBox.getSelectedIndex();
         if(scntryflg!=-1)
        {
            countryInvalid.setVisible(false);    
        }
        else
        {
            countryInvalid.setText("Please choose one");
            countryInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_countryComboBoxFocusLost

    private void messageTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTextAreaKeyTyped
        String msg= messageTextArea.getText();
            if(msg.isBlank()){
            msgInvalid.setText("Please type the message");
            msgInvalid.setVisible(true);
            }
            else{
                msgInvalid.setVisible(false);
            }
    }//GEN-LAST:event_messageTextAreaKeyTyped
    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
    Graphics2D g2d = (Graphics2D) bi.createGraphics();
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(img, 0, 0, w, h, null);
    g2d.dispose();
    return bi;
}
    private void imgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgButtonActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    String filename = f.getAbsolutePath();
    try {
        ImageIcon imageicon=new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(filename))));//get the image from file chooser and scale it to match JLabel size
        picLabel.setIcon(imageicon);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    checkinputs();
    }//GEN-LAST:event_imgButtonActionPerformed
    public void checkinputs(){
        boolean bemlflag = emailTextField.getText().matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        boolean bageflag = ageTextField.getText().matches("^[0-9]*");
        boolean blnflag=lNameTextField.getText().matches("^[A-Z ]*");
        boolean bflag=fNameTextField.getText().matches("^[A-Z ]*");
        boolean bgenderflag = femaleRadio.isSelected() ||maleRadio.isSelected() ||notSayRadio.isSelected() ;
        int scntryflg = countryComboBox.getSelectedIndex();
        String smsg= messageTextArea.getText();
        Icon proImg= picLabel.getIcon();
        if(bemlflag && bageflag && blnflag && bflag && bgenderflag && !smsg.isBlank() && !(scntryflg==-1) && (proImg!=null))
        {
            submitButton.setEnabled(true);
        }
        else{
            submitButton.setEnabled(false);          
        }
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageInvalid;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JPanel bgPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JLabel countryInvalid;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel emailInvalid;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fNameInvalid;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderInvalid;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton imgButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNameInvalid;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel msgInvalid;
    private javax.swing.JRadioButton notSayRadio;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
