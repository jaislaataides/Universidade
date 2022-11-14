//SUB ROTINA QUESTÃO 4 : CALCULADOR DE MÉDIA

float media;

void mediaAritmetica(){
    media = (nota1 + nota2 + nota3) / 3;
    printf("A media aritmetica e' %.2f", media);
}

void mediaPonderada (){
    media = (nota1 * 5 + nota2 * 3 + nota3 *2 ) / 10; 
    printf("A media ponderada e' %.2f", media);
}