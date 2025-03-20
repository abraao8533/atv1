interface Contato {
    String getNome();
    String getTelefone();
    void mostrarInfo();
}
class ContatoPessoal implements Contato {
    String nome;
    String telefone;
    String aniversario;

    ContatoPessoal(String nome, String telefone, String aniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.aniversario = aniversario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pessoal: " + nome + " - " + telefone + " - Aniversário: " + aniversario);
    }
}

class ContatoProfissional implements Contato {
    String nome;
    String telefone;
    String empresa;

    ContatoProfissional(String nome, String telefone, String empresa) {
        this.nome = nome;
        this.telefone = telefone;
        this.empresa = empresa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Profissional: " + nome + " - " + telefone + " - Empresa: " + empresa);
    }
}
