package fr.uvsq.doosa.gbintool

import org.junit.Test

class MainTest {
 @Test
 void shouldReturnHello() {
 Main m = new Main()
 assert 'Hello' == m.returnHello()
 }
}
package fr.uvsq.doosa.gbintool
import groovy.util.logging.Slf4j

@Slf4j
class Main {
 static void main(def args) {
  log.info 'Hello'
 }
String returnHello() {
 'Hello'
 }
}
