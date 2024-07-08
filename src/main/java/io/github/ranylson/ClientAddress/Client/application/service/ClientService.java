package io.github.ranylson.ClientAddress.Client.application.service;

import io.github.ranylson.ClientAddress.Client.application.api.ClientListResponse;
import io.github.ranylson.ClientAddress.Client.application.api.ClientRequest;
import io.github.ranylson.ClientAddress.Client.application.api.ClientResponse;
import io.github.ranylson.ClientAddress.Client.application.api.DetailedClientResponse;

import java.util.List;

public interface ClientService {
    ClientResponse saveClient(ClientRequest clientRequest);

    List<ClientListResponse> listAll();

    DetailedClientResponse findById(Long id);

    void alters(Long id, ClientRequest clientAlterationRequest);

    void deletaPessoaPorId(Long id);
}
