package peopleDao;

import java.util.List;
import basis.Human;
/*
 *  Interface du data access object
 *  
 *  Contient les prototypes des fonctions de la classe PeopleDAO
 *  N'est pas instanciable avec "new"
 *  
 */
public interface DAO {
	public List<Human> getHumans();
	public void fileFromPath(String path);
	public List<Human> findPeople();
	public List<String> getLinesFromFile();
	public List<Human> fromLinesToHumans(List<String> lineList);
	public Human transformLineToHuman(String line);
	public void showHumans(List<Human> ppl, List<String> lines);
}
