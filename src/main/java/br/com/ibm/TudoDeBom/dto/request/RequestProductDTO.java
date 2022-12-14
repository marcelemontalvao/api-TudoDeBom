package br.com.ibm.TudoDeBom.dto.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class RequestProductDTO {
    @NotEmpty
    private String nome;
    @DateTimeFormat
    private Date dataDeCriacao;
    @NotNull
    private Boolean isMedicine;
    @NotNull
    private Boolean isGeneric;

    private RequestInputDTO estoque;
    private RequestOrderDTO pedido;

}
