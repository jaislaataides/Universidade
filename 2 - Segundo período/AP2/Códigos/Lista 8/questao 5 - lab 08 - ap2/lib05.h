//SUB ROTINA QUESTÃO 5 : PESO

void AcharMaiorPeso(struct nutricionista *pacientes){
    float maiorpeso;
    char name[50];

    for (int i = 0; i < 5; i++){
        if (pacientes[i].peso >= maiorpeso){
            maiorpeso = pacientes[i].peso;
            strcpy(name, pacientes[i].nome);
        }
    }
    printf("\nO paciente %s tem o maior peso registrado!",name);
}

void AcimaPesoIdeal(struct nutricionista *pacientes){
    float pesoIdeal;

    for(int i = 0; i < 5; i++){
        if(pacientes[i].sexo == 'f' || pacientes[i].sexo == 'F'){
            pesoIdeal = (72.7 * pacientes[i].altura) - 58;

        }else if(pacientes[i].sexo == 'm' || pacientes[i].sexo == 'M'){
            pesoIdeal = (62.1 * pacientes[i].altura) - 44.7;
        }

        if(pacientes[i].peso > pesoIdeal){
            printf("\nO paciente %s, de %d anos, esta acima de seu peso ideal!",pacientes[i].nome,pacientes[i].idade);
        }
    }
}

void AbaixoPesoIdeal(struct nutricionista *pacientes){
    float pesoIdeal;

    for(int i = 0; i < 5; i++){
        if(pacientes[i].sexo == 'f' || pacientes[i].sexo == 'F'){
            pesoIdeal = (72.7 * pacientes[i].altura) - 58;

        }else if(pacientes[i].sexo == 'm' || pacientes[i].sexo == 'M'){
            pesoIdeal = (62.1 * pacientes[i].altura) - 44.7;
        }

        if(pacientes[i].peso < pesoIdeal){
            printf("\nO paciente %s esta abaixo de seu peso ideal!",pacientes[i].nome);
            printf("\nO paciente precisa obter %.2fkg para atingir seu peso ideal!",pesoIdeal-pacientes[i].peso);
        }
    }
}