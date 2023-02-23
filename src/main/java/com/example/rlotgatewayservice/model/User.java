package com.example.rlotgatewayservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Setter
@Getter
@ToString
@Entity
@Table(name = "TB_User")
public class User {

    @Id
    private String userId;

    @Column
    private String userName;

    @Column
    @JsonIgnore
    private String userPw;

    @Column
    private String userPlace;

    @Column
    private String userEmail;

    @Column
    private Boolean useFlag;

    @Column
    private Timestamp loginDate;

    @Column
    private Timestamp logoutDate;

    @Column
    private Timestamp pwUpdateDate;


}
