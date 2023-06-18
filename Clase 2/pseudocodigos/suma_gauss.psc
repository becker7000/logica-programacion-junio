Proceso suma_gauss
	
	Definir MAX Como Entero;
	Definir i Como Entero;
	Definir sum Como Entero;
	
	Imprimir "Sumar del 1 al: ";
	Leer MAX;
	
	sum <- 0; // La suma inicia en cero.
	
	Para i<-1 Hasta MAX Con Paso 1 Hacer
		sum <- sum+i;
	FinPara
	
	Imprimir "La suma del 1 al ",MAX," es: ",sum;
	
FinProceso
