package projet;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import projet.model.Administrateur;
import projet.model.Caissier;
import projet.model.Client;
import projet.model.Product;
import projet.repository.AdministrateurRepository;
import projet.repository.CaissierRepository;
import projet.repository.ClientRepository;
import projet.repository.ProductRepository;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		
		 	ConfigurableApplicationContext context = SpringApplication.run(Application.class);
	        ClientRepository clientRepository = context.getBean(ClientRepository.class);
	        AdministrateurRepository admRepository=context.getBean(AdministrateurRepository.class);
	        CaissierRepository caissierRepository=context.getBean(CaissierRepository.class);
	        ProductRepository productRepository=context.getBean(ProductRepository.class);
	        
	        System.out.println("Sauvegarde en cours ...");
	      
	        
	        
	        admRepository.save(new Administrateur("elf@gmail.com","elfelf"));
	        admRepository.save(new Administrateur("anas@gmail.com","anas"));
	        
	        caissierRepository.save(new Caissier(null, "el farouf","taoufik",null, 20,"Rue ibnou habous","taoufik@hotmail.com","elf"));
	        caissierRepository.save(new Caissier(null, "el Mourabit","Anas",null, 20,"Rue du passage","anas@gmail.com","anas"));
	        caissierRepository.save(new Caissier(null, "el farouf","taoufik",null, 20,"Rue ibnou habous","taoufik@hotmail.com","elf"));
	        caissierRepository.save(new Caissier(null, "el Mourabit","Anas",null, 20,"Rue du passage","anas@gmail.com","anas"));caissierRepository.save(new Caissier(null, "el farouf","taoufik",null, 20,"Rue ibnou habous","taoufik@hotmail.com","elf"));
	        caissierRepository.save(new Caissier(null, "el Mourabit","Anas",null, 20,"Rue du passage","anas@gmail.com","anas"));caissierRepository.save(new Caissier(null, "el farouf","taoufik",null, 20,"Rue ibnou habous","taoufik@hotmail.com","elf"));
	        caissierRepository.save(new Caissier(null, "el Mourabit","Anas",null, 20,"Rue du passage","anas@gmail.com","anas"));caissierRepository.save(new Caissier(null, "el farouf","taoufik",null, 20,"Rue ibnou habous","taoufik@hotmail.com","elf"));
	        caissierRepository.save(new Caissier(null, "el Mourabit","Anas",null, 20,"Rue du passage","anas@gmail.com","anas"));caissierRepository.save(new Caissier(null, "el farouf","taoufik",null, 20,"Rue ibnou habous","taoufik@hotmail.com","elf"));
	        caissierRepository.save(new Caissier(null, "el Mourabit","Anas",null, 20,"Rue du passage","anas@gmail.com","anas"));
	        clientRepository.save(new Client(1, "El","Mourabit","Rue de l'adresse", 19, "Entreprise", "anas@gmail.com", "adresse", "ville", "email"));
            clientRepository.save(new Client(14546989, "Bob","marley","rue de l'adresse", 20, "99", "bob@gmail.com", null, null, null));
            clientRepository.save(new Client(4654, "El","Mourabit","rue de l'avenue", 22, "27", "anas@gmail.com", null, null, null));
            

            productRepository.save(new Product(0, "RGTH5","Produit1","Description","21","marque", null));
            productRepository.save(new Product(0, "REFG4","Produit2","Description","22","marque", null));
            productRepository.save(new Product(0, "RGTH6","Produit3","Description","23","marque", null));
            productRepository.save(new Product(0, "REFG7","Produit4","Description","24","marque", null));
            productRepository.save(new Product(0, "RGTH5","Produit1","Description","25","marque", null));
            productRepository.save(new Product(0, "REFG4","Produit2","Description","26","marque", null));
            productRepository.save(new Product(0, "RGTH6","Produit3","Description","27","marque", null));
            productRepository.save(new Product(0, "REFG7","Produit4","Description","28","marque", null));
            productRepository.save(new Product(0, "RGTH5","Produit1","Description","27 $","marque", null));
            productRepository.save(new Product(0, "REFG4","Produit2","Description","230 $","marque", null));
            productRepository.save(new Product(0, "RGTH6","Produit3","Description","27","marque", null));
            productRepository.save(new Product(0, "REFG7","Produit4","Description","23","marque", null));
            productRepository.save(new Product(0, "RGTH5","Produit1","Description","27","marque", null));
            productRepository.save(new Product(0, "REFG4","Produit2","Description","23","marque", null));
            productRepository.save(new Product(0, "RGTH6","Produit3","Description","27","marque", null));
            productRepository.save(new Product(0, "REFG7","Produit4","Description","23","marque", null));

            //	        List<Client> listClients = (List<Client>) clientRepository.findAll();
//	        System.out.println("Affichage de nos clients");
	        
//	       System.out.println("Nom         "+"Prenom          "+"Ville          ");
//	       for(Client c : listeClients) 
//	       {
//	    	   System.out.print(""+c.getNom()); System.out.print("         "+c.getPrenom());System.out.print("        "+c.getVille());
//	           System.out.print("\n");
//	       }
//	        
	        
	        
	        

	}

}
