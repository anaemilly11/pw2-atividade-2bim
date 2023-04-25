import java.time.LocalDate;

public class Usuario {
    //código, nome, senha, tentativas de acesso, primeiro acesso (verdadeiro/falso), data de inativação e status.
    private String codigo;
    private String nome;
    private String senha;
    private int tentativasacesso;
    private boolean primeiroacesso;
    private LocalDate datainativacao;
    private  String status;

    public Usuario() {
        this.senha = "etec#123";
        this.primeiroacesso = true;
        this.status = "ATIVO";
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

    public int getTentativasacesso() {
        return tentativasacesso;
    }

    public void setTentativasacesso(int tentativasacesso) {
        this.tentativasacesso = tentativasacesso;
    }

    public boolean isPrimeiroacesso() {
        return primeiroacesso;
    }

    public void setPrimeiroacesso(boolean primeiroacesso) {
        this.primeiroacesso = primeiroacesso;
    }

    public LocalDate getDatainativacao() {
        return datainativacao;
    }

    public void setDatainativacao(LocalDate datainativacao) {
        this.datainativacao = datainativacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

        boolean inativacaoUsuario(){
            LocalDate.now();
            if(primeiroacesso == true)
                return false;
            else
                return true;
        }

    }


