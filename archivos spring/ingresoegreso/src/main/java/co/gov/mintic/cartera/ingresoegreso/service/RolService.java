package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.Repository.IRolRepository;
import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService {

    @Autowired
    private IRolRepository rolRepository;
    @Override
    public Rol findByid(int id) {
        Optional<Rol> rol= rolRepository.findById((long)id);
        return rol.get();
    }

    @Override
    public List<Rol> findAll() {
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

    @Override
    public Rol createRoll() {
        return null;
    }

    @Override
    public Rol createRoll(Rol rol) {
        Rol newrol = new Rol();
        newrol.setIdRol(3);
        newrol.setDescripcion(rol.getDescripcion());
        newrol.setEstado(rol.isEstado());
        return newrol;
    }

    @Override
    public Rol updateRol(int id, Rol rol) {
        Rol putrol = findById(id);
        putrol.setIdRol(id);
        putrol.setDescripcion(rol.getDescripcion());
        putrol.setEstado(rol.isEstado());
        return putrol;
    }

    private Rol findById(int id) {

        return null;
    }

    @Override
    public void deleteRon(int id) {

    }
}
