public class PlanDatosAcademico extends PlanDatos {
    public PlanDatosAcademico() {
        this.nombre = "Academico";
    }

    @Override
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}