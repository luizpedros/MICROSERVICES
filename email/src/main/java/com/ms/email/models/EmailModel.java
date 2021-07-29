package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static final long serialVersionUID = 1L;
    private Long emailId;
    private String ownerRef; //Referencia do proprietario(id)
    private String emailFrom; //Quem da mandando
    private String emailTo; //Para quem vai mandar
    private String subject; //Titulo do email

    @Column(columnDefinition = "TEXT") //Essa definição me permite colocar mais caracteres na string
    private String text; //O texto o corpo do email
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail; //É o status do email, se foi enviado ou nao (vou criar essa class)
}
