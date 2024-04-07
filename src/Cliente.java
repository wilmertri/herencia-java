public class Cliente extends Persona{
    private String producto;
    private Long codigo;

    public Cliente(){

    }

    public Cliente(Long codigo, String nombre, int edad){
        super(nombre, edad);
        this.codigo = codigo;
    }

    public String getNombreCliente(){
        return this.getNombre();
    }

    public int getEdad()
    {
        return this.getEdad();
    }

    public void mostrarEstatura(){
        System.out.println("Estatura del cliente " + this.estatura);
    }

    public double getEstatura(){
        return this.estatura;
    }
}
