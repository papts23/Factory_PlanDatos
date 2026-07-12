public class FabricaMovistar extends FabricaCreadora {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;
        
        if (tipo.equalsIgnoreCase("Personal")) {
            plan = new PlanDatosPersonal();
            plan.setTasa(0.8f);
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            plan = new PlanDatosNegocio();
            plan.setTasa(1.6f);
        } else if (tipo.equalsIgnoreCase("Academico")) {
            plan = new PlanDatosAcademico();
            plan.setTasa(1.25f);
        }
        
        return plan;
    }
}