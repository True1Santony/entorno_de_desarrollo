package cuentas;
/**En esta clase se generan los objetos cuenta y las reglas de su manipulacion
 * 
 * @author debian
 *
 */

public class CCuenta {

    //atribujos de clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()//constructor por defecto
    {
    }

    /**
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)//constructor con paramentros
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * @return
     * saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	/**
	 * @return
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
