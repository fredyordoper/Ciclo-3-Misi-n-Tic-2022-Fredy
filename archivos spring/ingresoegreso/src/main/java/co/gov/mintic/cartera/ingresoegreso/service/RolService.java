package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolService implements IRolService {


    @Override
    public Rol findByid(int id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return null;
    }

    @Override
    public List<Rol> findAll() {
        return null;
    }

    @Override
    public Rol createRoll() {
        return null;
    }

    @Override
    public Rol updateRol(int id, Rol rol) {
        return null;
    }

    @Override
    public void deleteRon(int id) {

    }
}
