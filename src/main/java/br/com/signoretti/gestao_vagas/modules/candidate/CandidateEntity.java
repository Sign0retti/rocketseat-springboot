package br.com.signoretti.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    //Expressão regular para detectar espaço dentro do campo username
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "O campo deve conter um e-mail válido.")
    private String email;

    @Length(min=5, max=12, message = "O campo [senha] deve ter entre 5 a 12 letras.")
    private String password;

    private String description;
    private String curriculo;

    
}
