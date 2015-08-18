package ecos.centralizador.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que representa a un ciudadano en
 * el Registro Unico de Usuarios
 *
 */
@XmlRootElement
public class Ciudadano {
	
	private int idCiudadano;
	
	private String uniqueId;
	
	private TipoIdentificacion tipoIdCiudadano;
	
	private String numeroIdentificacion;
	
	//TODO: private Municipio municipioExpDoc;
	
	private Date fechaExpDocumento;
	
	private String primerNombre;
	
	private String segundoNombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private Genero genero;
	
	private Date fechaNacimiento;	
	
	//TODO: private Municipio municipioNacimiento;
	
	//TODO: private Pais paisNacionalidad;
	
	private String telefonoFijo;
	
	private String telefonoCelular;
	
	private EstadoCivil estadoCivil;

	public int getIdCiudadano()
	{
		return idCiudadano;
	}

	public void setIdCiudadano(int idCiudadano)
	{
		this.idCiudadano = idCiudadano;
	}

	public String getUniqueId()
	{
		return uniqueId;
	}

	public void setUniqueId(String uniqueId)
	{
		this.uniqueId = uniqueId;
	}

	public TipoIdentificacion getTipoIdCiudadano()
	{
		return tipoIdCiudadano;
	}

	public void setTipoIdCiudadano(TipoIdentificacion tipoIdCiudadano)
	{
		this.tipoIdCiudadano = tipoIdCiudadano;
	}

	public String getNumeroIdentificacion()
	{
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion)
	{
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public Date getFechaExpDocumento()
	{
		return fechaExpDocumento;
	}

	public void setFechaExpDocumento(Date fechaExpDocumento)
	{
		this.fechaExpDocumento = fechaExpDocumento;
	}

	public String getPrimerNombre()
	{
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre)
	{
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre()
	{
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre)
	{
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido()
	{
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido)
	{
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido()
	{
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido)
	{
		this.segundoApellido = segundoApellido;
	}

	public Genero getGenero()
	{
		return genero;
	}

	public void setGenero(Genero genero)
	{
		this.genero = genero;
	}

	public Date getFechaNacimiento()
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefonoFijo()
	{
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo)
	{
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoCelular()
	{
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular)
	{
		this.telefonoCelular = telefonoCelular;
	}

	public EstadoCivil getEstadoCivil()
	{
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil)
	{
		this.estadoCivil = estadoCivil;
	}

}
