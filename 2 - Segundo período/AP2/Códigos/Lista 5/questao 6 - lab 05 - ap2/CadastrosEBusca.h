//SUB ROTINA QUESTÃO 6 : CADASTROS E BUSCA DE FUNCIONARIO

int i, j;
int auxiliar, input, acumulador = 0, comparacao;

void limpar()
{
    printf("\n(pressione enter para continuar)\n\n");
    getchar();
    system("cls");
    fflush(stdin);
}

void direcionarcadastro()
{
    if (und[0].numeroFilial == 0 && und[3].numeroFilial == 0)
    {
        printf("- Nao ha nenhuma empresa cadastrada ainda.");
        limpar();
        CadastrarEmpresa();
    }
}

void CadastrarEmpresa()
{
    for (i = 0; i < 4; i++)
    {
        fflush(stdin);
        printf("  -- C A D A S T R O   D E   E M P R E S A S --\n\n");
        printf("----------------- Unidade (%d/4) -----------------", i + 1);
        printf("\n- Escreva o nome da filial: ");

    lerfilial:
        scanf("%[^\n]", und[i].nomeFilial);
        fflush(stdin);

        for (j = i-1; j >= 0; j--)
        {
            auxiliar = strcmp(und[i].nomeFilial, und[j].nomeFilial);

            while (auxiliar == 0)
            {
                printf("\n+ O nome digitado esta registrado em outra filial.");
                printf("\n+ Por favor, digite novamente o nome unidade %d: ", i + 1);
                goto lerfilial;
            }
        }

        lernumerofilial:
        printf("\n- Escreva o numero da filial %s: ", und[i].nomeFilial);
        scanf("%d", &und[i].numeroFilial);

        for (j = i - 1; j >=0; j--)
        {
            while (und[i].numeroFilial == und[j].numeroFilial)
            {
                printf("\n+ O numero digitado esta cadastrado na filial %s!", und[j].nomeFilial);
                goto lernumerofilial;
            }
        }

        printf("\n\n---------- Unidade %s cadastrada! ----------\n\n", und[i].nomeFilial);

        // atribuicao de numero filial para funcionarios
        for (j = 0; j < 2; j++)
        {
            und[i].func[j].numeroFilial = und[i].numeroFilial;
        }

        limpar();
    }
}

void cadastrarFuncionario()
{
    char inputt[50];
    int cargo;
    auxiliar=0;

    system("cls");

    // verifica se ha empresas cadastradas
    direcionarcadastro();

    for (int k=0; k<8; k++)
        {
        printf("---- C A D A S T R O   D E   F U N C I O N A R I O S ----\n");

        insertnumerofilial:
        acumulador=0;
        printf("\n- Qual o numero da filial na qual o funcionario sera cadastrado? ");
        scanf("%d", &input);

        // verifica em qual empresa o funcionario sera alocado
        for (i = 0; i < 4; i++)
        {
            if (input == und[i].numeroFilial){
                auxiliar = i;
                acumulador++;
            }
        }

        // tratamento de erro caso o numero inserido nao seja correspondente a uma filial cadastrada
        if (acumulador == 0)
        {
            printf("\n+O numero digitado nao esta cadastrado em nossos dados, por favor, digite o numero da filial novamente: \n");
            goto insertnumerofilial;
        }

        // verifica se ja ha 2 pessoas em uma unidade
        if(und[auxiliar].func[0].salario!=0 && und[auxiliar].func[1].salario!=0)
        {
            printf("\n+ A filial informada ja tem 2 pessoas nessa unidade. Por favor, responda novamente:\n");
            goto insertnumerofilial;
        }

        // entrada de codigo do funcionario
        insertcodigofuncionario:
        printf("\n- Escreva o codigo do funcionario: ");
        scanf("%d", &input);

        // comparação se o codigo nao foi utilizado por outro trabalhador
        for (i=0; i<4; i++)
        {
            for (j=0; j<2; j++)
            {
                if (input == und[i].func[j].codigoFuncionario)
                {
                    printf("\n+ O codigo inserido ja esta cadastrado para outro funcionario\n");
                    goto insertcodigofuncionario;
                }
            }
        }

        // entrada de nome do funcionario
        fflush(stdin);
        printf("\n- Escreva o nome do funcionario: ");
        scanf("%[^\n]", inputt);

        // entrada de cargo do funcionario
        insertcargo:
        printf("\n- Qual o cargo de %s? \n0- vendedor \t1- gerente\n", inputt);
        printf("Escolha: ");
        scanf("%d", &cargo);

        // tratamento de erro
        if (cargo !=0 && cargo !=1)
        {
            printf("\n+O numero digitado nao e valido. Por favor, digite novamente:");
            goto insertcargo;
        }
        else if (cargo == 0)
        {

            //verifica se o cargo esta vago
            if(und[auxiliar].func[0].salario==0)
            {

            // atribuição das strings
            strcpy(und[auxiliar].func[0].cargo, "vendedor");
            }else
            {
                printf("\n+Ja ha um funcionario nessa filial nesse cargo! Digite de novo:");
                goto insertcargo;
            }
        }else
        {
            if(und[auxiliar].func[1].salario==0)
            {
            strcpy(und[auxiliar].func[1].cargo, "gerente");
            }else
            {
                printf("\n+Ja ha um funcionario nessa filial nesse cargo! Digite de novo:");
                goto insertcargo;
            }
        }
        strcpy(und[auxiliar].func[cargo].nomeFuncionario, inputt);

        und[auxiliar].func[cargo].codigoFuncionario = input;

        // entrada de salario do funcionario
        do
        {
            printf("\n- Qual o salario do funcionario %s?\n", und[auxiliar].func[cargo].nomeFuncionario);
            printf("R$ ");
            scanf("%f", &und[auxiliar].func[cargo].salario);

            if (und[auxiliar].func[cargo].salario <= 0)
            {
                printf("\n+ O valor inserido nao pode ser considerado um salario valido.");
            }
        } while (und[auxiliar].func[cargo].salario <= 0);
        
        limpar();
    }
}

void Buscador(){
    float salariogeral, salariofilial[4];

    system("cls");

    // verifica se ha empresas cadastradas
    direcionarcadastro();

    // verifica se ha funcionarios cadastrados
    if (und[0].func[0].salario == 0){
        printf("\n+ Nao ha funcionarios cadastrados ainda.\n");
        limpar();
        cadastrarFuncionario();
    }

    for (i = 0; i < 4; i++){
        for (j = 0; j < 2; j++){
                printf("\nNa unidade de codigo %d estao cadastrados:\n", und[i].numeroFilial);

                printf("\n --- FUNCIONARIO %d ---\n", j+1);
                printf("\nNome: %s", und[i].func[j].nomeFuncionario);
                printf("\nCodigo: %d", und[i].func[j].codigoFuncionario);
                printf("\nCargo: %s", und[i].func[j].cargo);
                printf("\nSalario: %f", und[i].func[j].salario);

                salariofilial[i] += und[i].func[j].salario;
                printf("\n - O valor total gasto com funcionarios nessa unidade e' de R$ %.2f", salariofilial[i]);
                salariogeral += salariofilial[i];
                printf("\n\n\n");
        }
    }
    printf("\n\n\n");
    printf("\n --- O valor total gasto com todas as unidades e' de R$ %.2f ---", salariogeral);
    limpar();
}