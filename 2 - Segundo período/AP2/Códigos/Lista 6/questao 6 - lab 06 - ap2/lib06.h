//SUB ROTINA QUESTÃO 6 : FATORIAL NO DENOMINADOR

float fatorialnodenominador(int m){
    float S = 0;
    int N;

    for (int i = 1; i <= m; i++){
        N = 1;

        for(int j = 1; j <= i; j++){
            N = N * j;
        }

    S += (float) 1/N;
    }

    S+=1;

    return S;
}