package com.tcc.apitcc.entidades;

import javax.persistence.*;

@Entity
@Table(name="mercancias")

public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="iup")
    private Integer iup;

    @Column(name="id_remitente")
    private String idRemitente;

    @Column(name="nombre_remitente")
    private String nombreRemitente;

    @Column(name="departamento_remitente")
    private String departamentoRemitente;

    @Column(name="municipio_remitente")
    private String municipioRemitente;

    @Column(name="tipo_remitente")
    private Boolean tipoRemitente;

    @Column(name="direccion_remitente")
    private String direccionRemitente;

    @Column(name="telefono_remitente")
    private String telefonoRemitente;

    @Column(name="id_destinatario")
    private String idDestinatario;

    @Column(name="nombre_destinatario")
    private String nombreDestinatario;

    @Column(name="departamento_destinatario")
    private String departamentoDestinatario;

    @Column(name="municipio_destinatario")
    private String municipioDestinatario;

    @Column(name="tip_destinatario")
    private Boolean tipoDestinatario;

    @Column(name="direccion_destinatario")
    private String direccionDestinatario;

    @Column(name="telefono_destinatario")
    private String telefonoDestinatario;

    @Column(name="peso")
    private Double peso;

    @Column(name="estado")
    private String estado;

    public Mercancia() {
    }

    public Mercancia(Integer iup, String idRemitente, String nombreRemitente, String departamentoRemitente, String municipioRemitente, Boolean tipoRemitente, String direccionRemitente, String telefonoRemitente, String idDestinatario, String nombreDestinatario, String departamentoDestinatario, String municipioDestinatario, Boolean tipoDestinatario, String direccionDestinatario, String telefonoDestinatario, Double peso, String estado) {
        this.iup = iup;
        this.idRemitente = idRemitente;
        this.nombreRemitente = nombreRemitente;
        this.departamentoRemitente = departamentoRemitente;
        this.municipioRemitente = municipioRemitente;
        this.tipoRemitente = tipoRemitente;
        this.direccionRemitente = direccionRemitente;
        this.telefonoRemitente = telefonoRemitente;
        this.idDestinatario = idDestinatario;
        this.nombreDestinatario = nombreDestinatario;
        this.departamentoDestinatario = departamentoDestinatario;
        this.municipioDestinatario = municipioDestinatario;
        this.tipoDestinatario = tipoDestinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.telefonoDestinatario = telefonoDestinatario;
        this.peso = peso;
        this.estado = estado;
    }
}
