package com.reto.vaale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reto.vaale.SumaService;
import com.reto.vaale.dto.Parametros;

/**
 * Controlador que se utiliza para los metodos de la suma
 * 
 * @author Edward Daniel Vidal García
 * @since Septiembre 2022
 */
@RestController
public class SumaController {
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Atributos de la clase
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/** Instancia del servicio suma  */
	@Autowired
	private SumaService sumaService;
	
	@PostMapping("/se_vaale")
	public ResponseEntity<Integer> suma(@RequestBody Parametros params) {		
		try {
			return ResponseEntity.ok(sumaService.suma(params));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
