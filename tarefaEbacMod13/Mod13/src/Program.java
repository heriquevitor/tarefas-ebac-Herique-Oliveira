public class Program {
    public static void main(String args[]){
        Pessoa pessoa = new PessoaFisica();
        Pessoa pessoaJuridica = new PessoaJuridica();
        pessoa.setNome("Herique");
        pessoa.setEndereco(" Mora ali");
        pessoaJuridica.setNome(" TI comunica��es");
        pessoaJuridica.setEndereco(" ali");
        System.out.println("*************Utilizando os m�todos comuns da classe Pessoa*************");
        System.out.println(pessoa.getNome() + pessoa.getEndereco() + " e � empres�rio da empresa" + pessoaJuridica.getNome() + " com endere�o" + pessoaJuridica.getEndereco());

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("106.470.555-28");
        pessoaFisica.setRg("MG-545155");
        PessoaJuridica pessoaJuri = new PessoaJuridica();
        pessoaJuri.setCnpj("20.450.0001/10");
        pessoaJuri.setRegJuntaComercial("JUCEMG 456484652");
        System.out.println("*************Utilizando os m�todos espec�ficos das classes PessoaFisica e Pessoa Juridica*************");
        System.out.println(pessoa.getNome() + " � inscrito no CPF: " + pessoaFisica.getCpf() + " portador da identidade: " + pessoaFisica.getRg());
        System.out.println(pessoaJuridica.getNome() + " � inscrita sob o CNPJ: " + pessoaJuri.getCnpj()+ " com registro na Jucemg n�mero: " + pessoaJuri.getRegJuntaComercial());
    }



}
