package io.github.ranylson.ClientAddress.Client.infra;

import io.github.ranylson.ClientAddress.Client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientSpringDataJPARespository extends JpaRepository<Client, Long> {
}
