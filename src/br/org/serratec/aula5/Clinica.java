package br.org.serratec.aula5;

public class Clinica extends PlanoDeSaude{
    private String razaoSocial;
    private String cnpj;
    
    public Clinica(String empresa, String razaoSocial, String cnpj) {
        super(empresa);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nRazão Social: " + razaoSocial + "\nCnpj: " + cnpj;  
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
}
