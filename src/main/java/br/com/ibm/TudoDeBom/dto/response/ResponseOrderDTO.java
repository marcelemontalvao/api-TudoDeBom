package br.com.ibm.TudoDeBom.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ResponseOrderDTO {
    private Long id;
    private Date dataSaida;
    private BigDecimal precoUnitario;
    private Integer quantidade;
    private BigDecimal valorFinal;
}
