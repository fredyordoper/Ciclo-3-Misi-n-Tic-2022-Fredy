package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entidad.Rol;

import java.util.List;

public interface IRolService {

    public Rol findByid (int id);
    public List<Rol> findAll();
    public Rol createRoll ();
    public Rol updateRol (int id, Rol rol);
    public void deleteRon (int id);




}
