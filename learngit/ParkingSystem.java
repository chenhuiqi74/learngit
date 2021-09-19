import java.util.*;

public class ParkingSystem implements IParking{

	public static void main(String[] args) {
		    IParams params = IParking.parse();//ParkingSystem.parse();
	        ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
	        ArrayList<Integer> plan = params.getPlanParking();
	        for (int i = 0; i < plan.size(); i++) {
	            ps.addCar(plan.get(i));
	        }
	        ps.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addCar(int carType) {
		// TODO Auto-generated method stub
		return false;
	}
}
