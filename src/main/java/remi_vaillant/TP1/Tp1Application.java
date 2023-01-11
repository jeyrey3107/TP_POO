package remi_vaillant.TP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Tp1Application {
	private Zoo zoo;
	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
		Animal tigre=new Animal("tigre",TypeAnimal.mammifere);
		Animal carpe=new Animal("carpe",TypeAnimal.poisson);
		Animal colibri=new Animal("colibri",TypeAnimal.oiseau);
		Animal grenouille=new Animal("grenouille",TypeAnimal.amphibien);
		Animal lezare=new Animal("lezare",TypeAnimal.reptile);
		Animal lion=new Animal("lion",TypeAnimal.mammifere);
		List<Animal> liste_mam = null;
		List<Animal> liste_poi = null;
		List<Animal> liste_ois = null;
		List<Animal> liste_amp = null;
		List<Animal> liste_rep = null;
		liste_mam.add(tigre);
		liste_mam.add(lion);
		liste_poi.add(carpe);
		liste_ois.add(colibri);
		liste_amp.add(grenouille);
		liste_rep.add(lezare);

		Secteur secteur_mam =new Secteur(TypeAnimal.mammifere,liste_mam);
		Secteur secteur_poi =new Secteur(TypeAnimal.poisson,liste_poi);
		Secteur secteur_ois =new Secteur(TypeAnimal.oiseau,liste_ois);
		Secteur secteur_amp =new Secteur(TypeAnimal.amphibien,liste_amp);
		Secteur secteur_rep =new Secteur(TypeAnimal.reptile,liste_rep);

		List<Secteur> liste_sec = null;
		liste_sec.add(secteur_mam);
		liste_sec.add(secteur_poi);
		liste_sec.add(secteur_ois);
		liste_sec.add(secteur_amp);
		liste_sec.add(secteur_rep);


		Zoo beauval = new Zoo(75,liste_sec,15);
		System.out.println(beauval.getLimiteVisiteur());


	}

}


