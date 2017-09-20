package meetup.repositories;

import java.util.List;

import meetup.pojos.Audience;

import org.springframework.data.repository.CrudRepository;

public interface AudiencesRepository extends CrudRepository<Audience, Integer>{
	public Audience getAudienceByUserIDAndMeetUpId(int userID,int meetUpID);
	public List<Audience> getAudienceByMeetUpId(int meetUpId);
	public List<Audience> getAudienceByUserID(int userID);
}
