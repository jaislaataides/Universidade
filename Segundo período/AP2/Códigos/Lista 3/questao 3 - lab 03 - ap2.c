//      ENUNCIADO:

// Escreva um trecho de código para fazer a criação dos novos tipos de dados conforme 
// solicitado abaixo: 
// • Horário: composto de hora, minutos e segundos. 
// • Data: composto de dia, mês e ano. 
// • Agenda: composto de uma data, horário e texto que descreve o compromisso.


#include <stdio.h>

void verificadortemporizador(int a)
{
    while (a<0 || a>60)
    {
        system("cls");
        printf("Esse valor não é válido, por favor, digite novamente: \n");
        scanf("%d",&a);
    }
}

void main()
{
    struct horario
    {
        int hora, min, seg;
    };
    struct data
    {
        int dia, mes, ano;
        struct horario horas;
    };
    struct agenda
    {
        char compromisso[50];
        struct data dataa;
    }usuario1;
    
    printf("------ DATA ------");
    printf("\nDigite o dia: ");
    scanf("%d",&usuario1.dataa.dia);
    
    //tratamento de erro para dias do mês
    while(usuario1.dataa.dia<0 || usuario1.dataa.dia>30)
    {
        printf("\nO dia informado não e compativel com o calendario.\nPor favor, digite o dia novamente:\n");
        scanf("%d",&usuario1.dataa.dia);
        system("cls");
    }

    // fim do tratamento de erro
    printf("\nDigite o mes: ");
    printf("\n1- janeiro\n2- fevereiro\n3- marco\n4- abril\n5- maio\n6- junho");
    printf("\n7- julho\n 8- agosto\n9- setembro\n10- outubro \n11- novembro\n12- dezembro\n");
    scanf("%d",&usuario1.dataa.mes);
    
    //tratamento de erro para meses do ano
    while(usuario1.dataa.mes<0 || usuario1.dataa.mes>12)
    {
        printf("\nO mes informado nao e valido.\nPor favor, digite o mes novamente:");
        scanf("%d", &usuario1.dataa.mes);
        system("cls");
    }

    //fim do tratamento de erro para meses do ano

    printf("\nDigite o ano: ");
    scanf("%d",&usuario1.dataa.ano);

    system("cls");
    printf("\n---- HORARIO ----");
    printf("\nDigite a hora: ");
    scanf("%d",&usuario1.dataa.horas.hora);

    while(usuario1.dataa.horas.hora<0 || usuario1.dataa.horas.hora>23)
    {
        printf("\nA hora digitada nao e valida.\nOs minutos devem ser informados mais tarde.\n\nDigite um horário entre 0h  e 23h.");
        scanf("%d",&usuario1.dataa.horas.hora);
    }

    printf("\nDigite os minutos: ");
    scanf("%d",&usuario1.dataa.horas.min);
    verificador(usuario1.dataa.horas.min);

    printf("\nDigite os segundos: ");
    scanf("%d",&usuario1.dataa.horas.seg);
    verificador(usuario1.dataa.horas.min);
    fflush(stdin);

    system("cls");
    printf("---- COMPROMISSO ----");
    printf("\nQual e o seu compromisso nessa data?\n");
    gets(usuario1.compromisso);

    system("cls");
    printf("Na data: %2d/%2d/%4d",usuario1.dataa.dia, usuario1.dataa.mes,usuario1.dataa.ano);
    printf("\nAs %2d:%2d:%2d\n",usuario1.dataa.horas.hora, usuario1.dataa.horas.min, usuario1.dataa.horas.seg);
    printf("Voce tem %s marcado.", usuario1.compromisso);
}