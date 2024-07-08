package io.github.ranylson.ClientAddress.Client.domain;


import io.github.ranylson.ClientAddress.Client.application.api.ClientRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    public Client(ClientRequest clientRequest) {
        this.firstName = clientRequest.getFirstName();
        this.lastName = clientRequest.getLastName();
        this.email = clientRequest.getEmail();
    }

    public void altera(ClientRequest alteraPessoaRequest) {
        this.firstName = alteraPessoaRequest.getFirstName();
        this.lastName = alteraPessoaRequest.getLastName();
        this.email = alteraPessoaRequest.getEmail();
    }
}