package io.github.ranylson.ClientAddress.Client.application.service;

import io.github.ranylson.ClientAddress.Client.application.api.ClientListResponse;
import io.github.ranylson.ClientAddress.Client.application.api.ClientRequest;
import io.github.ranylson.ClientAddress.Client.application.api.ClientResponse;
import io.github.ranylson.ClientAddress.Client.application.api.DetailedClientResponse;
import io.github.ranylson.ClientAddress.Client.domain.Client;
import io.github.ranylson.ClientAddress.Client.repository.ClientRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClientApplicationService implements ClientService {

    private final ClientRespository clientRespository;

    @Override
    public ClientResponse saveClient(ClientRequest clientRequest) {
        log.info("[start] ClientApplicationService - saveClient");
        Client client = clientRespository.saveClient(new Client(clientRequest));
        log.info("[finish] ClientApplicationService - saveClient");
        return new ClientResponse(client);
    }

    @Override
    public List<ClientListResponse> listAll() {
        log.info("[start] ClientApplicationService - listAll");
        List<Client> clients = clientRespository.listAll();
        log.info("[finish] ClientApplicationService - listAll");
        return ClientListResponse.converte(clients);
    }

    @Override
    public DetailedClientResponse findById(Long id) {
        log.info("[start] ClientApplicationService - findById");
        Client client = clientRespository.findById(id);
        log.info("[finish] ClientApplicationService - findById");
        return new DetailedClientResponse(client);

    }

    @Override
    public void alters(Long id, ClientRequest clientAlterationRequest) {
        log.info("[start] ClientApplicationService - alters");
        Client client = clientRespository.findById(id);
        client.altera(clientAlterationRequest);
        clientRespository.saveClient(client);
        log.info("[finish] ClientApplicationService - alters");
    }

    @Override
    public void deleteClientById(Long id) {
        log.info("[start] ClientApplicationService - deleteClientById");
        Client client = clientRespository.findById(id);
        clientRespository.deletesClient(client);
        log.info("[finish] ClientApplicationService - deleteClientById");
    }
}
