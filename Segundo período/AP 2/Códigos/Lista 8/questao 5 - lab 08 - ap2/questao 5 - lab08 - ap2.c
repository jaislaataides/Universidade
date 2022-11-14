//      ENUNCIADO

// Considere uma nutricionista que armazena algumas informações de cinco pacientes (nome, idade, 
// sexo, altura e peso
// a). Crie um programa que leia na função main essas informações. Usando passagem de parâmetros, 
// crie três funções (letras a, b, c, respectivamente) e determine: a) O nome da pessoa que tiver o maior 
// peso; 
// b) O nome e idade das pessoas que estejam acima do peso ideal; 
// c) Os nomes das pessoas que estejam abaixo do seu peso ideal, mostrando ainda o peso que essas 
// pessoas deverão alcançar para atingir esse peso ideal; 
// Utilize esses cálculos para determinar o peso ideal: 
// Mulheres: (72,7 * altura) – 58 
// Homens: (62,1 * altura) – 44,7 


#include <stdio.h>
#include <string.h>

struct nutricionista{
    char nome[50], sexo;
    int idade;
    float altura, peso;
}pacientes[5];

#include "lib05.h"

void main(){
    float pesoIdeal;

    for(int i=0; i<5; i++){
    printf("Digite o nome do paciente: ");
    scanf("%[^\n]",pacientes[i].nome);

    do{
    printf("\nQual o sexo do paciente? Digite f para feminino e m para masculino: ");
    scanf("%c",&pacientes[i].sexo);
    }while(pacientes[i].sexo!='f' && pacientes[i].sexo!='F' && pacientes[i].sexo!='m' && pacientes[i].sexo!='M');

    printf("\nEscreva a idade de %s: ",pacientes[i].nome);
    scanf("%d",&pacientes[i].idade);

    printf("\nEscreva a altura de %s: ",pacientes[i].nome);
    scanf("%f",&pacientes[i].altura);

    printf("\nEscreva o peso de %s: ",pacientes[i].nome);
    scanf("%f",&pacientes[i].peso);
    fflush(stdin);
    printf("\n");
    }

    AcharMaiorPeso(pacientes);
    AcimaPesoIdeal(pacientes);
    AbaixoPesoIdeal(pacientes);
}