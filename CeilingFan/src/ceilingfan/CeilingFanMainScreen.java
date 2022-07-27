package ceilingfan;
import javax.swing.JOptionPane;

/**
 * @author Mike Wilson
 * @date 2022/07/26
 */
public class CeilingFanMainScreen extends javax.swing.JFrame {
    
    //Variables
    public int directionState = 1;
    public int speed = 0;
    public final int FORWARD = 1;
    public final int BACKWARD = 2;
    public Thread t = new Thread(new Runnable() {
            @Override
            public void run(){
                while(true)
                {
                    switch(directionState){
                        case 1:
                            //loop to fill progress bar
                            for(int i = 0; i<=100; i+=(speed*2)){
                                //if fan is off, change direction immediately
                                //else finish cycle before changing direction
                                if(speed==0){
                                    i=100;
                                    break;
                                }
                                try{
                                    pgrsSpinningSpeed.setValue(i);
                                    Thread.sleep(50);
                                } catch(Exception ex) {
                                    JOptionPane.showMessageDialog(null, "Errors Ahoy!");
                                }
                            }
                            break;
                        case 2:
                            //loop to fill progress bar
                            for(int i = 100; i>=0; i-=(speed*2)){
                                //if fan is off, change direction immediately
                                //else finish cycle before changing direction
                                if(speed==0){
                                    i=0;
                                    break;
                                }
                                try{
                                    pgrsSpinningSpeed.setValue(i);
                                    Thread.sleep(50);
                                } catch(Exception ex) {
                                    JOptionPane.showMessageDialog(null, "Errors Ahoy!");
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        });

    public CeilingFanMainScreen() {
        initComponents();
        
        //set label text on startup
        lblSpeed.setText("Speed:  " + speed);
        lblDirection.setText("Direction: Forward");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgrsSpinningSpeed = new javax.swing.JProgressBar();
        lblDirection = new javax.swing.JLabel();
        btnSpeedUp = new javax.swing.JButton();
        btnSlowDown = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblSpeed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDirection.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblDirection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDirection.setText("Direction: ");

        btnSpeedUp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSpeedUp.setText("Speed");
        btnSpeedUp.setName("btnSpeedUp"); // NOI18N
        btnSpeedUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                speedUp(evt);
            }
        });

        btnSlowDown.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSlowDown.setText("Change Direction");
        btnSlowDown.setName("btnSlowDown"); // NOI18N
        btnSlowDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slowDown(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Ceiling Fan Application");

        lblSpeed.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpeed.setText("Speed: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgrsSpinningSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSlowDown, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(btnSpeedUp, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pgrsSpinningSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpeedUp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSlowDown, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );

        pgrsSpinningSpeed.getAccessibleContext().setAccessibleName("Spinning Bar");
        btnSpeedUp.getAccessibleContext().setAccessibleName("btnSpeedUp");
        btnSlowDown.getAccessibleContext().setAccessibleName("btnSlowDown");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void speedUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speedUp
        try
        {
            //if max speed, set 'off'
            //else increase speed
            if(speed == 3)
                speed = 0;
            else
                speed += 1;
            
            //only start thread if it's not already started
            if(!t.isAlive()){
                t.start();
            }
            
            //set label text
            lblSpeed.setText("Speed:  " + speed);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Errors Ahoy!");
        }
    }//GEN-LAST:event_speedUp

    private void slowDown(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slowDown
         try
        {
            //logic to know what direction to set the fan
            switch(directionState){
                case FORWARD:
                    directionState = BACKWARD;
                    lblDirection.setText("Direction: Backward");
                    break;
                case BACKWARD:
                    directionState = FORWARD;
                    lblDirection.setText("Direction: Forward");
                    break;
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Errors Ahoy!");
        }
    }//GEN-LAST:event_slowDown
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CeilingFanMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CeilingFanMainScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSlowDown;
    private javax.swing.JButton btnSpeedUp;
    private javax.swing.JLabel lblDirection;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JProgressBar pgrsSpinningSpeed;
    // End of variables declaration//GEN-END:variables
}
