package com.example

import spock.lang.Specification

class CalculatorSpec extends Specification {
    def "addition works"() {
        given:
        def calc = new Calculator()

        expect:
        calc.add(2, 3) == 5
    }

    def "subtraction works"() {
        given:
        def calc = new Calculator()

        expect:
        calc.subtract(3, 2) == 1
    }

    def "multiplication works"() {
        given:
        def calc = new Calculator()

        expect:
        calc.multiply(2, 3) == 6
    }

    def "division works"() {
        given:
        def calc = new Calculator()

        expect:
        calc.divide(6, 3) == 2
    }

    def "division by zero throws exception"() {
        given:
        def calc = new Calculator()

        when:
        calc.divide(1, 0)

        then:
        thrown(IllegalArgumentException)
    }
}
