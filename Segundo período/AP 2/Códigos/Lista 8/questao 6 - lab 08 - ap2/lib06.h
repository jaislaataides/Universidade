//SUB ROTINA QUESTÃO 6 : ÁLGEBRA LINEAR

void AlgebraLinear(int mat[6][6]){
    int i, j, auxiliar;

    for (i = 0; i < 6; i++){
        auxiliar = mat[i][i];
        
        for(j=0; j<6; j++){
            mat[i][j] *= auxiliar;
        }
    }

    printf("\nA matriz alternada e': \n\n");
    for(i = 0; i < 6; i++){
        
        printf("\t\t");
        
        for(j = 0; j < 6; j++){
            printf("%d   ", mat[i][j]);
        }
        printf("\n");
    }
}