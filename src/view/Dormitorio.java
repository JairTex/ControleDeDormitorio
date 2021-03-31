//Autoria:Antônio Alan Silva Lima
//        Jair Soares Teixeira

package view;

public final class Dormitorio {
    //Atributos
    private String nomeAdm, loginAdm, senhaAdm;
    private int numero;
    protected String nomeDiscente, discente, curso, ano, matricula;

    //Métodos Acessores (getters e setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }
    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public String getLoginAdm() {
        return loginAdm;
    }
    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }
    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeDiscente() {
        return nomeDiscente;
    }
    public void setNomeDiscente(String nomeDiscente) {
        this.nomeDiscente = nomeDiscente;
    }

    public String getDiscente() {
        return discente;
    }
    public void setDiscente(String discente) {
        this.discente = discente;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    
    //Método construtor
    Dormitorio() {
        this.nomeDiscente = nomeDiscente; 
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
}
}