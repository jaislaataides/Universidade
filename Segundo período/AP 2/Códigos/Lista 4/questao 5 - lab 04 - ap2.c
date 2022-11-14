//      ENUNCIADO:

// Faça um programa que gerencie o estoque de um mercado e: 
// • Crie e leia um vetor de 5 produtos, com os dados: código (inteiro), nome (máximo 15 letras), preço. 
// • Leia um pedido, composto por um código de produto e a quantidade. Localize este código no vetor 
// e, se houver quantidade suficiente para atender ao pedido integralmente, atualize o estoque e 
// informe o usuário. Repita este processo até ler um código igual a zero. Se por algum motivo não for 
// possível atender ao pedido, mostre uma mensagem informando qual erro ocorreu. 

#include <stdio.h>

void main()
{
    struct dadosprodutos
    {
        int codigo, estoque;
        char nome[15];
        float preco;
    }produto[5];

    int i, j=0, cod=1, quantidade;
    
    for(i = 0; i < 5; i++)
    {
        //loop de cadastro de produtos
        printf("-- PRODUTO %d --",i+1);
        printf("\nNome do produto: ");
        scanf("%[^\n]",produto[i].nome);
        fflush(stdin);

        printf("\nCodigo: ");
        scanf("%d",&produto[i].codigo);
        fflush(stdin);

        printf("\nQuantidade disponivel: ");
        scanf("%d",&produto[i].estoque);
        fflush(stdin);

        printf("\nPreco: ");
        scanf("%f",&produto[i].preco);
        fflush(stdin);

        system("cls");
    }

    //loop para sair de execucao apenas quando o codigo digitado for 0
    do
    {
        int produto_encontrado=0;

        printf("---- Comprar ----");
        printf("\nPara finalizar a execucao digite 0");
        printf("\nDigite o codigo do produto: ");
        scanf("%d",&cod);

        if (cod != 0)
        {
            printf("\nDigite a quantidade desejada: ");
            scanf("%d",&quantidade);

            //tratamento de erro: quantidade invalida
            while(quantidade <= 0)
            {
                printf("\n\nA quantidade digitada nao pode ser aceita. Por favor, digite um valor valido: ");
                scanf("%d",&quantidade);
            }
            for (i = 0; i < 1; i++)
            {
                //verifica se o produto está cadastrado
                if (cod == produto[i].codigo)
                {
                    //verifica se há estoque disponível caso o produto seja encontrado
                    if (quantidade <= produto[i].estoque)
                    {
                        //atualiza o estoque
                        produto[i].estoque -= quantidade;

                        //mensagem mostrada para compra realizada
                        printf("\nCompra realizada! Estoque atualizado para %d.",produto[i].estoque);
                        printf("\nO valor da compra foi de R$%.2f.\n\n",produto[i].preco*quantidade);

                        //atualiza parametro para produtoencontrado
                        produto_encontrado++;
                    }else
                    {
                        //caso o produto seja encontrado mas não haja estoque disponível
                        produto_encontrado++;
                        printf("\nEstoque insuficiente!\n\n");
                    }
                } 
            }

            //caso o produto não seja encontrado
            if(produto_encontrado == 0)
            {
                printf("\nO codigo digitado nao foi encontrado, por favor digite o codigo novamente.\n\n");
            }
            system("pause");
            system("cls");
        } 

    }while(cod > 0);

    if(cod < 0)
    {
        printf("\nO codigo digitado e' menor que 0.");
    }
}