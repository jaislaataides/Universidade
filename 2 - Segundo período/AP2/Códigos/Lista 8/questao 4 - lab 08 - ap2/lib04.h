//SUB ROTINA DA QUESTÃO 4 : FATORIAL COM VETORES

void Fatorial(int *a, int *b){
    int fat;

    for(int i = 0; i < 10; i++){
        fat = 1;
        for(int j = a[i]; j >= 1; j--){
            fat *= j;
        }
        b[i] = fat;
    }
}