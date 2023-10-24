package lulewill;

import java.util.ArrayList;
import java.util.List;

class Carrinho {
    private List<Veiculo> itens = new ArrayList<>();

    public void adicionarItem(Veiculo item) {
        itens.add(item);
    }

    public void removerItem(Veiculo item) {
        itens.remove(item);
    }

    public List<Veiculo> getItens() {
        return itens;
    }

    public void setItens(List<Veiculo> itens) {
        this.itens = itens;
    }
}
