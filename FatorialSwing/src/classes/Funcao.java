package classes;

public class Funcao extends javax.swing.JFrame 
{

    public Funcao() 
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() 
    {

        txtNum = new javax.swing.JSpinner();
        btnBot = new javax.swing.JButton();
        lblFormula = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBot.setText("<html><strong>!</strong></html>");
        btnBot.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnBotActionPerformed(evt);
            }
        });

        lblFormula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFormula.setForeground(new java.awt.Color(204, 0, 0));
        lblFormula.setText("Fórmula");

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(153, 0, 153));
        lblResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFormula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormula)
                    .addComponent(lblResultado))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnBotActionPerformed(java.awt.event.ActionEvent evt) 
    {
        int n = Integer.parseInt(txtNum.getValue().toString());
        Fatorial f = new Fatorial();
        f.setValor(n);
        lblFormula.setText(f.getFomula());
        lblResultado.setText(Integer.toString(f.getFatorial()));   
    }

    public static void main(String args[]) 
    {
      
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> { new Funcao().setVisible(true); });
    }

    private javax.swing.JButton btnBot;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSpinner txtNum;

    private void setValor(int n) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
