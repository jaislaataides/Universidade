//SUB ROTINA QUESTÃO 5 : SALARIO POR HORA

void salarioHorario(char numero[]){

    float salario;

    salario = empregado.horasTrabalhadas * empregado.valorPorHora;
    
    printf("Funcionario \tSalario");
    printf("\n%s       \tR$%.2f",numero,salario);
}