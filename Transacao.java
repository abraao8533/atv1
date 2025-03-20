interface Transacao {
    double getValor();
    String getDescricao();
}
class Receita implements Transacao {
    double valor;
    String descricao;

    Receita(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}

class Despesa implements Transacao {
    double valor;
    String descricao;

    Despesa(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public double getValor() {
        return -valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}

class Financas {
    List<Transacao> transacoes = new ArrayList<>();

    void adicionarTransacao(Transacao t) {
        transacoes.add(t);
    }

    double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += t.getValor();
        }
        return saldo;
    }
}
