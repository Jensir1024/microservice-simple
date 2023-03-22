package com.jensir.cloud.microservicesimple.DAO;

import com.jensir.cloud.microservicesimple.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
