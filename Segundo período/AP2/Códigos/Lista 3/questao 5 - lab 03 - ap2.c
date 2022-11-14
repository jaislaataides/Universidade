//  ENUNCIADO:

// Escreva um programa que receba dois structs do tipo dma, cada um representando uma data 
// válida, e calcule o número de dias que decorreram entre as duas datas. 
// struct dma 
// { int dia; int mes; 
//  int ano; 
// }; 

#include <stdio.h>

void verificadordedata();

void main()
{
    struct calendario
    {
        int dia, mes, ano;
    };
    typedef struct calendario dma;
    dma data1, data2;

    int quantidadededias, aux[2];

    printf("Esse algoritmo calcula a diferença de dias entre duas datas!\n");
    printf("----- PRIMEIRA DATA -----");
    printf("\n\ndia: ");
    scanf("%d",&data1.dia);

    printf("\nmes: ");
    scanf("%d",&data1.mes);

    printf("\nano: ");
    scanf("%d",&data1.ano);
    verificadordedata(&data1.dia, &data1.mes, &data1.ano);

    system("cls");
    printf("----- SEGUNDA DATA -----");
    printf("\n\ndia: ");
    scanf("%d",&data2.dia);

    printf("\nmes: ");
    scanf("%d",&data2.mes);

    printf("\nano: ");
    scanf("%d", &data2.ano);
    verificadordedata(&data2.dia, &data2.mes, &data2.ano);

    aux[0]= data1.dia + data1.mes*30 + data1.ano*360;
    aux[1]= data2.dia + data2.mes*30 + data2.ano*360;

    if(aux[0]<=aux[1])
    {
        quantidadededias = aux[1] - aux[0];
    }
    else
    {
        quantidadededias = aux[0] - aux[1];
    }

    system("cls");
    printf("Primeira data \tSegunda data");
    printf("\ndia: %2d \tdia: %2d",data1.dia,data2.dia);
    printf("\nmes: %2d \tmes: %2d",data1.mes,data2.mes);
    printf("\nano: %4d \tano: %4d",data1.ano,data2.ano);
    printf("\n\nA diferenca entre as duas datas e de %d dias!",quantidadededias);
}

void verificadordedata(int *a, int *b, int *c)
{
    if (*a < 0 || *a > 30)
    {
        printf("\nVoce informou uma quantidade de dias não aceita. \nPor favor, digite o dia entre 1 e 30:\n");
        scanf("%d",&*a);
    }
    if (*b < 0 || *b > 12)
    {
        printf("\nVoce informou um valor de meses inexistente. \nPor favor, digite o mes entre 1 e 12:\n");
        scanf("%d",&*b);
    }
    if(*c < 0)
    {
        printf("\nPor enquanto não efetuamos calculo com datas antes de Cristo. \nPor favor, digite de novo um ano:\n");
        scanf("%d",&*c);
    }
    system("cls");
}