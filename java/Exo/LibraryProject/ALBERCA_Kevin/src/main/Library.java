package main;

import java.util.ArrayList;

import model.*;

public class Library {
	
	private ArrayList<Document> documents = new ArrayList<Document>();
	private ArrayList<Member> member = new ArrayList<Member>();
	private ArrayList<Laptop> hardware = new ArrayList<Laptop>();
	
	public static void main(String[] args) {
		Library library = new Library();
		Book book1 = new Book("La pierre des mondes", "Fabienne Gil", false);
		Book book2 = new Book("Les carnets de Cerise", "Nothing", true);
		Magazine magazine1 = new Magazine("Closer", 1337, true);
		Magazine magazine2 = new Magazine("Public", 1, false);
		Laptop laptop1 = new Laptop("Apple", OS.Mac, true, false);
		Laptop laptop2 = new Laptop("Asus", OS.Windows, false, true);
		Member prof = new Member("Sami", Status.Teacher);
		Member etudiant = new Member("Kevin", Status.Students);
		
		library.addDocument(book1); library.addDocument(book2); //Ajout de 2 livres
		library.addDocument(magazine1); library.addDocument(magazine2); // Ajout de 2 magasines
		library.addHardware(laptop1); library.addHardware(laptop2); //Ajout de 2 ordinateurs
//		library.searchDocument("pierre"); //Cherche un document
//		library.showBorrowed();
		
//		laptop2.setAvailable(true);
		
		
		System.out.println(library.documents);
		System.out.println(library.hardware);
		
	}
	
	public void addMember(Member member){
		this.member.add(member);
	}
	
	public void addDocument(Document document){
		this.documents.add(document);
	}
		
	public void addHardware(Laptop hardware){
		this.hardware.add(hardware);
	}
		
	public void searchDocument(String name){
		String search = name.toLowerCase();
	
		for (int i = 0; i < documents.size(); i++) {
			String docName = documents.get(i).getTitle().toLowerCase();
			if (docName.contains(search)) {
				System.out.println(documents.get(i).getTitle());
			}
		}
	}
	
	public void showBorrowed(){
		for (Document doc : this.documents) {
			if(!doc.isAvailable()){
				System.out.println(doc.getTitle() + " est emprunte");
			}
		}
		
		for (Laptop hard : this.hardware) {
			if (!hard.isAvailable()) {
				System.out.println(hard.getBrand() + " est emprunte");
			}
		}
	}
	
	public void borrowThis(Object obj) {
		
	}
	
}