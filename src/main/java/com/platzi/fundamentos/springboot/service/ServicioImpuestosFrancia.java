package com.platzi.fundamentos.springboot.service;

import com.platzi.fundamentos.springboot.component.TipoIVA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServicioImpuestosFrancia {
    @Autowired
    @Qualifier("tipoIVAFrancia")
    private TipoIVA tipoIVA;

    public double calcularGastoConIVA(double importe){
        return tipoIVA.calcular(importe);
    }
}
