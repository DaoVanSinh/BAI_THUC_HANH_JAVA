public class Slide3Chuong4 {
    
    public class Student {
        private String fullName;
        private int age;
    
        public Student(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }
    
        // Getter và Setter
        public String getFullName() {
            return fullName;
        }
    
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        // Phương thức nhập thông tin
        public void inputInfo(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }
    
        // Phương thức hiển thị thông tin
        public void displayInfo() {
            System.out.println("Full Name: " + fullName);
            System.out.println("Age: " + age);
        }
    }
    
    }
}
