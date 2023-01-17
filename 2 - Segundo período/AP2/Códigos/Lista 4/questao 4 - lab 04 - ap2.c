//      ENUNCIADO:

// Crie uma estrutura representando os alunos de um determinado curso. A estrutura deve conter a 
// matrícula do aluno, nome, nota da primeira prova, nota da segunda prova e nota da terceira prova. 
// a) Permita ao usuário entrar com os dados de 5 alunos. 
// b) Encontre o aluno com maior nota da primeira prova. 
// c) Encontre o aluno com maior média geral. 
// d) Encontre o aluno com menor média geral. 
// e) Para cada aluno diga se ele foi aprovado ou reprovado, considerando o valor 6 para aprovação.


#include <stdio.h>

void main()
{
    struct controledenotas
    {
        char matricula[20], nome[50];
        float nota1, nota2, nota3, media;
    }alunos[5];

    int i;
    float maiornota=0, maiormedia=0, menormedia=10;

    for(i = 0; i < 5; i++)
    {
        printf("----- ALUNO %d/5 -----");
        printf("\nNome do aluno: ");
        scanf("%[^\n]",alunos[i].nome);
        
        printf("\nMatricula do aluno: ");
        scanf("%[^\n]",alunos[i].matricula);
        
        printf("\nNota do aluno %s na prova 1: ",alunos[i].nome);
        scanf("%f",&alunos[i].nota1);
        
        printf("\nNota do aluno %s na prova 2: ",alunos[i].nome);
        scanf("%f",&alunos[i].nota2);
        
        printf("\nNota do aluno %s na prova 3: ",alunos[i].nota3);
        scanf("%f",&alunos[i].nota3);

        alunos[i].media = (alunos[i].nota1 + alunos[i].nota2 + alunos[i].nota3)/3;
        if(alunos[i].media>=6 && alunos[i].media<=10)
        {
            printf("\n\nO aluno %s foi aprovado!\n",alunos[i].nome);
        }
        else if(alunos[i].media>=0 && alunos[i].media<6)
        {
            printf("\n\nO aluno %s foi reprovado!\n");
        }
    } 

    for(i = 0; i < 5; i++)
    {
        if(alunos[i].nota1 > maiornota)
        {
            maiornota = alunos[i].nota1;
        }
        if(alunos[i].media > maiormedia)
        {
            maiormedia = alunos[i].media;
        }
        if(alunos[i].media < menormedia)
        {
            menormedia = alunos[i].media;
        }
    }
}