<div align="left">
    <h1 align="center">Algoritmo de busca em largura com backtracking e número de caminhos</h1>
    <h3>Índices</h3>
    <br>
    <ul>
        <li><a href="#blbc">Para que serve a busca em largura com backtracking</a></li>
        <li><a href="#funcionamento">Como esse código funciona</a></li>
        <li><a href="#classes">Classes</a></li>
        <li><a href="#base">Base para a construção desse algoritmo</a></li>
    </ul>
    <h2><a name="blbc"></a></h2>
    <h3> Para que serve um algoritmo de busca em largura com backtracking e número de caminhos? </h3>
    <br>    
    <p> A busca em largura é responsável por encontrar o comprimento do menor caminho em grafos não ponderados, por meio de um rotulamento massivo de todos os vértices do grafo tendo como relação a distância do vértice inicial.</p>

    <p>     O backtracking é utilizado nesse caso para, a partir do vértice final, rotular os vértices anteriores condicionalmente a fim de obter o número de caminhos mais curtos.</p>
    <h2><a name="funcionamento"></a></h2>
    <h3>Como esse código funciona</h3>
    <br>
    <p><strong>Entrada : </strong> número de vértices do grafo, <a href="https://www.notion.so/Representa-o-matricial-de-grafos-7b2e7272807f4bc6a256df841af8aff0">matriz de adjacência</a>, vértice inicial e final, nessa ordem.</p>
    <p><strong>Saída : </strong>número de caminhos mais curtos, comprimento desse(s) caminho(s) mais curto(s), assim como todos os caminhos mais curtos alternativos.</p>
    <h2><a name="classes"></a></h2>
    <h3>Classes</h3>
    <br>
    <p><strong>Interface : </strong> nessa classe estão organizados os JComponents, recebendo as informações de entrada, direcionando-as, conseguindo as informações de saída e exibindo ao usuário. Exemplo: </p>
    <br>
    <div align="center">
        <img align="center" width="40%" src="https://media.discordapp.net/attachments/1017139709090209824/1051526818257174729/image.png">
        <br>
        <br>
        <br>
        <img align="center" width="80%" src="https://media.discordapp.net/attachments/1017139709090209824/1052707973060902932/image.png?width=730&height=454">
    </div>
    <br>
    <br>
    <p><strong>Vértice : </strong> nessa classe estão dispostos os principais atributos do vértice: seu "nome", seu grau(com relação ao vértice inicial, chamado lambda), seu grau quanto ao numeração dos caminhos e um rótulo para compreender se o vértice foi analisado ou não e, claro, os vizinhos desse vértice.</p>
    <p><strong>Grafo : </strong> essa classe tem apenas três atributos: um ArrayList com todos os vértices do grafo, o vértice inicial e final. Essa classe é a responsável, também, pela rotulação de cada vértice e do uso de backtracking para refazer os caminhos mais curtos.</p>
    <p><strong>BLb : </strong> apenas a classe principal onde a Interface é instanciada.</p>
    <h2><a name="base"></a></h2>
        <h3>Base para esse código : </h3>
        <br>
        <div align="center">
        <img align="center" src="https://media.discordapp.net/attachments/1017139709090209824/1052706640043970610/image.png">
    </div>
    <h2></h2>
</div>
