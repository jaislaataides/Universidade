void funcao(int segundos){
    int minutos = 0, horas = 0;

    horas  = segundos/3600;
    minutos = (segundos%horas)/60;
    segundos = segundos%minutos;

    printf("%d horas : %d minutos : %d segundos",horas, minutos, segundos);
}