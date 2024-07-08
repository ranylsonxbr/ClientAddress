package io.github.ranylson.ClientAddress.Client.application.api;

import io.github.ranylson.ClientAddress.Client.domain.Client;
import lombok.Value;

@Value
public class DetailedClientResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public DetailedClientResponse(Client client) {
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();
    }

}
