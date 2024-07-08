package io.github.ranylson.ClientAddress.Client.infra;

import io.github.ranylson.ClientAddress.Client.domain.Client;
import io.github.ranylson.ClientAddress.Client.repository.ClientRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClientInfraRespository implements ClientRespository {

    private final ClientSpringDataJPARespository clientSpringDataJPARespository;

    @Override
    public Client saveClient(Client client) {
        log.info("[start] ClientInfraRespository - saveClient");
        clientSpringDataJPARespository.save(client);
        log.info("[finish] ClientInfraRespository - saveClient");
        return client;
    }

    @Override
    public List<Client> listAll() {
        log.info("[start] ClientInfraRespository - listAll");
        List<Client> allClients = clientSpringDataJPARespository.findAll();
        clientSpringDataJPARespository.findAll();
        log.info("[finish] ClientInfraRespository - listAll");
        return allClients;
    }

    @Override
    public Client findById(Long id) {
        log.info("[start] ClientInfraRespository - findById");
        Client client = clientSpringDataJPARespository.findById(id)
                .orElseThrow(()-> new RuntimeException("Client not found"));
        log.info("[finish] ClientInfraRespository - findById");    
        return client;
    }

    @Override
    public void deletesClient(Client client) {
        log.info("[start] ClientInfraRespository - deletesClient");
        clientSpringDataJPARespository.delete(client);
        log.info("[finish] ClientInfraRespository - deletesClient");
    }
}
