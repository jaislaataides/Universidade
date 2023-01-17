//      ENUNCIADO

// Faça um programa que leia uma frase, na função invocadora (ou main). Depois chame a função 
// void cifra (char *frase, char valor_digitado_usr), que troca as vogais por um símbolo qualquer 
// digitado pelo usuário. Exemplo: 
// Frase: Eu estou na universidade 
// Valor digitado pelo usuário: % 
// Saída: %% %st%% n% %n%v%rs%d%d%

#include <stdio.h>
#include "lib03.h"

void main(){
    char frase[100];
    char simbolo;

    printf("\nEscreva a frase para sustituir as vogais por um simbolo: ");
    scanf("%[^\n]",frase);
    fflush(stdin);
    printf("\nDigite o simbolo pelo qual deseja trocar as vogais: ");
    scanf("%c", &simbolo);

    Caracterizador(frase, simbolo);
    printf("\nApos a substituicao, a frase fica da seguinte maneira: %s",frase);
}