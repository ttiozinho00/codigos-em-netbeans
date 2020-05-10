
package Classes;

import java.util.Arrays;
import javax.swing.DefaultListModel;

public class Vetor extends javax.swing.JFrame 
{

   int vetor[] = new int[5];
   DefaultListModel lista = new DefaultListModel();
   int selecionado = 0;

    public Vetor() 
    {
        initComponents();

        for(int c = 0; c <vetor.length; c++)
        {
            lista.addElement(vetor[c]);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() 
    {

        txtNum = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnOrdem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelecionado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnRemoveActionPerformed(evt);
            }
        });

        btnOrdem.setText("Ordemar");
        btnOrdem.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnOrdemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Vetor");

        lblSelecionado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelecionado.setText("[0]");

        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdem)
                            .addComponent(btnRemove))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelecionado)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(jLabel1)
                    .addComponent(lblSelecionado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) 
    {
        vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
        lista.removeAllElements();

        for(int c = 0; c <vetor.length; c++)
        {
            lista.addElement(vetor[c]);
        }
    }

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) 
    {
        selecionado = lstVetor.getSelectedIndex();
        lblSelecionado.setText("("+ selecionado +")");
    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) 
    {
        vetor[selecionado] = 0;
        lista.removeAllElements();

        for(int c = 0; c <vetor.length; c++)
        {
            lista.addElement(vetor[c]);
        }
    }

    private void btnOrdemActionPerformed(java.awt.event.ActionEvent evt) 
    {
        Arrays.sort(vetor);
        lista.removeAllElements();

        for(int c = 0; c <vetor.length; c++)
        {
            lista.addElement(vetor[c]);
        }
    }
   
    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(() -> {new Vetor().setVisible(true);});
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrdem;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionado;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner txtNum;
}
