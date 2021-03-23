public final class Cama {
    private int numero, matricula, ano, anoOcupacao;
    private String discente, curso;
    private boolean ocupado;

    public Cama(int numero, int ano, int anoOcupacao, String discente, String curso, boolean ocupado) {
        this.setNumero(numero);
        this.setAno(ano);
        this.setAnoOcupacao(anoOcupacao);
        this.setDiscente(discente);
        this.setCurso(curso);
        this.setOcupado(ocupado);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAnoOcupacao() {
        return anoOcupacao;
    }

    public void setAnoOcupacao(int anoOcupacao) {
        this.anoOcupacao = anoOcupacao;
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

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    //classesEspeciais
    public void ocupar(){
        this.setOcupado(true);
    }
    
    public void desocupar(){
        this.setOcupado(false);
    }
}
