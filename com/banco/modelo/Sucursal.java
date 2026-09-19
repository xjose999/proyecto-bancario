

    /** Invocado desde el constructor de Cuenta. */
    void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    /** Designa al director responsable de la sucursal. */
    public void asignarDirector(Empleado empleado) {
        this.director = empleado;
        if (!empleados.contains(empleado)) {
            agregarEmpleado(empleado);
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Empleado getDirector() {
        return director;
    }

    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    public List<Cuenta> getCuentas() {
        return Collections.unmodifiableList(cuentas);
    }
}
