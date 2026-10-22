
import 'tina.dart';

class IngresoBodega {
  final List<Tina> loteTinas = [];

  void registrarTina(Tina tina) {
    loteTinas.add(tina);
  }

  void generarInforme() {
    int completas = 0;
    int incompletas = 0;
    int excedentes = 0;

    for (Tina t in loteTinas) {
      String estado = t.evaluarEstado();

      if (estado == 'Tina Completa') {
        completas++;
      } else if (estado == 'Tina Incompleta') {
        incompletas++;
      } else if (estado == 'Tina con Excedente') {
        excedentes++;
      }
    }

    print('--- INFORME DE CIERRE ---');
    print('Tinas Completas: $completas');
    print('Tinas Incompletas: $incompletas');
    print('Tinas con Excedente: $excedentes');
  }
}
