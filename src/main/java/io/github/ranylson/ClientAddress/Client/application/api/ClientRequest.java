package io.github.ranylson.ClientAddress.Client.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class ClientRequest {

    @NotBlank
    @Size(message = "First Name field cannot be empty", max = 255, min = 3)
    private String firstName;
    private String lastName;
    @Email
    private String email;

}
