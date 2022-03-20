package com.platzi.fundamentos.springboot.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tipoIVAItalia")
public class TipoIVAItalia implements TipoIVA{
    @Override
    public double calcular(double importe) {
        return importe*1.25;
    }
}
