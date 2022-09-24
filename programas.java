import java.util.Scanner;
class problemas {
    public static void main (String[] args){
    Scanner respuesta= new Scanner(System.in);
      //variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";
        do{
       //menu
        System.out.println("¿Qué problema quiere resolver?:");
       System.out.println("1. Descuentos");
       System.out.println("2. Decimales a binarios");
       System.out.println("3. Conversiones de grados");
       System.out.println("4. Numeros positivos y negativos");
       opcion = entrada.nextInt();
    
    
    switch(opcion){
        case 1:
        do{
            System.out.println("¿Cual es su edad?: ");
            edad = respuesta.nextInt();
            }while(edad<0);
            do{
            System.out.println("Ingrese el bono: ");
            bono=respuesta.nextFloat();
            }while(edad<0);
    
            if(edad>65 && edad<=128){
                total = abono*0.40;
                System.out.println("Su abono es de " +total);
            }else if(edad1<21 && edad1>=18){
                System.out.println("¿Tus padres son socios? s/n");
                letras = respuesta.next().charAt(1);
                switch(letras){
                        case 's':
                        total=bono*0.45;
                        System.out.println("Su bono es de " +bono);
                        break;
                        case 'n':
                        total=bono*0.25;
                        System.out.println("Su aono es de " +bono);
                    }
                    
            }
        break;
        case 2:
        System.out.println("Ingrese el numero desee convertir a binario");
        numerobinario=respuesta.nextInt();
        binario="";
        if(numerobinario>0){
            while(numerobinario>0){
                if(numerobinario%2==0){
                    binario="0"+binario;
                }else{
                    binario="1"+binario;
                }
                numerobinario=(int)numerobinario/2;
            }
        }else if(numerobinario==0){
            binario="0";
        }else{
            binario="\n N0 se pudo converitir el numero, ingrese solo positivos";
        }
        System.out.println("El numero binario es: "+ binario);
        break;
        
        case 3:
        System.out.println("Introduzca la temperatura en celcius: ");
        n=respuesta.nextDouble();
        System.out.println("A que unidad de temperatura desea convertir?");
        System.out.println("1. FAHRENHEIT");
        System.out.println("2. KELVINE");
        System.out.println("3. RANKINE");
        operacion=entrada.nextInt();
        switch(mensaje2){
            case 1:
            r=(9*n/5)+32;
            System.out.println(n+" grados celicuis es igual a "+r+" grados fahrenheit");
            break;
            case 2:
            r=n+273.15;
            System.out.println(n+" grados celicuis es igual a "+r+" grados kelvine");
            break;
            case 3:
            r=(9*n/5)+491.67;
            System.out.println(n+" grados celicuis es igual a "+r+" grados kelvine");
            break;
        }
        break;
        case 4:
        n=0;
        a=0;
        b=0;
        do{
        System.out.println("Cuantos numeros desea introducir?");
        num1=entrada.nextInt();
        }while(num1<0);
        for(m=0; m<num1; m++){
            System.out.println("Introduzca un numero:");
            num2=entrada.nextInt();
            if(num2>0){
                n++;
            }else if(num2<0){
                a++;
            }else if(num2==0){
                b++;
            }
        }
        System.out.println("Hay en total "+n+" numeros positivos");
        System.out.println("Hay en total "+a+" numeros negativos");
        System.out.println("Hay en total "+b+" numeros neutros (0)");
        break;
    }

    System.out.println("Desea repetir? s/n");
    letras=entrada.next().charAt(0);;
    }while(letras=='S' || letras=='s');
    } 
}
