package SRC4;

public class Main {
    
        public static void main(String[] args) {

            Produto produto = new Produto("Arroz", 10.0, 10, null, null, null);
            ItemPedido item = new ItemPedido(10.0, 10, null, null);
            Listaencadeada lista = new Listaencadeada( null, null);
            Listaencadeada lista1 = new Listaencadeada(null, lista);
            item.setProduto(produto);
            lista.setItem(item);
            System.out.println(lista1.getItem().getProduto().getNome());
        }
    
}
