public class Person  //This class store name and id. this is parent class
{
     protected String name;
     protected String id;
     
     public Person() 
     {
          name = "not define";
          id = "not define";
     }
     
     public Person (String newName, String newId)
     {
          name = newName;
          id = newId;
     }
     
     public String getName()
     {
          return name;
     }
     
     public String getId()
     {
          return id;
     }
     
     public void setName(String newName)
     {
          name = newName;
     }
     
     public void setId(String newId)
     {
          id = newId;
     }
     
     public void set(String newName, String newId)
     {
          name = newName;
          id = newId;
     }
     
     public String toString()
     {
          return "Name = " + name + " " + "id = " + id;
     }
     
     public boolean equals(Object o) 
     {
          if (this == o)     // self check
               return true;
          if (o == null)    // null check
               return false;
          if (!(o instanceof Person))   // type check and cast
               return false;
          
          Person person = (Person) o;
          
          return  this.name.equals(person.name) //see if the person name and person id are match. 
               && this.id.equals(person.id);
     }

     
}