/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword_process_inf;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class CrosswordProcessamentoInf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

          
// 1- *************Faz Grid de Matriz Vazia*****************
        Scanner input = new Scanner(System.in);
        String matriz[][] = new String [11][12];  //Matriz de Strings - vazia
        
        System.out.println("Matriz base");
        for ( int i = 0; i < 11; i++){
            for(int j = 0; j < 12; j++){
                matriz[i][j] = "  -  ";  // Para matrizes, usamos somente o input.next
            }
        }
        
        matriz[0][0] = "  #  ";
        matriz[0][1] = "  #  ";
        matriz[0][2] = "  #  ";
        matriz[0][3] = "  #  ";
        matriz[0][4] = "  #  ";
        matriz[0][6] = "  #  ";
        matriz[0][8] = "  #  ";
        matriz[0][9] = "  #  ";
        matriz[0][10] = "  #  ";
        matriz[0][11] = "  #  ";
        matriz[1][0] = "  #  ";
        matriz[1][1] = "  #  ";
        matriz[1][2] = "  #  ";
        matriz[1][3] = "  #  ";
        matriz[1][4] = "  #  ";
        matriz[1][8] = "  #  ";
        matriz[1][9] = "  #  ";
        matriz[1][10] = "  #  ";
        matriz[1][11] = "  #  ";
        matriz[2][0] = "  #  ";
        matriz[2][1] = "  #  ";
        matriz[2][2] = "  #  ";
        matriz[2][3] = "  #  ";
        matriz[2][4] = "  #  ";
        matriz[2][9] = "  #  ";
        matriz[2][10] = "  #  ";
        matriz[2][11] = "  #  ";
        matriz[3][0] = "  #  ";
        matriz[3][1] = "  #  ";
        matriz[3][2] = "  #  ";
        matriz[3][10] = "  #  ";
        matriz[3][11] = "  #  ";
        matriz[4][0] = "  #  ";
        matriz[4][2] = "  #  ";
        matriz[4][11] = "  #  ";
        matriz[5][0] = "  #  ";
        matriz[5][2] = "  #  ";
        matriz[5][3] = "  #  ";
        matriz[5][10] = "  #  ";
        matriz[5][11] = "  #  ";
        matriz[6][0] = "  #  ";
        matriz[6][7] = "  #  ";
        matriz[6][10] = "  #  ";
        matriz[6][11] = "  #  ";
        matriz[7][0] = "  #  ";
        matriz[8][7] = "  #  ";
        matriz[8][10] = "  #  ";
        matriz[8][11] = "  #  ";
        matriz[9][0] = "  #  ";
        matriz[9][7] = "  #  ";
        matriz[9][10] = "  #  ";
        matriz[9][11] = "  #  ";
        matriz[10][0] = "  #  ";
        matriz[10][3] = "  #  ";
        matriz[10][6] = "  #  ";
        matriz[10][7] = "  #  ";
        matriz[10][10] = "  #  ";
        matriz[10][11] = "  #  ";
        matriz[8][0] = " (1) ";
        matriz[3][3] = " (2) ";
        matriz[4][3] = " (3) ";
        matriz[7][7] = " (4) ";
        matriz[4][1] = " (5) ";
        matriz[6][2] = " (6) ";
        matriz[6][3] = " (7) ";
        matriz[5][4] = " (8) ";
        matriz[6][5] = " (9) ";
        matriz[5][9] = " (10)";
        matriz[0][5] = " (11)";
        matriz[1][6] = " (12)";
        matriz[0][7] = " (13)";
        matriz[2][8] = " (14)";
         
        // Mostrar valor valores da Matriz
        System.out.println("   __ 1 ____ 2 ____ 3 ____ 4 ____ 5 ____ 6 ____ 7 ____ 8 ____ 9 ____ 10 ___ 11 ___ 12 _   COLUNAS");
        for ( int i = 0; i < 11; i++){
            System.out.print("  |");
            for(int j = 0; j < 12; j++){
                System.out.print(" " + matriz[i][j] + " "); //  matriz ordenada em grid
                System.out.print("");
                if(j == 11){                 //Este if faz pular as linhas da matriz
                    System.out.print("|" + "  LINHA " + (i+1));
                    System.out.println();
                }        
            }
        } //término grid

        
//2 - *************************Matriz Completa************************
        System.out.println();
        System.out.println("Matriz completa");
        String matriz_comp[][] = new String[11][12];
        //esboço
        matriz_comp[0][0] = "  #  ";
        matriz_comp[0][1] = "  #  ";
        matriz_comp[0][2] = "  #  ";
        matriz_comp[0][3] = "  #  ";
        matriz_comp[0][4] = "  #  ";
        matriz_comp[0][6] = "  #  ";
        matriz_comp[0][8] = "  #  ";
        matriz_comp[0][9] = "  #  ";
        matriz_comp[0][10] = "  #  ";
        matriz_comp[0][11] = "  #  ";
        matriz_comp[1][0] = "  #  ";
        matriz_comp[1][1] = "  #  ";
        matriz_comp[1][2] = "  #  ";
        matriz_comp[1][3] = "  #  ";
        matriz_comp[1][4] = "  #  ";
        matriz_comp[1][8] = "  #  ";
        matriz_comp[1][9] = "  #  ";
        matriz_comp[1][10] = "  #  ";
        matriz_comp[1][11] = "  #  ";
        matriz_comp[2][0] = "  #  ";
        matriz_comp[2][1] = "  #  ";
        matriz_comp[2][2] = "  #  ";
        matriz_comp[2][3] = "  #  ";
        matriz_comp[2][4] = "  #  ";
        matriz_comp[2][9] = "  #  ";
        matriz_comp[2][10] = "  #  ";
        matriz_comp[2][11] = "  #  ";
        matriz_comp[3][0] = "  #  ";
        matriz_comp[3][1] = "  #  ";
        matriz_comp[3][2] = "  #  ";
        matriz_comp[3][10] = "  #  ";
        matriz_comp[3][11] = "  #  ";
        matriz_comp[4][0] = "  #  ";
        matriz_comp[4][2] = "  #  ";
        matriz_comp[4][11] = "  #  ";
        matriz_comp[5][0] = "  #  ";
        matriz_comp[5][2] = "  #  ";
        matriz_comp[5][3] = "  #  ";
        matriz_comp[5][10] = "  #  ";
        matriz_comp[5][11] = "  #  ";
        matriz_comp[6][0] = "  #  ";
        matriz_comp[6][7] = "  #  ";
        matriz_comp[6][10] = "  #  ";
        matriz_comp[6][11] = "  #  ";
        matriz_comp[7][0] = "  #  ";
        matriz_comp[8][7] = "  #  ";
        matriz_comp[8][10] = "  #  ";
        matriz_comp[8][11] = "  #  ";
        matriz_comp[9][0] = "  #  ";
        matriz_comp[9][7] = "  #  ";
        matriz_comp[9][10] = "  #  ";
        matriz_comp[9][11] = "  #  ";
        matriz_comp[10][0] = "  #  ";
        matriz_comp[10][3] = "  #  ";
        matriz_comp[10][6] = "  #  ";
        matriz_comp[10][7] = "  #  ";
        matriz_comp[10][10] = "  #  ";
        matriz_comp[10][11] = "  #  ";
        matriz_comp[8][0] = " (1) ";
        matriz_comp[3][3] = " (2) ";
        matriz_comp[4][3] = " (3) ";
        matriz_comp[7][7] = " (4) ";
        matriz_comp[4][1] = " (5) ";
        matriz_comp[6][2] = " (6) ";
        matriz_comp[6][3] = " (7) ";
        matriz_comp[5][4] = " (8) ";
        matriz_comp[6][5] = " (9) ";
        matriz_comp[5][9] = " (10)";
        matriz_comp[0][5] = " (11)";
        matriz_comp[1][6] = " (12)";
        matriz_comp[0][7] = " (13)";
        matriz_comp[2][8] = " (14)";
        //Respostas
        matriz_comp[8][1] = "  r  ";
        matriz_comp[8][2] = "  a  ";
        matriz_comp[8][3] = "  n  ";
        matriz_comp[8][4] = "  d  ";
        matriz_comp[8][5] = "  o  ";       
        matriz_comp[8][6] = "  m  ";
        
        matriz_comp[3][4] = "  s  ";
        matriz_comp[3][5] = "  t  ";       
        matriz_comp[3][6] = "  r  ";
        matriz_comp[3][7] = "  i  ";
        matriz_comp[3][8] = "  n  ";
        matriz_comp[3][9] = "  g  ";
        
        matriz_comp[4][4] = "  b  ";
        matriz_comp[4][5] = "  o  ";
        matriz_comp[4][6] = "  o  ";
        matriz_comp[4][7] = "  l  ";
        matriz_comp[4][8] = "  e  ";       
        matriz_comp[4][9] = "  a  ";
        matriz_comp[4][10] = "  n  ";
        
        matriz_comp[7][8] = "  e  ";       
        matriz_comp[7][9] = "  l  ";
        matriz_comp[7][10] = "  s  ";
        matriz_comp[7][11] = "  e  ";
        
        matriz_comp[5][1] = "  m  ";
        matriz_comp[6][1] = "  a  ";
        matriz_comp[7][1] = "  t  ";
        matriz_comp[8][1] = "  r  ";
        matriz_comp[9][1] = "  i  ";
        matriz_comp[10][1] = "  z  ";       
        
        matriz_comp[7][2] = "  j  ";
        matriz_comp[8][2] = "  a  ";
        matriz_comp[9][2] = "  v  ";       
        matriz_comp[10][2] = "  a  ";
        
        matriz_comp[7][3] = "  i  ";
        matriz_comp[8][3] = "  n  ";
        matriz_comp[9][3] = "  t  ";
        
        matriz_comp[6][4] = "  d  ";
        matriz_comp[7][4] = "  a  ";
        matriz_comp[8][4] = "  d  ";
        matriz_comp[9][4] = "  o  ";       
        matriz_comp[10][4] = "  s  ";
        
        matriz_comp[7][5] = "  l  ";
        matriz_comp[8][5] = "  o  ";
        matriz_comp[9][5] = "  o  ";
        matriz_comp[10][5] = "  p  ";
        
        matriz_comp[6][9] = "  f  ";
        matriz_comp[7][9] = "  l  ";
        matriz_comp[8][9] = "  o  ";
        matriz_comp[9][9] = "  a  ";
        matriz_comp[10][9] = "  t  ";
        
        matriz_comp[1][5] = "  v  ";
        matriz_comp[2][5] = "  e  ";
        matriz_comp[3][5] = "  t  ";
        matriz_comp[4][5] = "  o  ";
        matriz_comp[5][5] = "  r  ";
        
        matriz_comp[2][6] = "  p  ";
        matriz_comp[3][6] = "  r  ";
        matriz_comp[4][6] = "  o  ";
        matriz_comp[5][6] = "  g  ";
        matriz_comp[6][6] = "  r  ";
        matriz_comp[7][6] = "  a  ";
        matriz_comp[8][6] = "  m  ";
        matriz_comp[9][6] = "  a  ";
        
        matriz_comp[1][7] = "  w  ";
        matriz_comp[2][7] = "  h  ";
        matriz_comp[3][7] = "  i  ";
        matriz_comp[4][7] = "  l  ";
        matriz_comp[5][7] = "  e  ";
        
        matriz_comp[3][8] = "  n  ";
        matriz_comp[4][8] = "  e  ";
        matriz_comp[5][8] = "  t  ";
        matriz_comp[6][8] = "  b  ";
        matriz_comp[7][8] = "  e  ";
        matriz_comp[8][8] = "  a  ";
        matriz_comp[9][8] = "  n  ";
        matriz_comp[10][8] = "  s  ";
        
        // Mostrar valor valores da Matriz_comp
        
        System.out.println("   __ 1 ____ 2 ____ 3 ____ 4 ____ 5 ____ 6 ____ 7 ____ 8 ____ 9 ____ 10 ___ 11 ___ 12 _   COLUNAS");
        for ( int i = 0; i < 11; i++){
            System.out.print("  |");
            for(int j = 0; j < 12; j++){
                System.out.print(" " + matriz_comp[i][j] + " ");//  matriz ordenada em grid
                System.out.print("");
                if(j == 11){                 //Este if faz pular as linhas da matriz
                    System.out.print("|" + "  LINHA " + (i+1));
                    System.out.println();
                }
            }
        } //término grid
        
//3 - ******************************Matriz de resposta(para comparação)******************************************* 
        String mat_resp_h[][] = new String [11][12];  //Matriz de Strings - matriz dos bancos de questões horizontais
        String mat_resp_v[][] = new String [11][12];  //Matriz de Strings - matriz dos bancos de questões verticais   
     
        //**************Matriz de respostas horizontais**********   
        for ( int i = 0; i < 11; i++){
            for(int j = 0; j < 12; j++){
                mat_resp_h[i][j] = "none";  // Para matrizes, usamos somente o input.next
            }
         }
        mat_resp_h[8][1] = "random";
        mat_resp_h[3][4] = "string";  
        mat_resp_h[4][4] = "boolean";
        mat_resp_h[7][8] = "else";
        
         //*********Matriz Vertical***********************
        for ( int i = 0; i < 11; i++){
            for(int j = 0; j < 12; j++){
                mat_resp_v[i][j] = "none";  // Para matrizes, usamos somente o input.next
            }
         }
         mat_resp_v[5][1] = "matriz";
         mat_resp_v[7][2] = "java";
         mat_resp_v[7][3] = "int";
         mat_resp_v[6][4] = "dados";
         mat_resp_v[7][5] = "loop";
         mat_resp_v[6][9] = "float";
         mat_resp_v[1][5] = "vetor";
         mat_resp_v[2][6] = "programa";
         mat_resp_v[1][7] = "while";
         mat_resp_v[3][8] = "netbeans";
         
//4 - *************************Perguntas e respostas*******************************************
         int c = 0; // Contagem de respostas certas
         int rodadas = 1; // contagem de rodadas
         while( c != 14){
             System.out.println();
             System.out.println("******************************************************");
             System.out.println("RODADA " + rodadas);
             System.out.println("******************************************************");
             System.out.println("              Eixo Horizontal        ");
             System.out.println("  (1) - L9 C2: Classe do Java que sorteia números aleatórios;");
             System.out.println("  (2) - L4 C5: Tipo de dado para caracteres literais;");
             System.out.println("  (3) - L5 C5: Tipo de dado lógico;");
             System.out.println("  (4) - L8 C9: Condicionais: IF ... ;");
             System.out.println("******************************************************");
             System.out.println("               Eixo Vertical         ");
             System.out.println("  (5) - L6 C2: Conjunto de vetores;");
             System.out.println("  (6) - L8 C3: Linguagem de programação;");
             System.out.println("  (7) - L8 C4: Tipo de dado para números inteiros;");
             System.out.println("  (8) - L7 C5: Combinação de valores e de operações que uma variável pode executar;");
             System.out.println("  (9) - L8 C6: Laços de repetição;");
             System.out.println("  (10) - L7 C10: Tipo de dado para números reais (ponto flutuante);");
             System.out.println("  (11) - L2 C6: Variável de armazenamento de dados, Array;");
             System.out.println("  (12) - L3 C7: Algoritmo;");
             System.out.println("  (13) - L2 C8: Estrutura de repetição;");
             System.out.println("  (14) - L4 C9: Programa para programar em Java;");
             System.out.println("******************************************************");
             System.out.println();
             
             //Interação com o jogador
             System.out.print("Entre com o eixo da pergunta: Horizontal (h) ou Vertical (v)? : ");
             String eixo = input.next();
             System.out.println("Entre com a linha e a coluna da pergunta");
             System.out.print("Linha (L): ");
             int L = input.nextInt();
             System.out.print("Coluna (C): ");
             int C = input.nextInt();
             System.out.print("Qual é a palavra? : ");
             String resposta = input.next();
                //Verificação da resposta
                    //vertical
             if( ("v".equals(eixo)) && (mat_resp_v[L-1][C-1].equals(resposta)) ){
                 System.out.println();
                 System.out.println("A resposta está correta!");
                 System.out.println();
                 for(int i = (L-1) ; i < (L-1)+resposta.length(); i++){   //A atualização deve começa do ponto até o tamanho da palavra
                     matriz[i][C-1] = matriz_comp[i][C-1];  //Matriz é atualizada
                 }
                       //mostrar matriz atualizada
                 System.out.println("   __ 1 ____ 2 ____ 3 ____ 4 ____ 5 ____ 6 ____ 7 ____ 8 ____ 9 ____ 10 ___ 11 ___ 12 _   COLUNAS");
                 for ( int i = 0; i < 11; i++){
                     System.out.print("  |");
                     for(int j = 0; j < 12; j++){
                         System.out.print(" " + matriz[i][j] + " "); //  matriz ordenada em grid
                         System.out.print("");
                         if(j == 11){                 //Este if faz pular as linhas da matriz
                             System.out.print("|" + "  LINHA " + (i+1));
                             System.out.println();
                         }
                     }
                 } //término grid
                 c++; //contagem das corretas
                 rodadas++;
             } //termino If
             else{
                 if( ("h".equals(eixo)) && (mat_resp_h[L-1][C-1].equals(resposta)) ){ //Horizontal
                     System.out.println();
                     System.out.println("A resposta está correta!");
                     System.out.println();
                     for(int j = (C-1); j < (C-1)+resposta.length(); j++){         //O quatro é o a quantidade de linhas na matriz mat_resp_v[][]
                         matriz[L-1][j] = matriz_comp[L-1][j];  //Matriz é atualizada
                     } //mostrar matriz atualizada
                     
                     System.out.println("   __ 1 ____ 2 ____ 3 ____ 4 ____ 5 ____ 6 ____ 7 ____ 8 ____ 9 ____ 10 ___ 11 ___ 12 _   COLUNAS");
                     for ( int i = 0; i < 11; i++){
                         System.out.print("  |");
                         for(int j = 0; j < 12; j++){
                             System.out.print(" " + matriz[i][j] + " "); //  matriz ordenada em grid
                             System.out.print("");
                             if(j == 11){                 //Este if faz pular as linhas da matriz
                                 System.out.print("|" + "  LINHA " + (i+1));
                                 System.out.println();
                             }
                         }
                     } //término grid
                     c++; //contagem das corretas
                     rodadas++;
                 } //termino If
                 else{
                     System.out.println();
                     System.out.print("A resposta está errada!");
                     System.out.println();
                     rodadas++;
                 }
             }
         }//Término laço while  
         
         System.out.println();
         System.out.println("Parabéns!! Você concluiu o jogo em " + (rodadas - 1) + " rodadas!");
         
 
        
        
        
        
        //********************************8
    }
}
