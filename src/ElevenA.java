// 16. Create an Employee class with fields, constructors, getters and setters.   
class ElevenA {

        private int id;
        private String name;
        private double salary; 
        public ElevenA(int id,String name,double salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
        }
        public void setId(int id){
            this.id=id;
        }
        public int getId(){
            return id;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setSal(double salary){
            this.salary=salary;
        }
        public double getSalary(){
            return salary;
        }
       


}
