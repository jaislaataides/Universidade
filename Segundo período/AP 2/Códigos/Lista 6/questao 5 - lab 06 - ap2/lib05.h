//SUB ROTINA QUESTÃO 5 : POTÊNCIA

int potencialnt (int base, int expoente){
    int potencia = 0;
    int i = 1;

    while (i <= expoente){
        potencia += base;
        i++;
    }

    return potencia;
}   