//SUB ROTINA DO EXERCÍCIO 3 : TABUDADA

void Tabuada(int n){
    for (int i =1 ; i < (n + 1); i++){
        for(int j = 1; j <= i ; j++){
            printf("%d ", i * j);
        }
        printf("\n");
    }
}