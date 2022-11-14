//      ENUNCIADO

// Faça uma sub-rotina que receba como parâmetro uma matriz A (6,6) e multiplique cada linha 
// pelo elemento da diagonal principal da linha. A sub-rotina deverá retomar a matriz alternada para ser 
// mostrada no programa principal. 

#include <stdio.h>
#include "lib06.h"

void main(){
    int matrizA[6][6];
    int i, j;

    for( i = 0; i < 6; i++){
        for( j = 0; j < 6; j++){
            printf("Digite o elemento da %d* linha e %d coluna: ",i + 1,j + 1);
            scanf("%d",&matrizA[i][j]);
            printf("\n");
        }
    }
    system("cls");
    printf("          A matriz digitada e': \n\n");
    
    for(i = 0; i < 6; i++){
        printf("\t\t");
        for(j = 0; j < 6; j++){
            printf("%d   ", matrizA[i][j]);
        }
        printf("\n");
    }

        AlgebraLinear(matrizA);
    }