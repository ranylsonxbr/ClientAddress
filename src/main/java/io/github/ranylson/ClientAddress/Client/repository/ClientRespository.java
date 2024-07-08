package io.github.ranylson.ClientAddress.Client.repository;

import io.github.ranylson.ClientAddress.Client.domain.Client;

import java.util.List;

public interface ClientRespository {
    Client saveClient(Client client);

    List<Client> listAll();

    Client findById(Long id);

    void deletesClient(Client client);
}
