package co.gov.mintic.cartera.ingresoegreso.controlador;

import co.gov.mintic.cartera.ingresoegreso.entidad.Perfil;
import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;
import co.gov.mintic.cartera.ingresoegreso.entidad.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/api")

public class UsuarioRestControler {
    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(id);
        usuario.setApellido("Rodriguez");
        usuario.setCedula("1234567");
        usuario.setPass("1234");
        usuario.setCorreo("sdfdf@df.com");
        usuario.setEstado(true);
        usuario.setNombre("Fredy");
        Perfil perfil = Perfil.Financiero;
        usuario.setPerfil(perfil);
        Rol rol = new Rol ();
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);



        return usuario;
    }







}
