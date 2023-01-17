//      ENUNCIADO:

// Escreva uma função recursiva que calcule o número de grupos distintos com k pessoas que podem 
// ser formados a partir de um conjunto de n pessoas. Por exemplo, Comb (4, 3) = 4, pois com 4 pessoas 
// (A, B, C, D), é possível formar 4 diferentes grupos: ABC, ABD, ACD e BCD. Sabe-se que:
// 𝐶𝑜𝑚𝑏(𝑛, 𝑘) = 𝑛, 𝑠𝑒 𝑘 = 1
// 𝐶𝑜𝑚𝑏(𝑛, 𝑘) = 1, 𝑠𝑒 𝑘 = 𝑛
// 𝐶𝑜𝑚𝑏(𝑛, 𝑘) = 𝐶𝑜𝑚𝑏(𝑛 − 1, 𝑘 − 1) + 𝐶𝑜𝑚𝑏(𝑛 − 1, 𝑘), 𝑠𝑒1 < 𝑘 < n


#include <stdio.h>

int COMB(int n, int k)
{
    if (k == 1)
    {
        return n;
    }
    else if (n == k) 
    {
        return 1 ;
    }
    else if (k > 1 && n > k)
    {
        return (COMB(n - 1, k - 1) + COMB(n - 1, k));
    }
}

void main()
{
    int k, n;

    pergunta:
    printf("Insira o numero total de elementos: ");
    scanf("%d", &n);

    printf("Qual a quantidade de elementos por grupo? ");
    scanf("%d", &k);

    printf("%d", COMB(n,k));
    system("pause");
    system("cls");

    printf("Deseja realizar a combinacao novamente? Digite 1 para sim: ");
    scanf("%d",&n);

    if (n == 1)
    {
        goto pergunta;
    } 
}