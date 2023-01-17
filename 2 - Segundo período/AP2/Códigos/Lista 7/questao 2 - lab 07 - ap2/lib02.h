//SUB ROTINA QUESTÃO 2 : ORDENADOR COM PONTEIROS

void ordenador(int *a, int *b, int *c){
    int auxiliar;

    if (*a >= *b && *a >= *c){

        if(*c > *b){
            //b < c < a
            auxiliar = *b;
            *b = *a;
            *a = auxiliar;
            
            auxiliar = *b;
            *b = *c;
            *c = auxiliar;

        }else{
            //c < b < a
            auxiliar = *c;
            *c = *a;
            *a = auxiliar;
        }

    }else if(*b >= *c && *b >= *a){

        if(*c > *a){
            //a < c < b
            auxiliar=*b;
            *b = *c;
            *c = auxiliar; 

        }else{
            //c < a < b
            auxiliar = *a;
            *a = *c;
            *c = auxiliar;

            auxiliar = *b;
            *b = *c;
            *c = auxiliar;
        }

    }else if(*c >= *a && *c >= *b){

        if(*a > *b){
            // b < a < c
            auxiliar = *a;
            *a = *b; 
            *b = auxiliar;


        }else{
            // a < b < c
            //ja esta ordenado
        }
    }
}