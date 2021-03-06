/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sociepka
 */
public class frmFactures extends javax.swing.JDialog {

    /**
     * Creates new form frmPaiment
     */
    public frmFactures(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
public frmFactures()  {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        quitter = new javax.swing.JMenuItem();
        donnees = new javax.swing.JMenu();
        stages = new javax.swing.JMenuItem();
        entreprises = new javax.swing.JMenuItem();
        types = new javax.swing.JMenuItem();
        evenements = new javax.swing.JMenu();
        inscription = new javax.swing.JMenuItem();
        absence = new javax.swing.JMenuItem();
        paiement = new javax.swing.JMenuItem();
        affichage = new javax.swing.JMenu();
        barreoutils = new javax.swing.JMenu();
        barreetat = new javax.swing.JMenuItem();
        fenetre = new javax.swing.JMenu();
        encascade = new javax.swing.JMenuItem();
        moshorizontale = new javax.swing.JMenuItem();
        mosverticale = new javax.swing.JMenuItem();
        reorganisericones = new javax.swing.JMenuItem();
        interrogation = new javax.swing.JMenu();
        sommaire = new javax.swing.JMenuItem();
        aidesur = new javax.swing.JMenuItem();
        aproposde = new javax.swing.JMenuItem();

        jMenuItem1.setText("TEST");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factures impayées");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Ikea", "02/01/2016", "1000"},
                {"2", "Cultura", "18/04/2016", "2000"},
                {"3", "Furet", "23/05/2016", "350"},
                {"4", "Fnac", "14/11/2015", "1200"}
            },
            new String [] {
                "No", "Raison sociale", "Date", "Montant"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        fichier.setText("Fichier");

        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        fichier.add(quitter);

        jMenuBar1.add(fichier);

        donnees.setText("Données");

        stages.setText("Stages");
        stages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stagesActionPerformed(evt);
            }
        });
        donnees.add(stages);

        entreprises.setText("Entreprises");
        donnees.add(entreprises);

        types.setText("Types");
        donnees.add(types);

        jMenuBar1.add(donnees);

        evenements.setText("Evenements");

        inscription.setText("Inscription");
        evenements.add(inscription);

        absence.setText("Absence");
        evenements.add(absence);

        paiement.setText("Paiement");
        evenements.add(paiement);

        jMenuBar1.add(evenements);

        affichage.setText("Affichage");

        barreoutils.setText("Barre d'outils");
        affichage.add(barreoutils);

        barreetat.setText("Barre d'état");
        affichage.add(barreetat);

        jMenuBar1.add(affichage);

        fenetre.setText("Fenêtre");

        encascade.setText("En cascade");
        fenetre.add(encascade);

        moshorizontale.setText("Mosaique horizontale");
        moshorizontale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moshorizontaleActionPerformed(evt);
            }
        });
        fenetre.add(moshorizontale);

        mosverticale.setText("Mosaique verticale");
        fenetre.add(mosverticale);

        reorganisericones.setText("Réorganiser les icônes");
        fenetre.add(reorganisericones);

        jMenuBar1.add(fenetre);

        interrogation.setText("?");

        sommaire.setText("Sommaire");
        sommaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sommaireActionPerformed(evt);
            }
        });
        interrogation.add(sommaire);

        aidesur.setText("AIde sur...");
        interrogation.add(aidesur);

        aproposde.setText("A propos de");
        interrogation.add(aproposde);

        jMenuBar1.add(interrogation);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitterActionPerformed

    private void stagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stagesActionPerformed

    private void moshorizontaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moshorizontaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moshorizontaleActionPerformed

    private void sommaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sommaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sommaireActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmFactures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFactures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFactures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFactures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmFactures dialog = null;
                try {
                    dialog = new frmFactures(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(frmFactures.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem absence;
    private javax.swing.JMenu affichage;
    private javax.swing.JMenuItem aidesur;
    private javax.swing.JMenuItem aproposde;
    private javax.swing.JMenuItem barreetat;
    private javax.swing.JMenu barreoutils;
    private javax.swing.JMenu donnees;
    private javax.swing.JMenuItem encascade;
    private javax.swing.JMenuItem entreprises;
    private javax.swing.JMenu evenements;
    private javax.swing.JMenu fenetre;
    private javax.swing.JMenu fichier;
    private javax.swing.JMenuItem inscription;
    private javax.swing.JMenu interrogation;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem moshorizontale;
    private javax.swing.JMenuItem mosverticale;
    private javax.swing.JMenuItem paiement;
    private javax.swing.JMenuItem quitter;
    private javax.swing.JMenuItem reorganisericones;
    private javax.swing.JMenuItem sommaire;
    private javax.swing.JMenuItem stages;
    private javax.swing.JMenuItem types;
    // End of variables declaration//GEN-END:variables
}
