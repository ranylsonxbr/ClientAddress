package io.github.ranylson.ClientAddress.Client.application.api;

import io.github.ranylson.ClientAddress.Client.domain.Client;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class ClientListResponse {

        private Long id;
        private String firstName;
        private String lastName;
        private String email;

    public static List<ClientListResponse> converte(List<Client> pessoas) {
        return pessoas.stream()
                .map(ClientListResponse::new)
                .collect(Collectors.toList());
    }
    public ClientListResponse(Client client) {
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();
    }
}
