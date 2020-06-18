package com.apudasgupta.discovery.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Apu Das Gupta
 *
 */

@Data
@ApiModel(description = "Details about the user")
public class UserDetail {
	@ApiModelProperty(notes = "The unique id of the User")
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	
	
	
}
