package facade.subsistema1cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {    
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Bandeirantes";
    }

    public String recuperarEstado(String cep) {
        return "PR";
    }
    
}
