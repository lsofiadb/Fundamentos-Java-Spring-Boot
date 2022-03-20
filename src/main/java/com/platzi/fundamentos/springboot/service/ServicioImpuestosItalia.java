package com.platzi.fundamentos.springboot.service;

import com.platzi.fundamentos.springboot.component.TipoIVA;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServicioImpuestosItalia {
    private TipoIVA tipoIVA;

    public ServicioImpuestosItalia(@Qualifier("tipoIVAItalia") TipoIVA tipoIVA){
        this.tipoIVA = tipoIVA;
    }
    public double calcularGastoConIVA(double importe){
        return tipoIVA.calcular(importe);
    }
}
