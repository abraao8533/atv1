interface Investimento {
    double calcularRetorno();
}

abstract class AtivoFinanceiro implements Investimento {
    String nome;
    double valorInvestido;

    AtivoFinanceiro(String nome, double valorInvestido) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
    }
}

class Acao extends AtivoFinanceiro {
    double percentualLucro;

    Acao(String nome, double valorInvestido, double percentualLucro) {
        super(nome, valorInvestido);
        this.percentualLucro = percentualLucro;
    }

    @Override
    public double calcularRetorno() {
        return valorInvestido * (percentualLucro / 100);
    }
}
class RendaFixa extends AtivoFinanceiro {
    double taxaJuros;

    RendaFixa(String nome, double valorInvestido, double taxaJuros) {
        super(nome, valorInvestido);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double calcularRetorno() {
        return valorInvestido * (taxaJuros / 100);
    }
}
