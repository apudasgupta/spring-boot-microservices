package com.apudasgupta.two.model;

import lombok.Data;

/**
 * @author Apu Das Gupta
 *
 */

@Data
public class EnvelopeResponse {		
	int status;
	String message;		
	long totalElements;
	Object data;
}
