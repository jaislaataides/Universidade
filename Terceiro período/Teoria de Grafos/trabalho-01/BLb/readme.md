<div align="left">
    <h1 align="center">Algoritmo de busca em largura com backtracking</h1>
    <h2 align="center"> Para que serve um algoritmo de busca em largura com backtracking? </h2>
        <p> A busca em largura é responsável por encontrar o comprimento do menor caminho em grafos não ponderados, por meio de um rotulamento massivo de todos os vértices do grafo tendo como relação a distância do vértice inicial.</p>
        <p>     O backtracking é utilizado nesse caso para, a partir do vértice final, reconstruir o caminho mais curto.</p>
        <hr>
    <h2 align="center">Como esse código funciona</h2>
    <p><strong>Entrada : </strong> número de vértices do grafo, <a href="https://www.notion.so/Representa-o-matricial-de-grafos-7b2e7272807f4bc6a256df841af8aff0">matriz de adjacência</a>, vértice inicial e final, nessa ordem.</p>
    <p><strong>Saída : </strong> comprimento do caminho mais curto e uma possibilidade desse caminho.</p>
    <hr>
    <h2 align="center">Classes</h2>
    <p><strong>Interface : </strong> nessa classe estão organizados os JComponents, recebendo as informações de entrada, direcionando-as, conseguindo as informações de saída e exibindo ao usuário. Exemplo: </p>
    <br>
    <div align="center">
        <img align="center" width="40%" src="https://media.discordapp.net/attachments/1017139709090209824/1051526818257174729/image.png">
        <br>
        <br>
        <br>
        <img align="center" width="80%" src="https://media.discordapp.net/attachments/1017139709090209824/1051526959357755402/image.png">
    </div>
    <br>
    <br>
    <p><strong>Vértice : </strong> nessa classe estão dispostos os principais atributos do vértice: seu "nome", seu grau(com relação ao vértice inicial), um rótulo para compreender se o vértice foi analisado ou não e, claro, os vizinhos desse vértice.</p>
    <p><strong>Grafo : </strong> essa classe tem apenas três atributos: um ArrayList com todos os vértices do grafo, o vértice inicial e final. Essa classe é a responsável, também, pela rotulação de cada vértice e do uso de backtracking para refazer o caminho mais curto.</p>
    <p><strong>BLb : </strong> apenas a classe principal onde a Interface é instanciada.</p>
    <hr>
    <div align="center">
        <h3>Base para esse código : </h3>
        <br>
        <img align="center" src="https://media.discordapp.net/attachments/1017139709090209824/1051530285038182530/image.png">
        <hr>
    </div>
</div>