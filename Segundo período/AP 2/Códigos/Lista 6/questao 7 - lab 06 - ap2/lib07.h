//SUB ROTINA QUESTÃO 7 : CALCULA TAXAS

float calculaTaxas(int carro, float horas){

    if(horas <= 3){
        clientes[carro].valor = 2.00;
    }else if(horas == 24){
        clientes[carro].valor = 10.00; 
    }else{
        clientes[carro].valor = (horas-3) * 0.5 + 2;
    }

    return clientes[carro].valor;
}