class ejercicio4 {
    public static void main(String[] args) {
        // Condición if
	int numeroIf = -5;
	if (numeroIf > 0) {
	System.out.println("El número es positivo");
	} else if (numeroIf < 0) {
	System.out.println("El número es negativo");
	} else {
	System.out.println("El número es 0");
	}

	// Bucle while
	int numeroWhile = 0;
	while (numeroWhile < 3) {
	numeroWhile++;
	System.out.println("Valor de numeroWhile: " + numeroWhile);
	}

	// Bucle do-while
	int numeroDoWhile = 0;
	do {
	numeroDoWhile++;
	System.out.println("Valor de numeroDoWhile: " + numeroDoWhile);
	} while (numeroDoWhile < 3);

	// Bucle for
	for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
	System.out.println("Valor de numeroFor: " + numeroFor);
	}

	// Switch
	String estacion = "verano";
	switch (estacion) {
	case "primavera":
	System.out.println("La estación es primavera");
	break;
	case "verano":
	System.out.println("La estación es verano");
	break;
	case "otoño":
	System.out.println("La estación es otoño");
	break;
	case "invierno":
	System.out.println("La estación es invierno");
	break;
	default:
	System.out.println("La estación es desconocida");
	}	
    }
}
