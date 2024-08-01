package com.ust.User_Service.Repository;

import com.ust.User_Service.Model.User_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User_info,String> {

}
