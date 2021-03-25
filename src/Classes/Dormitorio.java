package Classes;


public final class Dormitorio {
    private String nomeAdm, loginAdm, senhaAdm;
    private int numero;

    public Dormitorio(String nomeAdm, String senhaAdm, String loginAdm, int numero) {
        this.setNomeAdm(nomeAdm);
        this.setSenhaAdm(senhaAdm);
        this.setLoginAdm(loginAdm);
        this.setNumero(numero);
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    public String getLoginAdm() {
        return loginAdm;
    }

    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
