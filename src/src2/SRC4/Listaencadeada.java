package SRC4;

public class Listaencadeada {
    private ItemPedido item;
    private Listaencadeada next;

    public Listaencadeada(ItemPedido item, Listaencadeada next) {
        this.item = item;
        this.next = next;
    }

    public ItemPedido getItem() {
        return item;
    }

    public Listaencadeada getNext() {
        return next;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }

    public void setNext(Listaencadeada next) {
        this.next = next;
    }
}
