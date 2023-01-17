//SUB ROTINA DA QUESTÃO 3 : CARACTERIZADOR KKK

void Caracterizador(char *frase, char simbolo){

    for (int i = 0; frase[i] != '\0'; i++){

        if(frase[i] == 'a' || frase[i] == 'A' ){
            frase[i] = simbolo;

        }else if(frase[i] == 'e' || frase[i] == 'E'){
            frase[i] = simbolo;

        }else if(frase[i] == 'o'|| frase[i] == 'O'){
            frase[i] = simbolo;

        }else if(frase[i] == 'u' || frase[i] == 'U'){
            frase[i] = simbolo;
            
        }else if(frase[i] == 'i' || frase[i] == 'I'){
            frase[i] = simbolo;
        }
    }
}