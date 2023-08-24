package com.daniel.api.post.diopostapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.api.post.diopostapi.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
