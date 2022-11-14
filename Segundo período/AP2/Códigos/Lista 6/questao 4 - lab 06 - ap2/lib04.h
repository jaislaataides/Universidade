//SUB ROTINA QUESTÃO 4 : NUMERO PRIMO

int primo(int a){
    int divisores=0;

    for(int i = 1; i < a; i++){
        if(a % i == 0){
            divisores++;
        }
    }

    if(divisores > 1){
        return 0;
    }else{
        return 1;
    }
}