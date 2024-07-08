package io.github.ranylson.ClientAddress.Client.application.api;

import io.github.ranylson.ClientAddress.Client.application.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Log4j2
@RequiredArgsConstructor
public class ClientController implements ClientAPI {

    private final ClientService clientService;

    @Override
    public ClientResponse saveClient(ClientRequest clientRequest) {
        log.info("[start] ClientController - saveClient");
        ClientResponse savedClient = clientService.saveClient(clientRequest);
        log.info("[finish] ClientController - saveClient");
        return savedClient;
    }

    @Override
    public List<ClientListResponse> getAllClients() {
        log.info("[start] ClientController - getAllClients");
        List<ClientListResponse> clients = clientService.listAll();
        log.info("[finish] ClientController - getAllClients");
        return clients;
    }

    @Override
    public DetailedClientResponse getClientById(Long id) {
        log.info("[start] ClientController - getClientById]");
        log.info("[idClient] {}", id);
        DetailedClientResponse detailedClient = clientService.findById(id);
        log.info("[finish] ClientController - getClientById]");
        return detailedClient;
    }

    @Override
    public void patchEditClient(Long id, ClientRequest clientAlterationRequest) {
        log.info("[start] ClientController - patchEditClient]");
        log.info("[idClient] {}", id);
        clientService.alters(id,clientAlterationRequest);
        log.info("[finish] ClientController - patchEditClient]");
    }

    @Override
    public void deleteClientById(Long id) {
        log.info("[start] ClientController - deleteClientById]");
        log.info("[idClient] {}", id);
        clientService.deleteClientById(id);
        log.info("[finish] ClientController - deleteClientById]");
    }
}
