package co.gov.mintic.cartera.ingresoegreso.controlador;

import co.gov.mintic.cartera.ingresoegreso.entidad.TipoDocumento;
import co.gov.mintic.cartera.ingresoegreso.service.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class TipoDocumentoControler {


    @Autowired
    private ITipoDocumentoService TipoDocumentoService;


    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){

        return this.TipoDocumentoService.findById(id);
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){

        return this.TipoDocumentoService.findAll();
    }

    @PostMapping("/tipoDocumento")
    public TipoDocumento createRol(@RequestBody TipoDocumento tipoDocumento){

        return this.TipoDocumentoService.createTipoDocumento(tipoDocumento);
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateRol(@PathVariable int id, @RequestBody TipoDocumento tipoDocumento){

        return this.TipoDocumentoService.updateTipoDocumento(id, tipoDocumento);
    }

    @DeleteMapping("/tipoDocumento/{id}")
    public void deleteRol(@PathVariable int id){
        this.TipoDocumentoService.deleteTipodocumento(id);

    }
}
