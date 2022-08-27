package co.gov.mintic.cartera.ingresoegreso.controlador;


import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;
import co.gov.mintic.cartera.ingresoegreso.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")  // esta es la ruta despues de mi puerto; en mi caso local host 8080//
public class RolRestContoller {
   @Autowired
    private IRolService rolservice;

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id) {
        return rolservice.findByid(id);
    }


    @GetMapping("/rol")
    public List<Rol> findByAll() {
        List<Rol> roles = new ArrayList<Rol>();


        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);

        roles.add(rol1);

        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);

        roles.add(rol2);
        return roles;

    }

    @PostMapping("/rol")

    public Rol createRol(@RequestBody Rol rol) {

        Rol newrol = new Rol();
        newrol.setIdRol(3);
        newrol.setDescripcion(rol.getDescripcion());
        newrol.setEstado(rol.isEstado());
        return newrol;
    }

    @PutMapping("/rol/{id}")

    public Rol updateRol(@PathVariable int id, @RequestBody Rol rol) {

        Rol putrol = findById(id);
        putrol.setIdRol(id);
        putrol.setDescripcion(rol.getDescripcion());
        putrol.setEstado(rol.isEstado());
        return putrol;
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id) {

        Rol deleterol = findById(id);


    }



}