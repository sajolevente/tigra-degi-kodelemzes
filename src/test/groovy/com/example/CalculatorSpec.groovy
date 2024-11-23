package com.example

import spock.lang.Specification

class CalculatorSpec extends Specification {
    def calculator = new Calculator()

    // Statement Coverage
    def "addition test"() {
        expect:
        calculator.add(1, 2) == 3
    }

    def "subtraction test"() {
        expect:
        calculator.subtract(5, 3) == 2
    }

    def "multiplication test"() {
        expect:
        calculator.multiply(2, 3) == 6
    }

    def "division test"() {
        expect:
        calculator.divide(6, 2) == 3
    }

    def "division by zero test"() {
        when:
        calculator.divide(1, 0)

        then:
        thrown(IllegalArgumentException)
    }

    // Branch Coverage
    def "division by zero test"() {
        when:
        calculator.divide(1, 0)

        then:
        thrown(IllegalArgumentException)
    }

    // Path Coverage
    def "max test"() {
        expect:
        calculator.max(1, 2) == 2
        calculator.max(3, 2) == 3
    }
}
