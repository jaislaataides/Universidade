//  ENUNCIADO

// Uma matriz quadrada inteira é chamada de “Quadrado Mágico” se a soma dos elementos de cada 
// linha, a soma dos elementos de cada coluna e a soma dos elementos da diagonal principal são iguais. 
// A matriz a seguir representa um quadrado mágico: 
//      8   0   7 
//      4   5   6 
//      3  10   2
// Escreva um algoritmo que verifica se a matriz digitada pelo usuário é um quadrado mágico.


#include <stdio.h>
#include <stdlib.h>

void main(){
    int matriz[3][3];
    int somaElementosLinha [3]={0,0,0}, somaElementosColuna[3]={0,0,0}, somaElementosDiagonal[2]={0,0};
    for (int i=0; i<3; i++)
    {
        printf("-> Preencha a matriz: ");
        // ------------ preencher matriz -------------
            for (int j=0; j<3; j++)
            {
                printf("\n| Escreva o elemento da %d linha e %d coluna\n| ",i+1,j+1);
                scanf("%d",&matriz[i][j]);
            }
        system("cls");
    }
    // ------ cálculos e impressão da matriz ------- 
    for (int i=0; i<3; i++)
    {
        for (int j=0; j<3; j++)
        {
            // --- cálculo de somas de linhas e de colunas ---
            somaElementosLinha[i]=somaElementosLinha[i]+matriz[i][j];
            somaElementosColuna[i]=somaElementosColuna[i]+matriz[j][i];

            // --- cálculo de soma da diagonal principal ---
            if(i==j)
            {
            somaElementosDiagonal[0]=somaElementosDiagonal[0]+matriz[i][j];
            }

            // --- criando variável auxiliar ---
            int k=0;
            k=i+j;
            if (k==2)
            {
                // --- cálculo de soma da diagonal secundária ---
                somaElementosDiagonal[1]=somaElementosDiagonal[1]+matriz[i][j];
            }

            // --- imprimir linhas da matriz ---
            printf(" | %d",matriz[i][j]);
        }
        printf("|\n");
    }
    printf("\n\n");
    system("pause");
    system("cls");
    
    // --- verificando se é ou não um quadrado mágico ---
    if (
        somaElementosColuna[0] == somaElementosColuna[1] && somaElementosColuna[0] == somaElementosColuna[2] && somaElementosColuna[1] == somaElementosColuna[2] &&
        somaElementosLinha[0] == somaElementosLinha[1] && somaElementosLinha[0] ==somaElementosLinha[2] && somaElementosLinha[1] == somaElementosLinha[2] &&
        somaElementosDiagonal[0] == somaElementosDiagonal[1])
    {
        printf("A matriz e um quadrado magico!");
    }else
    {
        printf("A matriz nao e um quadrado magico.");
    }
}