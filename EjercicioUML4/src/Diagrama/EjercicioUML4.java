package Diagrama;

/**
 *
 * @author Lab_Redes_Eq15
 */
public class EjercicioUML4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaHotelera Hotel1 = new CadenaHotelera();
        Hotel1.setDirector("Jose");
        Hotel1.setNombre("Las Cariñosas");

        Hotel H1 = new Hotel(101320, "SDSD", "El padrote");
        H1.setDireccion("Texcoco");
        H1.setHabitaciones(200);
        H1.setNuumeroCuenta(1312431);

        Hotel1.addHotel(H1);

        System.out.println("Hotel 1:" + Hotel1);
//        System.out.println("Numero de Cuenta: " + H1.getNuumeroCuenta());
//        System.out.println("Nombre de Banco: " + H1.getNombreBanco());
        System.out.println("Hotel 1:" + Hotel1.getLista().get(0).getNuumeroCuenta());
        System.out.println("Hotel 1:" + Hotel1.getLista().get(0).getHabitaciones());
        System.out.println("Hotel 1:" + Hotel1.getLista().get(0).getNombreBanco());
        System.out.println("Hotel 1:" + Hotel1.getLista().get(0).getNombre());
        System.out.println("Hotel 1:" + Hotel1.getLista().get(0).getDireccion());

    }
}
