package io.github.ranylson.ClientAddress.Client.infra;

import io.github.ranylson.ClientAddress.Client.domain.Client;
import io.github.ranylson.ClientAddress.Client.repository.ClientRespository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientInfraRespository implements ClientRespository {
    @Override
    public Client saveClient(Client client) {
        return null;
    }

    @Override
    public List<Client> listAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public void deletesClient(Client client) {

    }
}
