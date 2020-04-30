package testing;

// Uncomment the below code to test your application

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Blog;

public class TestBlog {
	LocalDate ld = LocalDate.of(2005, 4, 9);
	Blog blog = new Blog("Java","ProgrammingLanguage",ld);
	
	 @Test
	 public void testSetterGetter() {
		 blog.setDescription("ProgrammingLanguage");
		 blog.setTittle("Java");
		 blog.setDate(ld);
		 assertEquals("ProgrammingLanguage",blog.getDescription());
		 assertEquals("Java",blog.getTittle());
		 assertEquals(ld,blog.getDate());
		 try {
			 blog.setDescription(null);
			 blog.setTittle(null);
			 blog.setDate(null);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}

