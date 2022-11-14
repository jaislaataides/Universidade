//      ENUNCIADO

// (Elabore um arquivo com extensão .h) Escreva uma função que determine a média e a situação de 
// um aluno em uma disciplina. A função recebe como parâmetros as três notas de um aluno (p1, p2, p3), 
// seu número de faltas (faltas), o número total de aulas da disciplina (aulas) e o ponteiro para uma 
// variável média (media), conforme o seguinte protótipo: 
// char situação (float p1, float p2, float p3, int faltas, int aulas, float *media); 
// Na variável indicada pelo ponteiro média, a função deve armazenar a média do aluno, calculado como 
// média aritmética das três provas. Além disso, a função deve tornar um caracter indicando a situação do 
// aluno no curso, definido de acordo com o seguinte critério: 
// Média > = 5 e Frequência >= 75% - Aprovado – ‘a’ 
// Média < 5 e Média >= 3 e Frequência >= 75% - Recuperação – ‘b’ 
// Média < 3 ou Frequência < 75% - Reprovado – ‘c’ 

#include <stdio.h>
#include "lib04.h"

void main(){
    char nome[50];

    struct academico{
        float nota1, nota2, nota3, media;
        int aulasDisciplina, faltas;
    }aluno;

    printf("Escreva o nome do aluno: ");
    scanf("%[^\n]",nome);

    printf("\n============ NOTAS ===========\n");
    printf("\nDigite a primeira nota do aluno %s: ",nome);
    scanf("%f",&aluno.nota1);

    printf("\nDigite a segunda nota do aluno %s: ",nome);
    scanf("%f",&aluno.nota2);

    printf("\nDigite a terceira nota do aluno %s: ",nome);
    scanf("%f",&aluno.nota3);

    printf("\n============= AULAS =============\n");
    printf("\nInforme a quantidade de aulas dessa disciplina: ");
    scanf("%d",&aluno.aulasDisciplina);

    printf("\nInforme a quantidade de faltas nessa disciplina: ");
    scanf("%d",&aluno.faltas);

    aluno.media = (aluno.nota1 + aluno.nota2 + aluno.nota3)/3;

    printf("\n\nA situacao do aluno e': ");
    printf("%c",situacao(aluno.nota1, aluno.nota2, aluno.nota3, aluno.aulasDisciplina, aluno.faltas, &aluno.media));
}