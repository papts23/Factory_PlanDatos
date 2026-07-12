public class PlanesDatosFactory {

    public static void calculoConsumo(FabricaCreadora fabrica, String tipo, int numeroMegasConsumido) {
        PlanDatos plan = fabrica.crearPlanDatos(tipo);
        
        if (plan != null) {
            float totalPagar = plan.calculoPago(numeroMegasConsumido);
            System.out.println("--- Detalles del Consumo ---");
            System.out.println(plan.toString());
            System.out.println("Megas consumidos: " + numeroMegasConsumido);
            System.out.println("Total a pagar: S/ " + totalPagar);
            System.out.println("----------------------------\n");
        } else {
            System.out.println("El tipo de plan '" + tipo + "' no existe en este proveedor.\n");
        }
    }

    public static void main(String[] args) {

        FabricaCreadora fabricaClaro = new FabricaClaro();
        System.out.println("Proveedor: Claro");
        calculoConsumo(fabricaClaro, "Academico", 150);

        FabricaCreadora fabricaMovistar = new FabricaMovistar();
        System.out.println("Proveedor: Movistar");
        calculoConsumo(fabricaMovistar, "Personal", 200);
        
        FabricaCreadora fabricaLinea = new FabricaLineaRapida();
        System.out.println("Proveedor: Linea Rapida");
        calculoConsumo(fabricaLinea, "Negocio", 500);
    }
}