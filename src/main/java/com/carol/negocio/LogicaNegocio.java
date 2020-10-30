/**
 * 
 */
package com.carol.negocio;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carol.datos.ConsultaDatos;
import com.carol.datos.IConsultaDatos;

/**
 * @author carol
 *
 */
@Component
public class LogicaNegocio implements ILogicaNegocio {
	@Autowired
	IConsultaDatos consultaDatos;
	
	@Override
	public  int cuantosCoches(String nombre) throws IOException {
		//Usar clase datos
		//IConsultaDatos consultaDatos = new ConsultaDatos();
		List<String> nombres = consultaDatos.consultaCoches(); //Array de string que devuelve la capa de datos
		int contador = 0;
		
		for (String nombreArray : nombres) {
			if(nombreArray.contentEquals(nombre)) {
				contador++;
			}
		}
		return contador;
	}

}
