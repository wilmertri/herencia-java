public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pablo");
        System.out.println(cliente.getNombreCliente());
        cliente.estatura = 1.80;
        cliente.mostrarEstatura();
    }
}