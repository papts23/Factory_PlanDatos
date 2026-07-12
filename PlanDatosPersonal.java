public class PlanDatosPersonal extends PlanDatos {
    public PlanDatosPersonal() {
        this.nombre = "Personal";
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}