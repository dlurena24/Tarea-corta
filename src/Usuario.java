public class Usuario {

    private String residencia;

    private String email;
    private String vencimientoLicencia;
    private String contraseña;
    private int cedula;
    private int telefono;
    private String metodoPago;
    private Vehiculo[] vehiculo = new Vehiculo[10];

    private Usuario(){}

    public synchronized static Usuario getInstance() {
        if(instance == null){
            instance = new Usuario();
        }
        return instance;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getVencimientoLicencia() {
        return vencimientoLicencia;
    }

    public void setVencimientoLicencia(String vencimientoLicencia) {
        this.vencimientoLicencia = vencimientoLicencia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    private static Usuario instance; //null

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private String licencia;

    public String getContraseña() {
        return contraseña;
    }

    public static void setInstance(Usuario instance) {
        Usuario.instance = instance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}