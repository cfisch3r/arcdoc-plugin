package de.agiledojo.arcdoc

import org.pegdown.PegDownProcessor
import spock.lang.Specification


class MarkDownProcessorTest extends Specification {
	
	def "do nothing" () {
		setup:
		def pegdownProcessor = new PegDownProcessor();
		def sut = new MarkDownProcessor(pegDownProcessor);
		
		when:
		def result = sut.toHtml('test')
		
		then:
		result == 'test'
	}
}
