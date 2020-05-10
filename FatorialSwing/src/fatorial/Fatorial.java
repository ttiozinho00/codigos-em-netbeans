package fatorial;

public class Fatorial extends javax.swing.JFrame {

    public Fatorial() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFat = new javax.swing.JLabel();
        txtN = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFat.setForeground(new java.awt.Color(153, 0, 0));
        lblFat.setText("1");

        txtN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 33, 1));
        txtN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtNStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("!=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFat)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFat)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtNStateChanged
        int n = Integer.parseInt(txtN.getValue().toString());
        int f = 1;
        int c = n;
        
        while(c >= 1)
        {
            f *= c;
            c--;
        }
        lblFat.setText(Integer.toString((int) f));
    }//GEN-LAST:event_txtNStateChanged

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Fatorial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFat;
    private javax.swing.JSpinner txtN;
    // End of variables declaration//GEN-END:variables
}
