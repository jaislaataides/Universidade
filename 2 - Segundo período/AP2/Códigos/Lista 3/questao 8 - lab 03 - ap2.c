//      ENUNCIADO:

//Faça a verificação de validade do CPF digitado, no campo do formulário criado no exercício 3. 

#include <stdio.h>

void main()
{
    char entrada[11];
    int cpf[11], aux[9], verificador[2];
    int soma;

    printf("Escreva o cpf que sera validado:\n");
    gets(entrada);

    //atribuição de valor numérico 
    for (int i=0; i<11; i++)
    {
        cpf[i] = entrada[i] - '0';
    }

    //calculo do produto e soma
    for (int i=0, j=10; j>1, i<9; j--, i++)
    {
        aux[i] = j*cpf[i];
        soma += aux[i];
    }

    //calcula o primeiro digito validador
    if (soma%11<2 && soma%11>0)
    {
        verificador[0] = 0;
    }
    else
    {
        verificador[0] = 11 - (soma%11);
    }

    soma = 0;

    //calculo do produto e soma (segundo digito)
    for (int i=0, j=11; j>1, i<10; j--, i++)
    {
        aux[i] = j*cpf[i];
        soma += aux[i];
    }


    //calculo do segundo digito validador
    if (soma%11<2 && soma%11>0)
    {
        verificador[1] = 0;
    }
    else
    {
        verificador[1] = 11 - (soma%11);
    }

    //saída: resultado da validação
    if (verificador[0] != cpf[9] && verificador[1] != cpf[10])
    {
        printf("O cpf inserido e invalido.");
    }
    else
    {
        printf("O cpf inserido e valido.");
    }
}