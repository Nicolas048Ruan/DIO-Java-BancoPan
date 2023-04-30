package facade;

import facade.subsistema1cep.CepApi;
import facade.subsistema1crm.CrmSercive;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmSercive.gravarCliente(nome, cep, nome, cep);

    }
    
}
