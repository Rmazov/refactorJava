public class Carro extends Comparendo{
    private int limiteInferiorCarro = 65;
    private int limiteInferiorIntermedioCarro = 66;
    private int limiteSuperiorCarro = 85;

    private String tipoVehiculo = "CARRO";
    public Carro() {
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
        if(velocidad<=limiteInferiorCarro) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedioCarro && velocidad<=limiteSuperiorCarro) {
            return 1;
        }
        return 2;
    }


    public String enviarCorreoFotomulta() {  String cuerpoMensaje = "//enviando correo para el tipo carro.";
        String asunto = "//asunto: comparendo carro";
        return   asunto + cuerpoMensaje;
    }
}
