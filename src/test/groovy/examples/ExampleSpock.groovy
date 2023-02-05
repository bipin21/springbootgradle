package examples;

import spock.lang.Specification;

/**
 * @author bipinkarki
 */
class ExampleSpock extends Specification {

    def "example test"() {
        given:
        def x = 1
        def y = 2

        when:
        def res = x + y

        then:
        res == 3
    }
}
