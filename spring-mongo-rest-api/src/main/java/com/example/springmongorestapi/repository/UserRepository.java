package com.example.springmongorestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springmongorestapi.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { //veri tabanı işlemlerinin gerçeklesitirlmesiini saglayan arayuzumuzdur(update, delete, ınsert)

}
