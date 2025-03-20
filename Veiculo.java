abstract class Veiculo {
    String marca;
    String modelo;
    int ano;

    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    abstract void mostrarDetalhes();
}

class Carro extends Veiculo {
    int portas;

    Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    void mostrarDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + ", " + ano + " - " + portas + " portas.");
    }
}

class Moto extends Veiculo {
    boolean partidaEletrica;

    Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    void mostrarDetalhes() {
        System.out.println("Moto: " + marca + " " + modelo + ", " + ano + " - Partida elétrica: " + partidaEletrica);
    }
}
