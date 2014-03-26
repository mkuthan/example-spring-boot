package example.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

import com.sun.istack.internal.NotNull

@Entity
class Individual {
	@Id
	@GeneratedValue
	Long id
	
	@NotNull
	String firstName
	
	@NotNull
	String lastName
}
