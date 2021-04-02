package com.hmrc.taxpayer.repository;

import com.hmrc.taxpayer.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
