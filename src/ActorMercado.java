public abstract class ActorMercado {
    private double oroDisponible = 0.0;
    private Inventario inventarioPersonal;

    public double getOroDisponible() {
        return oroDisponible;
    }

    public void actualizarOro(Double cantidad, boolean esIngreso){

    }
    public void comprarObjeto(Coleccionables item, double  precioFinal){

    }
    public Coleccionables venderObjeto(String idObjeto){

        return //aqui retorna un objeto Coleccionable
    }

    public double calcularValorTotalColeccion(){
        return //retorna double
    }

    public boolean ofertarPorItem(INegociable item, double ofertaMaxima){
        return //retorna booleano
    }
}
