
import 'dart:io';
import 'ingreso_bodega.dart';
import 'tina.dart';

void main() {
  IngresoBodega bodega = IngresoBodega();

  print('=== SISTEMA DE INGRESO A BODEGA ===');

  String continuar = 's';

  while (continuar == 's' || continuar == 'S') {
    stdout.write(
      '\nIngrese el destino de la tina (Venta / Desperdicio): ',
    );
    String destino = stdin.readLineSync() ?? '';

    double peso = 0;

    if (destino.toLowerCase() == 'venta') {
      stdout.write('Ingrese el peso neto de la tina en kg: ');

      String entradaPeso = stdin.readLineSync() ?? '0';
      peso = double.tryParse(entradaPeso) ?? 0;
    }

    // Creamos la tina y la registramos en la bodega.
    Tina tina = Tina(peso, destino);
    bodega.registrarTina(tina);

    stdout.write('¿Desea registrar otra tina? (s/n): ');
    continuar = stdin.readLineSync() ?? 'n';
  }

  print('\n');

  // Generamos el informe de cierre final.
  bodega.generarInforme();
}
