public class Program {
    public static void main(String args[]){
        Pessoa pessoa = new PessoaFisica();
        Pessoa pessoaJuridica = new PessoaJuridica();
        pessoa.setNome("Herique");
        pessoa.setEndereco(" Mora ali");
        pessoaJuridica.setNome(" TI comunicações");
        pessoaJuridica.setEndereco(" ali");
        System.out.println("*************Utilizando os métodos comuns da classe Pessoa*************");
        System.out.println(pessoa.getNome() + pessoa.getEndereco() + " e é empresário da empresa" + pessoaJuridica.getNome() + " com endereço" + pessoaJuridica.getEndereco());

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("106.470.555-28");
        pessoaFisica.setRg("MG-545155");
        PessoaJuridica pessoaJuri = new PessoaJuridica();
        pessoaJuri.setCnpj("20.450.0001/10");
        pessoaJuri.setRegJuntaComercial("JUCEMG 456484652");
        System.out.println("*************Utilizando os métodos específicos das classes PessoaFisica e Pessoa Juridica*************");
        System.out.println(pessoa.getNome() + " é inscrito no CPF: " + pessoaFisica.getCpf() + " portador da identidade: " + pessoaFisica.getRg());
        System.out.println(pessoaJuridica.getNome() + " é inscrita sob o CNPJ: " + pessoaJuri.getCnpj()+ " com registro na Jucemg número: " + pessoaJuri.getRegJuntaComercial());
    }



}
