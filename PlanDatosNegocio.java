public class PlanDatosNegocio extends PlanDatos {
    public PlanDatosNegocio() {
        this.nombre = "Negocio";
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}