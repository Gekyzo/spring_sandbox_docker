package com.box.sandbox.hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MSTR_HELLO")
public class Hello {

    @Id
    @Column(name = "ID")
    private Long id;

}
