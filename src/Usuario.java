import java.time.LocalDate;

public class Usuario {
    //código, nome, senha, tentativas de acesso, primeiro acesso (verdadeiro/falso), data de inativação e status.
    private String codigo;
    private String nome;
    private String senha;
    private int tentativasAcesso;
    private boolean primeiroAcesso;
    private LocalDate dataInativacao;
    private String status;
    private String usuario;

    public Usuario() {
        this.senha = "etec#123";
        this.primeiroAcesso = true;
        this.status = "INATIVO";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTentativasAcesso() {
        return tentativasAcesso;
    }

    public void setTentativasAcesso(int tentativasAcesso) {
        this.tentativasAcesso = tentativasAcesso;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public LocalDate getDataInativacao() {
        return dataInativacao;
    }

    public void setDataInativacao(LocalDate dataInativacao) {
        this.dataInativacao = dataInativacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    void exibirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Usuario: " + usuario);
        System.out.println("Senha: " + senha);
        System.out.println("Trocar senha: " + primeiroAcesso);
        System.out.println("Status: " + status);
    }

        boolean inativacaoUsuario(){
            LocalDate.now();
            if(primeiroAcesso == true)
                return false;
            else
                return true;
        }

    }


