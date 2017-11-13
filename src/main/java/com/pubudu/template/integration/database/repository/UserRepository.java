package com.pubudu.template.integration.database.repository;

import com.pubudu.template.integration.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
