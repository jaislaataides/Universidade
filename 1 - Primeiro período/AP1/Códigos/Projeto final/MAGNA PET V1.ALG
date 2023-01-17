Algoritmo "Magna Pet v1"
//  Disciplina : Algoritmos  e Programação 1
//  Professor  : Ana Paula Freitas Vilela
//    Nome     : Magna Pet
//    Tema     : Aplicação de monitoramento pet em função do tempo
//   Alunos    : Jaisla Ataídes

Var
   //sistema matricial de meses
   meses1: vetor [1..12,1..31] de inteiro
   meses2: vetor [1..12,1..31] de inteiro
   meses3: vetor [1..12,1..31] de inteiro

   //dados utilizados na cartilha
   dono: caractere
   pet,animal,raca,doenca,cor,genero: vetor [1..3] de caractere
   tamanho,idade,peso: vetor [1..3] de inteiro

   //vetores de dados diários
   humor,alimentacao: vetor [1..5] de caractere
   irregularidades: vetor [1..8] de caractere
   medicacao: vetor [1..3] de caractere
   urina: vetor [1..4] de caractere
   fezes:vetor [1..10] de caractere
   vetormedicacao: vetor [1..31] de caractere

   // variáveis de dados diários
   mes,dia : inteiro
   medicacaoderotina : caractere
   petEscolhido : inteiro

   //vetores auxiliares
   vetorAuxiliarMatriz : vetor [1..9] de inteiro
   diasPorMes:vetor [1..12] de inteiro
   validadeDeCaractere : vetor [1..20] de logico

   //variáveis auxiliares
   posicao,expoente,decisor,codigo,algarismo,potencia:inteiro
   auxiliarAlgarismo:real
   enter:caractere
   quantidadedepets,contador,contador2,acumulador: inteiro
   validade: logico

   //variáveis de loop
   decisaoMenuInicial, decisaoMenuPrincipal,decisaoMenuCalendario,decisaoMenuCartilha: inteiro
   loopMenuCartilha,loopMenuCalendario: logico
   loopAcessoDados:inteiro

   //--------- P R O C E D I M E N T O S   E   F U N Ç Õ E S ----------------
   //--------------------- tratamentos de erro ------------------------------

   //------------- tratamento de erro para caractere ------------------------
procedimento TratamentoDeErroChar (var a: caractere)
inicio
   enquanto a="" faca
      escreval("")
      escreval("Nada foi digitado, por favor, digite novamente.")
      leia (a)
      limpatela
   fimenquanto
fimprocedimento

//----------------- tratamento de erro para inteiro -------------------------
procedimento TratamentoDeErroInt (var a:inteiro)
inicio
   enquanto a<=0 faca
      escreval("")
      escreval("O valor inserido não é válido, por gentileza, escreva novamente.")
      leia (a)
      limpatela
   fimenquanto
fimprocedimento

//-------------- tratamento de erro números na string ------------------------
//--- usa
Procedimento tratamentoDeErroNumInChar(var nome: caractere)
var
   comprimento,n,p,contador,char: inteiro
   aux:caractere
inicio
   validade<-falso
   enquanto (validade=falso) faca
      n<-1
      p<-1
      comprimento<-compr(nome)
      para contador de 1 até comprimento faca
         Aux<-copia(nome;n,p)
         char<-Asc(aux)
         se  (char>=65) e (char<=90) entao
            validadeDeCaractere[contador]<-verdadeiro
         senao
            se  (char>=97) e (char<=122) entao
               validadeDeCaractere[contador]<-verdadeiro
            senao
               validadeDeCaractere[contador]<-falso
            fimse
         fimse
         n<-n+1
      fimpara
      validade<-verdadeiro
      para contador de 1 ate comprimento faca
         se validadeDeCaractere[contador]=falso entao
            validade<-falso
         fimse
      fimpara
      se validade=falso entao
         escreval(":")
         escreval("......................................................")
         escreval(": Nesse campo não são permitidos símbolos ou números :")
         escreval(":         Por favor, nos informe novamente           :")
         escreval(":....................................................:")
         escreva(":   ")
         leia (nome)
      fimse
   fimenquanto
Fimprocedimento
//--------------------------- ESTRUTURAS ------------------------------------

//--------------------- Cadastro De Informações -----------------------------
procedimento cadastro()
inicio
   limpatela
   se (decisaoMenuInicial=1) entao
      escreval(" ......................................................")
      escreval(" :         Esse pet ainda não está cadastrado         :")
      escreval(" :                                                    :")
      escreval(" :           Preencha os dados a seguir:              :")
      escreval(" :....................................................:")
   senao
      //----------------------- nome --------------------------------
      limpatela
      escreval(" ......................................................")
      escreval(" :                  Escreva o seu nome                :")
      escreval(" :....................................................:")
      escreva(":   ")
      leia (dono)
      se dono="" entao
         TratamentoDeErroChar(dono)
         tratamentoDeErroNumInChar(dono)
      fimse
      limpatela
   fimse

   //----------------- quantidade de pets ---------------------------
   escreval("........................................................")
   escreval(": Quantos pets deseja cadastrar?            [máximo 3] :")
   escreva(":   ")
   leia(quantidadedepets)
   //--- tratamento de erro ---
   enquanto (quantidadedepets<=0) ou (quantidadedepets>4) faca
      limpatela
      escreval(".............................................................")
      escreval(":      Desculpe, o número digitado não pode ser aceito.     :")
      escreval(":O limite de pets que podem ser cadastrados nesse plano é 3.:")
      escreval(":                                                           :")
      escreval(":    Por favor, nos informe quantos pets deseja cadastrar.  :")
      escreval(".............................................................")
      escreval("")
      escreva(":      ")
      leia(quantidadedepets)
   fimenquanto
   repita
      contador<-contador+1

      //-------------------- nome pet -----------------------------
      escreval("........................................................")
      escreval (": Agora, nós precisamos saber o nome do ",contador,"° animalzinho")
      escreva(":   ")
      leia(pet[contador])
      se pet[contador]="" entao
         TratamentoDeErroChar(pet[contador])
         tratamentoDeErroNumInChar(pet[contador])
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //---------------------- sexo -------------------------------
      escreval(":Nos conte: ",pet[contador]," é macho ou fêmea? (digite M ou F):")
      escreva(":   ")
      leia (genero[contador])
      enquanto (genero[contador]<>"m") e (genero[contador]<>"M") e (genero[contador]<>"f") e (genero[contador]<>"F") faca
         limpatela
         escreval("...................................................................")
         escreval(":  Desculpe, você não seguiu a orientação ou digitou algo errado...")
         escreval(":    Por favor, novamente, digite M para macho e F para fêmea     :")
         escreval(":.................................................................:")
         escreval("")
         escreva(":    ")
         leia (genero[contador])
      fimenquanto
      se (genero[contador]="m") ou (genero[contador]="M") entao
         genero[contador]<-"Macho"
      senao
         genero[contador]<-"Fêmea"
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //------------------- qual animal ---------------------------
      escreval(": Legal, que tipo de animal é ",pet[contador],"?      ")
      escreva(":   ")
      leia (animal[contador])
      se animal[contador]="" entao
         TratamentoDeErroChar(animal[contador])
         tratamentoDeErroNumInChar(animal[contador])
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //---------------------- raça -------------------------------
      escreval(":",pet[contador]," tem raça definida? Se sim, qual?    ")
      escreval(":           (se não, pressione enter)                  ")
      escreva(":   ")
      leia (raca[contador])
      se raca[contador]="" entao
         raca[contador]<-"Sem raça definida"
      senao
         tratamentoDeErroNumInChar(raca[contador])
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //--------´---------- doença crônica ------------------------
      escreval(":",pet[contador]," possui alguma doença crônica? Se sim, qual?:")
      escreval(":              (se não aperte enter)                    ")
      escreva(":   ")
      leia (doenca[contador])
      se doenca[contador]="" entao
         doenca[contador]<-"Não possui"
      senao
         tratamentoDeErroNumInChar(doenca[contador])
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //---------------- cor ou característica --------------------
      escreval(":Escreva a cor de ",pet[contador]," ou característica:")
      escreva(":   ")
      leia (cor[contador])
      se (cor[contador]="") entao
         TratamentoDeErroChar(cor[contador])
      fimse
      tratamentoDeErroNumInChar(cor[contador])
      escreval(":                                                       ")
      escreval("........................................................")

      //------------------------ peso ------------------------------
      escreval(": Qual é o peso de ",pet[contador]," em gramas?  ")
      escreva(":   ")
      leia (peso[contador])
      se peso[contador]<=0 entao
         TratamentoDeErroInt(peso[contador])
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //---------------------- tamanho -----------------------------
      escreval(":  Qual o tamanho de ",pet[contador]," EM CENTÍMETROS?  ")
      escreva(":   ")
      leia (tamanho[contador])
      se tamanho[contador]<=0 entao
         TratamentoDeErroInt(tamanho[contador])
      fimse
      escreval(":                                                       ")
      escreval("........................................................")

      //----------------------- idade ------------------------------
      escreval(":  Qual a idade de ",pet[contador]," em meses?   ")
      escreva(":   ")
      leia(idade[contador])
      se idade[contador]<=0 entao
         TratamentoDeErroInt(idade[contador])
      fimse
      limpatela
   ate contador=quantidadedepets
fimprocedimento

//---------------------- MENU PRINCIPAL -------------------------------------
procedimento menuPrincipal (var a:inteiro)
inicio
   limpatela
   escreval("......................................................")
   escreval(":             M E N U   P R I N C I P A L            :")
   escreval(":                                                    :")
   escreval(":                Para onde deseja ir ?               :")
   escreval(":                                                    :")
   escreval(":         [1] Cartilha (informações do animal)       :")
   escreval(":                  [2] Calendário                    :")
   escreval(":                     [3] Sair                       :")
   escreval(":....................................................:")
   escreval("")
   escreva("    ")
   leia (a)
   enquanto (a<=0) ou (a>3) faca  //tratamento de erro menu principal
      limpatela
      escreval("......................................................")
      escreval(":           O valor digitado não é válido.           :")
      escreval(":                                                    :")
      escreval(":                     Escolha:                       :")
      escreval(":                                                    :")
      escreval(":   [1] Visualizar cartilha (informações do animal)  :")
      escreval(":              [2] Ir ao calendário                  :")
      escreval(":                     [3] Sair                       :")
      escreval(":....................................................:")
      escreval("")
      escreva("    ")
      leia(a)
   fimenquanto
fimprocedimento

//---------------------- MENU CALENDÁRIO ------------------------------------
procedimento menuHistorico (var a:inteiro)
inicio
   limpatela
   escreval("......................................................")
   escreval(":                 C A L E N D Á R I O                :")
   escreval(":                                                    :")
   escreval(":                      Escolha:                      :")
   escreval(":                                                    :")
   escreval(":           [1] Inserir informações diárias          :")
   escreval(":               [2] Visualizar por data              :")
   escreval(":            [3] Voltar ao menu principal            :")
   escreval(":                     [4] Sair                       :")
   escreval(":....................................................:")
   escreval("")
   escreva("    ")
   leia (a)
   enquanto (a<=0) ou (a>4) faca  //tratamento de erro menu calendário
      limpatela
      escreval("......................................................")
      escreval(":           Você inseriu um número inválido.         :")
      escreval(":                                                    :")
      escreval(":           Por favor, selecione novamente:          :")
      escreval(":                                                    :")
      escreval(":           [1] Inserir informações diárias          :")
      escreval(":               [2] Visualizar por data              :")
      escreval(":            [3] Voltar ao menu principal            :")
      escreval(":                      [4] Sair                      :")
      escreval(":....................................................:")
      escreval("")
      escreva("    ")
      leia(a)
   fimenquanto
fimprocedimento

//---------------------- MENU CARTILHA ---------------------------------------
procedimento MenuCartilha(var a: inteiro)
inicio
   limpatela
   escreval("......................................................")
   escreval(":                  C A R T I L H A                   :")
   escreval(":                                                    :")
   escreval(":                     Selecione                      :")
   escreval(":                                                    :")
   escreval(":        [1] Editar informações da cartilha          :")
   escreval(":             [2] Inserir dados diários              :")
   escreval(":            [3] Voltar ao Menu Principal            :")
   escreval(":                     [4] Sair                       :")
   escreval(":....................................................:")
   escreval("")
   escreva("    ")
   leia (a)
   enquanto (a<=0) ou (a>5) faca
      limpatela
      escreval("......................................................")
      escreval(":           Você inseriu um número inválido.         :")
      escreval(":                                                    :")
      escreval(":               Selecione mais uma vez:              :")
      escreval(":                                                    :")
      escreval(":          [1] Editar informações da cartilha        :")
      escreval(":              [2] Inserir dados diários             :")
      escreval(":            [3] Voltar ao Menu Principal            :")
      escreval(":                     [4] Sair                       :")
      escreval(":....................................................:")
      escreval("")
      escreva("    ")
      leia (a)
   fimenquanto
fimprocedimento
//------------------------- SAIR --------------------------------
procedimento Sair()
inicio
   limpatela
   escreval("......................................................")
   escreval(":                                                    :")
   escreval(":             Esperamos te ver em breve!             :")
   escreval(":                                                    :")
   escreval(":....................................................:")
Fimalgoritmo
fimprocedimento

//================== OBTENÇÃO DE DADOS DIÁRIOS ==============================

//--------------------- Procedimento padrão ---------------------------------
procedimento DadosDiarios(var a: inteiro)
inicio
   se idade[a]=0 entao
      Cadastro()
   fimse
   humorDoDia(a)
   alimentacaoDoDia(a)
   medicacaoDoDia(a)
   urinaDoDia(a)
   fezesDoDia(a)
   irregularidadesDoDia(a)
   Compactador(a)
fimprocedimento

//------------------------- H U M O R -------------------------------------
procedimento humorDoDia(a:inteiro)
inicio
   limpatela
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":              D A D O S   D I Á R I O S         [1/6]  :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   se (genero[a]="Macho") entao
      escreval(":      Como estava o humor do seu amiguinho hoje?       ")
   senao
      escreval(":      Como estava o humor da sua princesinha hoje?     ")
   fimse
   escreval(":                                                       ")
   para contador de 1 ate 5 faca
      escreval(":         [",contador,"]  ",humor[contador])
   fimpara
   escreval(":                                                       ")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval("")
   escreva(":      ")
   leia (vetorAuxiliarMatriz[1])

   //------------------- tratamento de erro ----------------------------
   enquanto (vetorAuxiliarMatriz[1]<=0) ou (vetorAuxiliarMatriz[1]>5) faca
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [1/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":   O número digitado não é válido, digite novamente:   ")
      escreval(":                                                       ")
      se genero[a]="Macho" entao
         escreval(":      Como estava o humor do seu amiguinho hoje?       ")
      senao
         escreval(":      Como estava o humor da sua princesinha hoje?     ")
      fimse
      escreval(":                                                       ")
      para contador de 1 ate 5 faca
         escreval(":         [",contador,"]  ",humor[contador])
      fimpara
      escreval(":                                                       ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[1])
   fimenquanto
   escreval("")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":          Deseja assinalar mais uma alternativa?       :")
   escreval(":              Digite 1 para sim e 2 para não.          :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreva(":   -> ")
   leia (decisor)
   //---------- duas características --------------
   se decisor=1 entao
      escreval("")
      escreval("")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [1/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      se (genero[petEscolhido]="Macho") entao
         escreval(":      Como estava o humor do seu amiguinho hoje?     ")
      senao
         escreval(":      Como estava o humor da sua princesinha hoje?   ")
      fimse
      escreval("")
      para contador de 1 ate 5 faca
         escreval(":         [",contador,"]  ",humor[contador])
      fimpara
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[2])

      //------------------- tratamento de erro ----------------------------
      enquanto (vetorAuxiliarMatriz[2]<=0) ou (vetorAuxiliarMatriz[2]>5) faca
         limpatela
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval(":              D A D O S   D I Á R I O S         [1/6]  :")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval(":                                                        ")
         escreval(":   O número digitado não é válido, digite novamente:    ")
         escreval(":                                                        ")
         se genero[a]="Macho" entao
            escreval(":      Como estava o humor do seu amiguinho hoje?     ")
         senao
            escreval(":     Como estava o humor da sua princesinha hoje?    ")
         fimse
         escreval(":                                                        ")
         para contador de 1 ate 5 faca
            escreval(":          [",contador,"]  ",humor[contador])
         fimpara
         escreval(":                                                        ")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval("")
         escreva(":      ")
         leia (vetorAuxiliarMatriz[2])
      fimenquanto
   fimse
fimprocedimento

//-------------------- A L I M E N T A Ç Ã O --------------------------------
procedimento alimentacaoDoDia(a: inteiro)
inicio
   limpatela
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":              D A D O S   D I Á R I O S         [2/6]  :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":                                                       :")
   se genero[a]="Macho" entao
      escreval(":         Como seu amiguinho se alimentou hoje?       ")
   senao
      escreval(":          Como sua princesa se alimentou hoje?       ")
   fimse
   escreval(":                                                        ")
   para contador de 1 ate 5 faca
      escreval(":          [",contador,"]  ",alimentacao[contador])
   fimpara
   escreval(":                                                        ")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval("")
   escreva(":      ")
   leia (vetorAuxiliarMatriz[3])

   //------------------- tratamento de erro ----------------------------
   enquanto (vetorAuxiliarMatriz[3]<=0) ou (vetorAuxiliarMatriz[3]>5) faca
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [2/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                                                        ")
      escreval(":   O número digitado não é válido, digite novamente:    ")
      escreval(":                                                        ")
      se genero[a]="Macho" entao
         escreval(":         Como seu amiguinho se alimentou hoje?       ")
      senao
         escreval(":         Como sua princesa se alimentou hoje?        ")
      fimse
      escreval(":                                                        ")
      para contador de 1 ate 5 faca
         escreval(":          [",contador,"]  ",alimentacao[contador])
      fimpara
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[3])
   fimenquanto
fimprocedimento

//----------------------- M E D I C A Ç Ã O -------------------------------
procedimento medicacaoDoDia(a:inteiro)
inicio
   limpatela
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":              D A D O S   D I Á R I O S         [3/6]  :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":                                                        ")
   se genero[a]="Macho" entao
      escreval(":      ",pet[a]," foi medicado hoje?")
   senao
      escreval(":      ",pet[a]," foi medicada hoje?")
   fimse
   escreval(":                                                        ")
   para contador de 1 ate 3 faca
      escreval(":          [",contador,"]  ",medicacao[contador])
   fimpara
   escreval(":                                                        ")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval("")
   escreva(":      ")
   leia (vetorAuxiliarMatriz[4])

   //------------------- tratamento de erro ----------------------------
   enquanto (vetorAuxiliarMatriz[4]<=0) ou (vetorAuxiliarMatriz[4]>3) faca
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [3/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                                                        ")
      escreval(":   O número digitado não é válido, digite novamente:    ")
      escreval(":                                                        ")
      se genero[a]="Macho" entao
         escreval(":      ",pet[a]," foi medicado hoje?")
      senao
         escreval(":      ",pet[a]," foi medicada hoje?")
      fimse
      escreval(":                                                        ")
      para contador de 1 ate 3 faca
         escreval(":          [",contador,"]  ",medicacao[contador])
      fimpara
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[4])
   fimenquanto
   se (vetorAuxiliarMatriz[4]=2) e (medicacaoderotina="") entao
      escreval("")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":            Qual é a medicação de rotina?              :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (medicacaoderotina)
      escreval("")
   fimse
   se (vetorAuxiliarMatriz[4]=3) entao
      escreval("")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                Qual foi a medicação?                  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetormedicacao[1])
      escreval("")
   fimse
fimprocedimento

//-------------------------- U R I N A --------------------------------------
procedimento urinaDoDia (a:inteiro)
inicio
   limpatela
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":              D A D O S   D I Á R I O S         [4/6]  :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":                                                        ")
   escreval(":    Como foi a urina de ",pet[a]," hoje?")
   escreval(":                                                        ")
   para contador de 1 ate 4 faca
      escreval(":          [",contador,"]  ",urina[contador])
   fimpara
   escreval(":                                                        ")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval("")
   escreva(":      ")
   leia (vetorAuxiliarMatriz[5])

   //------------------- tratamento de erro ----------------------------
   enquanto (vetorAuxiliarMatriz[5]<=0) ou (vetorAuxiliarMatriz[5]>4) faca
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [4/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                                                        ")
      escreval(":   O número digitado não é válido, digite novamente:    ")
      escreval(":                                                        ")
      escreval(":    Como foi a urina de ",pet[a]," hoje?")
      escreval(":                                                        ")
      para contador de 1 ate 4 faca
         escreval(":          [",contador,"]  ",urina[contador])
      fimpara
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[5])
   fimenquanto
fimprocedimento

//--------------------------- F E Z E S -------------------------------------
procedimento fezesDoDia(a:inteiro)
inicio
   limpatela
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":              D A D O S   D I Á R I O S         [5/6]  :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":                                                        ")
   escreval(":    Como foram as fezes de ",pet[a]," hoje?")
   escreval(":                                                        ")
   para contador de 1 ate 9 faca
      escreval(":          [",contador,"]  ",fezes[contador])
   fimpara
   escreval(":                                                        ")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval("")
   escreva(":      ")
   leia (vetorAuxiliarMatriz[6])

   //------------------- tratamento de erro ----------------------------
   enquanto (vetorAuxiliarMatriz[6]<=0) ou (vetorAuxiliarMatriz[6]>9) faca
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [5/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                                                        ")
      escreval(":   O número digitado não é válido, digite novamente:    ")
      escreval(":                                                        ")
      escreval(":    Como foram as fezes de ",pet[a]," hoje?")
      escreval(":                                                        ")
      para contador de 1 ate 9 faca
         escreval(":          [",contador,"]  ",fezes[contador])
      fimpara
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[6])
   fimenquanto
   escreval("")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":          Deseja assinalar mais uma alternativa?       :")
   escreval(":              Digite 1 para sim e 2 para não.          :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreva(":   -> ")
   leia (decisor)
   //---------- duas características -----------
   se decisor=1 entao
      escreval("")
      escreval("")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [5/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                                                        ")
      escreval(":    Como foram as fezes de ",pet[a]," hoje?")
      escreval(":                                                        ")
      para contador de 1 ate 9 faca
         escreval(":          [",contador,"]  ",fezes[contador])
      fimpara
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[7])

      //------------------- tratamento de erro ----------------------------
      enquanto (vetorAuxiliarMatriz[7]<=0) ou (vetorAuxiliarMatriz[7]>9) faca
         limpatela
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval(":              D A D O S   D I Á R I O S         [5/6]  :")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval(":                                                        ")
         escreval(":   O número digitado não é válido, digite novamente:    ")
         escreval(":                                                        ")
         escreval(":    Como foram as fezes de ",pet[a]," hoje?")
         escreval(":                                                        ")
         para contador de 1 ate 9 faca
            escreval(":          [",contador,"]  ",fezes[contador])
         fimpara
         escreval(":                                                        ")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval("")
         escreva(":      ")
         leia (vetorAuxiliarMatriz[7])
      fimenquanto
   fimse
fimprocedimento

//------------------  I R R E G U L A R I D A D E S -------------------------
procedimento irregularidadesDoDia(a: inteiro)
inicio
   limpatela
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":              D A D O S   D I Á R I O S         [6/6]  :")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval(":                                                        ")
   escreval(": Houve algo com ",pet[a]," que ainda não foi dito?")
   escreval(":                                                        ")
   para contador de 1 ate 7 faca
      escreval(":          [",contador,"]  ",irregularidades[contador])
   fimpara
   escreval(":          [ 8]  não                                     ")
   escreval(":                                                        ")
   escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
   escreval("")
   escreva(":      ")
   leia (vetorAuxiliarMatriz[8])
   enquanto (vetorAuxiliarMatriz[8]<=0) ou (vetorAuxiliarMatriz[8]>8) faca  //tratamento de erro
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":              D A D O S   D I Á R I O S         [6/6]  :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":                                                        ")
      escreval(":   O número digitado não é válido, digite novamente:    ")
      escreval(":                                                        ")
      escreval(":    Houve algo mais com ",pet[a]," hoje?")
      escreval(":                                                        ")
      para contador de 1 ate 7 faca
         escreval(":          [",contador,"]  ",irregularidades[contador])
      fimpara
      escreval(":          [ 8]  não                                     ")
      escreval(":                                                        ")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval("")
      escreva(":      ")
      leia (vetorAuxiliarMatriz[8])
      escreval("")
   fimenquanto
   se (vetorAuxiliarMatriz[8]<>8) entao
      escreval("")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":          Deseja assinalar mais uma alternativa?       :")
      escreval(":              Digite 1 para sim e 2 para não.          :")
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreva(":   -> ")
      leia (decisor)
      //---------- duas características -------------
      se decisor=1 entao
         escreval("")
         escreval("")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval(":              D A D O S   D I Á R I O S         [6/6]  :")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval(":                                                        ")
         escreval(":    Como foram as fezes de ",pet[a]," hoje?")
         escreval(":                                                        ")
         para contador de 1 ate 7 faca
            escreval(":          [",contador,"]  ",irregularidades[contador])
         fimpara
         escreval(":          [ 8]  não                                     ")
         escreval(":                                                        ")
         escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
         escreval("")
         escreva(":      ")
         leia (vetorAuxiliarMatriz[9])
         enquanto (vetorAuxiliarMatriz[9]<=0) ou (vetorAuxiliarMatriz[9]>7) faca  //tratamento de erro
            limpatela
            escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
            escreval(":              D A D O S   D I Á R I O S         [6/6]  :")
            escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
            escreval(":                                                        ")
            escreval(":   O número digitado não é válido, digite novamente:    ")
            escreval(":                                                        ")
            escreval(":    Como foram as fezes de ",pet[a]," hoje?")
            escreval(":                                                        ")
            para contador de 1 ate 8 faca
               escreval(":          [",contador,"]  ",irregularidades[contador])
            fimpara
            escreval(":                                                        ")
            escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
            escreval("")
            escreva(":      ")
            leia (vetorAuxiliarMatriz[9])
         fimenquanto
      fimse
   fimse
fimprocedimento

//======================== C O M P A C T A D O R =============================
//Esse procedimento armazena valores provenientes de todos os vetores
//de dados diários em uma única posição de matriz
procedimento Compactador (a: inteiro)
inicio
   posicao<-0
   codigo<-0
   para expoente de 8 ate 0 passo -1 faca
      posicao<-posicao+1
      auxiliarAlgarismo<-vetorAuxiliarMatriz[posicao]*10^(expoente)
      algarismo<-Int(auxiliarAlgarismo)
      codigo<-codigo+algarismo
   fimpara

   //--------------- A T R I B U I D O R   I N T E G R A D O --------------------
   //recebimento de data de armazenamento
   //recebimento de mês de armazenamento
   limpatela
   escreval("......................................................")
   escreval(":      Em que mês esses dados serão armazenados?     :")
   escreval(":....................................................:")
   escreval(":")
   escreva(":   Mês: ")
   leia(mes)
   // tratamento de erro (inserção de mês inexistente)
   enquanto (mes<1) ou (mes>12) faca
      limpatela
      escreval("......................................................")
      escreval(":      Em que mês esses dados serão armazenados?     :")
      escreval(":....................................................:")
      escreval(":")
      escreva(":   Mês: ")
      leia(mes)
   fimenquanto
   //recebimento de dia de armazenamento
   escreval(":")
   escreval(":....................................................:")
   escreval(":              Em que dia, exatamente?               :")
   escreval(":....................................................:")
   escreval(":")
   escreva(":   Dia: ")
   leia (dia)
   //tratamento de erro (inserção de dia inexistente)
   enquanto (dia>diasPorMes[mes]) ou (dia<=0) faca
      limpatela
      escreval("......................................................")
      escreval(":       O mês referido não tem o dia digitado.       :")
      escreval(":                                                    :")
      escreval(":         Digite novamente, por gentileza:           :")
      escreval(":                                                    :")
      escreval(":      Em que mês esses dados serão armazenados?     :")
      escreval(":....................................................:")
      escreval(":")
      escreva(":   Mês: ")
      leia(mes)
      escreval("")
      escreval(":....................................................:")
      escreval(":            Em que dia, especificamente?            :")
      escreval(":....................................................:")
      escreval(":")
      escreva(":   Dia: ")
      leia (dia)
   fimenquanto
   //atribuição propriamente dita à posição da matriz
   se a=1 entao
      meses1[mes,dia]<-codigo
   senao
      se a=2 entao
         meses2[mes,dia]<-codigo
      senao
         meses3[mes,dia]<-codigo
      fimse
   fimse
fimprocedimento

//==================== D E S C O M P A C T A D O R ============================
//Esse procedimento retira de uma posição os valores referentes aos dados diários
procedimento Descompactador(a:inteiro)
inicio
   se idade[1]=0 entao
      cadastro()
   fimse
   loopAcessoDados<-0
   enquanto loopAcessoDados=0 faca
      //leitura do mês de armazenamento
      codigo<-0
      limpatela
      escreval("........................................................")
      escreval(":              {ACESSAR DADOS DIÁRIOS}                 :")
      escreval(":                                                      :")
      escreval(":   Para qual pet deseja procurar os dados do dia?     :")
      escreval(":                                                      :")
      para contador de 1 ate quantidadedepets faca
         escreval(":          [",contador,"] ",pet[contador],".")
      fimpara
      escreval("........................................................")
      escreval(":")
      escreva("   -> ")
      leia(petEscolhido)
      enquanto (petEscolhido<=0) ou (petEscolhido>3) faca
         limpatela
         escreval(".............................................................")
         escreval(":      Desculpe, o número digitado não pode ser aceito.     :")
         escreval(":O limite de pets que podem ser cadastrados nesse plano é 3.:")
         escreval(":                                                           :")
         escreval(":          Por favor, nos informe de qual pet são           :")
         escreval(":                os dados que deseja acessar.               :")
         escreval(":                                                           :")
         para contador de 1 ate quantidadedepets faca
            escreval(":       [",contador,"] ",pet[contador],".")
         fimpara
         escreval(".............................................................")
         escreval("")
         escreva("   -> ")
         leia(petEscolhido)
      fimenquanto
      escreval(":")
      escreval("......................................................")
      escreval(":             Em que mês estão armazenados           :")
      escreval(":            os dados que deseja consultar?          :")
      escreval(":....................................................:")
      escreval(":")
      escreva(":   Mês: ")
      leia(mes)
      escreval(":")
      // tratamento de erro (inserção de mês inexistente)
      enquanto (mes<1) ou (mes>12) faca
         escreval("......................................................")
         escreval(":      Em que mês esses dados estão armazenados?     :")
         escreval(":....................................................:")
         escreva(":   Mês: ")
         leia(mes)
      fimenquanto
      //leitura de dia de armazenamento
      escreval(":")
      escreval("......................................................")
      escreval(":              Em que dia, exatamente?               :")
      escreval(":....................................................:")
      escreval(":")
      escreva(":   Dia: ")
      leia (dia)
      //tratamento de erro (inserção de dia inexistente)
      enquanto (dia>diasPorMes[mes]) ou (dia<=0) faca
         limpatela
         escreval("......................................................")
         escreval(":       O mês referido não tem o dia digitado.       :")
         escreval(":                                                    :")
         escreval(":          Digite novamente, por gentileza:          :")
         escreval(":                                                    :")
         escreval(":        Em que mês os dados estão armazenados?      :")
         escreval(":....................................................:")
         escreval(":")
         escreva(":   Mês: ")
         leia(mes)
         escreval(":")
         escreval("......................................................")
         escreval(":          Em que dia, especificamente?              :")
         escreval(":....................................................:")
         escreval(":")
         escreva(":   Dia: ")
         leia (dia)
      fimenquanto
      //escolhe sistema matricial por pet
      se (a=1) entao
         codigo<-meses1[mes,dia]
      senao
         se (a=2) entao
            codigo<-meses2[mes,dia]
         senao
            codigo<-meses3[mes,dia]
         fimse
      fimse
      se (codigo<>0) entao
         loopAcessoDados<-1
         // descompactador do codigo
         posicao<-9
         para expoente de 0 ate 7 faca
            contador<-0
            potencia<-1
            se expoente<>0 entao
               repita
                  potencia<-potencia*10
                  contador<-contador+1
               ate contador>=expoente
            fimse
            algarismo<-(codigo\potencia)%10
            vetorAuxiliarMatriz[posicao]<-algarismo
            posicao<-posicao-1
         fimpara
         //--- Exibir resultados ---
         Exibidor(dia,mes)
      fimse
      //tratamento de erro
      se (codigo=0)  entao
         escreval("")
         escreval("......................................................")
         escreval(":          Não há nenhum registro nessa data,        :")
         escreval(":            deseja pesquisar outra data?            :")
         escreval(":                                                    :")
         escreval(":                    [1] Sim                         :")
         escreval(":           [2] Não, inserir dados diários           :")
         escreval(":          [3] Não, voltar ao menu principal         :")
         escreval(":                    [4] Sair                        :")
         escreval(":....................................................:")
         escreval("")
         escreva("        ")
         leia (decisor)
         enquanto (decisor<=0) ou (decisor>3) faca
            escreval("")
            escreval("......................................................")
            escreval(":                                                    :")
            escreval(":           O valor de entrada não é válido.         :")
            escreval(":             Deseja pesquisar outra data?           :")
            escreval(":                                                    :")
            escreval(":                    [1] Sim                         :")
            escreval(":           [2] Não, inserir dados diários           :")
            escreval(":          [3] Não, voltar ao menu principal         :")
            escreval(":                    [4] Sair                        :")
            escreval(":....................................................:")
            escreval("")
            escreva("        ")
            leia (decisor)
         fimenquanto
         escolha (decisor)
         caso 1
            loopAcessoDados<-0
         caso 2
            DadosDiarios(petEscolhido)
            loopAcessoDados<-1
         caso 3
            loopAcessoDados<-1
            loopMenuCalendario<-verdadeiro
         caso 4
            Sair()
         fimescolha
      fimse
   fimenquanto
fimprocedimento


//====================== E X I B I D O R =====================================
procedimento Exibidor(dia,mes:inteiro)
inicio
   limpatela
   escreval("......................................................")
   escreval(":              D A D O S   D I Á R I O S              ")
   escreval(":                     ",dia:2," / ",mes:2,"              ")
   escreval("......................................................")
   escreval(":                    Nessa data:                      ")
   escreval(":")
   escreval("")
   escreva(":   § Humor: ",humor[vetorAuxiliarMatriz[1]])
   se (vetorAuxiliarMatriz[2]<>0) e (vetorAuxiliarMatriz[2]<>vetorAuxiliarMatriz[1])entao
      escreva (" e ",humor[vetorAuxiliarMatriz[2]])
      escreval("")
   senao
      escreval("")
   fimse
   escreval(":")
   escreval(":   § Alimentação: ",alimentacao[vetorAuxiliarMatriz[3]],";")
   escreval(":")
   escreva(":   § Medicação: ",medicacao[vetorAuxiliarMatriz[4]])
   se (vetorAuxiliarMatriz[4]=2) entao
      escreva(": ",medicacaoderotina,";")
      escreval("")
   senao
      se  (vetorAuxiliarMatriz[4]=3) entao
         escreva(" :",vetormedicacao[dia],";")
         escreval("")
      fimse
   fimse
   escreval(":")
   escreval(":   § Urina: ",urina[vetorAuxiliarMatriz[5]],";")
   escreval(":")
   escreval(":   § Fezes: ",fezes[vetorAuxiliarMatriz[6]])
   se (vetorAuxiliarMatriz[7]<>0) e (vetorAuxiliarMatriz[7]<>vetorAuxiliarMatriz[6]) entao
      escreva ("e ",fezes[vetorAuxiliarMatriz[7]])
   fimse
   escreval(":                                                     ")
   escreval(":   § Irregularidades: ",irregularidades[vetorAuxiliarMatriz[8]])
   se (vetorAuxiliarMatriz[9]<>0) e (vetorAuxiliarMatriz[9]<>vetorAuxiliarMatriz[8]) entao
      escreva ("e ",irregularidades[vetorAuxiliarMatriz[9]],".")
      escreval("")
   fimse
   escreval(":                                                     ")
   escreval("......................................................")
   escreval("")
   escreval("......................................................")
   escreval(":         PRESSIONE ENTER PARA CONTINUAR              ")
   escreval("......................................................")
   escreval("")
   escreval("")
   leia (enter)
fimprocedimento

//---------------- I N Í C I O  D O   P R O G R A M A -------------------------
Inicio
   //-- set variáveis de loop
   //usado para manter os menus em loop até que o usuário "opte por sair"
   decisaoMenuCalendario<-3
   decisaoMenuCartilha<-3

   //------------------ ATRIBUIÇÃO A VETORES -----------------------------------

   //------- VETORES DE DADOS DIÁRIOS ----------
   //-- humor
   humor[1]<-"calmo"
   humor[2]<-"cabisbaixo"
   humor[3]<-"animado"
   humor[4]<-"irritado"
   humor[5]<-"choramingando"
   //-- alimentação
   alimentacao[1]<-"não comeu"
   alimentacao[2]<-"comeu normalmente"
   alimentacao[3]<-"comeu algo diferente"
   alimentacao[4]<-"ração nova"
   alimentacao[5]<-"comida de humano"
   //-- medicação
   medicacao[1]<-"não"
   medicacao[2]<-"de rotina"
   medicacao[3]<-"outra medicação"
   //-- urina
   urina[1]<-"cor típica e líquida"
   urina[2]<-"cor alaranjada"
   urina[3]<-"cor avermelhada"
   urina[4]<-"cor amarronzada"
   //-- fezes
   fezes[1]<-"normal"
   fezes[2]<-"preta"
   fezes[3]<-"branca"
   fezes[4]<-"cinza"
   fezes[5]<-"verde"
   fezes[6]<-"com verme"
   fezes[7]<-"com giárdia"
   fezes[8]<-"com muco amarelo"
   fezes[9]<-"com sangue"
   //-- irregularidades
   irregularidades[1]<-"vômito"
   irregularidades[2]<-"diarréia"
   irregularidades[3]<-"intestino preso"
   irregularidades[4]<-"Ingestão incorreta de água"
   irregularidades[5]<-"gases"
   irregularidades[6]<-"febre"
   irregularidades[7]<-"olhos amarelados"
   irregularidades[8]<-"não"

   //-------- VETORES AUXILIARES -------
   //-- dias por mês
   diaspormes[1]<-31
   diaspormes[2]<-28
   diaspormes[3]<-31
   diaspormes[4]<-30
   diaspormes[5]<-31
   diaspormes[6]<-30
   diaspormes[7]<-31
   diaspormes[8]<-31
   diaspormes[9]<-30
   diaspormes[10]<-31
   diaspormes[11]<-30
   diaspormes[12]<-31

   //----------------------- EXIBIÇÃO ------------------------------------------
   escreval("......................................................")
   escreva(":")
   timer 50
   escreva("      O")
   escreva("l")
   escreva("á,")
   escreva(" ")
   escreva("s")
   escreva("e")
   escreva("j")
   escreva("a")
   escreva(" ")
   escreva("b")
   escreva("e")
   escreva("m")
   escreva(" ")
   escreva("v")
   escreva("i")
   escreva("n")
   escreva("d")
   escreva("o")
   escreva("(a)")
   escreva(" ")
   escreva("a")
   escreva("o")
   escreva(" ")
   escreva("M")
   escreva("a")
   escreva("g")
   escreva("n")
   escreva("a")
   escreva(" ")
   escreva("P")
   escreva("e")
   escreva("t")
   escreva("!")
   escreva("          :")
   escreval("")
   escreval(":     --- O seu app de monitoramento animal ---      :")
   escreval(":                                                    :")
   escreval(": .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  :")
   escreval(":                                                    :")
   escreval(":            É sua primeira vez conosco?             :")
   escreval(":                                                    :")
   escreval(":                   [1] Logar                        :")
   escreval(":              [2] Realizar cadastro                 :")
   escreval(":                   [3] Sair                         :")
   escreval(":....................................................:")
   escreval("")
   leia (decisaoMenuInicial)
   timer 0
   enquanto (decisaoMenuInicial<=0) e (decisaoMenuInicial>3) faca
      limpatela
      escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
      escreval(":      Desculpe, o número digitado não é válido.     :")
      escreval(":             Por gentileza, diga novamente:         :")
      escreval(":                     [1] Logar                      :")
      escreval(":                [2] Realizar cadastro               :")
      escreval(":                     [3] Sair                       :")
      escreval(": .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  :")
      escreval("")
      leia (decisaoMenuInicial)
   fimenquanto
   escolha (decisaoMenuInicial)
   caso 1
      limpatela
      escreval("......................................................")
      escreval(":         Insira o nome do usuário cadastrado:        ")
      escreva(":    Nome: ")
      leia (dono)
      tratamentoDeErroNumInChar(dono)
      escreval("")
      escreval("......................................................")
      escreval(":                Insira o nome do pet: ")
      escreva(":     Pet: ")
      leia(pet[1])
      tratamentoDeErroNumInChar(pet[1])
   caso 2
      cadastro()
   caso 3
      Sair()
   fimescolha
   //----  "retornar" ao menu principal sempre que necessário  -------
   enquanto (decisaoMenuCalendario=3) ou (decisaoMenuCartilha=3) faca
      //-- menu principal
      menuPrincipal(decisaoMenuPrincipal)
      escolha (decisaoMenuPrincipal)
      caso 1
         //opção menu principal

         loopMenuCartilha<-verdadeiro
         //--- ver cartilha ----
         //direciona ao cadastro se não estiver cadastrado
         se idade[1]=0 entao
            cadastro()
         fimse
         contador2<-0
         repita
            contador2<-contador2+1
            //--- mostra cartilhas de todos os pets (1 por vez)
            limpatela
            escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
            escreval(":              C A R T I L H A   P E T                  :")
            escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
            escreval(":")
            escreval(":       Nome do pet: ",pet[contador2])
            escreval(":       Animal: ",animal[contador2])
            escreval(":       Raça: ",raca[contador2])
            escreval(":       Gênero: ",genero[contador2])
            escreval(":       Idade: ",idade[contador2]," meses")
            escreval(":       Tamanho: ",tamanho[contador2]," cm")
            escreval(":       Peso: ",peso[contador2]," gramas")
            escreval(":       Cor/ característica: ",cor[contador2])
            escreval(":       Doença crônica: ",doenca[contador2])
            escreval(":")
            escreval(". .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .")
            escreval("")
            escreva("pressione enter para continuar")
            leia (enter)
         ate contador2>=quantidadedepets

         //------------------ Exibe menu cartilha ----------------
         enquanto loopMenuCartilha=verdadeiro faca
            menuCartilha(decisaoMenuCartilha)
            escolha (decisaoMenuCartilha)
            caso 1
               contador<-1
               enquanto (contador>0) e (contador<=quantidadedepets) faca
                  limpatela
                  contador2<-0
                  escreval("......................................................")
                  escreval(":        Escolha qual cartilha deseja editar         :")
                  escreval(":            (OU PRESSIONE 0 PARA SAIR)              :")
                  escreval("......................................................")
                  repita
                     contador2<-contador2+1
                     escreval(":               [",contador2,"] ",pet[contador2])
                  ate contador2=quantidadedepets
                  escreval("......................................................")
                  escreval("")
                  leia (contador)
                  se (contador>0) e (contador<quantidadedepets) entao
                     limpatela
                     escreval("........................................................")
                     escreval(":",pet[contador]," possui alguma doença crônica? Se sim, qual?:")
                     escreval(":              (se não aperte enter)                   :")
                     escreva(":   ")
                     leia (doenca[contador])
                     se doenca[contador]="" entao
                        doenca[contador]<-"Não possui"
                     fimse
                     escreval(":                                                      :")
                     escreval("........................................................")

                     //------------------------ peso ------------------------------
                     escreval(": Qual é o peso de ",pet[contador]," em gramas?  ")
                     escreva(":   ")
                     leia (peso[contador])
                     se peso[contador]<=0 entao
                        TratamentoDeErroInt(peso[contador])
                     fimse
                     escreval(":                                                      :")
                     escreval("........................................................")

                     //---------------------- tamanho -----------------------------
                     escreval(":  Qual o tamanho de ",pet[contador]," EM CENTÍMETROS? :")
                     escreva(":   ")
                     leia (tamanho[contador])
                     se tamanho[contador]<=0 entao
                        TratamentoDeErroInt(tamanho[contador])
                     fimse
                     escreval(":                                                      :")
                     escreval("........................................................")

                     //----------------------- idade ------------------------------
                     escreval(":  Qual a idade de ",pet[contador]," em meses?  :")
                     escreva(":   ")
                     leia(idade[contador])
                     se idade[contador]<=0 entao
                        TratamentoDeErroInt(idade[contador])
                     fimse
                  fimse
               fimenquanto
            caso 2
               limpatela
               se idade[1]=0 entao
                  cadastro()
               fimse
               escreval("........................................................")
               escreval(":              {INSERIR DADOS DIÁRIOS}                 :")
               escreval(":                                                      :")
               escreval(":   Para qual pet deseja registrar os dados do dia.    :")
               escreval(":                                                      :")
               para contador de 1 ate quantidadedepets faca
                  escreval(":       [",contador,"] ",pet[contador],".")
               fimpara
               escreval("........................................................")
               escreval("")
               escreva("   -> ")
               leia(petEscolhido)
               enquanto (petEscolhido<=0) ou (petEscolhido>3) faca
                  limpatela
                  escreval(".............................................................")
                  escreval(":      Desculpe, o número digitado não pode ser aceito.     :")
                  escreval(":O limite de pets que podem ser cadastrados nesse plano é 3.:")
                  escreval(":                                                           :")
                  escreval(":          Por favor, nos informe de qual pet são           :")
                  escreval(":                os dados que deseja salvar.                :")
                  escreval(":                                                           :")
                  para contador de 1 ate quantidadedepets faca
                     escreval(":       [",contador,"] ",pet[contador],".")
                  fimpara
                  escreval(".............................................................")
                  escreval("")
                  escreva("   -> ")
                  leia(petEscolhido)
               fimenquanto
               escreval("")
               DadosDiarios(petEscolhido)
            caso 3
               //-- CASO 3 ESTÁ NO LOOP DE MENU PRINCIPAL ------
               loopMenuCartilha<-falso
            caso 4
               Sair()
            fimescolha
         fimenquanto
      caso 2
         //opção menu principal
         loopMenuCalendario<-verdadeiro

         //------------------- Exibe menu calendário --------------------------
         enquanto  (loopMenuCalendario=verdadeiro) ou (loopAcessoDados=3) faca
            menuHistorico(decisaoMenuCalendario)
            escolha (decisaoMenuCalendario)
            caso 1
               limpatela
               //direciona ao cadastro se não estiver cadastrado
               se idade[1]=0 entao
                  cadastro()
               fimse
               escreval("........................................................")
               escreval(":              {INSERIR DADOS DIÁRIOS}                 :")
               escreval(":                                                      :")
               escreval(":   Para qual pet deseja registrar os dados do dia.    :")
               escreval(":                                                      :")
               para contador de 1 ate quantidadedepets faca
                  escreval(":       [",contador,"] ",pet[contador],".")
               fimpara
               escreval("........................................................")
               escreval("")
               escreva("   -> ")
               leia(petEscolhido)
               escreval("")
               enquanto (petEscolhido<=0) ou (petEscolhido>3) faca
                  limpatela
                  escreval(".............................................................")
                  escreval(":      Desculpe, o número digitado não pode ser aceito.     :")
                  escreval(":O limite de pets que podem ser cadastrados nesse plano é 3.:")
                  escreval(":                                                           :")
                  escreval(":          Por favor, nos informe de qual pet são           :")
                  escreval(":                os dados que deseja salvar.                :")
                  escreval(":                                                           :")
                  para contador de 1 ate quantidadedepets faca
                     escreval(":       [",contador,"] ",pet[contador],".")
                  fimpara
                  escreval(".............................................................")
                  escreval("")
                  escreva("   -> ")
                  leia(petEscolhido)
               fimenquanto
               DadosDiarios(petEscolhido)
            caso 2
               Descompactador(petEscolhido)
            caso 3
               //-- CASO 3 ESTÁ NO LOOP DE MENU PRINCIPAL ------
               loopMenuCalendario<-falso
            caso 4
               Sair()
            fimescolha
         fimenquanto
      caso 3
         //opção menu principal
         Sair()
      fimescolha
   fimenquanto
Fimalgoritmo