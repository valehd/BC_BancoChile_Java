package com.valentinahernandez.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pinturas")
public class Pintura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El campo es requerido.")
    @Size(min = 5, message = "El título debe tener al menos 5 caracteres.")
    @Column(unique = true)
    private String titulo;

    @NotNull(message = "El campo es requerido.")
    @Positive(message = "El año debe ser un número positivo.")
    private Integer anio;

    @NotBlank(message = "El campo es requerido.")
    @Size(min = 10, message = "La descripción debe tener al menos 10 caracteres.")
    private String descripcion;

    @NotNull(message = "El campo es requerido.")
    @Positive(message = "La cantidad debe ser un número positivo.")
    private Integer cantidad;

    @NotBlank(message = "El campo es requerido.")
    @Pattern(
        regexp = "(?i).*\\.(jpg|jpeg|png|gif|bmp|webp|svg)$",
        message = "La URL de la imagen debe terminar con una extensión de imagen válida."
    )
    private String urlImagen;

    @NotNull(message = "El campo es requerido.")
    @Positive(message = "El precio debe ser un número positivo.")
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario creador;

    public Pintura() {
    }

    public Pintura(Long id, String titulo, Integer anio, String descripcion, Integer cantidad,
                    String urlImagen, Double precio, Usuario creador) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.urlImagen = urlImagen;
        this.precio = precio;
        this.creador = creador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Pintura [id=" + id + ", titulo=" + titulo + ", anio=" + anio + ", descripcion=" + descripcion
                + ", cantidad=" + cantidad + ", urlImagen=" + urlImagen + ", precio=" + precio
                + ", creador=" + creador + "]";
    }
}