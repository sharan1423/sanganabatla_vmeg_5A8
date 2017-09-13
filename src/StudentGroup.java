import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {

	}

	@Override
	public Student getStudent(int index) {
           int i;
           int a=0;
           String b=null;
           Date c=null;
           double d=0.0d;
		if(index<=0 || index>students.length)
              {
                 throw new IllegalArgumentException();
              }
             for(i=0;i<students.length;i++)
                 {
                    if(i==index)
                       {
                          a=students[i].id;
                          b=students[i].fullName;
                          c=students[i].birthDate;
                          d=students[i].avgMark;
                       }
		      }
                Student s=new Student(a,b,c,d);
                return s;
	}

	@Override
	public void setStudent(Student student, int index) {
           int a=student.id;
           String b=student.fullName;
           Date c=student.birthDate;
           double d=student.avgMark;
    if(index<=0 || index>students.length || student==null)
              {
                 throw new IllegalArgumentException();
              }
             students[index].id=a;
             students[index].fullName=b;
             students[index].birthDate=c;
             students[index].avgMark=d;
	}

	@Override
	public void addFirst(Student student) {
                 if(student==null)
                  {
                     throw new IllegalArgumentException();
                  }
		int a=student.id;
           String b=student.fullName;
           Date c=student.birthDate;
           double d=student.avgMark;
            int i;
             for(i=students.length;i>=0;i--)
                 {
                     students[i]=students[i-1];
                  }
             students[0].id=a;
             students[0].fullName=b;
             students[0].birthDate=c;
             students[0].avgMark=d;
 
	}

	@Override
	public void addLast(Student student) {
		if(student==null)
                  {
                     throw new IllegalArgumentException();
                  }
		int a=student.id;
           String b=student.fullName;
           Date c=student.birthDate;
           double d=student.avgMark;
             students[students.length].id=a;
             students[students.length].fullName=b;
             students[students.length].birthDate=c;
             students[students.length].avgMark=d;
	}

	@Override
	public void add(Student student, int index) {
		if(index<=0 || index>students.length || student==null)
                  {
                     throw new IllegalArgumentException();
                  }
            int a=student.id;
           String b=student.fullName;
           Date c=student.birthDate;
           double d=student.avgMark;
            int i;
             for(i=students.length;i>=index;i--)
                 {
                     students[i]=students[i-1];
                  }
             students[index].id=a;
             students[index].fullName=b;
             students[index].birthDate=c;
             students[index].avgMark=d;
             
	}

	@Override
	public void remove(int index) {
		if(index<=0 || index>students.length)
              {
                 throw new IllegalArgumentException();
              }
            int i;
            for(i=index;i<students.length;i++)
                {
               students[i]=students[i+1];
                }
	}

	@Override
	public void remove(Student student) {
		if(student==null)
                  {
                     throw new IllegalArgumentException();
                  }
              for(int i=0;i<students.length;i++)
			{
          			if(student.id==students[i].id)
					{
                                for(int j=i;i<students.length;i++)
                                   {
                                    students[j]=students[j+1];
                                    }
                               }
			}

	}

	@Override
	public void removeFromIndex(int index) {
         if(index<=0 || index>students.length)

              {
                 throw new IllegalArgumentException();
              }
          for(int i=index;i<students.length;i++)
			{
				students[i].id=0;
                        students[i].fullName=null;
                        students[i].birthDate=null;
                        students[i].avgMark=0.0d;
                    }
        }
		

	@Override
	public void removeFromElement(Student student) {
		if(student==null)
                  {
                     throw new IllegalArgumentException();
                  }
            for(int i=0;i<students.length;i++)
               {
                  if(student.id==students[i].id)
                      {
                         for(int j=i;j<students.length;j++)
			{
				students[j].id=0;
                        students[j].fullName=null;
                        students[j].birthDate=null;
                        students[j].avgMark=0.0d;
                    }
                  }
                }
                       
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
