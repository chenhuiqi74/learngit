
public interface IParking {
	// ��ӡ������
    public void print();
    
    // ����Ƿ��� carType ��Ӧ��ͣ��λ
    // ���û�пճ�λ���뷵�� false �����򽫸ó�ͣ�복λ������ true
    public boolean addCar(int carType);
    
    
    // ��������������Ĳ�������ʽ�������ĵ�����
     public static IParams parse() throws Exception{
		return null;
 	
   };

}
