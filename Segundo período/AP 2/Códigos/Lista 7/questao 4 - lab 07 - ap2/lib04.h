//SUB ROTINA QUESTÃO 4 : SITUAÇÃO ESCOLAR

char situacao(float nota1, float nota2, float nota3, int aulas, int faltas, float *media){
    float presenca;

    presenca = ((aulas - faltas) / aulas) * 100;

    if (*media >= 5 && presenca >= 75){
        return 'a';
    }else if(*media < 5 && *media >= 3 && presenca >= 75){
        return 'b';
    }else if(*media < 3 || presenca < 75){
        return 'c';
    }
}