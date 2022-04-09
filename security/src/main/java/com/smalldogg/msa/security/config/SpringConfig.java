package com.smalldogg.msa.security.config;

import com.smalldogg.msa.security.aop.TimeTraceAop;
import com.smalldogg.msa.security.domain.user.repository.JpaUserRepository;
import com.smalldogg.msa.security.domain.user.repository.UserRepository;
import com.smalldogg.msa.security.domain.user.service.UserService;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  private final UserRepository userRepository;

  @Autowired
  public SpringConfig(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Bean
  public UserService userService(){
    return new UserService(userRepository);
  }

  @Bean
  public TimeTraceAop timeTraceAop(){
    return new TimeTraceAop();
  }

}
