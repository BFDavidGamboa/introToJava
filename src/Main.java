import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BreakYContinue();

    }

        public static void JavaSalute() {
            String saludarHoy = "Saludos desde java";
            var adiosFrances = "aios";
            var number = 0;
        }
        public static void HelloWorld(){
            System.out.println("Hello world\r");
            System.out.println(1 + 2 +" " + "asddas");
        }

        public static void Salutes(){
            var nombre = "Karla";
            var apellido = "Esparza";

            System.out.println(nombre + " "+ apellido);
            System.out.println("Nueva linea: \n" + nombre);
            System.out.println("Tabulador: \t" + nombre);
            System.out.println("Retroceso: \b\b" + nombre);
            System.out.println("Retorno de carro: \r" + nombre);
            System.out.println("Comilla simple: \'"+nombre + "\'" + " " + "'");
            System.out.println("Comilla doble: \""+ nombre + "\"" + " ");
            System.out.println("saludos");
            System.out.print("adios");
            System.out.println("nos vemos");
        }

        public static void Iteration() {
            for (int i = 1; i <= 5; i++) {
                // Press Ctrl+D to start debugging your code. We have set one breakpoint
                // for you, but you can always add more by pressing Cmd+F8.
                System.out.println("i = " + i);
                System.out.println("Hello world\r\n" + "olakease");

            }
        }

        public static void Scannvar(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proporciona el valor del usuario:");
            var usuario = scanner.nextLine();
            System.out.println("usuario = " + usuario);
        }

        public static void Primitives(){
            byte byteVar = 127;
            System.out.println("byteVar = " + byteVar);

            System.out.println("bits tipo Byte:" + Byte.SIZE);
            System.out.println("bytes tipos Byte:" + Byte.BYTES);
            System.out.println("valor minimo typo Byte: " + Byte.MIN_VALUE);
            System.out.println("valor maximo tipo Byte:" + Byte.MAX_VALUE);

            short shortVar = 32767;
            System.out.println("shortVar =" + shortVar);
            System.out.println("shortVar tipos short:" + Short.SIZE);
            System.out.println("valor minimo tipo Short:" + Short.MIN_VALUE);
            System.out.println("valor maximo tipo Short:"+ Short.MAX_VALUE);

            int intVar = 2147483647;
            System.out.println("intVar = " + intVar);
            System.out.println("intVar =" + Integer.SIZE);
            System.out.println("bytes tipos Integer:" + Integer.BYTES);
            System.out.println("valor minimo tipo Integer:" + Integer.MIN_VALUE);
            System.out.println("valor maximo tipo Integer:"+ Integer.MAX_VALUE);

            long longVar = 922337203685477580L;
            //Recordar el sufijo del tipo del valor literal a asignar manualmente
            System.out.println("longVar = " + longVar);
            System.out.println("longVar =" + Long.SIZE);
            System.out.println("bytes tipos Long:" + Long.BYTES);
            System.out.println("valor minimo tipo Long:" + Long.MIN_VALUE);
            System.out.println("valor maximo tipo Long:"+ Long.MAX_VALUE);

            //Por defecto es tipo Integer
            var numero = 2147483647;
            System.out.println("numero = " + numero);

            var numeroLong = 2147483647L;
            System.out.println("numeroLong =" + numeroLong);



        }

        public static void BaseHexaOctal(){

            int numeroDecimal = 10;
            System.out.println("numeroDecimal = " + numeroDecimal);

            int numeroOctal = 012;
            System.out.println("numeroDecimal = " + numeroOctal);

            int numeroHExadecimal = 0xA;
            System.out.println("numeroHExadecimal = " +numeroHExadecimal);

            int numeroBinario = 0b1010;
            System.out.println("numeroBinario = " + numeroBinario);

        }


        public static void PrimitivesFloat(){
            var floatVar = 1000.10F;
            System.out.println("floatVar =" + floatVar);
            System.out.println("Size tipo float:" + Float.SIZE);
            System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
            System.out.println("valor maximo tipo float" + Float.MAX_VALUE);

            var doubleVar = 100D;
            System.out.println("doubleVar = " + doubleVar);
            System.out.println("Size tipo double " + Double.SIZE);
            System.out.println("Bytes tipo double " + Double.BYTES);
            System.out.println("Bytes minimo tipo double " + Double.MIN_VALUE);
            System.out.println("Bytes maximo tipo double " + Double.MAX_VALUE);
        }

        public static void  PrimitivesChar(){

            char varChar = '\u0021';

            System.out.println("varChar = " + varChar);
            System.out.println("Size tipo char " + Character.SIZE);
            System.out.println("Bytes tipo char " + Character.BYTES);
            System.out.println("Bytes minimo tipo char " + Character.MIN_VALUE);
            System.out.println("Bytes maximo tipo char " + Character.MAX_VALUE);

            var varCharDecimal = 33;
            System.out.println("varCharDecimal = " + varCharDecimal);

            var varCharSimbolo = '!';
            System.out.println("varCharSimbolo = " + varCharSimbolo);



        }

        public static void PrimitivesBoolean(){
            System.out.println("true tipo boolean = " + Boolean.TRUE);
            System.out.println("false tipo boolean: " + Boolean.FALSE);

            boolean booleanVar = true;

            if(booleanVar){
                System.out.println("el valor es verdadero");
            } else {
                System.out.println("el valor es false");
            }

            System.out.println("");
            var edad = 30;
            var esAdulto = edad >= 18;
            System.out.println("esAdulto = " + esAdulto);


        }

        public static void ConvertPrimitives(){
            var edad = Integer.parseInt("20");
            System.out.println("edad = " + edad);

            double valorPI = Double.parseDouble("3.1416");
            System.out.println("valorPI =" + valorPI);

            char c = "hola".charAt(3);
            System.out.println("c = " + c);

            var scanner = new Scanner(System.in);
            edad = Integer.parseInt(scanner.nextLine());
            System.out.println("edad = " + edad);

            char character = scanner.nextLine().charAt(0);
            System.out.println("caracter = " + character);



            String edadTexto = String.valueOf(25D);
            System.out.println("edadTexto = " + edadTexto);

            short s = 128;
            byte b = (byte) s;
            System.out.println("b = " +b);

        }

        public static void Arimetic(){
            int a = 3, b =2;
            int resultado = a + b;
            System.out.println("resultado suma  = "  + (a + b));

            resultado = a - b;
            System.out.println("resultado resta= " + (a - b));

            resultado = a * b;
            System.out.println("resultado multiplicacion = " + resultado);

            var resultado2 = 3F / b;
            System.out.println("resultado division = " + resultado2);

            resultado = a % b;
            System.out.println("resultado modulo = " + resultado);

            resultado = a % 2;
            System.out.println("resultado = " + resultado);

            resultado = b % 2;
            System.out.println("resultado =" +resultado);

            if(resultado == 0)
                System.out.println("es numero par");
            else
                System.out.println("es numero impar");

        }

        public static void AssingOperators(){
            int a = 3, b =2;
            int c = a + 5 - b;

            a += 1; //a=a+1
            System.out.println("a =" + a);

            a += 3; //
            System.out.println("a = " + a);

            b -= 1; //b=b-1
            System.out.println("a = " + b);

        }

        public static void UnaryOperators(){
            int a = 3;
            int b = -a;
            System.out.println("b = " + b);

            boolean c = true;
            boolean d = !c;

            System.out.println("d = " + d);

            int e = 3;
            int f = ++e;

            System.out.println("e = " + e);
            System.out.println("f = " + f);

            //Postincrement
            int g = 5;
            int h = g++;
            System.out.println("g = " + g);
            System.out.println("h = " + h);

            //decremento
            //predecremento
            int i=2;
            int j = --i;
            System.out.println("k = " + i);
            System.out.println("l = " + j);

            //postdecremento
            int k=4;
            int l= k--;
            System.out.println("k = " + k);
            System.out.println("l = " + l);


        }

        public static void EqualityOperators(){
            int a = 3, b=2;


            boolean c = (a == b);
                System.out.println("c = "+ c);

            c = (a != b);
                System.out.println("c = "+ c);

            String cadena = "hola";
            String cadena2 = "hola";
            System.out.println( cadena.equals(cadena2));

            boolean d = a >= b;
            System.out.println("d = " + d);

            if( b % 2 == 0) {
                System.out.println("numero par");
            } else {
                System.out.println("numero impar");
            }

            int edad = 8;
            int adulto = 10;
            if (edad >= adulto)
                System.out.println("es un adulto");
            else
                System.out.println("es menor de edad");

        }

        public static void OperadoresCondicionales(){
            int a = 10;
            int valorMinimo = 0, valorMaximo = 10;
            boolean resultado = a >= valorMinimo && a <= valorMaximo;
            System.out.println("Resultado = " + resultado);
            boolean vacaciones = false;
            boolean diaDescanso = false;

            if(vacaciones || diaDescanso)
                System.out.println("Padre puede asistir al juego del hijo");
            else
                System.out.println("Padre ocupado");
        }

        public static void TernaryOperators(){
            var resultado = (3>2) ? "verdadero" : false;
            System.out.println("resultado = " + resultado);
            var numero = 8;
            var par = (numero % 2 == 0 )? "numero par" : "numero impar";
            System.out.println("par = " + par);
        }

        public static void OperatorsPreceding(){
            var x = 5;
            var y = 10;
            var z = ++x + y--; //X=6, y=10, z=16
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);

            System.out.println("\nEjemplo 2 precedencia operadores");
            var resultado =( 4 + 5) * 6 /3; //   {4 + ((5*6)/3) }
            System.out.println("resultado = " + resultado);


        }

        public static void IfElse(){
            var condition = false;

            if (condition) {
                System.out.println("Condicion verdadera");
            } else {
                System.out.println("condicion falsa");
            }

            var number = 2;
            var numeroTexto = "numero desconocido";

            if ( number == 1 ){
                numeroTexto = "numero uno";
            } else if (number == 3){
                numeroTexto = "numero dos";
            } else if(number == 3){
                numeroTexto = "numero tres";
            } else {
                numeroTexto = "valor desconocido";
            }
            System.out.println("numeroTexto = " + numeroTexto);
        }

        public static void Season() {
            var scanner = new Scanner(System.in);
            System.out.println("Proporciona el mes del año: ");
            var month = scanner.nextInt();


            String estacion = null;


            if (month == 2 || month == 3 || month == 4){
                estacion = "Primavera";
            } else if  (month == 5 || month == 6 || month == 7) {
                estacion = "Verano";
            } else if (month == 8 || month == 9 || month == 10) {
                estacion = "Otoño";
            } else if (month == 11 || month == 12 || month == 1){
                estacion = "Invierno";
            } else {
                estacion = "Mes incorrecto";
            }

            System.out.println("estacion "+ estacion + "para el mes" + month);
        }

        public static void SwitchSentence() {

            var numeroTexto = "numero desconocido";
            var numero = 1;

            switch(numero) {
                case 1:
                    numeroTexto = "numero uno";
                    break;
                case 2:
                    numeroTexto = "numero dos";
                    break;
                case 3:
                    numeroTexto = "numero tres";
                    break;
                default:
                    numeroTexto = "numero desconocido";
                    break;
            }

            System.out.println("numero texto: " +  numeroTexto + "para el numero proporcionado:" + numero);
        }

        public static void CalcularEstacionPorAño() {
            System.out.println("Escribir estacion del año");
            var scanner = new Scanner(System.in);
            var mes = scanner.nextInt();

            String estacion = null;

            switch ( mes ) {
                case 1: case 2: case 12:
                    estacion = "invierno";
                    break;

                case 3: case 4: case 5:
                    estacion = "Primavera";
                    break;

                case 6: case 7: case 8:
                    estacion = "Verano";
                    break;

                case 9: case 10: case 11:
                    estacion = "Otoño";
                    break;

                default:
                    estacion = "mes incorrecto";
                    break;


            }
            System.out.println(estacion);

        }

        public static void SwitchWithNumber(){

            var numeroTexto = "numero uno";
            System.out.println("Ingrese numero ");

            var scanner = new Scanner(System.in);
            var numero = scanner.nextInt();


            switch(numero){
                case 1:
                    numeroTexto = "Numero Uno";
                    break;
                case 2:
                    numeroTexto = "Numero dos";
                    break;
                case 3:
                    numeroTexto = "Numero tres";
                    break;
                default:
                    numeroTexto = "numero deconocido";
            }

            System.out.println(numeroTexto);
        }

        public static void RepetitiveCicles() {
            for (int i = 0; i < 10; i++) {
                System.out.println("i: " + i);

            }

            var contador = 0;
            while (contador <= 3) {
                System.out.println("while contador = " + contador);
                contador++;
            }

            contador = 0;
            do {
                System.out.println("do contador = " + contador);
                contador ++;
            } while (contador < 3);

        }

        public static void BreakYContinue(){

            iniciobreak:
            for (int i = 0; i < 3; i++) {
                if (i % 2 ==0) {
                    System.out.println("i = "+ i);
                    break iniciobreak;
                }
            }

            iniciocontinue:
            for (int i = 0; i < 3; i++) {
                if (i % 2 != 0) {
                    continue iniciocontinue;
                }

                System.out.println("i = " + i);
            }
        }

     }
