package com.dblogin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {
	
	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private String roles;

}
