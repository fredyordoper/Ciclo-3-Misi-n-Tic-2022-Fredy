package co.gov.mintic.cartera.ingresoegreso.controlador;

import co.gov.mintic.cartera.ingresoegreso.entidad.Perfil;
import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;
import co.gov.mintic.cartera.ingresoegreso.entidad.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


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

    @GetMapping("/usuario/{id}")
    public Usuario findByAll(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setIdUsuario(1);
        usuario1.setApellido("Rodriguez");
        usuario1.setCedula("1234567");
        usuario1.setPass("1234");
        usuario1.setCorreo("sdfdf@df.com");
        usuario1.setEstado(true);
        usuario1.setNombre("Fredy");
        Perfil perfil = Perfil.Financiero;
        usuario1.setPerfil(perfil);
        Rol rol = new Rol ();
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario1.setRol(rol);



        return usuario1;

    }





}
