//SUB ROTINA DA QUESTÃO 2

#include <stdio.h>

void Ordena(int a, int b, int c){
    if(a<c && b<c){
        if (a<b){
            printf("maior: %d   intermediario: %d  menor: %d",c,b,a);
        }else{
            printf("maior: %d   intermediario: %d  menor: %d",c,a,b);
        }
    }else if(c<a && b<a){
        if(b<c){
            printf("maior: %d   intermediario: %d  menor: %d",a,c,b);
        }else{
            printf("maior: %d   intermediario: %d  menor: %d",a,b,c);
        }
    }else if(c<b && a<b){
        if(c<a){
            printf("maior: %d   intermediario: %d  menor: %d",b,a,c);
        }else{
            printf("maior: %d   intermediario: %d  menor: %d",b,c,a);
        }
    }else{
        printf("maior: %d   intermediario: %d  menor: %d",b,c,a);
    }
}