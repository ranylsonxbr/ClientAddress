package io.github.ranylson.ClientAddress.Client.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/clients")
public interface ClientAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClientResponse saveClient(@Valid @RequestBody ClientRequest clientRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClientListResponse> getAllClients();

    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    DetailedClientResponse getClientById(@PathVariable Long id);

    @PatchMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchEditClient(@PathVariable Long id,
                           @Valid @RequestBody ClientRequest clientAlterationRequest);

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteClientById(@PathVariable Long id);

}
