package meetup.repositories;

import meetup.pojos.User;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer>{
	public User getUserByEmailIDAndPassword(String emailID,String password);
	public User getUserByEmailID(String emailID);
	//@Async
	//@Querry("Select * from users u where ")
}
