public class Camion extends Comparendo{
    private int limiteInferiorCamion = 75;
    private int limiteInferiorIntermedioCamion = 76;
    private int limiteSuperiorCamion = 95;
    private String tipoVehiculo = "CAMION";

    public Camion() {
    }

    @Override
    public void construirFotoMulta(int velocidad) {
        int tipoComparendo = calcularComparendo(velocidad);
        String mensajeFotoMulta = enviarCorreoFotomulta();
        if(tipoComparendo == -1){
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo + "corre: " + mensajeFotoMulta);
        }else {
            System.out.println("----el tipo de comparendo es: " + tipoComparendo + " ----cuerpo del correo" + mensajeFotoMulta);
        }
    }


    public int calcularComparendo(int velocidad) {
        if(velocidad<=limiteInferiorCamion) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedioCamion && velocidad<=limiteSuperiorCamion) {
            return 1;
        }
        return 2;
    }


    public String enviarCorreoFotomulta() {   String cuerpoMensaje = "//enviando correo para el tipo camion.";
        String asunto = "//asunto: comparendo camion";
        return   asunto + cuerpoMensaje;
    }

}
