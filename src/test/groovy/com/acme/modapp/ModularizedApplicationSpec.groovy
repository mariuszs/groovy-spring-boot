package com.acme.modapp


import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ModularizedApplicationSpec extends Specification {

	@Autowired
	BarService barService

	def 'should loads context'() {
		expect:
			barService
	}

}
