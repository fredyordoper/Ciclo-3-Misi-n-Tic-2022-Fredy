package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entidad.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById (int id);

    public List<TipoDocumento> findAll();

    public TipoDocumento  createTipoDocumento(TipoDocumento tipoDocumento);

    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento);

    public void deleteTipodocumento(int id);

}
