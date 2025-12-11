package dev.aulait.amv;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class HelloService {

  private final HelloRepository helloRepository;

  public String hello() {
    HelloEntity entity = helloRepository.findById(1L).orElseThrow();
    return entity.getMessage();
  }
}
