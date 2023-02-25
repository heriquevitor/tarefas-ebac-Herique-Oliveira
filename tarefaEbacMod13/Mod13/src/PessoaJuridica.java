public class PessoaJuridica extends Pessoa{
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRegJuntaComercial() {
        return regJuntaComercial;
    }

    public void setRegJuntaComercial(String regJuntaComercial) {
        this.regJuntaComercial = regJuntaComercial;
    }

    public String getRegTitulosDocumentos() {
        return regTitulosDocumentos;
    }

    public void setRegTitulosDocumentos(String regTitulosDocumentos) {
        this.regTitulosDocumentos = regTitulosDocumentos;
    }

    private String cnpj;
    private String  inscricaoEstadual;
    private String regJuntaComercial;
    private String regTitulosDocumentos;

    @Override
    public String teste() {
        return null;
    }
}
