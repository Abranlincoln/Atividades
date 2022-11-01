package SRC4;


    public class ItemPedido{

        double valor;
        int quantidade;
        Produto produto;
        
        public ItemPedido(double valor, int quantidade, Listaencadeada lista_next,
                Listaencadeada lista_preview) {
            this.valor = valor;
            this.quantidade = quantidade;
            
        }
        public Produto getProduto() {
            return produto;
        }

        public void setProduto(Produto produto) {
            this.produto = produto;
        }
        public double getValor() {
            return valor;
        }

    }
    

//não há necessidade de alteração para que ItemPedido faça parte de uma pilha ou fila, porque a classe ItemPedido já possui os métodos necessários para isso,
// como o método nextListaencadeada() e o método previewListaencadeada().