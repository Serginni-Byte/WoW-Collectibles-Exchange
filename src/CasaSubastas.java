public class CasaSubastas implements INegociable{

    private Coleccionables itemSubastado;
    private String vendedor;
    private double precioInicial = 0.0;
    private double pujaActual = 0.0;
    private String mejorPostor;
    private int tiempoRestante = 0;
    private boolean activa = false;

    @Override
    public boolean evaluarOferta(double oferta){
        return
    }

    @Override
    public void procesarIntercambio(){

    }

    public boolean recibirPuja(String idPostor, double montoOferta){
        return
    }

    public void cerrarSubasta(){

    }

    public double getPujaActual(){
        return this.pujaActual;
    }

    public Coleccionables getItemSubastado() {
        return itemSubastado;
    }

    public boolean estaActiva(){
        return this.activa;
    }
}
