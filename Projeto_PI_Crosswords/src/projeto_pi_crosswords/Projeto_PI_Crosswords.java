/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_pi_crosswords;

import java.util.Scanner;


public class Projeto_PI_Crosswords {

    
    public static void main(String[] args) {
        
   // 1- *************Faz Grid de Matriz Vazia*****************
        Scanner input = new Scanner(System.in);
        String matriz[][] = new String [4][4];  //Matriz de Strings - vazia
        
         System.out.println("Matrix base");
        for ( int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                //System.out.println(" linha - " +i+ "; coluna - " +j);  mostra  o que está em cada linha e coluna
                matriz[i][j] = " - ";  // Para matrizes, usamos somente o input.next
             }
         }
         matriz[0][0] = " ? ";
         matriz[1][1] = " * ";
         matriz[1][2] = " * ";
         matriz[2][3] = " ? ";
         matriz[3][1] = " ? ";
         
        // Mostrar valor valores da Matriz
        for ( int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){

                  System.out.print(""+matriz[i][j]+"");//  matriz ordenada em grid
                  System.out.print("");
                  if(j==3){                 //Este if faz pular as linhas da matriz
                       System.out.println();
                  }
                  //System.out.println(" linha - " +i+ "; coluna - " +j+ " = " +matriz[i][j]);
             }
         } //término grid

        
        //2 - *************************Matriz Completa************************
        System.out.println();
        System.out.println("Matriz completa");
        String matriz_comp[][] = new String[4][4];
        //esboço
        matriz_comp[0][0] = " ? ";
        matriz_comp[1][1] = " * ";
        matriz_comp[1][2] = " * ";
        matriz_comp[2][3] = " ? ";
        matriz_comp[3][1] = " ? ";
        //Respostas
        matriz_comp[0][1] = " c ";
        matriz_comp[0][2] = " a ";
        matriz_comp[0][3] = " r ";
        matriz_comp[1][0] = " t ";
        matriz_comp[1][3] = " o ";       
        matriz_comp[2][0] = " i ";
        matriz_comp[2][1] = " p ";
        matriz_comp[2][2] = " e ";       
        matriz_comp[3][0] = " o ";
        matriz_comp[3][2] = " i ";
        matriz_comp[3][3] = " f ";
        // Mostrar valor valores da Matriz_comp
        for ( int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){

                  System.out.print(""+matriz_comp[i][j]+"");//  matriz ordenada em grid
                  System.out.print("");
                  if(j==3){                 //Este if faz pular as linhas da matriz
                       System.out.println();
                  }
                  //System.out.println(" linha - " +i+ "; coluna - " +j+ " = " +matriz[i][j]);
             }
         } //término grid
        
  //3 - ******************************Matriz de resposta(para comparação)******************************************* 
        
        String mat_resp_h[][] = new String [4][4];  //Matriz de Strings - matriz dos bancos de questões horizontais
        String mat_resp_v[][] = new String [4][4];  //Matriz de Strings - matriz dos bancos de questões verticais   
        
        System.out.println("Matrizes Resposta");
     
        //**************Matriz de respostas horizontais**********   
        for ( int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                //System.out.println(" linha - " +(i+1)+ "; coluna - " +(j+1));  
                mat_resp_h[i][j] = "none";  // Para matrizes, usamos somente o input.next
             }
         }
            mat_resp_h[0][0] = "car";
            mat_resp_h[2][3] = "epi";  
            mat_resp_h[3][1] = "if";
            
        System.out.println("Matriz Horizontal");      
        for ( int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                  
                 //System.out.println(" linha - " +(i+1)+ "; coluna - " +(j+1)+ " = " + mat_resp_h[i][j]);
 
             }
         } 
        
         //*********Matriz Vertical***********************
         for ( int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                //System.out.println(" linha - " +(i+1)+ "; coluna - " +(j+1));  
                mat_resp_v[i][j] = "none";  // Para matrizes, usamos somente o input.next
             }
         }
            mat_resp_v[0][0] = "tio";
            mat_resp_v[2][3] = "or";  
            
            
        System.out.println("Matriz Vertical");      
        for ( int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                  
                 //System.out.println(" linha - " +(i+1)+ "; coluna - " +(j+1)+ " = " + mat_resp_v[i][j]);
 
             }
         } 
        
        
        //4 - *************************Perguntas e respostas*******************************************
     int c = 0; // Contagem de respostas certas
     while( c != 5){
                System.out.println();
                System.out.println("              Eixo Horizontal        ");
                System.out.println("linha  -   Coluna");
                System.out.println("  1    -      1     : Carro em Inglês;   ");
                System.out.println("  3    -      4     : Equipamento de Proteção Pessoal;   ");
                System.out.println("  4    -      2     : Conditional loop in programming;   ");
                System.out.println("******************************************************");
                System.out.println();
                System.out.println("               Eixo Vertical         ");
                System.out.println("linha  -   Coluna");
                System.out.println("  1    -      1     : Irmão de sua mãe ou de seu pai;   ");
                System.out.println("  3    -      4     : Operador lógico;   ");
                System.out.println("******************************************************");
                System.out.println();
     
                //Interação com o jogador
                System.out.println("Entre com o eixo da pergunta: horizontal h ou vertical v  ");
                String eixo = input.next();
                System.out.println("Entre com a linha e a coluna da pergunta :");
                System.out.println("Linha :");
                int L = input.nextInt();
                System.out.println("Coluna :");
                int C = input.nextInt();
                System.out.println("Qual é a resposta :");
                String resposta = input.next();
                //Verificação da resposta
                    //vertical
                    if( ("v".equals(eixo))&&(mat_resp_v[L-1][C-1].equals (resposta)) ){
                       System.out.println("A resposta está correta"); 
                       for(int i = 0; i<4;i++){         //O quatro é o a quantidade de linhas na matriz mat_resp_v[][]
                           matriz[i][C-1] = matriz_comp[i][C-1];  //Matriz é atualizada
                       }
                       //mostrar matriz atualizada
                       for ( int i = 0; i < 4; i++){
            
                           for(int j = 0; j < 4; j++){

                                 System.out.print(""+matriz[i][j]+"");//  matriz ordenada em grid
                                 System.out.print("");
                                if(j==3){                 //Este if faz pular as linhas da matriz
                                          System.out.println();
                                        }
                            }
                        } //término grid
                       c++; //contagem das corretas
                    } //termino If
                    
                    else
                    //Horizontal
                    if( ("h".equals(eixo))&&(mat_resp_h[L-1][C-1].equals(resposta)) ){
                       System.out.println("A resposta está correta"); 
                       for(int j = 0; j<4;j++){         //O quatro é o a quantidade de linhas na matriz mat_resp_v[][]
                           matriz[L-1][j] = matriz_comp[L-1][j];  //Matriz é atualizada
                       }
                       //mostrar matriz atualizada
                       for ( int i = 0; i < 4; i++){
            
                           for(int j = 0; j < 4; j++){

                                 System.out.print(""+matriz[i][j]+"");//  matriz ordenada em grid
                                 System.out.print("");
                                if(j==3){                 //Este if faz pular as linhas da matriz
                                          System.out.println();
                                        }
                            }
                        } //término grid
                       c++; //contagem das corretas
                    } //termino If
                    else{ System.out.print("A resposta está errada.");
                    }
                    
                    
    }//Término laço while  
     
     System.out.print("Parabéns!!Você concluiu o puzzle com êxito!");
        
    //************Todo código está acima**************    
    }
}
