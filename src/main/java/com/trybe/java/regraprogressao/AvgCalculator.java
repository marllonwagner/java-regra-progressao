package com.trybe.java.regraprogressao;

/**
 * Classe responsável por calcular a média ponderada das notas.
 */
public class AvgCalculator {

  /**
   * Calcula a média ponderada com base em um array de notas e pesos.
   *
   * @param gradesArr Array contendo as notas e pesos das atividades.
   */
  public static void calculator(short[] gradesArr) {
    int weightedSum = 0;
    int totalWeight = 0;

    for (int i = 0; i < gradesArr.length; i += 2) {
      short weight = gradesArr[i];
      short grade = gradesArr[i + 1];

      weightedSum += grade * weight;
      totalWeight += weight;
    }

    double average = (double) weightedSum / totalWeight;

    if (average >= 85) {
      System.out.println("Parabéns! Você alcançou " + average + "%!"
          +
          "E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste"
          + " período, " + average + "%," + " você não atingiu a pontuação mínima "
          + "necessária para sua aprovação.");
    }
  }
}
