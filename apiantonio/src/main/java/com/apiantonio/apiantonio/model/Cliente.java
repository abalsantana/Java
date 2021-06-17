package com.apiantonio.apiantonio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

//@Getter
//@Setter
//@ToString
@Data//Substitui todas as anotações sobre getters and setters,toString e HashCode
@Entity
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column - poderia usar essa notação, mas como o nome no banco é igual, posso omitir
    private String nome;

    private String email;

    @Column(name="telefone")
    private String fone;


}
