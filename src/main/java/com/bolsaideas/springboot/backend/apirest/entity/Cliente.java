package com.bolsaideas.springboot.backend.apirest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "clientes")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    @Column(name = "create_at")
    private String createAt;

    @PrePersist
    public void prePersist(){
        Date createAtDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        createAt = dateFormat.format(createAtDate);
    }

    private String email;

}
