package io.github.ranylson.ClientAddress.Client.application.api;

import io.github.ranylson.ClientAddress.Client.domain.Client;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class ClientResponse {
    private Long id;

    public ClientResponse(Client client) {
        this.id = client.getId();
    }
}
