//      ENUNCIADO:
 
// Faça um programa que leia um vetor com os dados de 5 carros: marca (máximo 15 ´ letras), ano e 
// preço. Leia um valor p e mostre as informações de todos os carros com o preço menor que p. Repita 
// este processo até que seja lido um valor p = 0.

#include <stdio.h>

void main()
{
    struct concessionaria
    {
        char marca[50];
        int ano;
        float preco;
    }carros[5];

    int i;
    float p, maior = 0;

    for (i = 0; i < 6; i++) 
    {
    printf("Escreva a marca do carro: ");
    scanf("%[^\n]",carros[i].marca);

    printf("\nDigite o ano de fabricacao: ");
    scanf("%d",&carros[i].ano);

    printf("\nPreco: ");
    scanf("%f",&carros[i].preco);
    fflush(stdin);

    system("cls");
    }

    while(p != 0)
    {
    int j = 0;
    printf("Qual o orcamento do cliente?\n");
    printf("R$");
    scanf("%f",&p);

    for(i=0;i<5;i++)
    {
        if(carros[i].preco < p)
        {
            printf("\nO carro da marca %s tem preco menor que RS%.2f!\n",carros[i].marca,p);
            j++;
        }
    }

    if(j == 0){
        printf("\nNao ha nenhum carro com preco menor que %f disponivel\n",p);
    }

    printf("\n\n\n\n");
    system("pause");
    system("cls");
    }
}