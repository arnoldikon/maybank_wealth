package kubikTransaction

import java.time.LocalDate


def static id(Integer prevId,String type) {
	
	Integer newId
	def period = new Date().format("yy").toString()
	def prefix = new String("${type}${period}")
	
	if(type) {
		
		if(prevId && prevId.toString().startsWith(prefix)){newId = prevId+1}
		else {newId = "${prefix}000000".toInteger()}
		
		return newId
	}
	else {throw new IllegalArgumentException("ID type cannot be empty")}
	
}