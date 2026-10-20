import java.util.Scanner;

public class objetcsorientation {
    
    public static void Control46 (String[] args) {
        int n = 0;
        int k = 0;
        
        while (k >= n || n <= 0 || k <= 0) {
            System.out.print("Ingrese N (entero positivo): ");
            n = Integer.parseInt(System.console().readLine());
            System.out.print("Ingrese K (entero positivo menor que N): ");
            k = Integer.parseInt(System.console().readLine());
            if (k >= n || n <= 0 || k <= 0) {
                System.out.println("Error: K debe ser menor que N y ambos positivos.");
            }
        }

        int actual = n;
        System.out.println("Secuencia descendente:");
        
        while (actual >= k) {
            System.out.print(actual);
            if (actual > k) {
                System.out.print(", ");
            }
            actual--;
        }
        System.out.println();
    }

    public static void Control47 (String[] args) {
        int i = 1;
        System.out.println("Enteros positivos impares menores que 100 no divisibles por 7:");
        
        while (i < 100) {
            if (i % 7 != 0) {
                System.out.print(i + " ");
            }
            i += 2;
        }
        System.out.println();
    }

    public static void Control48 (String[] args) {
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Fahrenheit", "Celsius", "Kelvin", "Rankine");
        System.out.println("--------------------------------------------------");
        System.out.println("Muestra 1 (28 a 54 F, paso 1 F):");
        double f = 28.0;
        
        while (f <= 54.0001) {
            double c = 5.0 * (f - 32.0) / 9.0;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%-12.2f %-12.2f %-12.2f %-12.2f%n", f, c, k, r);
            f += 1.0;
        }

        System.out.println("\nMuestra 2 (450 a 950 F, paso 50 F):");
        f = 450.0;
        
        while (f <= 950.0001) {
            double c = 5.0 * (f - 32.0) / 9.0;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%-12.2f %-12.2f %-12.2f %-12.2f%n", f, c, k, r);
            f += 50.0;
        }

        System.out.println("\nMuestra 3 (-50 a 250 F, paso 10 F):");
        f = -50.0;
        
        while (f <= 250.0001) {
            double c = 5.0 * (f - 32.0) / 9.0;
            double r = f + 459.67;
            double k = c + 273.15;
            System.out.printf("%-12.2f %-12.2f %-12.2f %-12.2f%n", f, c, k, r);
            f += 10.0;
        }
    }

    public static void Control49 (String[] args) {
        int totalPersonas = 100;
        int i = 1;
        int cantTresCorrectas = 0;
        int cantSolo1y2 = 0;
        int cantSolo1y3 = 0;
        int cantSolo2y3 = 0;
        int cantP1PorLoMenos = 0;
        int cantP2PorLoMenos = 0;
        int cantP3PorLoMenos = 0;
        int cantNinguna = 0;

        System.out.print("Ingrese cantidad de personas a evaluar (100 segun el ejercicio): ");
        totalPersonas = Integer.parseInt(System.console().readLine());
        
        while (i <= totalPersonas) {
            System.out.println("Persona " + i + ":");
            System.out.print("Pregunta 1 correcta? (1=Si, 0=No): ");
            int p1 = Integer.parseInt(System.console().readLine());
            System.out.print("Pregunta 2 correcta? (1=Si, 0=No): ");
            int p2 = Integer.parseInt(System.console().readLine());
            System.out.print("Pregunta 3 correcta? (1=Si, 0=No): ");
            int p3 = Integer.parseInt(System.console().readLine());

            if (p1 == 1 && p2 == 1 && p3 == 1) {
                cantTresCorrectas++;
            }
            if (p1 == 1 && p2 == 1 && p3 == 0) {
                cantSolo1y2++;
            }
            if (p1 == 1 && p2 == 0 && p3 == 1) {
                cantSolo1y3++;
            }
            if (p1 == 0 && p2 == 1 && p3 == 1) {
                cantSolo2y3++;
            }
            if (p1 == 1) {
                cantP1PorLoMenos++;
            }
            if (p2 == 1) {
                cantP2PorLoMenos++;
            }
            if (p3 == 1) {
                cantP3PorLoMenos++;
            }
            if (p1 == 0 && p2 == 0 && p3 == 0) {
                cantNinguna++;
            }
            i++;
        }

        System.out.println("\nResultados:");
        System.out.println("a. Respondieron correctamente las tres preguntas: " + cantTresCorrectas);
        System.out.println("b. Respondieron correctamente solamente la 1ra y 2da: " + cantSolo1y2);
        System.out.println("c. Respondieron correctamente solamente la 1ra y 3ra: " + cantSolo1y3);
        System.out.println("d. Respondieron correctamente solamente la 2da y 3ra: " + cantSolo2y3);
        System.out.println("e. Respondieron correctamente la 1ra pregunta por lo menos: " + cantP1PorLoMenos);
        System.out.println("f. Respondieron correctamente la 2da pregunta por lo menos: " + cantP2PorLoMenos);
        System.out.println("g. Respondieron correctamente la 3ra pregunta por lo menos: " + cantP3PorLoMenos);
        System.out.println("h. No respondieron correctamente ninguna pregunta: " + cantNinguna);
    }

    public static void Control50 (String[] args) {
        long suma = 0;
        int num = 98;
        
        while (num <= 1002) {
            suma += num;
            num += 2;
        }
        System.out.println("Suma de todos los numeros pares comprendidos entre 97 y 1003: " + suma);
    }

    public static void Control51 (String[] args) {
        int a1 = 6;
        int d = 5;
        int n = 12;
        int repeticion = 1;
        int termino = a1;
        int suma = 0;
        int a12 = 0;
        
        while (repeticion <= n) {
            suma += termino;
            if (repeticion == n) {
                a12 = termino;
            }
            termino += d;
            repeticion++;
            System.out.println("Termino " + repeticion + ": " + termino);
        }

        System.out.println("Termino doceavo (a12): " + a12);
        System.out.println("Suma de los doce primeros terminos: " + suma);
    }

    public static void Control52 (String[] args) {
        int totalPersonas = 100;
        int i = 1;

        double pesoNinos = 0;
        int cantNinos = 0;

        double pesoJovenes = 0;
        int cantJovenes = 0;

        double pesoAdultos = 0;
        int cantAdultos = 0;

        double pesoViejos = 0;
        int cantViejos = 0;

        System.out.print("Ingrese el total de personas para el muestreo (100 segun el ejercicio): ");
        totalPersonas = Integer.parseInt(System.console().readLine());
        
        while (i <= totalPersonas) {
            System.out.println("Persona " + i + ":");
            System.out.print("Edad: ");
            int edad = Integer.parseInt(System.console().readLine());
            System.out.print("Peso: ");
            double peso = Double.parseDouble(System.console().readLine());

            if (edad >= 0 && edad <= 12) {
                pesoNinos += peso;
                cantNinos++;
            } else if (edad >= 13 && edad <= 29) {
                pesoJovenes += peso;
                cantJovenes++;
            } else if (edad >= 30 && edad <= 59) {
                pesoAdultos += peso;
                cantAdultos++;
            } else if (edad >= 60) {
                pesoViejos += peso;
                cantViejos++;
            }
            i++;
        }

        System.out.println("\nPromedios de peso obtenidos:");
        if (cantNinos > 0) {
            System.out.printf("Ninos (0-12 anos): %.2f kg (Cantidad: %d)%n", (pesoNinos / cantNinos), cantNinos);
        } else {
            System.out.println("Ninos (0-12 anos): Sin registros");
        }

        if (cantJovenes > 0) {
            System.out.printf("Jovenes (13-29 anos): %.2f kg (Cantidad: %d)%n", (pesoJovenes / cantJovenes), cantJovenes);
        } else {
            System.out.println("Jovenes (13-29 anos): Sin registros");
        }

        if (cantAdultos > 0) {
            System.out.printf("Adultos (30-59 anos): %.2f kg (Cantidad: %d)%n", (pesoAdultos / cantAdultos), cantAdultos);
        } else {
            System.out.println("Adultos (30-59 anos): Sin registros");
        }

        if (cantViejos > 0) {
            System.out.printf("Viejos (60 en adelante): %.2f kg (Cantidad: %d)%n", (pesoViejos / cantViejos), cantViejos);
        } else {
            System.out.println("Viejos (60 en adelante): Sin registros");
        }
    }

    public static void Control53 (String[] args) {
        System.out.print("Ingrese el numero de empleados (M): ");
        int m = Integer.parseInt(System.console().readLine());
        int i = 1;

        int venTipo1 = 0;
        int venTipo2 = 0;
        int venTipo3 = 0;
        int extranjerosEdadImpar = 0;
        double sumaEdades = 0;
        double totalGeneralPagar = 0;
        
        while (i <= m) {
            System.out.println("\nEmpleado " + i + ":");
            System.out.print("Nombre: ");
            String nombre = System.console().readLine();
            System.out.print("Nacionalidad (V o E): ");
            char nac = System.console().readLine().toUpperCase().charAt(0);
            System.out.print("Edad: ");
            int edad = Integer.parseInt(System.console().readLine());
            System.out.print("Tipo de empleado (1, 2 o 3): ");
            int tipo = Integer.parseInt(System.console().readLine());
            System.out.print("Horas trabajadas: ");
            double horas = Double.parseDouble(System.console().readLine());

            double pagoHora = 0;
            if (tipo == 1) {
                pagoHora = 5000;
                if (nac == 'V') {
                    venTipo1++;
                }
            } else if (tipo == 2) {
                pagoHora = 10000;
                if (nac == 'V') {
                    venTipo2++;
                }
            } else if (tipo == 3) {
                pagoHora = 15000;
                if (nac == 'V') {
                    venTipo3++;
                }
            }

            double sueldoBasico = horas * pagoHora;
            double seguroSocial = 0;
            if (sueldoBasico > 100000) {
                seguroSocial = sueldoBasico * 0.03;
            }
            double sueldoNeto = sueldoBasico - seguroSocial;

            if (nac == 'E' && (edad % 2 != 0)) {
                extranjerosEdadImpar++;
            }

            sumaEdades += edad;
            totalGeneralPagar += sueldoNeto;

            System.out.println("a. Sueldo basico o bruto: " + sueldoBasico + " Bs.");
            System.out.println("b. Seguro Social: " + seguroSocial + " Bs.");
            System.out.println("   Sueldo neto: " + sueldoNeto + " Bs.");

            i++;
        }

        System.out.println("\n--- TOTALES Y ESTADISTICAS ---");
        System.out.println("c. Venezolanos tipo 1: " + venTipo1);
        System.out.println("   Venezolanos tipo 2: " + venTipo2);
        System.out.println("   Venezolanos tipo 3: " + venTipo3);
        System.out.println("d. Total de extranjeros con edad impar: " + extranjerosEdadImpar);
        if (m > 0) {
            System.out.printf("e. Promedio de edad de todos los empleados: %.2f%n", (sumaEdades / m));
        }
        System.out.println("f. Total general a pagar en sueldos: " + totalGeneralPagar + " Bs.");
    }

    public static void Control54 (String[] args) {
        int totalCuestionarios = 64;
        int totalPreguntas = 23;
        int c = 1;

        double sumaPromedios = 0;
        double maxPromedio = -1;
        int numMax = 0;
        double minPromedio = 999;
        int numMin = 0;

        int cantMenor3 = 0;
        int cantMayor4 = 0;
        int cantEntre45y5 = 0;

        System.out.print("Ingrese cantidad de cuestionarios a evaluar (64 segun enunciado): ");
        totalCuestionarios = Integer.parseInt(System.console().readLine());
        
        while (c <= totalCuestionarios) {
            System.out.println("--- Cuestionario " + c + " ---");
            double pt = 0;
            int p = 1;
            
            while (p <= totalPreguntas) {
                System.out.print("Puntaje de pregunta " + p + " (1 a 5): ");
                double puntaje = Double.parseDouble(System.console().readLine());
                if (puntaje < 1) {
                    puntaje = 1;
                } else if (puntaje > 5) {
                    puntaje = 5;
                }
                pt += puntaje;
                p++;
            }

            double prom = pt / totalPreguntas;
            sumaPromedios += prom;

            if (c == 1 || prom > maxPromedio) {
                maxPromedio = prom;
                numMax = c;
            }
            if (c == 1 || prom < minPromedio) {
                minPromedio = prom;
                numMin = c;
            }

            if (prom < 3.0) {
                cantMenor3++;
            }
            if (prom > 4.0) {
                cantMayor4++;
            }
            if (prom >= 4.5 && prom <= 5.0) {
                cantEntre45y5++;
            }

            c++;
        }

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.printf("a. Media o promedio general de todos los cuestionarios: %.2f%n", (sumaPromedios / totalCuestionarios));
        System.out.printf("b. Promedio mas alto: %.2f (Instrumento #%d)%n", maxPromedio, numMax);
        System.out.printf("c. Promedio mas bajo: %.2f (Instrumento #%d)%n", minPromedio, numMin);

        if (cantMayor4 > 0) {
            double porcMenor3 = ((double) cantMenor3 / cantMayor4) * 100.0;
            System.out.printf("d. Porcentaje promedio < 3 respecto a > 4: %.2f%%%n", porcMenor3);
        } else {
            System.out.println("d. No hubo cuestionarios con promedio > 4 para calcular la proporcion.");
        }

        double porc45a5 = ((double) cantEntre45y5 / totalCuestionarios) * 100.0;
        System.out.printf("e. Porcentaje con promedio entre 4.5 y 5 respecto al total: %.2f%%%n", porc45a5);
    }

    public static void Control55 (String[] args) {
        int k = 1;
        double suma = 0;
        int terminos = 0;
        int continuar = 1;
        
        while (continuar == 1) {
            double termino = ((double) (k * k + 1)) / k;
            if (suma + termino <= 1000.0) {
                suma += termino;
                terminos = k;
                k++;
            } else {
                continuar = 0;
            }
        }

        System.out.println("Numero de terminos necesarios: " + terminos);
        System.out.printf("Valor alcanzado de la sumatoria: %.4f%n", suma);
    }

    public static void Control56 (String[] args) {
        System.out.print("Ingrese el dividendo: ");
        int dividendo = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el divisor (positivo): ");
        int divisor = Integer.parseInt(System.console().readLine());

        if (divisor <= 0 || dividendo < 0) {
            System.out.println("Entrada invalida. Divisor debe ser mayor que 0.");
        } else {
            int cociente = 0;
            int resto = dividendo;

            if (resto >= divisor) {
                
                while (resto >= divisor) {
                    System.out.println(resto + " - " + divisor + " = " + (resto - divisor));
                    resto = resto - divisor;
                    cociente++;
                }
            }

            System.out.println("Cociente obtenido: " + cociente);
            System.out.println("Resto de la division: " + resto);
        }
    }

    public static void Control57 (String[] args) {
        double n = 0;
        
        while (n <= 0) {
            System.out.print("Ingrese un numero positivo N: ");
            n = Double.parseDouble(System.console().readLine());
            if (n <= 0) {
                System.out.println("El numero debe ser estrictamente positivo.");
            }
        }

        double x = 0.1;
        double rn = 0;
        double dif = 0;
        
        while (dif >= 0.000001) {
            rn = (x + (n / x)) / 2.0;
            dif = Math.abs(x - rn);
            x = rn;
        }

        System.out.printf("La raiz cuadrada calculada de %.6f es: %.6f%n", n, rn);
    }

    public static void Control58 (String[] args) {
        System.out.print("Ingrese el capital a depositar: ");
        double capital = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese la tasa de interes anual (%): ");
        double tasa = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese la duracion del deposito en semanas: ");
        int semanas = Integer.parseInt(System.console().readLine());

        int totalDias = semanas * 7;
        int dia = 1;
        double interesDiario = (tasa / 100.0 * capital) / 365.0;
        double capitalAcumulado = capital;

        if (totalDias > 0) {
            
            while (dia <= totalDias) {
                capitalAcumulado += interesDiario;
                dia++;
            }
        }

        System.out.println("\n--- RESULTADO DE LA INVERSION ---");
        System.out.println("Total de dias transcurridos: " + totalDias);
        System.out.printf("Interes diario generado: %.4f%n", interesDiario);
        System.out.printf("Capital total acumulado: %.2f%n", capitalAcumulado);
    }

    public static void Control59 (String[] args) {
        double minProg = 999;
        double sumaProg = 0;
        int cantProg = 0;

        int inglesNoPresento = 0;
        int inglesSiPresento = 0;

        int matPresentaron = 0;
        int matReprobaron = 0;

        int aproboTodas = 0;
        int totalAlumnos = 0;
        char resp = 'S';
        
        while (resp == 'S') {
            totalAlumnos++;
            System.out.println("\nAlumno #" + totalAlumnos + ":");

            System.out.print("Presento Matematica? (1=Si, 0=No): ");
            int presMat = Integer.parseInt(System.console().readLine());
            double notaMat = -1;
            if (presMat == 1) {
                System.out.print("Nota Matematica (0-20): ");
                notaMat = Double.parseDouble(System.console().readLine());
                matPresentaron++;
                if (notaMat < 10) {
                    matReprobaron++;
                }
            }

            System.out.print("Presento Programacion? (1=Si, 0=No): ");
            int presProg = Integer.parseInt(System.console().readLine());
            double notaProg = -1;
            if (presProg == 1) {
                System.out.print("Nota Programacion (0-20): ");
                notaProg = Double.parseDouble(System.console().readLine());
                cantProg++;
                sumaProg += notaProg;
                if (notaProg < minProg) {
                    minProg = notaProg;
                }
            }

            System.out.print("Presento Ingles? (1=Si, 0=No): ");
            int presIng = Integer.parseInt(System.console().readLine());
            double notaIng = -1;
            if (presIng == 1) {
                System.out.print("Nota Ingles (0-20): ");
                notaIng = Double.parseDouble(System.console().readLine());
                inglesSiPresento++;
            } else {
                inglesNoPresento++;
            }

            if (presMat == 1 && notaMat >= 10 && presProg == 1 && notaProg >= 10 && presIng == 1 && notaIng >= 10) {
                aproboTodas++;
            }

            System.out.print("Desea ingresar otro alumno? (S/N): ");
            resp = System.console().readLine().toUpperCase().charAt(0);
        }

        System.out.println("\n--- RESULTADOS GENERALES ---");
        if (cantProg > 0) {
            System.out.printf("a. Nota menor de Programacion: %.2f%n", minProg);
            System.out.printf("d. Promedio general en Programacion: %.2f%n", (sumaProg / cantProg));
        } else {
            System.out.println("a. Nota menor de Programacion: Ninguna");
            System.out.println("d. Promedio general en Programacion: Sin datos");
        }

        if (inglesSiPresento > 0) {
            double porcIng = ((double) inglesNoPresento / inglesSiPresento) * 100.0;
            System.out.printf("b. Porcentaje no presentaron ingles respecto a los que si: %.2f%%%n", porcIng);
        } else {
            System.out.println("b. No hubo alumnos que presentaran Ingles.");
        }

        System.out.println("c. Alumnos que aprobaron todas las materias: " + aproboTodas);

        if (matPresentaron > 0) {
            double porcMat = ((double) matReprobaron / matPresentaron) * 100.0;
            System.out.printf("e. Porcentaje reprobaron Matematica respecto a los que presentaron: %.2f%%%n", porcMat);
        } else {
            System.out.println("e. Ningun alumno presento examen de Matematica.");
        }
    }

    public static void Control60 (String[] args) {
        char continuar = 'S';
        
        while (continuar == 'S') {
            System.out.println("\n--- INGRESO DE FACTURA ---");
            System.out.print("Numero de factura (num-fac): ");
            String numFac = System.console().readLine();
            System.out.print("Nombre del cliente (num-cli): ");
            String numCli = System.console().readLine();
            System.out.print("Monto de la factura (mon-fac): ");
            double monFac = Double.parseDouble(System.console().readLine());
            System.out.print("Dias transcurridos entre compra y pago: ");
            int dias = Integer.parseInt(System.console().readLine());

            double interesMora = 0;
            double descuentoProntoPago = 0;

            if (dias >= 60) {
                interesMora = monFac * 0.08;
            } else if (dias >= 31 && dias <= 59) {
                interesMora = monFac * 0.06;
            } else if (dias < 15) {
                descuentoProntoPago = monFac * 0.02;
            }

            double montoCancelar = monFac + interesMora - descuentoProntoPago;

            System.out.println("\n--- DETALLE DE FACTURA ---");
            System.out.println("Numero de factura: " + numFac);
            System.out.println("Nombre del cliente: " + numCli);
            System.out.println("Monto de la factura: " + monFac);
            System.out.println("Monto a pagar por interes de mora: " + interesMora);
            System.out.println("Monto descontado por pronto pago: " + descuentoProntoPago);
            System.out.println("Monto total a cancelar: " + montoCancelar);

            System.out.print("\nDesea procesar otra factura? (S/N): ");
            continuar = System.console().readLine().toUpperCase().charAt(0);
        }
    }

    public static void Control61 (String[] args) {
        System.out.print("Ingrese el multiplicador: ");
        int multiplicador = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el multiplicando: ");
        int multiplicando = Integer.parseInt(System.console().readLine());

        int sum = 0;
        int m1 = multiplicador;
        int m2 = multiplicando;

        System.out.println("\nMultiplicador | Multiplicando");
        System.out.println("----------------------------");
        
        while (m1 >= 1) {
            System.out.printf("%-13d | %-13d", m1, m2);
            if (m1 % 2 != 0) {
                sum += m2;
                System.out.print(" -> Se suma " + m2);
            }
            System.out.println();
            m1 = m1 / 2;
            m2 = m2 * 2;
        }

        System.out.println("----------------------------");
        System.out.println("Resultado de la multiplicacion: " + sum);
    }

    public static void Control62 (String[] args) {
        int totalEmpresas = 0;
        int cantAgricola = 0;
        int cantIndustrial = 0;
        int cantMinera = 0;
        int cantPesquera = 0;
        int cantOtra = 0;

        int mineraSur = 0;

        int trabAgricola = 0;
        int trabIndustrial = 0;
        int trabMinera = 0;
        int trabPesquera = 0;
        int trabOtra = 0;

        int indNorte = 0;
        int indSur = 0;
        int indEste = 0;
        int indOeste = 0;

        char cont = 'S';
        
        while (cont == 'S') {
            totalEmpresas++;
            System.out.println("\nEmpresa #" + totalEmpresas + ":");
            System.out.print("Actividad (1=Agricola, 2=Industrial, 3=Minera, 4=Pesquera, 5=Otra): ");
            int act = Integer.parseInt(System.console().readLine());
            System.out.print("Localizacion (1=Norte, 2=Sur, 3=Este, 4=Oeste): ");
            int loc = Integer.parseInt(System.console().readLine());
            System.out.print("Numero de trabajadores: ");
            int trab = Integer.parseInt(System.console().readLine());

            if (act == 1) {
                cantAgricola++;
                trabAgricola += trab;
            } else if (act == 2) {
                cantIndustrial++;
                trabIndustrial += trab;
                if (loc == 1) {
                    indNorte++;
                } else if (loc == 2) {
                    indSur++;
                } else if (loc == 3) {
                    indEste++;
                } else if (loc == 4) {
                    indOeste++;
                }
            } else if (act == 3) {
                cantMinera++;
                trabMinera += trab;
                if (loc == 2) {
                    mineraSur++;
                }
            } else if (act == 4) {
                cantPesquera++;
                trabPesquera += trab;
            } else if (act == 5) {
                cantOtra++;
                trabOtra += trab;
            }

            System.out.print("Desea ingresar otra empresa? (S/N): ");
            cont = System.console().readLine().toUpperCase().charAt(0);
        }

        System.out.println("\n--- ESTADISTICAS DE EMPRESAS ---");
        if (totalEmpresas > 0) {
            double porcAgricola = ((double) cantAgricola / totalEmpresas) * 100.0;
            System.out.printf("i. Porcentaje de empresas agricolas: %.2f%%%n", porcAgricola);
        }

        if (cantMinera > 0) {
            double porcMineraSur = ((double) mineraSur / cantMinera) * 100.0;
            System.out.printf("ii. Porcentaje de mineras del Sur respecto a total mineras: %.2f%%%n", porcMineraSur);
        } else {
            System.out.println("ii. No se registraron empresas mineras.");
        }

        System.out.println("iii. Promedio de trabajadores por actividad:");
        if (cantAgricola > 0) {
            System.out.printf("   Agricola: %.2f%n", ((double) trabAgricola / cantAgricola));
        } else {
            System.out.println("   Agricola: 0");
        }
        if (cantIndustrial > 0) {
            System.out.printf("   Industrial: %.2f%n", ((double) trabIndustrial / cantIndustrial));
        } else {
            System.out.println("   Industrial: 0");
        }
        if (cantMinera > 0) {
            System.out.printf("   Minera: %.2f%n", ((double) trabMinera / cantMinera));
        } else {
            System.out.println("   Minera: 0");
        }
        if (cantPesquera > 0) {
            System.out.printf("   Pesquera: %.2f%n", ((double) trabPesquera / cantPesquera));
        } else {
            System.out.println("   Pesquera: 0");
        }
        if (cantOtra > 0) {
            System.out.printf("   Otra: %.2f%n", ((double) trabOtra / cantOtra));
        } else {
            System.out.println("   Otra: 0");
        }

        System.out.print("iv. Localizacion con mayor numero de empresas industriales: ");
        int maxInd = indNorte;
        String locMax = "Norte";
        if (indSur > maxInd) {
            maxInd = indSur;
            locMax = "Sur";
        }
        if (indEste > maxInd) {
            maxInd = indEste;
            locMax = "Este";
        }
        if (indOeste > maxInd) {
            maxInd = indOeste;
            locMax = "Oeste";
        }
        if (cantIndustrial == 0) {
            System.out.println("Ninguna empresa industrial registrada.");
        } else {
            System.out.println(locMax + " (con " + maxInd + " empresas)");
        }
    }

    public static void Control63 (String[] args) {
        int totalAlumnos = 0;
        int cantMujeres = 0;
        int cantHombres = 0;
        double sumaEdadMujeres = 0;
        double sumaEdadHombres = 0;

        int solteros = 0;
        int casados = 0;
        int divorciados = 0;
        int viudos = 0;

        int esp1 = 0;
        int esp2 = 0;
        int esp3 = 0;
        int esp4 = 0;
        int esp5 = 0;

        int mujeresAdultas = 0;
        int hombresJovenes = 0;
        int hombresSolteros = 0;
        int mujeresSolteras = 0;

        char resp = 'S';
        
        while (resp == 'S') {
            totalAlumnos++;
            System.out.println("\nAlumno #" + totalAlumnos + ":");
            System.out.print("Edad: ");
            int edad = Integer.parseInt(System.console().readLine());
            System.out.print("Sexo (M/F): ");
            char sexo = System.console().readLine().toUpperCase().charAt(0);
            System.out.print("Estado Civil (1=Soltero, 2=Casado, 3=Divorciado, 4=Viudo): ");
            int ec = Integer.parseInt(System.console().readLine());
            System.out.print("Especialidad (1=Informatica, 2=Administracion, 3=Contaduria, 4=Mercadeo, 5=Otra): ");
            int esp = Integer.parseInt(System.console().readLine());

            if (sexo == 'F') {
                cantMujeres++;
                sumaEdadMujeres += edad;
                if (edad > 21) {
                    mujeresAdultas++;
                }
                if (ec == 1) {
                    mujeresSolteras++;
                }
            } else {
                cantHombres++;
                sumaEdadHombres += edad;
                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }
                if (ec == 1) {
                    hombresSolteros++;
                }
            }

            if (ec == 1) {
                solteros++;
            } else if (ec == 2) {
                casados++;
            } else if (ec == 3) {
                divorciados++;
            } else if (ec == 4) {
                viudos++;
            }

            if (esp == 1) {
                esp1++;
            } else if (esp == 2) {
                esp2++;
            } else if (esp == 3) {
                esp3++;
            } else if (esp == 4) {
                esp4++;
            } else if (esp == 5) {
                esp5++;
            }

            System.out.print("Desea ingresar otro alumno? (S/N): ");
            resp = System.console().readLine().toUpperCase().charAt(0);
        }

        System.out.println("\n--- ESTADISTICAS DE LA ENCUESTA ---");
        if (cantMujeres > 0) {
            System.out.printf("a. Promedio de edad de las mujeres: %.2f%n", (sumaEdadMujeres / cantMujeres));
        } else {
            System.out.println("a. No se registraron mujeres.");
        }

        if (cantHombres > 0) {
            System.out.printf("b. Promedio de edad de los hombres: %.2f%n", (sumaEdadHombres / cantHombres));
        } else {
            System.out.println("b. No se registraron hombres.");
        }

        System.out.println("c. Cantidad de hombres: " + cantHombres + ", Cantidad de mujeres: " + cantMujeres);

        if (totalAlumnos > 0) {
            System.out.println("d. Porcentaje por estado civil:");
            System.out.printf("   Solteros: %.2f%%%n", ((double) solteros / totalAlumnos) * 100.0);
            System.out.printf("   Casados: %.2f%%%n", ((double) casados / totalAlumnos) * 100.0);
            System.out.printf("   Divorciados: %.2f%%%n", ((double) divorciados / totalAlumnos) * 100.0);
            System.out.printf("   Viudos: %.2f%%%n", ((double) viudos / totalAlumnos) * 100.0);

            System.out.println("e. Cantidad y porcentaje por especialidad:");
            System.out.printf("   Informatica: %d (%.2f%%)%n", esp1, ((double) esp1 / totalAlumnos) * 100.0);
            System.out.printf("   Administracion: %d (%.2f%%)%n", esp2, ((double) esp2 / totalAlumnos) * 100.0);
            System.out.printf("   Contaduria: %d (%.2f%%)%n", esp3, ((double) esp3 / totalAlumnos) * 100.0);
            System.out.printf("   Mercadeo: %d (%.2f%%)%n", esp4, ((double) esp4 / totalAlumnos) * 100.0);
            System.out.printf("   Otra: %d (%.2f%%)%n", esp5, ((double) esp5 / totalAlumnos) * 100.0);
        }

        if (cantMujeres > 0) {
            double porcMujeresAdultas = ((double) mujeresAdultas / cantMujeres) * 100.0;
            System.out.printf("f. Porcentaje de mujeres adultas (>21): %.2f%%%n", porcMujeresAdultas);
        }

        if (cantHombres > 0) {
            double porcHombresJovenes = ((double) hombresJovenes / cantHombres) * 100.0;
            System.out.printf("g. Porcentaje de hombres jovenes (18 a 20): %.2f%%%n", porcHombresJovenes);
        }

        System.out.println("h. Hombres solteros: " + hombresSolteros + ", Mujeres solteras: " + mujeresSolteras);
    }

    public static void Control64 (String[] args) {
        double meta = 1.99;
        double suma = 0.0;
        double termino = 1.0;
        int n = 0;

        int mejorN = 0;
        double mejorSuma = 0.0;
        double menorDif = 999.0;
        int continuar = 1;
        
        while (continuar == 1) {
            n++;
            suma += termino;
            double difActual = Math.abs(meta - suma);
            if (difActual < menorDif) {
                menorDif = difActual;
                mejorN = n;
                mejorSuma = suma;
            }
            termino = termino / 2.0;
            if (suma > meta && difActual > menorDif) {
                continuar = 0;
            }
        }

        System.out.println("Numero de terminos necesarios: " + mejorN);
        System.out.printf("Valor de la suma mas proxima a 1.99: %.8f%n", mejorSuma);
    }

    public static void Control65 (String[] args) {
        char resp = 'S';
        
        while (resp == 'S') {
            System.out.println("\n--- REGISTRO DE TRABAJADOR ---");
            System.out.print("Nombre: ");
            String nombre = System.console().readLine();
            System.out.print("Cedula: ");
            String cedula = System.console().readLine();
            System.out.print("Tipo (1=Obrero, 2=Administrativo, 3=Ejecutivo): ");
            int tipo = Integer.parseInt(System.console().readLine());
            System.out.print("Cantidad de hijos: ");
            int hijos = Integer.parseInt(System.console().readLine());
            System.out.print("Dias asistidos en el mes (de 30): ");
            int diasAsistidos = Integer.parseInt(System.console().readLine());

            double sueldoBasico = 0;
            if (tipo == 1) {
                sueldoBasico = 100000;
            } else if (tipo == 2) {
                sueldoBasico = 165500;
            } else if (tipo == 3) {
                sueldoBasico = 250000;
            }

            int hijosValidos = hijos;
            if (hijosValidos > 5) {
                hijosValidos = 5;
            }
            if (hijosValidos < 0) {
                hijosValidos = 0;
            }

            double aporteHijos = sueldoBasico * 0.10 * hijosValidos;
            double aporteAsistencia = 0;
            if (diasAsistidos > 28.5) {
                aporteAsistencia = sueldoBasico * 0.05;
            }

            double deduccionCaja = sueldoBasico * 0.10;
            double deduccionSeguro = sueldoBasico * 0.02;

            double sueldoNeto = sueldoBasico + aporteHijos + aporteAsistencia - deduccionCaja - deduccionSeguro;

            System.out.println("\n--- REGISTRO SALARIAL ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Cedula: " + cedula);
            System.out.printf("Sueldo Basico: %.2f Bs.%n", sueldoBasico);
            System.out.printf("Aporte por Hijos: %.2f Bs.%n", aporteHijos);
            System.out.printf("Aporte por Asistencia: %.2f Bs.%n", aporteAsistencia);
            System.out.printf("Aporte a la Caja de Ahorros: %.2f Bs.%n", deduccionCaja);
            System.out.printf("Seguro Social: %.2f Bs.%n", deduccionSeguro);
            System.out.printf("Sueldo Neto: %.2f Bs.%n", sueldoNeto);

            System.out.print("\nDesea procesar otro trabajador? (S/N): ");
            resp = System.console().readLine().toUpperCase().charAt(0);
        }
    }

    public static void Control66 (String[] args) {
        int totalPasajerosGeneral = 0;
        int pasajerosSinPagoGeneral = 0;
        char respVuelo = 'S';

        while (respVuelo == 'S') {

            System.out.print("\nIngrese Numero de Vuelo: ");
            String numVuelo = System.console().readLine();

            System.out.print("Ingrese cantidad de pasajeros para el vuelo " + numVuelo + ": ");
            int cantPasajerosVuelo = Integer.parseInt(System.console().readLine());

            double totalMontoVuelo = 0;
            double maxPesoVuelo = -1;
            String pasajeroMaxPesoVuelo = "";
            String codigoAbordoMaxVuelo = "";

            double minPesoVuelo = 999999;
            String pasajeroMinPesoVuelo = "";
            String codigoAbordoMinVuelo = "";

            int p = 1;

            while (p <= cantPasajerosVuelo) {

                System.out.println("\n--- Pasajero #" + p + " del vuelo " + numVuelo + " ---");

                System.out.print("Codigo de abordo: ");
                String codAbordo = System.console().readLine();

                System.out.print("Nombre del pasajero: ");
                String nomPasajero = System.console().readLine();

                System.out.print("Cantidad de maletas: ");
                int cantMaletas = Integer.parseInt(System.console().readLine());

                double pesoTotalPasajero = 0;
                double maxPesoMaleta = -1;
                String codMaletaMayor = "";

                int m = 1;

                while (m <= cantMaletas) {

                    System.out.print("Codigo maleta #" + m + ": ");
                    String codMaleta = System.console().readLine();

                    System.out.print("Peso de la maleta (kg): ");
                    double pesoM = Double.parseDouble(System.console().readLine());

                    pesoTotalPasajero += pesoM;

                    if (pesoM > maxPesoMaleta) {
                        maxPesoMaleta = pesoM;
                        codMaletaMayor = codMaleta;
                    }

                    m++;
                }

                double tarifaPorKg = 0;

                if (pesoTotalPasajero <= 3.0) {
                    tarifaPorKg = 0;
                } else if (pesoTotalPasajero <= 6.0) {
                    tarifaPorKg = 600;
                } else if (pesoTotalPasajero <= 9.0) {
                    tarifaPorKg = 1200;
                } else if (pesoTotalPasajero <= 12.0) {
                    tarifaPorKg = 1500;
                } else if (pesoTotalPasajero <= 15.0) {
                    tarifaPorKg = 2000;
                } else {
                    tarifaPorKg = 2500;
                }

                double montoPagarPasajero = pesoTotalPasajero * tarifaPorKg;

                totalMontoVuelo += montoPagarPasajero;
                totalPasajerosGeneral++;

                if (montoPagarPasajero == 0) {
                    pasajerosSinPagoGeneral++;
                }

                System.out.println("\ni. Info Pasajero: Vuelo " + numVuelo
                        + ", Cod Abordo: " + codAbordo
                        + ", Nombre: " + nomPasajero
                        + ", Peso Total: " + pesoTotalPasajero
                        + " kg, Monto: " + montoPagarPasajero + " Bs.");

                System.out.println("ii. Maleta con mayor peso de " + nomPasajero
                        + ": Codigo " + codMaletaMayor
                        + " con " + maxPesoMaleta + " kg.");

                if (pesoTotalPasajero > maxPesoVuelo) {
                    maxPesoVuelo = pesoTotalPasajero;
                    pasajeroMaxPesoVuelo = nomPasajero;
                    codigoAbordoMaxVuelo = codAbordo;
                }

                if (pesoTotalPasajero < minPesoVuelo) {
                    minPesoVuelo = pesoTotalPasajero;
                    pasajeroMinPesoVuelo = nomPasajero;
                    codigoAbordoMinVuelo = codAbordo;
                }

                p++;
            }

            System.out.println("\n--- RESUMEN VUELO " + numVuelo + " ---");

            System.out.println("iii. Pasajero con mayor peso: "
                    + pasajeroMaxPesoVuelo
                    + " (Cod: " + codigoAbordoMaxVuelo
                    + ", Peso: " + maxPesoVuelo + " kg)");

            System.out.println("     Pasajero con menor peso: "
                    + pasajeroMinPesoVuelo
                    + " (Cod: " + codigoAbordoMinVuelo
                    + ", Peso: " + minPesoVuelo + " kg)");

            System.out.printf("iv. Monto total cancelado por equipaje en el vuelo %s: %.2f Bs.%n",
                    numVuelo, totalMontoVuelo);

            System.out.print("\nDesea procesar otro vuelo? (S/N): ");
            respVuelo = System.console().readLine().toUpperCase().charAt(0);
        }

        if (totalPasajerosGeneral > 0) {

            double porcSinPago = ((double) pasajerosSinPagoGeneral
                    / totalPasajerosGeneral) * 100.0;

            System.out.printf(
                    "\nv. Porcentaje general de pasajeros que no pagaron por equipaje: %.2f%%%n",
                    porcSinPago
            );
        }
    }

    public static void Control67 (String[] args) {
        double deudaInicial = 12775.0;
        double saldo = deudaInicial;
        double pagoActual = 100.0;
        int numPagos = 0;
        double montoUltimoPago = 0;

        System.out.printf("%-10s %-15s %-20s%n", "No. Pago", "Monto Pago (Bs.)", "Saldo Pendiente (Bs.)");
        System.out.println("--------------------------------------------------");
        
        while (saldo > 0.0001) {
            numPagos++;
            double pagoEfectuado = pagoActual;
            if (pagoEfectuado > saldo) {
                pagoEfectuado = saldo;
            }
            saldo -= pagoEfectuado;
            montoUltimoPago = pagoEfectuado;

            System.out.printf("%-10d %-15.2f %-20.2f%n", numPagos, pagoEfectuado, saldo);
            pagoActual += 125.0;
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Numero de pagos realizados: " + numPagos);
        System.out.printf("Monto del ultimo pago: %.2f Bs.%n", montoUltimoPago);
    }

    public static void Control68 (String[] args) {
        int encontrados = 0;
        int num = 2;
        System.out.println("Los tres primeros numeros perfectos son:");
        
        while (encontrados < 3) {
            int sumaDivisores = 0;
            int divisor = 1;
            
            while (divisor <= num / 2) {
                if (num % divisor == 0) {
                    sumaDivisores += divisor;
                }
                divisor++;
            }

            if (sumaDivisores == num) {
                encontrados++;
                System.out.println("Numero perfecto #" + encontrados + ": " + num);
            }
            num++;
        }
    }

    public static void Control69 (String[] args) {
        System.out.print("Ingrese el primer numero (A): ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el segundo numero (B): ");
        int b = Integer.parseInt(System.console().readLine());

        int sumaA = 0;
        int d = 1;
        
        while (d <= a / 2) {
            if (a % d == 0) {
                sumaA += d;
            }
            d++;
        }

        int sumaB = 0;
        d = 1;
        
        while (d <= b / 2) {
            if (b % d == 0) {
                sumaB += d;
            }
            d++;
        }

        System.out.println("Suma de divisores propios de " + a + " = " + sumaA);
        System.out.println("Suma de divisores propios de " + b + " = " + sumaB);

        if (sumaA == b && sumaB == a && a != b) {
            System.out.println("Los numeros " + a + " y " + b + " SON NUMEROS AMIGOS.");
        } else {
            System.out.println("Los numeros " + a + " y " + b + " NO son numeros amigos.");
        }

        System.out.println("\nPrimeros pares de numeros amigos conocidos:");
        int n1 = 2;
        int paresEncontrados = 0;
        
        while (paresEncontrados < 3) {
            int sum1 = 0;
            int div = 1;
            
            while (div <= n1 / 2) {
                if (n1 % div == 0) {
                    sum1 += div;
                }
                div++;
            }

            int n2 = sum1;
            if (n2 > n1) {
                int sum2 = 0;
                int div2 = 1;
                
                while (div2 <= n2 / 2) {
                    if (n2 % div2 == 0) {
                        sum2 += div2;
                    }
                    div2++;
                }

                if (sum2 == n1) {
                    paresEncontrados++;
                    System.out.println("Par #" + paresEncontrados + ": (" + n1 + ", " + n2 + ")");
                }
            }
            n1++;
        }
    }

    public static void Control70 (String[] args) {
        int diasProporcionados = 0;
        int totalLecturasIngresadas = 0;
        int erroresIngresados = 0;

        double sumaMaximas = 0;
        double sumaMinimas = 0;
        int diasValidos = 0;

        double tMax = 0;
        double tMin = 0;

        System.out.println("Ingrese temperaturas diarias (Max y Min). Fin con 0 0:");
        
        while (!(tMax == 0 && tMin == 0)) {
            System.out.print("Temp Max: ");
            tMax = Double.parseDouble(System.console().readLine());
            System.out.print("Temp Min: ");
            tMin = Double.parseDouble(System.console().readLine());

            if (!(tMax == 0 && tMin == 0)) {
                diasProporcionados++;
                totalLecturasIngresadas += 2;

                int errorDia = 0;
                if (tMax < 14.0 || tMax > 30.0) {
                    erroresIngresados++;
                    errorDia = 1;
                }
                if (tMin < 14.0 || tMin > 30.0) {
                    erroresIngresados++;
                    errorDia = 1;
                }

                if (errorDia == 0) {
                    sumaMaximas += tMax;
                    sumaMinimas += tMin;
                    diasValidos++;
                }
            }
        }

        System.out.println("\n--- RESULTADOS ESTACION CLIMATICA ---");
        System.out.println("g. Numero de dias proporcionados: " + diasProporcionados);
        if (diasValidos > 0) {
            System.out.printf("h. Media maxima: %.2f C, Media minima: %.2f C%n", (sumaMaximas / diasValidos), (sumaMinimas / diasValidos));
        } else {
            System.out.println("h. No hubo dias dentro del rango normal (14 a 30 C).");
        }
        System.out.println("i. Numero de errores ingresados (temperaturas fuera de rango): " + erroresIngresados);
        if (totalLecturasIngresadas > 0) {
            double porcErrores = ((double) erroresIngresados / totalLecturasIngresadas) * 100.0;
            System.out.printf("j. Porcentaje que representan los errores: %.2f%%%n", porcErrores);
        }
    }

    public static void Control71 (String[] args) {
        int totalHuerfanos = 0;
        int huerfanosTachiraODC = 0;

        int grupo1 = 0;
        int grupo2 = 0;
        int grupo3 = 0;
        int grupo4 = 0;

        int cantNinos = 0;
        int cantNinas = 0;

        char resp = 'S';
        
        while (resp == 'S') {
            totalHuerfanos++;
            System.out.println("\nRegistro de nino #" + totalHuerfanos + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = System.console().readLine().toUpperCase().charAt(0);
            System.out.print("Edad (en anos cumplidos, 0 si menor de 1 ano): ");
            int edad = Integer.parseInt(System.console().readLine());
            System.out.print("Nombre del orfanatorio: ");
            String orfanatorio = System.console().readLine();
            System.out.print("Estado de la Republica (ej. Tachira, Distrito_Capital, Miranda, etc.): ");
            String estado = System.console().readLine();

            if (sexo == 'M') {
                cantNinos++;
            } else {
                cantNinas++;
            }

            if (estado.equalsIgnoreCase("Tachira") || estado.equalsIgnoreCase("Distrito_Capital") || estado.equalsIgnoreCase("DistritoCapital") || estado.equalsIgnoreCase("DC")) {
                huerfanosTachiraODC++;
            }

            if (edad < 1) {
                grupo1++;
            } else if (edad >= 1 && edad <= 3) {
                grupo2++;
            } else if (edad >= 4 && edad <= 6) {
                grupo3++;
            } else if (edad > 6) {
                grupo4++;
            }

            System.out.print("Desea registrar otro nino? (S/N): ");
            resp = System.console().readLine().toUpperCase().charAt(0);
        }

        System.out.println("\n--- ESTADISTICAS UNICEF ---");
        if (totalHuerfanos > 0) {
            double porcTachiraDC = ((double) huerfanosTachiraODC / totalHuerfanos) * 100.0;
            System.out.printf("a. Porcentaje de huerfanos de Tachira y Distrito Capital: %.2f%%%n", porcTachiraDC);
        }

        System.out.println("b. Cantidad de huerfanos por grupos de edad:");
        System.out.println("   Grupo 1 (menores de 1 ano): " + grupo1);
        System.out.println("   Grupo 2 (1 a 3 anos): " + grupo2);
        System.out.println("   Grupo 3 (4 a 6 anos): " + grupo3);
        System.out.println("   Grupo 4 (mayores de 6 anos): " + grupo4);

        if (totalHuerfanos > 0) {
            double porcNinos = ((double) cantNinos / totalHuerfanos) * 100.0;
            double porcNinas = ((double) cantNinas / totalHuerfanos) * 100.0;
            System.out.printf("c. Ninos (varones): %d (%.2f%%)%n", cantNinos, porcNinos);
            System.out.printf("   Ninas (hembras): %d (%.2f%%)%n", cantNinas, porcNinas);
        }
    }

    public static void Control72 (String[] args) {
        double G = 6.67259e-11;
        double M_tierra = 5.97e24;

        int totalSatelites = 0;
        double sumaFuerza = 0;
        double sumaMasa = 0;

        double maxFuerza = -1;
        double minFuerza = Double.MAX_VALUE;
        String satMaxFuerza = "";
        String satMinFuerza = "";

        double maxMasa = -1;
        String satMaxMasa = "";

        double minAltura = Double.MAX_VALUE;
        double maxAltura = -1;
        String satMinAltura = "";
        String satMaxAltura = "";

        System.out.print("Ingrese el numero de satelites a procesar (ej. 4 para los datos muestra): ");
        int nSatelites = Integer.parseInt(System.console().readLine());
        int i = 1;

        if (nSatelites > 0) {
            
            while (i <= nSatelites) {
                System.out.println("\n--- Satelite #" + i + " ---");
                System.out.print("Nombre del satelite: ");
                String nombre = System.console().readLine();
                System.out.print("Pais: ");
                String pais = System.console().readLine();
                System.out.print("Masa (Kg): ");
                double masa = Double.parseDouble(System.console().readLine());
                System.out.print("Altura/Distancia (Mts): ");
                double r = Double.parseDouble(System.console().readLine());

                double fuerza = (G * masa * M_tierra) / (r * r);

                totalSatelites++;
                sumaFuerza += fuerza;
                sumaMasa += masa;

                if (i == 1 || fuerza > maxFuerza) {
                    maxFuerza = fuerza;
                    satMaxFuerza = nombre;
                }
                if (i == 1 || fuerza < minFuerza) {
                    minFuerza = fuerza;
                    satMinFuerza = nombre;
                }

                if (i == 1 || masa > maxMasa) {
                    maxMasa = masa;
                    satMaxMasa = nombre;
                }

                if (i == 1 || r < minAltura) {
                    minAltura = r;
                    satMinAltura = nombre;
                }
                if (i == 1 || r > maxAltura) {
                    maxAltura = r;
                    satMaxAltura = nombre;
                }

                System.out.printf("Fuerza calculada para %s: %.4f N%n", nombre, fuerza);
                i++;
            }
        }

        System.out.println("\n--- INFORME FINAL NASA ---");
        System.out.printf("a) Mayor fuerza de atraccion: %.4f N (%s)%n", maxFuerza, satMaxFuerza);
        System.out.printf("   Menor fuerza de atraccion: %.4f N (%s)%n", minFuerza, satMinFuerza);
        if (totalSatelites > 0) {
            System.out.printf("b) Fuerza de atraccion promedio: %.4f N%n", (sumaFuerza / totalSatelites));
        }
        System.out.printf("c) Mayor masa estudiada: %.2f Kg (%s)%n", maxMasa, satMaxMasa);
        if (totalSatelites > 0) {
            System.out.printf("d) Masa promedio: %.2f Kg%n", (sumaMasa / totalSatelites));
        }
        System.out.printf("e) Menor altura: %.2f Mts (%s)%n", minAltura, satMinAltura);
        System.out.printf("   Mayor altura: %.2f Mts (%s)%n", maxAltura, satMaxAltura);
    }

    public static void Control73 (String[] args) {
        System.out.print("Ingrese fecha de corte para el reporte (dd/mm/aaaa): ");
        String fechaCorte = System.console().readLine();

        System.out.print("Ingrese cantidad de Estados a procesar: ");
        int cantEstados = Integer.parseInt(System.console().readLine());
        int e = 1;

        double sumaMaximosAgenciasNacional = 0;
        int totalAgenciasNacional = 0;

        if (cantEstados > 0) {
            while (e <= cantEstados) {
                System.out.println("\n==========================================");
                System.out.print("Codigo del Estado #" + e + ": ");
                String codEstado = System.console().readLine();
                System.out.print("Cantidad de agencias en el Estado " + codEstado + ": ");
                int cantAgencias = Integer.parseInt(System.console().readLine());

                double totalAdeudadoEstado = 0;
                double maxDeudaAgenciaEstado = -1;
                String codAgenciaMaxEstado = "";
                double minDeudaAgenciaEstado = Double.MAX_VALUE;
                String codAgenciaMinEstado = "";

                int a = 1;
                if (cantAgencias > 0) {
                    while (a <= cantAgencias) {
                        System.out.println("\n------------------------------------------");
                        System.out.print("Codigo de la Agencia #" + a + ": ");
                        String codAgencia = System.console().readLine();
                        System.out.print("Cantidad de clientes con pagares en agencia " + codAgencia + ": ");
                        int cantClientes = Integer.parseInt(System.console().readLine());

                        double totalAdeudadoAgencia = 0;
                        double maxDeudaClienteAgencia = -1;
                        String codClienteMaxAgencia = "";

                        int c = 1;
                        if (cantClientes > 0) {
                            while (c <= cantClientes) {
                                System.out.println("\n--- RECIBO DE PAGO PENDIENTE (Fecha: " + fechaCorte + ") ---");
                                System.out.print("Codigo client: ");
                                String codCliente = System.console().readLine();
                                System.out.print("Nombre client: ");
                                String nomCliente = System.console().readLine();
                                System.out.print("Direccion client: ");
                                String dirCliente = System.console().readLine();
                                System.out.print("Cantidad de pagares pendientes: ");
                                int cantPagares = Integer.parseInt(System.console().readLine());

                                System.out.println("Cliente: " + codCliente + " - " + nomCliente);
                                System.out.println("Direccion: " + dirCliente);
                                System.out.println("Estado: " + codEstado + " | Agencia: " + codAgencia);
                                System.out.println("Detalle de Pagares:");

                                double totalPendienteCliente = 0;
                                int p = 1;
                                if (cantPagares > 0) {
                                    while (p <= cantPagares) {
                                        System.out.print("  Pagare #" + p + " - Numero: ");
                                        String numPagare = System.console().readLine();
                                        System.out.print("  Pagare #" + p + " - Vencimiento (dd/mm/aaaa): ");
                                        String fecVenc = System.console().readLine();
                                        System.out.print("  Pagare #" + p + " - Monto: ");
                                        double montoPag = Double.parseDouble(System.console().readLine());

                                        totalPendienteCliente += montoPag;
                                        System.out.printf("  -> Pagare No: %s | Vence: %s | Monto: %.2f Bs.%n", numPagare, fecVenc, montoPag);
                                        p++;
                                    }
                                }

                                System.out.println("Total pagares pendientes: " + cantPagares);
                                System.out.printf("Monto total pendiente cliente: %.2f Bs.%n", totalPendienteCliente);

                                totalAdeudadoAgencia += totalPendienteCliente;
                                if (c == 1 || totalPendienteCliente > maxDeudaClienteAgencia) {
                                    maxDeudaClienteAgencia = totalPendienteCliente;
                                    codClienteMaxAgencia = codCliente;
                                }

                                c++;
                            }
                        }

                        System.out.println("\n--- RESUMEN AGENCIA " + codAgencia + " ---");
                        System.out.println("Estado: " + codEstado);
                        System.out.println("Clientes con pagares pendientes: " + cantClientes);
                        System.out.printf("Monto total adeudado agencia: %.2f Bs.%n", totalAdeudadoAgencia);
                        System.out.println("Codigo cliente con mayor deuda: " + codClienteMaxAgencia);

                        totalAdeudadoEstado += totalAdeudadoAgencia;
                        totalAgenciasNacional++;
                        sumaMaximosAgenciasNacional += maxDeudaClienteAgencia;

                        if (a == 1 || totalAdeudadoAgencia > maxDeudaAgenciaEstado) {
                            maxDeudaAgenciaEstado = totalAdeudadoAgencia;
                            codAgenciaMaxEstado = codAgencia;
                        }
                        if (a == 1 || totalAdeudadoAgencia < minDeudaAgenciaEstado) {
                            minDeudaAgenciaEstado = totalAdeudadoAgencia;
                            codAgenciaMinEstado = codAgencia;
                        }

                        a++;
                    }
                }

                System.out.println("\n=== RESUMEN ESTADO " + codEstado + " ===");
                System.out.printf("Monto total adeudado en estado: %.2f Bs.%n", totalAdeudadoEstado);
                System.out.println("Agencia con menor monto adeudado: " + codAgenciaMinEstado);
                System.out.println("Agencia con mayor monto adeudado: " + codAgenciaMaxEstado);

                e++;
            }
        }

        if (totalAgenciasNacional > 0) {
            double promMaximos = sumaMaximosAgenciasNacional / totalAgenciasNacional;
            System.out.printf("\n*** MONTO PROMEDIO ADEUDADO EN RAZON DE MONTOS MAXIMOS POR AGENCIA: %.2f Bs. ***%n", promMaximos);
        }
    }

    public static void Control74 (String[] args) {
        System.out.print("Ingrese el limite/meta de unidades a producir por semana (X): ");
        double metaX = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese cantidad de obreros: ");
        int totalObreros = Integer.parseInt(System.console().readLine());

        int obrerosCumplieron = 0;
        double maxProduccion = -1;
        String obreroMasProdujo = "";
        double sumaProduccionTotal = 0;

        int o = 1;
        if (totalObreros > 0) {
            while (o <= totalObreros) {
                System.out.println("\n--- Obrero #" + o + " ---");
                System.out.print("Nombre: ");
                String nombre = System.console().readLine();

                double totalSemanaObrero = 0;
                int dia = 1;
                while (dia <= 6) {
                    System.out.print("Produccion dia " + dia + " (bloques): ");
                    double prodDia = Double.parseDouble(System.console().readLine());
                    totalSemanaObrero += prodDia;
                    dia++;
                }

                double porcMeta = (totalSemanaObrero / metaX) * 100.0;

                System.out.println("\nResumen Obrero:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Total producido en la semana: " + totalSemanaObrero + " bloques");
                System.out.printf("Porcentaje respecto al limite establecido: %.2f%%%n", porcMeta);

                if (totalSemanaObrero >= metaX) {
                    obrerosCumplieron++;
                }

                if (o == 1 || totalSemanaObrero > maxProduccion) {
                    maxProduccion = totalSemanaObrero;
                    obreroMasProdujo = nombre;
                }

                sumaProduccionTotal += totalSemanaObrero;
                o++;
            }
        }

        System.out.println("\n==========================================");
        System.out.println("--- RESUMEN GENERAL BLOQUERA EL MILAGRO ---");
        if (totalObreros > 0) {
            double porcCumplieron = ((double) obrerosCumplieron / totalObreros) * 100.0;
            System.out.printf("Porcentaje de obreros que alcanzaron/superaron la meta: %.2f%%%n", porcCumplieron);
            System.out.println("Obrero que mas produjo: " + obreroMasProdujo + " (" + maxProduccion + " bloques)");
            System.out.printf("Promedio de produccion por obrero en la semana: %.2f bloques%n", (sumaProduccionTotal / totalObreros));
        }
    }

    public static void Control75 (String[] args) {
        int totalMiembros = 5;
        int m = 1;

        System.out.println("=== CLUB CONTRA LA OBESIDAD - CONTROL DE PESO ===");
        
        while (m <= totalMiembros) {
            System.out.println("\n--- Miembro #" + m + " ---");
            System.out.print("Nombre del miembro: ");
            String nombre = System.console().readLine();
            System.out.print("Peso de la ultima reunion (kg): ");
            double pesoAnterior = Double.parseDouble(System.console().readLine());

            double sumaPesos = 0;
            int b = 1;
            
            while (b <= 10) {
                System.out.print("Peso en bascula #" + b + " (kg): ");
                double pesoBascula = Double.parseDouble(System.console().readLine());
                sumaPesos += pesoBascula;
                b++;
            }

            double pesoPromedio = sumaPesos / 10.0;
            double diferencia = pesoPromedio - pesoAnterior;

            System.out.println("\nResultado para " + nombre + ":");
            System.out.printf("Peso anterior: %.2f kg | Peso promedio actual: %.2f kg%n", pesoAnterior, pesoPromedio);

            if (diferencia > 0) {
                System.out.printf("SUBIO %.2f kilos de peso.%n", diferencia);
            } else if (diferencia < 0) {
                System.out.printf("BAJO %.2f kilos de peso.%n", Math.abs(diferencia));
            } else {
                System.out.println("MANTUVO su peso (diferencia de 0.00 kilos).");
            }

            m++;
        }
    }

    public static void Control76 (String[] args) {
        System.out.print("Ingrese cantidad de grupos (g): ");
        int g = Integer.parseInt(System.console().readLine());

        double sumaPromediosGrupos = 0;
        int gIdx = 1;

        if (g > 0) {
            while (gIdx <= g) {
                System.out.println("\n==========================================");
                System.out.println("GRUPO #" + gIdx);
                System.out.print("Cantidad de alumnos en el grupo (n): ");
                int n = Integer.parseInt(System.console().readLine());

                double sumaPromediosAlumnos = 0;
                int aIdx = 1;

                if (n > 0) {
                    while (aIdx <= n) {
                        System.out.println("\n--- Alumno #" + aIdx + " del Grupo #" + gIdx + " ---");
                        System.out.print("Nombre del alumno: ");
                        String nomAlumno = System.console().readLine();
                        System.out.print("Cantidad de materias del alumno (m): ");
                        int m = Integer.parseInt(System.console().readLine());

                        double sumaPromediosMaterias = 0;
                        int mIdx = 1;

                        if (m > 0) {
                            while (mIdx <= m) {
                                System.out.println("Materia #" + mIdx + ":");
                                double sumaNotas = 0;
                                int nIdx = 1;
                                while (nIdx <= 3) {
                                    System.out.print("  Calificacion " + nIdx + ": ");
                                    double calif = Double.parseDouble(System.console().readLine());
                                    sumaNotas += calif;
                                    nIdx++;
                                }

                                double promMateria = sumaNotas / 3.0;
                                sumaPromediosMaterias += promMateria;
                                System.out.printf("  -> Promedio de materia #%d: %.2f%n", mIdx, promMateria);
                                mIdx++;
                            }
                        }

                        double promAlumno = (m > 0) ? (sumaPromediosMaterias / m) : 0;
                        System.out.printf(">>> Promedio del alumno %s: %.2f%n", nomAlumno, promAlumno);
                        sumaPromediosAlumnos += promAlumno;

                        aIdx++;
                    }
                }

                double promGrupo = (n > 0) ? (sumaPromediosAlumnos / n) : 0;
                System.out.printf("\n*** PROMEDIO DEL GRUPO #%d: %.2f ***%n", gIdx, promGrupo);
                sumaPromediosGrupos += promGrupo;

                gIdx++;
            }
        }

        double promGeneral = (g > 0) ? (sumaPromediosGrupos / g) : 0;
        System.out.printf("\n==========================================%n");
        System.out.printf("PROMEDIO GENERAL DE TODOS LOS GRUPOS: %.2f%n", promGeneral);
    }

    public static void Control77 (String[] args) {
        System.out.print("Ingrese la poblacion total del Pais: ");
        double poblacionTotalPais = Double.parseDouble(System.console().readLine());

        int totalEstados = 5;
        int e = 1;

        double maxPoblacionEstado = -1;
        String nomEstadoMayor = "";
        double minPoblacionEstado = Double.MAX_VALUE;
        String nomEstadoMenor = "";

        double sumaPoblacion5Estados = 0;
        
        while (e <= totalEstados) {
            System.out.println("\n--- Estado #" + e + " de 5 ---");
            System.out.print("Nombre del Estado: ");
            String nomEstado = System.console().readLine();
            System.out.print("Cantidad de municipios (M): ");
            int m = Integer.parseInt(System.console().readLine());

            double poblacionEstado = 0;
            int mun = 1;
            if (m > 0) {
                while (mun <= m) {
                    System.out.print("Poblacion del municipio #" + mun + ": ");
                    double pobMun = Double.parseDouble(System.console().readLine());
                    poblacionEstado += pobMun;
                    mun++;
                }
            }

            System.out.printf("Poblacion total de %s: %.0f habitantes%n", nomEstado, poblacionEstado);
            sumaPoblacion5Estados += poblacionEstado;

            if (e == 1 || poblacionEstado > maxPoblacionEstado) {
                maxPoblacionEstado = poblacionEstado;
                nomEstadoMayor = nomEstado;
            }
            if (e == 1 || poblacionEstado < minPoblacionEstado) {
                minPoblacionEstado = poblacionEstado;
                nomEstadoMenor = nomEstado;
            }

            e++;
        }

        System.out.println("\n==========================================");
        System.out.println("--- ESTADISTICAS POBLACIONALES ---");
        System.out.printf("a. Estado con mayor poblacion: %s con %.0f habitantes%n", nomEstadoMayor, maxPoblacionEstado);
        System.out.printf("b. Estado con menor poblacion: %s con %.0f habitantes%n", nomEstadoMenor, minPoblacionEstado);

        if (poblacionTotalPais > 0) {
            double porc5Estados = (sumaPoblacion5Estados / poblacionTotalPais) * 100.0;
            System.out.printf("c. Porcentaje de los 5 estados respecto al pais: %.2f%%%n", porc5Estados);
        }
        System.out.printf("d. Promedio de habitantes por Estado: %.2f habitantes%n", (sumaPoblacion5Estados / totalEstados));
    }

    public static void Control78 (String[] args) {
        double pvp1 = 100.0;
        double pvp2 = 200.0;
        double pvp3 = 300.0;

        System.out.print("Ingrese cantidad de sucursales a procesar: ");
        int cantSucursales = Integer.parseInt(System.console().readLine());
        int s = 1;

        int sucursalesCumplieron = 0;

        if (cantSucursales > 0) {
            while (s <= cantSucursales) {
                System.out.println("\n==========================================");
                System.out.print("Codigo de la sucursal (2 digitos): ");
                int codSucursal = Integer.parseInt(System.console().readLine());
                System.out.print("Descripcion de la sucursal: ");
                String descSucursal = System.console().readLine();
                System.out.print("Monto de venta esperado (Bs.): ");
                double ventaEsperada = Double.parseDouble(System.console().readLine());
                System.out.print("Cantidad de puntos de venta de la sucursal: ");
                int cantPuntos = Integer.parseInt(System.console().readLine());

                double totalVendidoSucursal = 0;
                double maxComisionPunto = -1;
                int codPuntoMaxComision = 0;

                int p = 1;
                if (cantPuntos > 0) {
                    while (p <= cantPuntos) {
                        System.out.println("\n--- Punto de Venta #" + p + " ---");
                        System.out.print("Codigo de punto de venta (4 digitos): ");
                        int codPunto = Integer.parseInt(System.console().readLine());

                        System.out.print("Unidades vendidas Producto 1: ");
                        int u1 = Integer.parseInt(System.console().readLine());
                        System.out.print("Unidades vendidas Producto 2: ");
                        int u2 = Integer.parseInt(System.console().readLine());
                        System.out.print("Unidades vendidas Producto 3: ");
                        int u3 = Integer.parseInt(System.console().readLine());

                        int totalUnidadesPunto = u1 + u2 + u3;
                        double montoBrutoPunto = (u1 * pvp1) + (u2 * pvp2) + (u3 * pvp3);
                        double comisionVendedores = montoBrutoPunto * 0.10;
                        double montoNetoPunto = montoBrutoPunto - comisionVendedores;

                        int codProductoMenosVendido = 1;
                        int minUnidades = u1;
                        if (u2 < minUnidades) {
                            minUnidades = u2;
                            codProductoMenosVendido = 2;
                        }
                        if (u3 < minUnidades) {
                            minUnidades = u3;
                            codProductoMenosVendido = 3;
                        }

                        System.out.println("Resultados Punto de Venta " + codPunto + ":");
                        System.out.println("  Total unidades vendidas: " + totalUnidadesPunto);
                        System.out.printf("  Monto neto de la venta: %.2f Bs.%n", montoNetoPunto);
                        System.out.printf("  Monto comision vendedores: %.2f Bs.%n", comisionVendedores);
                        System.out.println("  Codigo producto menor unidades vendidas: " + codProductoMenosVendido + " (" + minUnidades + " unidades)");

                        totalVendidoSucursal += montoBrutoPunto;

                        if (p == 1 || comisionVendedores > maxComisionPunto) {
                            maxComisionPunto = comisionVendedores;
                            codPuntoMaxComision = codPunto;
                        }

                        p++;
                    }
                }

                double porcAlcanzado = (ventaEsperada > 0) ? ((totalVendidoSucursal / ventaEsperada) * 100.0) : 0;
                if (totalVendidoSucursal >= ventaEsperada) {
                    sucursalesCumplieron++;
                }

                System.out.println("\n--- RESUMEN SUCURSAL " + codSucursal + " (" + descSucursal + ") ---");
                System.out.printf("Monto total vendido: %.2f Bs.%n", totalVendidoSucursal);
                System.out.printf("Porcentaje alcanzado vs esperado: %.2f%%%n", porcAlcanzado);
                System.out.printf("Punto de venta con mayor comision: Codigo %d con %.2f Bs.%n", codPuntoMaxComision, maxComisionPunto);

                s++;
            }
        }

        if (cantSucursales > 0) {
            double porcSucursalesMeta = ((double) sucursalesCumplieron / cantSucursales) * 100.0;
            System.out.println("\n==========================================");
            System.out.printf("Porcentaje de sucursales que alcanzaron el monto esperado: %.2f%%%n", porcSucursalesMeta);
        }
    }

    public static void Control79 (String[] args) {
        System.out.print("Ingrese cantidad de autores a procesar: ");
        int cantAutores = Integer.parseInt(System.console().readLine());
        int a = 1;

        int totalLibrosGeneral = 0;
        int librosCienciaFiccion = 0;
        int librosRomance = 0;

        int maxLibrosAutor = -1;
        String autorMaxLibros = "";

        if (cantAutores > 0) {
            while (a <= cantAutores) {
                System.out.println("\n--- Autor #" + a + " ---");
                System.out.print("Apellido del autor: ");
                String apellido = System.console().readLine();
                System.out.print("Cantidad de libros del autor: ");
                int cantLibros = Integer.parseInt(System.console().readLine());

                int totalPaginasAutor = 0;
                int maxPaginasLibro = -1;
                String codLibroMayorPaginas = "";

                int l = 1;
                if (cantLibros > 0) {
                    while (l <= cantLibros) {
                        System.out.print("  Libro #" + l + " - Codigo: ");
                        String codLibro = System.console().readLine();
                        System.out.print("  Libro #" + l + " - Genero (1=CienciaFiccion, 2=Romance, 3=Accion, 4=Terror, 5=Novela, 6=Autoayuda, 7=Academico): ");
                        int gen = Integer.parseInt(System.console().readLine());
                        System.out.print("  Libro #" + l + " - Numero de paginas: ");
                        int paginas = Integer.parseInt(System.console().readLine());

                        totalPaginasAutor += paginas;
                        totalLibrosGeneral++;

                        if (gen == 1) {
                            librosCienciaFiccion++;
                        } else if (gen == 2) {
                            librosRomance++;
                        }

                        if (l == 1 || paginas > maxPaginasLibro) {
                            maxPaginasLibro = paginas;
                            codLibroMayorPaginas = codLibro;
                        }

                        l++;
                    }
                }

                System.out.println("\nReporte por Autor:");
                System.out.println("Apellido: " + apellido);
                System.out.println("Total paginas escritas: " + totalPaginasAutor);
                System.out.println("Libro con mayor numero de paginas: Codigo " + codLibroMayorPaginas + " (" + maxPaginasLibro + " paginas)");

                if (a == 1 || cantLibros > maxLibrosAutor) {
                    maxLibrosAutor = cantLibros;
                    autorMaxLibros = apellido;
                }

                a++;
            }
        }

        System.out.println("\n==========================================");
        System.out.println("--- ESTADISTICAS GENERALES DE LA LIBRERIA ---");
        if (totalLibrosGeneral > 0) {
            double porcCF = ((double) librosCienciaFiccion / totalLibrosGeneral) * 100.0;
            System.out.printf("Porcentaje de libros de ciencia ficcion: %.2f%%%n", porcCF);
        }
        System.out.println("Cantidad de libros de ciencia ficcion en existencia: " + librosCienciaFiccion);
        System.out.println("Cantidad de libros de romance en existencia: " + librosRomance);
        System.out.println("Autor con mayor cantidad de libros: " + autorMaxLibros + " (" + maxLibrosAutor + " libros)");
    }

    public static void Control80 (String[] args) {
        System.out.print("Ingrese cantidad de Estados a censar: ");
        int cantEstados = Integer.parseInt(System.console().readLine());
        int e = 1;

        double maxPorcProfDesempleadosEstado = -1;
        String codEstadoMaxProfDesemp = "";

        if (cantEstados > 0) {
            while (e <= cantEstados) {
                System.out.println("\n==========================================");
                System.out.print("Codigo del Estado (2 digitos): ");
                String codEstado = System.console().readLine();
                System.out.print("Cantidad de ciudades en el Estado: ");
                int cantCiudades = Integer.parseInt(System.console().readLine());

                int totalProfesionalesEstado = 0;
                int totalProfDesempleadosEstado = 0;

                int c = 1;
                if (cantCiudades > 0) {
                    while (c <= cantCiudades) {
                        System.out.println("\n------------------------------------------");
                        System.out.print("Codigo de la ciudad (4 digitos): ");
                        String codCiudad = System.console().readLine();
                        System.out.print("Cantidad de municipios en la ciudad: ");
                        int cantMunicipios = Integer.parseInt(System.console().readLine());

                        int totalPersonasCiudad = 0;
                        int totalCondicionCiudad = 0;

                        int m = 1;
                        if (cantMunicipios > 0) {
                            while (m <= cantMunicipios) {
                                System.out.println("\n--- Municipio #" + m + " ---");
                                System.out.print("Codigo del municipio (6 digitos): ");
                                String codMun = System.console().readLine();
                                System.out.print("Cantidad de personas a registrar en municipio: ");
                                int cantPersonas = Integer.parseInt(System.console().readLine());

                                int personasCondicionMun = 0;
                                int p = 1;
                                if (cantPersonas > 0) {
                                    while (p <= cantPersonas) {
                                        System.out.print("  Persona #" + p + " - Edad (>18): ");
                                        int edad = Integer.parseInt(System.console().readLine());
                                        System.out.print("  Persona #" + p + " - Educacion (N, B, S, P): ");
                                        char edu = System.console().readLine().toUpperCase().charAt(0);
                                        System.out.print("  Persona #" + p + " - Situacion (D: Desempleado, E: Empleado): ");
                                        char sit = System.console().readLine().toUpperCase().charAt(0);

                                        if (sit == 'D' && edu == 'N' && edad > 25) {
                                            personasCondicionMun++;
                                        }

                                        if (edu == 'P') {
                                            totalProfesionalesEstado++;
                                            if (sit == 'D') {
                                                totalProfDesempleadosEstado++;
                                            }
                                        }

                                        p++;
                                    }
                                }

                                System.out.println("Municipio " + codMun + ": " + personasCondicionMun + " personas desempleadas, sin educacion y > 25 anos.");
                                totalCondicionCiudad += personasCondicionMun;
                                totalPersonasCiudad += cantPersonas;

                                m++;
                            }
                        }

                        if (totalPersonasCiudad > 0) {
                            double porcCondicionCiudad = ((double) totalCondicionCiudad / totalPersonasCiudad) * 100.0;
                            if (porcCondicionCiudad > 50.0) {
                                System.out.printf(">>> ALERTA CIUDAD %s: Mas del 50%% de personas con la condicion especial (%.2f%%)%n", codCiudad, porcCondicionCiudad);
                            }
                        }

                        c++;
                    }
                }

                double porcProfDesempEstado = 0;
                if (totalProfesionalesEstado > 0) {
                    porcProfDesempEstado = ((double) totalProfDesempleadosEstado / totalProfesionalesEstado) * 100.0;
                }

                if (e == 1 || porcProfDesempEstado > maxPorcProfDesempleadosEstado) {
                    maxPorcProfDesempleadosEstado = porcProfDesempEstado;
                    codEstadoMaxProfDesemp = codEstado;
                }

                e++;
            }
        }

        System.out.println("\n==========================================");
        System.out.printf("Estado con mayor porcentaje de profesionales desempleados: %s (%.2f%%)%n", codEstadoMaxProfDesemp, maxPorcProfDesempleadosEstado);
    }

    public static void Control81 (String[] args) {
        System.out.print("Ingrese cantidad de Estados a procesar: ");
        int cantEstados = Integer.parseInt(System.console().readLine());
        int e = 1;

        if (cantEstados > 0) {
            while (e <= cantEstados) {
                System.out.println("\n==========================================");
                System.out.print("Codigo del Estado (2 digitos): ");
                String codEstado = System.console().readLine();
                System.out.print("Nombre del Estado: ");
                String nomEstado = System.console().readLine();
                System.out.print("Cantidad de ciudades en " + nomEstado + ": ");
                int cantCiudades = Integer.parseInt(System.console().readLine());

                double montoNetoTotalEstado = 0;
                int ciudadesNoAlcanzaronMeta = 0;
                int ciudades40a60PorcEncima = 0;

                int c = 1;
                
                if (cantCiudades > 0) {
                    while (c <= cantCiudades) {
                        System.out.println("\n------------------------------------------");
                        System.out.print("Codigo de la ciudad (3 digitos): ");
                        String codCiudad = System.console().readLine();
                        System.out.print("Nombre de la ciudad: ");
                        String nomCiudad = System.console().readLine();
                        System.out.print("Cantidad esperada de unidades de venta: ");
                        int unidadesEsperadas = Integer.parseInt(System.console().readLine());
                        System.out.print("Cantidad de canales de comercializacion en la ciudad: ");
                        int cantCanales = Integer.parseInt(System.console().readLine());

                        int totalUnidadesCiudad = 0;
                        double totalBrutoCiudad = 0;
                        double comisionTiendaCiudad = 0;
                        double comisionCalleCiudad = 0;

                        double maxVentaNetaCanal = -1;
                        String codCanalMaxVenta = "";

                        int minUnidadesVendedor = Integer.MAX_VALUE;
                        String codVendedorMinUnidades = "";

                        int k = 1;
                        
                        if (cantCanales > 0) {
                            while (k <= cantCanales) {
                                System.out.println("\n--- Canal de Comercializacion #" + k + " ---");
                                System.out.print("Codigo del canal (4 digitos): ");
                                String codCanal = System.console().readLine();
                                System.out.print("Cantidad de vendedores en este canal: ");
                                int cantVendedores = Integer.parseInt(System.console().readLine());

                                double ventaNetaCanal = 0;
                                int v = 1;
                                
                                if (cantVendedores > 0) {
                                    while (v <= cantVendedores) {
                                        System.out.print("  Codigo vendedor #" + v + " (5 digitos, inicia con 11=tienda o 12=calle): ");
                                        String codVendedor = System.console().readLine();
                                        System.out.print("  Unidades vendidas: ");
                                        int unidVendidas = Integer.parseInt(System.console().readLine());
                                        System.out.print("  Monto total vendido: ");
                                        double montoVendido = Double.parseDouble(System.console().readLine());

                                        totalUnidadesCiudad += unidVendidas;
                                        totalBrutoCiudad += montoVendido;

                                        double comisionVendedor = 0;
                                        
                                        if (codVendedor.startsWith("11")) {
                                            comisionVendedor = montoVendido * 0.10;
                                            comisionTiendaCiudad += comisionVendedor;
                                        } else if (codVendedor.startsWith("12")) {
                                            comisionVendedor = montoVendido * 0.15;
                                            comisionCalleCiudad += comisionVendedor;
                                        }

                                        ventaNetaCanal += (montoVendido - comisionVendedor);

                                        if (unidVendidas < minUnidadesVendedor) {
                                            minUnidadesVendedor = unidVendidas;
                                            codVendedorMinUnidades = codVendedor;
                                        }

                                        v++;
                                    }
                                }

                                if (k == 1 || ventaNetaCanal > maxVentaNetaCanal) {
                                    maxVentaNetaCanal = ventaNetaCanal;
                                    codCanalMaxVenta = codCanal;
                                }

                                k++;
                            }
                        }

                        double totalNetoCiudad = totalBrutoCiudad - comisionTiendaCiudad - comisionCalleCiudad;
                        montoNetoTotalEstado += totalNetoCiudad;

                        if (totalUnidadesCiudad < unidadesEsperadas) {
                            ciudadesNoAlcanzaronMeta++;
                        } else {
                            double porcEncima = ((double) (totalUnidadesCiudad - unidadesEsperadas) / unidadesEsperadas) * 100.0;
                            if (porcEncima >= 40.0 && porcEncima <= 60.0) {
                                ciudades40a60PorcEncima++;
                            }
                        }

                        System.out.println("\n*** REPORTE CIUDAD " + codCiudad + " (" + nomCiudad + ") ***");
                        System.out.println("Total unidades vendidas: " + totalUnidadesCiudad);
                        System.out.printf("Monto total bruto: %.2f Bs.%n", totalBrutoCiudad);
                        System.out.printf("Comision vendedores tienda: %.2f Bs.%n", comisionTiendaCiudad);
                        System.out.printf("Comision vendedores calle: %.2f Bs.%n", comisionCalleCiudad);
                        System.out.println("Canal con mayor venta neta: Codigo " + codCanalMaxVenta + " (" + maxVentaNetaCanal + " Bs.)");
                        System.out.println("Vendedor con menor unidades vendidas: Codigo " + codVendedorMinUnidades + " (" + minUnidadesVendedor + " unidades)");

                        c++;
                    }
                }

                double porcCiudadesNoMeta = (cantCiudades > 0) ? (((double) ciudadesNoAlcanzaronMeta / cantCiudades) * 100.0) : 0;

                System.out.println("\n==========================================");
                System.out.println("=== REPORTE ESTADO " + codEstado + " (" + nomEstado + ") ===");
                System.out.printf("Monto neto vendido en el Estado: %.2f Bs.%n", montoNetoTotalEstado);
                System.out.printf("Porcentaje de ciudades que no alcanzaron la meta: %.2f%%%n", porcCiudadesNoMeta);
                System.out.println("Cantidad de ciudades con 40% a 60% por encima de la meta: " + ciudades40a60PorcEncima);

                e++;
            }
        }
    }

    // USUARIO

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = "";

        do {

            System.out.println("---------------MENU DE EJERCICIOS---------------");

            System.out.println("Seleccione el control que desea ejecutar:");
            System.out.println();
            System.out.println("Para mostrar ejercicio 46 digite: 1");
            System.out.println("Para mostrar ejercicio 47 digite: 2");
            System.out.println("Para mostrar ejercicio 48 digite: 3");
            System.out.println("Para mostrar ejercicio 49 digite: 4");
            System.out.println("Para mostrar ejercicio 50 digite: 5");
            System.out.println("Para mostrar ejercicio 51 digite: 6");
            System.out.println("Para mostrar ejercicio 52 digite: 7");
            System.out.println("Para mostrar ejercicio 53 digite: 8");
            System.out.println("Para mostrar ejercicio 54 digite: 9");
            System.out.println("Para mostrar ejercicio 55 digite: 10");
            System.out.println("Para mostrar ejercicio 56 digite: 11");
            System.out.println("Para mostrar ejercicio 57 digite: 12");
            System.out.println("Para mostrar ejercicio 58 digite: 13");
            System.out.println("Para mostrar ejercicio 59 digite: 14");
            System.out.println("Para mostrar ejercicio 60 digite: 15");
            System.out.println("Para mostrar ejercicio 61 digite: 16");
            System.out.println("Para mostrar ejercicio 62 digite: 17");
            System.out.println("Para mostrar ejercicio 63 digite: 18");
            System.out.println("Para mostrar ejercicio 64 digite: 19");
            System.out.println("Para mostrar ejercicio 65 digite: 20");
            System.out.println("Para mostrar ejercicio 66 digite: 21");
            System.out.println("Para mostrar ejercicio 67 digite: 22");
            System.out.println("Para mostrar ejercicio 68 digite: 23");
            System.out.println("Para mostrar ejercicio 69 digite: 24");
            System.out.println("Para mostrar ejercicio 70 digite: 25");
            System.out.println("Para mostrar ejercicio 71 digite: 26");
            System.out.println("Para mostrar ejercicio 72 digite: 27");
            System.out.println("Para mostrar ejercicio 73 digite: 28");
            System.out.println("Para mostrar ejercicio 74 digite: 29");
            System.out.println("Para mostrar ejercicio 75 digite: 30");
            System.out.println("Para mostrar ejercicio 76 digite: 31");
            System.out.println("Para mostrar ejercicio 77 digite: 32");
            System.out.println("Para mostrar ejercicio 78 digite: 33");
            System.out.println("Para mostrar ejercicio 79 digite: 34");
            System.out.println("Para mostrar ejercicio 80 digite: 35");
            System.out.println("Para mostrar ejercicio 81 digite: 36");
            System.out.println();
            System.out.println("Para salir digite: Salir");
            x = scanner.nextLine();

            switch (x.toLowerCase()) {
                case "1":
                    Control46(args);
                    break;
                case "2":
                    Control47(args);
                    break;
                case "3":
                    Control48(args);
                    break;
                case "4":
                    Control49(args);
                    break;
                case "5":
                    Control50(args);
                    break;
                case "6":
                    Control51(args);
                    break;
                case "7":
                    Control52(args);
                    break;
                case "8":
                    Control53(args);
                    break;
                case "9":
                    Control54(args);
                    break;
                case "10":
                    Control55(args);
                    break;
                case "11":
                    Control56(args);
                    break;
                case "12":
                    Control57(args);
                    break;
                case "13":
                    Control58(args);
                    break;
                case "14":
                    Control59(args);
                    break;
                case "15":
                    Control60(args);
                    break;
                case "16":
                    Control61(args);
                    break;
                case "17":
                    Control62(args);
                    break;
                case "18":
                    Control63(args);
                    break;
                case "19":
                    Control64(args);
                    break;
                case "20":
                    Control65(args);
                    break;
                case "21":
                    Control66(args);
                    break;
                case "22":
                    Control67(args);
                    break;
                case "23":
                    Control68(args);
                    break;
                case "24":
                    Control69(args);
                    break;
                case "25":
                    Control70(args);
                    break;
                case "26":
                    Control71(args);
                    break;
                case "27":
                    Control72(args);
                    break;
                case "28":
                    Control73(args);
                    break;
                case "29":
                    Control74(args);
                    break;
                case "30":
                    Control75(args);
                    break;
                case "31":
                    Control76(args);
                    break;
                case "32":
                    Control77(args);
                    break;
                case "33":
                    Control78(args);
                    break;
                case "34":
                    Control79(args);
                    break;
                case "35":
                    Control80(args);
                    break;
                case "36":
                    Control81(args);
                    break;
                case "salir":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese el nombre de la clase que desea ejecutar o 'Salir' para terminar:");
                    x = scanner.nextLine();
            }

            System.out.println();
            
        } while (!x.equalsIgnoreCase("salir"));
    }
}