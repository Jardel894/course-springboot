package com.jardelbarbosa.course.repository;

import com.jardelbarbosa.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
