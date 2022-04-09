package com.smalldogg.msa.security.domain.user.repository;

import com.smalldogg.msa.security.domain.user.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaUserRepository extends JpaRepository<User, Long>, UserRepository {

  @Override
  Optional<User> findByName(String name);
}
