package br.com.partypoker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends Usuario{
    @Column(nullable = false)
    private boolean isSuperAdmin;
}
