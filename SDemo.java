class Student
{
  private int regno;
  private Stringname;
  Student(int regno,String name)
   {
   this.regno=regno;
   this.name=name;
    }
   public void display()
   {
     System.out.println("register no:"+regno);
     System.out.println("Name:"+name);
     }
class SDemo
{
public static void main(String a[])
  {
Student s1=new Student(401,"Supraja");
Student s2=new Student(402,"Gayatri");
s1.display();s2.display();
 }
}