package io.application.controller;

import io.application.domain.response.Transacao;
import io.application.api.TransacaoApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-29T01:33:56.555Z")

@Controller
public class TransacaoApiController implements TransacaoApi {

    private static final Logger log = LoggerFactory.getLogger(TransacaoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransacaoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> alteraValorTransacao(@ApiParam(value = "",required=true)
                                                     @PathVariable("codigo") Long codigo,
                                                     @NotNull @ApiParam(value = "", required = true)
                                                     @Valid @RequestParam(value = "valor", required = true) Double valor,
                                                     @ApiParam(value = "" ,required=true)
                                                     @RequestHeader(value="Authorization", required=true) String authorization) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Transacao> cadastraTransacao(@ApiParam(value = "" ,required=true)
                                                       @RequestHeader(value="Authorization", required=true)
                                                               String authorization,
                                                       @ApiParam(value = "" ,required=true )
                                                       @Valid @RequestBody Transacao transacao,
                                                       @NotNull @ApiParam(value = "", required = true,
                                                               allowableValues = "debito, deposito")
                                                       @Valid @RequestParam(value = "tipo", required = true) String tipo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Transacao>(objectMapper.readValue("{\"empty\": false}",
                        Transacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Transacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Transacao>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> excluiTransacao(@ApiParam(value = "",required=true)
                                                @PathVariable("codigo") Long codigo,
                                                @ApiParam(value = "" ,required=true)
                                                @RequestHeader(value="Authorization",
                                                        required=true) String authorization) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
