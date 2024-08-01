package com.ust.User_Service.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_info")
@Builder
public class User_info {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String role;


}
