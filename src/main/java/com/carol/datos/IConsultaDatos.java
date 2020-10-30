package com.carol.datos;

import java.io.IOException;
import java.util.List;

public interface IConsultaDatos {

	List<String> consultaCoches() throws IOException;

}