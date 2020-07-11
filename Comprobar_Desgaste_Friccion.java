/*
 Diseño e implementación de un algoritmo que le permita gestionar el diagnóstico
para comprobar el desgaste por fricción del eje principal de transmisión del vehículo
mediante un captador de movimiento(sensor).
 */
package comprobar_desgaste_friccion;

import java.util.Scanner;

/**
 *
 * @author Lenin Paul
 */


public class Comprobar_Desgaste_Friccion {

public static String Identificar_seniales_movimiento( ){
Scanner objeto=new Scanner(System.in);
String tipo_senial;
int valor_movimiento;
System.out.println("INGRESE EL TIPO DE SENIAL : ");
tipo_senial=objeto.nextLine();
System.out.println("INGRESE EL VALOR DE LA SENIAL :");
valor_movimiento=objeto.nextInt();
return  "El tipo de señal " +tipo_senial+ " que se obtiene a la entrada"
        +"\n posee un valor de movimiento de \n"+valor_movimiento;



}

public static String Determinar_limites_dispositivo( ){
Scanner objeto=new Scanner(System.in);
String forma_dispositivo;
String tipo_limite;
System.out.println("INGRESE LA FORMA DEL DISPOSITIVO :");
forma_dispositivo=objeto.nextLine();
System.out.println("INGRESE EL TIPO DE LIMITE :");
tipo_limite=objeto.nextLine();
return "El dispositivo presenta una forma" +forma_dispositivo+ ",segun su estructura"
       +"\nposee un tipo límite de "+tipo_limite;
}

public static String Determinar_superficie_eje_principal_transmision( ){
    Scanner objeto=new Scanner(System.in);
    String estado_eje_principal_transmision;
    System.out.println("INGRESE EL ESTADO DE EJE DE TRANSMISION PRINCIPAL :");
    estado_eje_principal_transmision=objeto.nextLine() ;
    return "En su funcionamiento se encuentra en un estado"+estado_eje_principal_transmision;
}

public static float Comprobar_eje_principal_transmision_mediante_sensor( ){
    Scanner objeto=new Scanner(System.in);
    float valor_desgaste;
    float desgaste_minimo;
    float desgaste_maximo;
    System.out.println("INGRESE EL VALOR DE DESGASTE :");
    valor_desgaste=objeto.nextFloat();
    return valor_desgaste;

}

public static float Comparar_limites_generados_mediciones( ){
    Scanner objeto=new Scanner(System.in);

    float valor_desgaste;
    valor_desgaste=Comprobar_eje_principal_transmision_mediante_sensor( );
    return valor_desgaste;


}

public static String Verificar_diagnostico( ){
    Scanner objeto=new Scanner(System.in);

    int valor_friccion;
    String tipo_senial_establecido;
    String forma_dispositivo;
    int valor_movimiento;
    String tipo_sensor_establecido;
    int valor_medicion;
    System.out.println("INGRESE VALOR DE FRICCION ESTABLECIDO :" );
    valor_friccion=objeto.nextInt();
    System.out.println("INGRESE EL TIPO DE SENIAL ESTABLECIDA ");
    tipo_senial_establecido=objeto.nextLine();
    System.out.println("INGRESE LA FORMA DEL DISPOSITIVO ESTABLECIDO :");
    forma_dispositivo=objeto.nextLine();
    System.out.println("INGRESE EL VALOR DEL MOVIMIENTO ESTABLECIDO :");
    valor_movimiento=objeto.nextInt();
    System.out.println("INGRESE EL TIPO DE SENSOR ESTABLECIDO");
    tipo_sensor_establecido=objeto.nextLine();
    System.out.println("INGRESE EL VALOR DE MEDICION ESTABLECIDO :");
    valor_medicion=objeto.nextInt();
    return "Bajo los parámetros establecidos del valor de fricción"+valor_friccion+"que"
            +"\nproporciona el tipo de señal"+tipo_senial_establecido+",tomando en cuenta el "
            +"\ntipo de sensor :"+tipo_sensor_establecido+ "y la forma del dispositivo "+forma_dispositivo+",proporciona"
            +"\nel valor del movimiento que existe en el eje de "+valor_movimiento+",este proporciona el"
            +"\nvalor de medición de  " +valor_medicion;

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto=new Scanner(System.in);
        float valor_desgaste;
        float desgaste_minimo=2;
        float desgaste_maximo=10;

        System.out.println(Identificar_seniales_movimiento( ));
        System.out.println(Determinar_limites_dispositivo( ));
        System.out.println(Determinar_superficie_eje_principal_transmision( ));

        valor_desgaste=Comprobar_eje_principal_transmision_mediante_sensor( );
        if(valor_desgaste<desgaste_minimo){
        System.out.println("El eje principal de transmisión se encuentra en perfecto estado");

        }else

         {

	if(valor_desgaste<desgaste_maximo)
		System.out.println("El eje de transmisión se encuentra en condiciones normales de funcinamiento");
         else
            System.out.println("El eje de trasmisión se encuentra con un desgaste excesivo");

         }
        if(valor_desgaste<desgaste_minimo){
            System.out.println("El eje de transmisión trabaja correctamente");
        }else{

        }if(valor_desgaste<desgaste_maximo){
            System.out.println("El eje de transmisión no presenta signos críticos de desgaste ");
        }else
            System.out.println("El eje de trasnmisión presenta signos de desgaste por fricción");

        System.out.println(Verificar_diagnostico( ));

        System.out.println("Cuando todos los resultados experimentales se evalúan se ha observado que el uso del modelo establecido está funcionando correctamente");

















    }

}
