abstract class Dispositivo {
    String marca;
    String modelo;

    Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void ligar();
    abstract void desligar();
}

class Computador extends Dispositivo {

    Computador(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void ligar() {
        System.out.println("Computador " + marca + " " + modelo + " ligado.");
    }

    @Override
    void desligar() {
        System.out.println("Computador " + marca + " " + modelo + " desligado.");
    }
}

class Smartphone extends Dispositivo {

    Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void ligar() {
        System.out.println("Smartphone " + marca + " " + modelo + " ligado.");
    }

    @Override
    void desligar() {
        System.out.println("Smartphone " + marca + " " + modelo + " desligado.");
    }
}
