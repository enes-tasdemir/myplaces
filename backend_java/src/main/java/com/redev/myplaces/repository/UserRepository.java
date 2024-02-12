package com.redev.myplaces.repository;

import com.redev.myplaces.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
