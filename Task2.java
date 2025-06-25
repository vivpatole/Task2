package Task24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	
	int Student_id;
	String Name;
	float marks;
	static Scanner sc=new Scanner(System.in);
	static List<Task2>stulist=new ArrayList<>();
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Task2 [Student_id=" + Student_id + ", Name=" + Name + ", marks=" + marks + "]";
	}
	public Task2(int student_id, String name, float marks) {
		super();
		Student_id = student_id;
		Name = name;
		this.marks = marks;
	}
	public Task2() {
		super();
		
	}
	
	public static void addStudentRecord()
	{
		
		System.out.print("Enter ID You Want: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name You Want: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks You Want: ");
        float marks = sc.nextFloat();

        stulist.add(new Task2(id, name, marks));
        System.out.println(" Record Inserted \n");
	}
	public static void seeStudentRecord()
	{
		if (stulist.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("Student Records:");
            for (Task2 s : stulist) {
                System.out.println(s);
            }
        }
        System.out.println();
	}
	public static void UpdatestudentRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Data You want to update: \n");
		int id=sc.nextInt();
		boolean Seen=false;
		
		for (Task2 ts : stulist) {
            if (ts.Student_id == id) {
                sc.nextLine();
                System.out.print("Enter new name: ");
                ts.Name = sc.nextLine();
                System.out.print("Enter new marks: ");
                ts.marks = sc.nextFloat();
                Seen = true;
                System.out.println("Record updated.\n");
                break;
            }
		 
        if (!Seen) {
            System.out.println("Student not found.\n");
        }
	}
}
	public static void DeletestudentRecord() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Student ID to delete: ");
	    int id = sc.nextInt();

	    Iterator<Task2> itr = stulist.iterator(); 
	    boolean seen = false;

	    while (itr.hasNext()) {
	        Task2 student = itr.next();
	        if (student.Student_id == id) {
	            itr.remove(); 
	            seen = true;
	            System.out.println("Record deleted.\n");
	            break;
	        }
	    }

	    if (!seen) {
	        System.out.println("Student not found.\n");
	    }
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int click;

        do {
            System.out.println("------ Student Record  ------");
            System.out.println("1. addStudentRecord");
            System.out.println("2. seeStudentRecord");
            System.out.println("3. UpdatestudentRecord");
            System.out.println("4. DeletestudentRecord");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            click = sc.nextInt();

            switch (click) {
                case 1: 
                	addStudentRecord(); 
                	break;
                case 2:
                	seeStudentRecord(); 
                	break;
                case 3: 
                	UpdatestudentRecord(); 
                	break;
                case 4: 
                	DeletestudentRecord(); 
                	break;
                case 5: 
                	System.out.println("Exit program"); 
                	break;
                default: 
                	System.out.println("Oops!Invalid choice\n");
            }
        } while (click != 5);

        
}
}

