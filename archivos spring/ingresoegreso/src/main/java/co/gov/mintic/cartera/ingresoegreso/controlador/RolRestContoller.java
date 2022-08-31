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
        return rolservice.findAll();

    }

    @PostMapping("/rol")

    public Rol createRol(@RequestBody Rol rol) {
        return rolservice.createRoll();
    }

    @PutMapping("/rol/{id}")

    public Rol updateRol(@PathVariable int id, @RequestBody Rol rol) {
        return rolservice.updateRol(id, rol);
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id) {
        rolservice.deleteRon(id);


    }



}