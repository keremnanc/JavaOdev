package oopIntro;

public class Main {

	public static void main(String[] args) 
	{
		Product product1 = new Product(1,"Lenovo V14", 15000, "16 GB Ram");
	
		Product product2 = new Product(2,"Lenovo V15",31000, "32 GB Ram");

		Product product3 = new Product();
		product3.id=3;
		product3.name="HP V17";
		product3.unitPrice=15000;
		product3.detail="16 GB Ram";
		
		//ürünler sayýlarý vs.
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
			
		}
		System.out.println(products.length);
		//kategori
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar ";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Bahçe";
		
		Category[] categories = {category1,category2};
		for(Category category : categories) 
		{
			System.out.println(category.name);
		}
		
		//sepete ekleme
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		//Kurs
		Course course1 = new Course("Python", 400,"24 saat kurs");
		Course course2 = new Course("Java", 250,"48 saat kurs");
		Course course3 = new Course("C#", 100,"36 saat kurs");
		
		Course[] courses = {course1,course2,course3};
		for(Course course : courses) 
		{
			System.out.println(course.name);
		}
		
		
		//yorum
		Comment comment1 = new Comment("Kerem'in Bilgisayar hakkýndaki puaný ve yorumu : ", 5 , " Güzel bilgisayar");
		Comment comment2 = new Comment("Köfte'nin Bilgisayar hakkýndaki puaný ve yorumu : ", 1 ," Kötü bilgisayar");
		
		Comment[] comments = {comment1,comment2};
		for(Comment comment : comments) 
		{
		System.out.println(comment.name  + comment.puanlama + comment.detail);
		}
		
	}
}
			

	
	
