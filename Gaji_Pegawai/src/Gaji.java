//Menggunakan extend untuk pewarisan Polymorphisme dari superclass ke subclass(anak)
public class Gaji extends Pegawai
{
	private double salary;
	public Gaji(String name, String address, int number, double salary) {
		super(name, address, number);
		getsalary(salary);
	}
	public void mailCheck() {
		//Pada method ini terjadi overridding dikarenakan memiliki nama yang sama dengan method yang ada pada super class
		System.out.println("Memeriksa kelas gaji dalam surat");
		System.out.println("surat tertuju untuk" + getName()+ " dengan gaji " + salary );
	}
		public double getsalary() {	
		return salary;
	}
		public void getsalary(double newSalary) {
			if(newSalary >= 0.0) {
				salary = newSalary;
			}
		}
		public double computePay() {
			System.out.println("Menghitung pembayaran gaji untuk " + getName());
			return salary/52;
		}
}
