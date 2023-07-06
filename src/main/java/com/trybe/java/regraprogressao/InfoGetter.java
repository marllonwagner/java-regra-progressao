package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * Classe responsável por obter informações das atividades.
 */
public class InfoGetter {

  /**
   * Obtém o número de atividades a serem cadastradas.
   *
   * @return O número de atividades.
   */
  public static short activitiesNumber() {
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    Scanner scanNumb = new Scanner(System.in);
    return scanNumb.nextShort();
  }

  /**
   * Obtém as informações das atividades.
   *
   * @param actNumb O número de atividades.
   * @return Um array contendo as informações das atividades.
   */
  public static short[] activitiesInfo(short actNumb) {
    Scanner scan = new Scanner(System.in);


    short[] data = new short[actNumb * 2];

    for (int contador = 0; contador < actNumb; contador++) {
      System.out.println("Digite o nome da atividade " + (contador + 1) + ":");
      String actName = scan.nextLine();
      System.out.println("Digite o peso da atividade " + (contador + 1) + ":");
      data[contador * 2] = Short.parseShort(scan.nextLine());
      System.out.println("Digite a nota obtida para " + actName + ":");
      data[contador * 2 + 1] = Short.parseShort(scan.nextLine());
    }
    scan.close();
    return data;
  }


}
