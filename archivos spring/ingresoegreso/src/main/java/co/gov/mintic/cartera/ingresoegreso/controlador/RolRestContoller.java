package co.gov.mintic.cartera.ingresoegreso.controlador;


import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // esta es la ruta despues de mi puerto; en mi caso local host 8080//
public class RolRestContoller {

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        System.out.println(id);
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }



}
