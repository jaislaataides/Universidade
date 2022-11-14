//      ENUNCIADO:

// Considerando a estrutura struct Vetor 
// { float x; float y; float z; 
// }; 
// para representar um vetor no R3, implemente um programa que calcule a soma de dois vetores.



#include <stdio.h>

void main()
{
    struct vetores
    {
        float x, y, z;
    };
    
    typedef struct vetores v;
    v vetor1, vetor2, vetor3;

    printf("Escreva as posições do primeiro vetor:\n");
    printf("x: ");
    scanf("%f", &vetor1.x);
    printf("y: ");
    scanf("%f", &vetor1.y);
    printf("z: ");
    scanf("%f", &vetor1.z);

    printf("Escreva as posições do segundo vetor:\n");
    printf("x: ");
    scanf("%f", &vetor2.x);
    printf("y: ");
    scanf("%f", &vetor2.y);
    printf("z: ");
    scanf("%f", &vetor2.z);

    vetor3.x = vetor1.x + vetor2.x;
    vetor3.y = vetor1.y + vetor2.y;
    vetor3.z = vetor1.z + vetor2.z;

    printf("O terceiro vetor, obtido pela soma dos outros dois, tem as seguintes coordenadas:\n");
    printf("\n (%f, %f, %f)", vetor3.x, vetor3.y, vetor3.z);
}