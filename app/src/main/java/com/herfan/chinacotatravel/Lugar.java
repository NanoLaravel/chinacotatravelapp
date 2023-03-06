package com.herfan.chinacotatravel;

public class Lugar {
    private String nombre, direccion, foto, uri, comentario;
    private int telefono;
    private Long fecha;
    private float valoracion;
    private TipoLugar tipo;
    private Geopunto Posicion;
    private double longitud, latitud;


    public Lugar() {
    }

    public Lugar(String nombre, String direccion, String comentario, int telefono, float valoracion, TipoLugar tipo, double longitud, double latitud) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.comentario = comentario;
        this.telefono = telefono;
        this.valoracion = valoracion;
        this.tipo = tipo;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public TipoLugar getTipo() {
        return tipo;
    }

    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

    public Geopunto getPosicion() {
        return Posicion;
    }

    public void setPosicion(Geopunto posicion) {
        Posicion = posicion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", foto='" + foto + '\'' +
                ", uri='" + uri + '\'' +
                ", comentario='" + comentario + '\'' +
                ", telefono=" + telefono +
                ", fecha=" + fecha +
                ", valoracion=" + valoracion +
                ", tipo=" + tipo +
                ", Posicion=" + Posicion +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                '}';
    }
}
