package com.app.model;

import java.io.Serializable;

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
@NoArgsConstructor
@AllArgsConstructor

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
//	@NotEmpty(message = "UserName cannot be empty")
    @NotNull(message = "UserName cannot be null")
	@NotBlank(message = "UserName cannot be blank")
	private String username;
	@NotEmpty(message = "Password cannot be empty")
    @NotNull(message = "Password cannot be null")
	private String password;

}