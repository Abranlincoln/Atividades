package SRC5;

import SRC4.Produto;

public class ItemPedido{

    double valor;
    int quantidade;
    Produto produto;
    
    //A Lista encadeada.
    public class newItemPedidoA{

        double valor;
        int quantidade;
        Produto produto;
        
        ItemPedido next;
        ItemPedido inicio_lista;
    }
    //B Lista duplamente encadeada.
    public class newItemPedidoB{

        double valor;
        int quantidade;
        Produto produto;
        
        ItemPedido next;
        ItemPedido preview;
        ItemPedido inicio_lista;
    }

    //C  Não é necessário alterar a classe ItemPedido para que ela faça parte de uma pilha ou fila, porque a classe ItemPedido já possui os atributos necessários para isso,
    //      pois ambas as estruturas suportam até tipos de dados genéricos, como tipo int.

    //D Resposta: Foi apenas necessário incluir os atributos que representam as operações de cada estrutura de dados. Como demonstrado acima,
    //      o ItemPedido next e preview.
}

