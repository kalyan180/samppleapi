package com.app.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
//	@NotEmpty(message = "UserName cannot be empty")
    @NotNull(message = "UserName cannot be null")
	@NotBlank(message = "UserName cannot be blank")
	private String username;
	private String password;

}