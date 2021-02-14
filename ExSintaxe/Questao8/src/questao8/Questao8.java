package questao8;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = teclado.nextInt();
        int [][]matriz = new int[tamanho][tamanho];
        int diagonalPrincipal = 0;
        for(int linha = 0; linha < tamanho; linha++){
            for(int coluna = 0; coluna < tamanho; coluna++){
                System.out.printf("Digite o número [%d][%d]\n",linha, coluna);
                matriz[linha][coluna] = teclado.nextInt();
                //SOMANDO DIAGONAL PRIMÁRIA
                if(linha == coluna){
                    diagonalPrincipal += matriz[linha][coluna];
                }
            }
        }
        //SOMAR LINHA
        int linhaOficial = 0;
        int contador = 0;
        for(int linha = 0; linha < tamanho; linha++){
            int linhaAtual = 0;
            for(int coluna = 0; coluna < tamanho; coluna++){
                linhaAtual += matriz[linha][coluna];
            }
            if(contador != 0){
                if(linhaOficial != linhaAtual ){
                    linhaOficial = diagonalPrincipal - 1;
                    break;
                }
            }else{
                linhaOficial = linhaAtual;
            }
            contador +=1;
            
        }
        contador = 0;
        //SOMAR COLUNA
        int colunaOficial = 0;
        for(int coluna = 0; coluna < tamanho; coluna++){
            int colunaAtual = 0;
            for(int linha = 0; linha < tamanho; linha++){
                colunaAtual += matriz[linha][coluna];
            }
            if(contador != 0){
                if(colunaOficial != colunaAtual ){
                    colunaOficial = diagonalPrincipal - 1;
                    break;
                }
            }else{
                colunaOficial = colunaAtual;
            }
            contador +=1;
        }
        //SOMAR DIAGONAL SECUNDÁRIA    
        int diagonalSecundaria = 0;
        for(int auxiliar = 0; auxiliar < tamanho; auxiliar++){
            diagonalSecundaria += matriz[auxiliar][tamanho-1-auxiliar];
        }
        //VERIFICAR SE É MATRIZ QUADRADA OU NÃO
        if(diagonalPrincipal == linhaOficial && linhaOficial == diagonalSecundaria && colunaOficial == diagonalPrincipal){
            System.out.println("É quadraddo mágico!");
        }else{
            System.out.println("Não é quadrado mágico!");
        }
    }
        
}
    

