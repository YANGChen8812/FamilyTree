package peopleDao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import basis.Human;

public class PeopleDAO implements DAO {

	private File file;
	private List<Human> people;
	private final static String SEPARATOR = ";";

	/*
	 *  Getter de la classe PeopleDAO
	 * 	Renvoie la liste d'humains contenue dans l'attribut people.
	 */
	@Override
	public List<Human> getHumans() {
		return this.people;
	}
	
	/*
	 *  Méthode public List<Human> fileFromPath :
	 *  	Initialise l'attribut file de l'objet à partir du String passé en argument
	 *  Argument(s) :
	 *  	String path : Chemin d'acces à un fichier, sans se préoccuper du format de celui-ci
	 *  
	 */
	@Override
	public void fileFromPath(String path) {
		final String fileName = path;
		this.file = new File(fileName);

		//this.people = findPeople();
	}
	
	/*
	 *  Méthode findePeople
	 *  	Remplit une liste d'humains à partir des informations contenues dans le fichier file par l'intermédiaire de la méthode getLinesFromFile()
	 *  Valeurs de retour :
	 *  	Renvoie "null" si l'attribut file est null ou si getLinesFromFile() n'a pas fonctionné.
	 *  	Renvoie la valeur de retour de la méthode fromLineToHumans(List<String> lineList) sinon.
	 * 
	 */
	@Override
	public List<Human> findPeople() {
		System.out.println("********************************************************************** FIND PEOPLE ");
		if(this.file == null)
			return null;
		this.people = new ArrayList<Human>();
		
		System.out.println("********************************************************************** go get the lines in the file ");
		List<String> lineList = getLinesFromFile();
		if(lineList == null || lineList.isEmpty()){
			System.out.println("********************************************************************** Empty List ");
			return null;
		}

		this.people = fromLinesToHumans(lineList);
		return people;
	}
	/*
	 * people.add(new Human("Pierre", "Hewins", "M", "000", "Roger",
	 * "Brigitte")); people.add(new Human("Rose", "Hewins", "F", "001",
	 * "Roger", "Brigitte"));
	 */
	
	
	/*
	 * 	Méthode public List<String> getLinesFromFile()
	 * 		Doit lire les informations du fichier pointé par l'attribut "file".
	 * 	Valeurs de Retour:
	 * 		Si le fichier n'est pas de bon format ou est vide, elle renvoie "null"
	 * 		Sinon elle renvoie une Liste<String>, chaque case contenant une ligne du fichier.
	 * 
	 */
	/*
	 * 	A TESTER 
	 * 		--> Premier String dans lineList ?????
	 * 
	 */
	@Override
	public List<String> getLinesFromFile() {
		System.out.println("getting Lines From CSV File");
		final List<String> lineList = new ArrayList<String>();

		FileReader fR = null;
		BufferedReader bR = null;

		try {
			fR = new FileReader(this.file);
			bR = new BufferedReader(fR);
			String line = bR.readLine();

			while (line != null) {
				// Delete empty lines, comments and deletes useless spaces
				if (line.isEmpty()) {
					continue;
				}
				if (line.startsWith("#")) {
					continue;
				}
				line = line.trim();
				System.out.println("----------------------------------"+line);
				lineList.add(line);
				line = bR.readLine();
			}

		}

		catch (IOException e) {
			System.err.println("FAIL : ReadLinesFromFile");
		}

		finally {
			System.out.println("---------------------------------- FINALLY from getlines from file");
			if (bR != null) {
				try {
					bR.close();
				} catch (IOException e) {
					System.err.println("Unable to close bufferedReader");
				}
			}
			if (fR != null) {
				try {
					fR.close();
				} catch (IOException e) {
					System.err.println("Unable to close fileReader");
				}
			}
		}
		
		System.out.println("---------------------------------- RETURN of the list of lines");
		return lineList;

	}

	/*
	 * 	Méthode public List<Human> fromLineToHumans(List<String> lineList)
	 * 		Prend en paramètre une liste de String, contenant les informations du fichier et les transforme en Objets de la classe Humain
	 * 	Renvoie une liste d'humains en modifiant l'attribut "people" de l'objet.
	 */
	/*
	 * 	A FAIRE
	 * 
	 */
	@Override
	public List<Human> fromLinesToHumans(List<String> lineList) {
		System.out.println("FROM LINE TO HUMANS");
		Human h = null;
		for(String i : lineList){
			h = transformLineToHuman(i);
			if(h != null)
				people.add(h);
		}
		return people;
	}
	
	/*
	 * 
	 *
	 * 
	 */
	@Override
	public Human transformLineToHuman(String line){
		final Human h = new Human();
		String[] values = { "", "", "", "", "", "", "" };
		int indicator=-1;
		values = line.split(SEPARATOR);
		for(int i=0; i<values.length; i++){
			if(values[i] == null)
				return null;
		}

		h.setfname(values[0]);
		h.setlname(values[1]);

		if(values[2].charAt(0) == 'M')
			h.setSexe("M");
		else if(values[2].charAt(0) == 'F')
			h.setSexe("F");
		else
			h.setSexe("Z");
		
		h.setfather(values[3]);
		h.setmother(values[4]);
		h.setbirthDate(values[5]);
		
		for(int i=0; i<values[6].length(); i++){
			if( !Character.isDigit(values[6].charAt(i)) ){
				indicator = 0;
				h.setId(indicator);
				break;
			}
		}
		if(indicator != 0){
			indicator = Integer.parseInt(values[6]);
			h.setId(indicator);
		}
		return h;
		
	}
	
	/*
	 * 	Méthode public void showHumans(List<Human> ppl, List<String> lines)
	 * 		Sert à affichier les résultats du DAO
	 * 	Pas de retour mais un affichage dans le flux "out"
	 * 
	 */
	@Override
	public void showHumans(List<Human> ppl) {
		System.out.println("SHOOW US YOUR HUMANS");

		if(ppl == null || ppl.isEmpty())
		{
			System.out.println("NO PEOPLE HERE");
			return;
		}
		for(Human i : people)
			System.out.println("Human: "+i.getlname()+" "+i.getfname()+" born "+i.getbirthDate()+" father: "+i.getfather()+" mother: "+i.getmother());
	}

}
