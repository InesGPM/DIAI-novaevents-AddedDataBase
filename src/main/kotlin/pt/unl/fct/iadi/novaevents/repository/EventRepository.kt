package pt.unl.fct.iadi.novaevents.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.unl.fct.iadi.novaevents.model.Club
import pt.unl.fct.iadi.novaevents.model.Event
import pt.unl.fct.iadi.novaevents.model.EventType

interface EventRepository : JpaRepository<Event, Long> {
    fun existsByNameIgnoreCase(name: String): Boolean
    fun existsByNameIgnoreCaseAndIdNot(name: String, id: Long): Boolean
    fun findByClub(club: Club): List<Event>
    fun findByType(type: EventType): List<Event>
    fun findByClubAndType(club: Club, type: EventType): List<Event>
}
