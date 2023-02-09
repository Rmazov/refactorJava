public class Mula extends Comparendo{
    private int limiteInferiorMula = 95;
    private int limiteInferiorIntermedioMula = 96;
    private int limiteSuperiorMula = 110;

    private String tipoVehiculo = "MULA";
    public Mula() {
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
        if(velocidad<=limiteInferiorMula) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedioMula && velocidad<=limiteSuperiorMula) {
            return 1;
        }
        return 2;
    }


    public String enviarCorreoFotomulta() { String cuerpoMensaje = "//enviando correo para el tipo mula.";
        String asunto = "//asunto: comparendo mula";
        return   asunto + cuerpoMensaje;
    }

}
