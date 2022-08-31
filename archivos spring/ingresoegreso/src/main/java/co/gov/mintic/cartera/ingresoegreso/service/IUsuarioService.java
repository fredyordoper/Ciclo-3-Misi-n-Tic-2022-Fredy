package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entidad.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

public interface IUsuarioService {

    public Usuario findById(@PathVariable int id);

}
