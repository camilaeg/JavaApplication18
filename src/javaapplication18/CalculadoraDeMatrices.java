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
public class CalculadoraDeMatrices {
    static void obtenerCofactor(int matriz[][],int tem[][],int p,int q,int n){
    int i=0,j=0;
    for(int fila=0;fila<n;fila++){
        for(int columna=0;columna<n;columna++){
            if(fila!=p&&columna!=q){
                tem[i][j++]=matriz[fila][columna];
                if(j==n-1){
                    j=0;
                    i++;
                   }
                }
            }
        }
    }//Terminado Cofactor
    
    static int determinanteMatriz(int matriz[][],int n){
        int determinante=0;
        if(n==1){
            return matriz[0][0];
        }
        int tem[][]=new int[n][n];
        int multiplicador=1;
        for(int f=0;f<n;f++){
            obtenerCofactor(matriz,tem,0,f,n);
            determinante+= multiplicador*matriz[0][f]*determinanteMatriz(tem,n-1);
            multiplicador=-multiplicador;
        }
        return determinante;
    }
    static void sumaResta(int matriz[][],int op,int f,int c){
        int f2,c2;
         f2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la segunda matriz"));
         c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la segunda matriz"));
         int matrizDos[][]= new int[f2][c2];
         int matrizR[][]= new int[f2][c2];
         JOptionPane.showMessageDialog(null, "Digite lo datos de la Segunda Matriz");
         for(int i=0;i<f2;i++){
            for(int j=0;j<c2;j++){
                matrizDos[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion:"+(i+1)+"x"+(j+1)));
            }
        }
        if(op==1){
         for(int i=0;i<f;i++){
                for(int j=0;j<c;j++){
                    matrizR[i][j]=matriz[i][j]+matrizDos[i][j];
                }
            }
          for(int i=0;i<f;i++){
                for(int j=0;j<c;j++){
                    System.out.print(matrizR[i][j]+"  ");
                }
            }
        }
        else if(op==2){
            for(int i=0;i<f;i++){
                for(int j=0;j<c;j++){
                    matrizR[i][j]=matriz[i][j]-matrizDos[i][j];
                }
            }
            for(int i=0;i<f;i++){
                for(int j=0;j<c;j++){
                    System.out.print(matrizR[i][j]+"  ");
                }
            }
        }
            else{
                    int resultado=0;
         if(c==f2){
             for(int i=0;i<f;i++){
                 for(int j=0;j<c2;j++){
                     for(int h=0;h<c;h++){
                         matrizR[i][j]+= matriz[i][h]*matrizDos[h][j];
                        }
                    }
                }
             for(int i=0;i<f;i++){
                for(int j=0;j<c;j++){
                    System.out.print(matrizR[i][j]+"  ");
                }
            }
                    }
         else{
           System.out.print("ERROR");
        }
        
        }
    }
}
