/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("¡INICIAR!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Calculadora de Matrices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)))
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addGap(73, 73, 73))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 // TODO add your handling code here:
                  int op;
        String menu ="1.Suma\n"+"2.Resta\n"+"3.Multiplicacion\n"+"4.División\n"+"5.Determinante\n"+"6.Traza\n"+"Digite el Número de la operacion que desea realizar";
         op=Integer.parseInt(JOptionPane.showInputDialog(menu));
    int colum,fil;
    
    //Solicitar Columnas y Filas
    fil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la primera matriz"));
    colum= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la primera matriz"));
   
    int matrizUno[][]= new int[fil][colum];
    int matrizResultante[][]= new int[fil][colum];
    
    //Llenar las matrices 
    JOptionPane.showMessageDialog(null, "Digite lo datos de la primera Matriz");
        for(int i=0;i<fil;i++){
            for(int j=0;j<colum;j++){
                matrizUno[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion:"+(i+1)+"x"+(j+1)));
            }
        }
       
    
    switch(op){
         case 1 ://Sumar las Matrices
            CalculadoraDeMatrices.sumaResta(matrizUno, op, fil, colum);
            break;
         case 2 ://Resta de Matrices
            CalculadoraDeMatrices.sumaResta(matrizUno, op, fil, colum);
            break;
         case 3: //Multiplicacion de matrices 
             CalculadoraDeMatrices.sumaResta(matrizUno, op, fil, colum);
            break;
         case 4 ://Division de Matrices
            int escalar;
            escalar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el escalar por el que desea dividir la matriz"));
            for(int i=0;i<fil;i++){
                for(int j=0;j<colum;j++){
                    matrizResultante[i][j]=matrizUno[i][j]/escalar;
                }
            }
            for(int i=0;i<fil;i++){
                for(int j=0;j<colum;j++){
                    System.out.print(matrizResultante[i][j]+"  ");
                }
            }
            break;
         case 5 ://Determinante  
            System.out.print("La determinante = "+CalculadoraDeMatrices.determinanteMatriz(matrizUno,fil));
            break;
              
         case 6 ://Traza
            int traza=0,k=0,u=0;
            if(colum==fil){
                for(int h=0;h<fil;h++){
                        traza = traza+matrizUno[k][u];
                        k++;
                        u++;
                    }
                }
            else{
                System.out.print("ERROR"); 
                }
            break;
         default:
            JOptionPane.showMessageDialog(null, "Opcion desconocida,teclee otra");
            break;
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
