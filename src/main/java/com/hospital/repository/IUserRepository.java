package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.*;

public interface IUserRepository extends JpaRepository<UserTable, String> {

}
