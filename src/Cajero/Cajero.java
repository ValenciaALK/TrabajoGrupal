package Cajero;
import java.util.ArrayList;
import java.util.Scanner;
public class Cajero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrTarjeta = new ArrayList<String>();
		arrTarjeta.add("4000 1234 5678 9010");
		arrTarjeta.add("3000 5678 9010 1234");
		arrTarjeta.add("2000 9010 1234 5678");
		arrTarjeta.add("1000 1234 9010 5678");
		ArrayList<String> arrNombre = new ArrayList<String>();
		arrNombre.add("Alejandro Ramirez López");
		arrNombre.add("Ramiro Araujo  Villa");
		arrNombre.add("Melanie Aguilar Paredes");
		arrNombre.add("Renzo Costa Manrique");
		ArrayList<String> arrDNI = new ArrayList<String>();
		arrDNI.add("09105678");
		arrDNI.add("46791230");
		arrDNI.add("87902010");
		arrDNI.add("04875784");
		ArrayList<String> arrCodigo = new ArrayList<String>();
		arrCodigo.add("9735");
		arrCodigo.add("4280");
		arrCodigo.add("5030");
		arrCodigo.add("8724");
		ArrayList<Integer> arrSaldo = new ArrayList<Integer>();
		arrSaldo.add(800);
		arrSaldo.add(1500);
		arrSaldo.add(1200);
		arrSaldo.add(500);

		String validacion = "S";

		while (validacion.equals("s") || validacion.equals("S") || validacion.equals("Si")) {

			System.out.println("  <<< Bienvenido >>>");
			System.out.println("-------------------------");
			System.out.println("[1] Ingreso por DNI.");
			System.out.println("[2] Ingreso por tarjeta.");
			System.out.println("[3] Crear cuenta.");
			System.out.println("[0] Salir.");
			System.out.print("¿Qué acción desea realizar?: ");
			int acc_1 = sc.nextInt();
			sc.nextLine();

			switch (acc_1) {
			case 1:
				System.out.println("-------------------------");
				System.out.print("\nIngrese número de DNI: ");
				String dni = sc.nextLine();
				System.out.print("Ingrese su contraseña: ");
				String contra = sc.nextLine();

				while (true) {
					for (int i = 0; i < arrDNI.size(); i++) {
						if (dni.equals(arrDNI.get(i)) && contra.equals(arrCodigo.get(i))) {

							System.out.println("\n-----------------------");
							System.out.println("INGRESADO CON ÉXITO");
							System.out.println("-----------------------");
							System.out.println("Bienvenido  <<<" + arrNombre.get(i) + ">>>");

							System.out.println("==================================");

							String vali_2 = "S";
							while (vali_2.equals("S") || vali_2.equals("s") || vali_2.equals("Si")) {
								System.out.println("\n<<<<Que  desea hacer el día de hoy>>>>" 
										+ "\n(1)====Ver saldo "
										+ "\n(2)====Retirar saldo   " 
										+ "\n(3)====Transferir saldo  "
										+ "\n(4)====Depósito" 
										+ "\n(0)====Salir  " + "\n");
								System.out.print("Digite una opción : ");
								int opcion = sc.nextInt();
								vali_2 = "";
								System.out.println("=======================================");

								switch (opcion) {
								case 1:
									System.out.println("Su saldo es : " + arrSaldo.get(i));
									break;

								case 2:
									System.out.println("Cuanto deseas retirar :  ");
									int retirar = sc.nextInt();
									if (retirar <= arrSaldo.get(i)) {

										int a = 0;
										a = arrSaldo.get(i);
										a = arrSaldo.get(i) - retirar;
										System.out.println("Retiro Exitoso");
										System.out.println("===============");
										System.out.println("Su nuevo saldo es : " + a);

										arrSaldo.add(i,a);

									} else
										System.out
												.println("No puede retirar cantidades  mas altas que su saldo actual");
									break;
								case 3:
									if (dni == arrDNI.get(i)) {
										System.out.println("No puede depositarse asi mismo, ingrese otro codigo  ");
										sc.nextLine();
									} else
										System.out.println("<<<<<Cuanto desea transferir>>>>>");
									int transferir = sc.nextInt();
										
									if (transferir <= arrSaldo.get(i)) {
										System.out.println("Cuenta destinataria: ");
										String cuenta_d = sc.nextLine();
										
										int a = 0;
										a = arrSaldo.get(i);
										a = arrSaldo.get(i) - transferir;

										String per = sc.nextLine();
										if (per.equals(arrTarjeta.get(i))) {
											System.out.println(
													"<<<No puede transferirse  asi mismo, ingrese otro codigo >>>\nPresione ENTER PARA CONTINUAR");
											break;
										} else
											System.out.println("=================");
										System.out.println("Transferencia exitosa,su nuevo saldo es " + a);
										System.out.println("=================");
										arrSaldo.add(i,a);
										System.out.println("PRESIONE ENTER PARA CONTINUAR");
									}

									else if (transferir > arrSaldo.get(i)) {
										System.out.println("No puede transferir mas que su saldo actual");
									}
									break;
								case 4:
									System.out.print("Cuanto deseas depositar:  ");
									int deposito = sc.nextInt();
									if (deposito > 0) {

										int a = 0;
										a = arrSaldo.get(i);
										a = arrSaldo.get(i) + deposito;
										System.out.println("Deposito Exitoso");
										System.out.println("===============");
										System.out.println("Su nuevo saldo es : " + a+ "\n");


										arrSaldo.add(i,a);

									} else
										System.out
												.println("\nDeposite un valor mayor a cero\n");
									break;
								case 0:
									System.out.println("\nUsted cerró el programa.\n");
									vali_2 = "n";
									validacion = "n";
									break;

								default:
									System.out.println("Opcion no encontrada, intentalo de nuevo");

								}
								sc.nextLine();
								while (!vali_2.equals("S") && !vali_2.equals("s") && !vali_2.equals("N") && !vali_2.equals("n")){
									System.out.print("¿Desea realizar otra operación? [S/N]: ");
									vali_2 = sc.nextLine();
									validacion = vali_2;
								}


							}

						}

					}

					break;
				}



//				sc.nextLine();
				break;

			case 2:
					System.out.println("-------------------------");
				System.out.print("\nIngrese número de Tarjeta: ");
				String tarje = sc.nextLine();
				System.out.print("Ingrese su contraseña: ");
				String pw = sc.nextLine();

				while (true) {
					for (int i = 0; i < arrTarjeta.size(); i++) {
						if (tarje.equals(arrTarjeta.get(i)) && pw.equals(arrCodigo.get(i))) {

							System.out.println("\n-----------------------");
							System.out.println("INGRESADO CON ÉXITO");
							System.out.println("-----------------------");
							System.out.println("Bienvenido  <<<" + arrNombre.get(i) + ">>>");

							System.out.println("==================================");

							String vali_2 = "S";
							while (vali_2.equals("S") || vali_2.equals("s") || vali_2.equals("Si")) {
								System.out.println("\n<<<<Que  desea hacer el día de hoy>>>>" + "\n(1)====Ver saldo "
										+ "\n(2)====Retirar saldo   " + "\n(3)====Transferir saldo  "
										+ "\n(4)====Depósito" + "\n(0)====Salir  " + "\n");
								System.out.print("Digite una opción : ");
								int opcion = sc.nextInt();
								vali_2 = "";
								System.out.println("=======================================");

								switch (opcion) {
								case 1:
									System.out.println("Su saldo es : " + arrSaldo.get(i));
									break;

								case 2:
									System.out.println("Cuanto deseas retirar :  ");
									int retirar = sc.nextInt();
									if (retirar <= arrSaldo.get(i)) {

										int a = 0;
										a = arrSaldo.get(i);
										a = arrSaldo.get(i) - retirar;
										System.out.println("Retiro Exitoso");
										System.out.println("===============");
										System.out.println("Su nuevo saldo es : " + a);

										arrSaldo.add(i,a);

									} else
										System.out
												.println("No puede retirar cantidades  mas altas que su saldo actual");
									break;
								case 3:
									if (tarje == arrTarjeta.get(i)) {
										System.out.println("No puede depositarse asi mismo, ingrese otro codigo  ");
										sc.nextLine();
									} else
										System.out.println("<<<<<Cuanto desea transferir>>>>>");
									int transferir = sc.nextInt();
										
									if (transferir <= arrSaldo.get(i)) {
										System.out.println("Cuenta destinataria: ");
										String cuenta_d = sc.nextLine();
										int a = 0;
										a = arrSaldo.get(i);
										a = arrSaldo.get(i) - transferir;

										String per = sc.nextLine();
										if (per.equals(arrTarjeta.get(i))) {
											System.out.println(
													"<<<No puede transferirse  asi mismo, ingrese otro codigo >>>\nPresione ENTER PARA CONTINUAR");
											break;
										} else
										
										System.out.println("=================");
										System.out.println("Transferencia exitosa,su nuevo saldo es " + a);
										System.out.println("=================");
										arrSaldo.add(i,a);
										System.out.println("PRESIONE ENTER PARA CONTINUAR");
										
									}

									else if (transferir > arrSaldo.get(i)) {
										System.out.println("No puede transferir mas que su saldo actual");
									}
									break;
								case 4:
									System.out.print("Cuanto deseas depositar:  ");
									int deposito = sc.nextInt();
									if (deposito > 0) {

										int a = 0;
										a = arrSaldo.get(i);
										a = arrSaldo.get(i) + deposito;
										System.out.println("Deposito Exitoso");
										System.out.println("===============");
										System.out.println("Su nuevo saldo es : " + a+ "\n");


										arrSaldo.add(i,a);

									} else
										System.out
												.println("\nDeposite un valor mayor a cero\n");
									break;
								case 0:
									System.out.println("\nUsted cerró el programa.\n");
									vali_2 = "n";
									validacion = "n";
									break;

								default:
									System.out.println("Opcion no encontrada, intentalo de nuevo");

								}
								sc.nextLine();
								while (!vali_2.equals("S") && !vali_2.equals("s") && !vali_2.equals("N") && !vali_2.equals("n")){
									System.out.print("¿Desea realizar otra operación? [S/N]: ");
									vali_2 = sc.nextLine();
									validacion = vali_2;
								}


							}

						}

					}

					break;
				}

				break;

			case 3:
				System.out.println("-------------------------");
				System.out.println("\n<< Creador de cuentas >>");
				System.out.print(" Ingrese nombre: ");
				String nombre_creado = sc.nextLine();
				System.out.print(" Ingrese su edad: ");
				int edad = sc.nextInt();

				if (edad <= 17) {
					System.out.println("\nUsted no tiene la edad suficiente\npara crear una cuenta bancaria.");
					validacion = "N";
					break;
				} else if (edad >= 18) {
					sc.nextLine();

					System.out.print(" Ingrese su DNI: ");
					String dni1 = sc.nextLine();
					System.out.print(" Ingrese su contraseña: ");
					String contrasena = sc.nextLine();
					System.out.print(" Ingrese su saldo: ");
					int saldo = sc.nextInt();
					arrNombre.add(nombre_creado);
					arrCodigo.add(contrasena);
					arrDNI.add(dni1);
					arrSaldo.add(saldo);
					arrTarjeta.add("5678 9010 1234 5678");
					System.out.println("\n <<Creando cuenta>>\n\n");
					System.out.println("-- Cuenta creada con éxito --");
					System.out.println("\n-------------------------");
					System.out.println("Nombre.....: " + nombre_creado);
					System.out.println("DNI........: " + dni1);
					System.out.println("Tarjeta....: " + "5678 9010 1234 5678");
					System.out.println("Contraseña.: " + contrasena);
					System.out.println("\n");
					sc.nextLine();
					break;

				}

			case 0:

				validacion = "n";
				break;

			default:
				System.out.println("\n-------------------------");
				System.out.println("No eligió una opción válida.");
				System.out.print("¿Desea realizar otro intento? [Si/No]: ");
				validacion = sc.nextLine();
				System.out.println("");

			}

		}

		System.out.println("\n---------------------------");
		System.out.println("Gracias por su preferencia.");
		System.out.println(" << Cerrando programa >>");
		System.out.println("---------------------------");

	}

}