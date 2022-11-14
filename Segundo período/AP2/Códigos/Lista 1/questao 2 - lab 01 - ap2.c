// ENUNCIADO:

// Durante a liquidação de uma loja, os proprietários decidiram marcar os valores de desconto das 
// mercadorias, em função das cores. Com base na associação entre os valores do produto e o desconto, 
// faça um programa que calcule o valor final que o cliente pagará pela mercadoria. 

//      Cor         Desconto 
// L (de laranja)     10% 
// R (de rosa)        20%
// V (de verde)       50% 
// A (de azul)        70%

#include <stdio.h>
int main()
{
    char cor;
    float preco, valorfinal;
    printf("Qual a cor do produto?\n");
    printf("\nL - laranja \t R - rosa");
    printf("\nV - verde \t A - azul\n\n");
    scanf("%c",&cor);
    //tratamento de erro - entrada não reconhecida
    while (cor!='L' && cor!='R' && cor!='V' && cor!='A')
    {
        system("cls");
        printf("Desculpe, o caractere digitado nao pode ser identificado\n");
        printf("Por favor, digite nopvamente:\n\n");
        printf("Qual a cor do produto?\n");
        printf("\nL - laranja \t R - rosa");
        printf("\nV - verde \t A - azul\n\n");
        scanf("%c",&cor);
    }
    printf("\nQual era o valor total desse produto?\n\n");
    scanf("%f",&preco);
    //cálculo do valor final
    if (cor=='L')
    {
        valorfinal=preco*0.9;
    }else if (cor=='R')
    {
        valorfinal=preco*0.8;
    }else if (cor=='V')
    {
        valorfinal=preco*0.5;
    }else
    {
        valorfinal=preco*0.3;
    }
    if (valorfinal!=0)
    {
        printf("\n\nO valor do produto com desconto e R$ %.2f",valorfinal);
    }
}
