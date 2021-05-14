Feature: Secuencia fibonacci
  yo como desarrollador de scrum
  deseo conocer el valor de fibonacci
  dada la posición indicada


  Scenario: Valor fibonacci en posicion 1
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 1
    Then retorna el valor 1

  Scenario:
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 3
    Then retorna el valor 2

  Scenario:
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 10
    Then retorna el valor 55

  Scenario:
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 11
    Then retorna el valor 89