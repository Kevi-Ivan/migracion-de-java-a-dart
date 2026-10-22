class Tina {
    double pesoNeto;
    String tipoDestino;

    Tina(double pesoNeto, String tipoDestino) {
        this.pesoNeto = pesoNeto;
        this.tipoDestino = tipoDestino;
    }
}
  String evaluarEstado() {
    if (tipoDestino.toLowerCase() == 'desperdicio') {
      return 'Desperdicio';
    }

    if (pesoNeto >= 600 && pesoNeto <= 605) {
      return 'Tina Completa';
    } else if (pesoNeto < 600) {
      return 'Tina Incompleta';
    } else {
      return 'Tina con Excedente';
    }
  }
}
