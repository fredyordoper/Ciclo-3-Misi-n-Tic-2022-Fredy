package co.gov.mintic.cartera.ingresoegreso.controlador;

import co.gov.mintic.cartera.ingresoegreso.entidad.TipoDocumento;
import co.gov.mintic.cartera.ingresoegreso.entidad.Usuario;
import co.gov.mintic.cartera.ingresoegreso.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UsuarioResColtroler {
    @Autowired
    private IUsuarioService Usuarioservice;

    @GetMapping
    public Usuario findById(@PathVariable int id){

        return this.Usuarioservice.findById(id);

    }
}
