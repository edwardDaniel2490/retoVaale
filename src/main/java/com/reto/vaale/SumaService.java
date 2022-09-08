package com.reto.vaale;

import org.springframework.stereotype.Service;

import com.reto.vaale.dto.Parametros;

/**
 * Servicio para manejar la logica de suma
 * @author Edward Daniel Vidal Garcia
 * @since Septiembre 2022
 */
@Service
public class SumaService {
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Métodos de la clase
	///////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Metodo par asumar
	 * @param params recibe parametros a sumar
	 * @return resultado de la suma
	 */
	public int suma(Parametros params) {		
		int suma = params.getN() + params.getX();		
		return  suma; 
	}	
}
