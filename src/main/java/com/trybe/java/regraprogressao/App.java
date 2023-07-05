package com.trybe.java.regraprogressao;

/**
 * Classe principal que contém o método main para executar o programa.
 */
public class App {

  /**
   * Método principal que inicia a execução do programa.
   *
   * @param args Argumentos da linha de comando.
   */
  public static void main(String[] args) {
    // Obtém o número de atividades a serem cadastradas
    short numberOfActivities = InfoGetter.activitiesNumber();

    // Obtém as informações das atividades e armazena em um array
    short[] data = InfoGetter.activitiesInfo(numberOfActivities);

    // Calcula a média ponderada com base nas informações das atividades
    AvgCalculator.calculator(data);
  }
}
