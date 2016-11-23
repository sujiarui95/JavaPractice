public class Emp{
    private int empNo;
    private String empName;
    private String empJob;
    private double empSala;
    private double empComm;

    public Emp(){
	System.out.println("This is Emp Contructor!");
    }

    public void setEmpNo(int empNo){
	this.empNo = empNo;
    }

    public void setEmpName(String empName){
	this.empName = empName;
    }
    public void setEmpJob(String empJob){
	this.empJob = empJob;
    }
    public void setEmpSala(double empSala){
	this.empSala = empSala;
    }
    public void setEmpComm(double empComm){
	this.empComm = empComm;
    }

    public int getEmpNo(){
	return empNo;
    }
    public String getEmpName(){
	return empName;
    }
    public String getEmpJob(){
	return empJob;
    }
    public double getEmpSala(){
	return empSala;
    }
    public double getEmpComm(){
	return empComm;
    }
    
    public static void main(String[] args){
	Emp emp = new Emp();
	emp.setEmpJob("Java Programer");
	System.out.println(emp.getEmpJob());
    }

}
