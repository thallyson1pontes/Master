/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.26).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.application.api;

import io.application.domain.request.Cliente;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-29T01:33:56.555Z")

@Validated
@Api(value = "cliente", description = "the cliente API")
@RequestMapping(value = "/atnk-api/v1")
public interface ClienteApi {

    @ApiOperation(value = "Cadastra Cliente", nickname = "cadastraCliente", notes = "Cadastra um novo cliente", response = Cliente.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cadastro efetuado com sucesso", response = Cliente.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/cliente",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Cliente> cadastraCliente(@ApiParam(value = ""  )  @Valid @RequestBody Cliente cliente_);

}
