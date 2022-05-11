package com.proyecto.proyecto.models;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idUs;
    private String nombreUs;
    private String apellidoUs;
    private String tituloUs;
    private String descripcionUs;
    private String fotoUs;

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch= FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsListList;
    @OneToMany(fetch= FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaListList;

    public Usuario() {
    }

    public Usuario(long idUs, String nombreUs, String apellidoUs, String tituloUs, String descripcionUs, String fotoUs) {
        this.idUs = idUs;
        this.nombreUs = nombreUs;
        this.apellidoUs = apellidoUs;
        this.tituloUs = tituloUs;
        this.descripcionUs = descripcionUs;
        this.fotoUs = fotoUs;
    }

    public long getIdUs() {
        return idUs;
    }

    public void setIdUs(long idUs) {
        this.idUs = idUs;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getApellidoUs() {
        return apellidoUs;
    }

    public void setApellidoUs(String apellidoUs) {
        this.apellidoUs = apellidoUs;
    }

    public String getTituloUs() {
        return tituloUs;
    }

    public void setTituloUs(String tituloUs) {
        this.tituloUs = tituloUs;
    }

    public String getDescripcionUs() {
        return descripcionUs;
    }

    public void setDescripcionUs(String descripcionUs) {
        this.descripcionUs = descripcionUs;
    }

    public String getFotoUs() {
        return fotoUs;
    }

    public void setFotoUs(String fotoUs) {
        this.fotoUs = fotoUs;
    }
}
