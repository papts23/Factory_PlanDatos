public abstract class PlanDatos {
    String nombre;
    float tasa;

    public abstract void setTasa(float tasa);

    public float calculoPago(int datos) {
        return this.tasa * datos;
    }

    @Override
    public String toString() {
        return "Plan: " + nombre + " | Tasa por mega: S/ " + tasa;
    }
}