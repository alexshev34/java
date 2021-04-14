import java.util.ArrayList;
import java.util.Collections;

public class Homework1 {
	
	

	public static void main(String[] args) {
		String[] car = new String[] {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
		
		ArrayList<String> car_sort1 = new ArrayList<String>(); // ��������������� ������ � �������� � ���������� �����������
		ArrayList<String> car_sort2 = new ArrayList<String>(); // ��������������� ������ � ���. ���������� � ���������� �����������
		
		ArrayList<String> run_class1 = new ArrayList<String>(); // ������ ������ 1
		ArrayList<String> run_class2 = new ArrayList<String>(); 
		ArrayList<String> run_class3 = new ArrayList<String>();
		ArrayList<String> run_class4 = new ArrayList<String>();
		
		ArrayList<String> gsm_general = new ArrayList<String>(); // ����� ������ �������
		
		int run_class1_sum = 0; // ������� ������ ������� ������ 1
		int run_class2_sum = 0;
		int run_class3_sum = 0;
		int run_class4_sum = 0;
		
		float general_class1_sum; // ��� ���������� ��������� ����� ������� ������ 1
		float general_class2_sum;
		float general_class3_sum;
		float general_class4_sum;
		
		float gsm_sum; // ��� ���������� ����� ����� ���
		
		ArrayList<String> car_array_c100 = new ArrayList<String>(); // ��� ���������� ����������� � ����� c100
		ArrayList<Double> car_class1_cost = new ArrayList<Double>(); // ��� ����������� �� ���������� �������� ��� ������ 1
		
		ArrayList<String> car_array_c200 = new ArrayList<String>();
		ArrayList<Double> car_class2_cost = new ArrayList<Double>();
		
		ArrayList<String> car_array_c300 = new ArrayList<String>();
		ArrayList<Double> car_class3_cost = new ArrayList<Double>();
		
		ArrayList<String> car_array_c400 = new ArrayList<String>();
		ArrayList<Double> car_class4_cost = new ArrayList<Double>();
		
		ArrayList<String> general_car_array = new ArrayList<String>(); // ��� ����������� ����� ����
		
		ArrayList<Double> general_car_cost = new ArrayList<Double>(); // ��� ����������� � �����
		
		ArrayList<Integer> car_mileage = new ArrayList<Integer>(); // ��������� ������ � ��������
		ArrayList<Integer> car_argument = new ArrayList<Integer>(); // ��������� ������ � ���. ����������
		
		ArrayList<Float> test1 = new ArrayList<Float>();
		
		String type_auto_max = null; // ��� ���������� ���� � ���������� ���������� ��������
		String type_auto_min = null; // ��� ���������� ���� � ���������� ���������� ��������
		String param;
		 
		int max_cost;
		int min_cost;
		
		//��������� ������ ����
		for(int i = 0; i < car.length; i++) {
			if(car[i].substring(0,4).equals("C100")) {
				run_class1.add(car[i].split("-")[1]);
				gsm_general.add(car[i].split("-")[1]);
				
				car_class1_cost.add(Integer.valueOf(car[i].split("-")[1]) * 0.125 * 100 * 0.1 * 4.61);
				car_array_c100.add(car[i]);
				
			}
			else if(car[i].substring(0,4).equals("C200")) {
				run_class2.add(car[i].split("-")[1]);
				gsm_general.add(car[i].split("-")[1]);
				
				car_class2_cost.add(Integer.valueOf(car[i].split("-")[1]) * 0.12 * 100 * 0.1 * 4.89);
				car_array_c200.add(car[i]);
			}
			else if(car[i].substring(0,4).equals("C300")) {
				run_class3.add(car[i].split("-")[1]);
				gsm_general.add(car[i].split("-")[1]);
				
				car_class3_cost.add(Integer.valueOf(car[i].split("-")[1]) * 0.115 * 100 * 0.1 * 4.75);
				car_array_c300.add(car[i]);
			}
			else if(car[i].substring(0,4).equals("C400")) {
				run_class4.add(car[i].split("-")[1]);
				gsm_general.add(car[i].split("-")[1]);
				
				car_class4_cost.add(Integer.valueOf(car[i].split("-")[1]) * 0.2 * 100 * 0.1 * 4.89);
				car_array_c400.add(car[i]);
			}
		}
		// ������� ����� ������� ������� ������, ������� ������� �� ������ ����� � ����� ��������� ��������
		for(int i = 0; i < run_class1.size(); i++) {
			run_class1_sum = run_class1_sum + Integer.valueOf(run_class1.get(i)); // ����� ������� ������ 1
		}
		for(int i = 0; i < run_class2.size(); i++) {
			run_class2_sum = run_class2_sum + Integer.valueOf(run_class2.get(i));
		}
		for(int i = 0; i < run_class3.size(); i++) {
			run_class3_sum = run_class3_sum + Integer.valueOf(run_class3.get(i));
		}
		for(int i = 0; i < run_class4.size(); i++) {
			run_class4_sum = run_class4_sum + Integer.valueOf(run_class4.get(i));
		}
		
		general_class1_sum = (float) (run_class1_sum * 0.125 * 100 * 0.1 * 4.61); // ��������� �������� �� ����� 1
		general_class2_sum = (float) (run_class2_sum * 0.12 * 100 * 0.1 * 4.89);
		general_class3_sum = (float) (run_class3_sum * 0.115 * 100 * 0.1 * 4.75);
		general_class4_sum = (float) (run_class4_sum * 0.2 * 100 * 0.1 * 4.89);
		
		gsm_sum = general_class1_sum + general_class2_sum + general_class3_sum + general_class4_sum;
		
		
		test1.add(general_class1_sum);
		test1.add(general_class2_sum);
		test1.add(general_class3_sum);
		test1.add(general_class4_sum);
		
		float maximal = Collections.max(test1);
		float minimal = Collections.min(test1);
		
		for(int i = 0; i < test1.size(); i++) {
			if(test1.get(i) == maximal) {
				if(i == 0) {
					type_auto_max = "C100";
				}
				else if(i == 1) {
					type_auto_max = "C200";
				}
				else if(i == 2) {
					type_auto_max = "C300";
				}
				else {
					type_auto_max = "C400";
				}
			}
		}
		
		for(int i = 0; i < test1.size(); i++) {
			if(test1.get(i) == minimal) {
				if(i == 0) {
					type_auto_min = "C100";
				}
				else if(i == 1) {
					type_auto_min = "C200";
				}
				else if(i == 2) {
					type_auto_min = "C300";
				}
				else {
					type_auto_min = "C400";
				}
			}
		}	
		// ��������� � ����� ������ 
//		general_car_array.addAll(car_array_c100);
//		general_car_array.addAll(car_array_c200);
//		general_car_array.addAll(car_array_c300);
//		general_car_array.addAll(car_array_c400);
//		
//		general_car_cost.addAll(car_class1_cost);
//		general_car_cost.addAll(car_class2_cost);
//		general_car_cost.addAll(car_class3_cost);
//		general_car_cost.addAll(car_class4_cost);
		
		// ������� ���������� ����� ������� ���������� � ���������� ���������
//		max_cost = general_car_cost.indexOf(Collections.max(general_car_cost));
//		min_cost = general_car_cost.indexOf(Collections.min(general_car_cost));
		// ������� ���� ���� ������� ���������� ��������� ��������
//		type_auto_max = general_car_array.get(max_cost);
//		type_auto_min = general_car_array.get(min_cost);
		
		// ������� ����� ������ ���� ���� � ���������� ������
		for(int i = 0; i < car.length; i++) {
			car_mileage.add(Integer.valueOf(car[i].split("-")[1]));
		}
		
		// ������� ���. �������� ���� ���� � ��������� ������ ���� ��� ��� �� ������� 0
        for (int i = 0; i < car.length; i++) {
            param = car[i].split("-").length == 3 ? car[i].split("-")[2] : "0";
            car_argument.add(Integer.parseInt(param));
        }
        
        // ������� �� ������� ��� �������� ��� ���������� ���������� �� �������
        for(int i = 0; i < car.length; i++) {
        	car_sort1.add(car[i]);
        }
        // ������� �� ������� ��� �������� ��� ���������� ���������� �� ���. ���������
        for(int i = 0; i < car.length; i++) {
        	car_sort2.add(car[i]);
        }
        // ������ �������� �� ����� �������� ��� ���. ���������
        for(int i = 0; i < car_argument.size(); i++) {
        	if(car_argument.get(i) == 0) {
        		car_argument.remove(i);
        		car_sort2.remove(i);
        	}
        }
        // �������� ���������� �� ������� ��������� ������� "��������"
        for(int j = car_mileage.size() - 1; j > 0; j--) {
        	for (int i = 0; i < j; i++) {
        		if(car_mileage.get(i) > car_mileage.get(i+1)) {
        			int temp = car_mileage.get(i);
        			String temp2 = car_sort1.get(i);
        			car_mileage.set(i, car_mileage.get(i+1));
        			car_mileage.set(i+1, temp);
        			
        			car_sort1.set(i, car_sort1.get(i+1));
        			car_sort1.set(i+1, temp2);
        		}
        	}
        }
        System.out.println("���������� �� �������");
        for(int i = 0; i < car_sort1.size(); i++) {
        	if(car_sort1.get(i).split("-").length == 3) {
        		System.out.println("��� ����: " + car_sort1.get(i).substring(0,4) + " �����: " + car_sort1.get(i).substring(5,6) + " ������: " + car_mileage.get(i) + " ���. ��������: " + car_sort1.get(i).split("-")[2]);
        	}
        	else {
        		System.out.println("��� ����: " + car_sort1.get(i).substring(0,4) + " �����: " + car_sort1.get(i).substring(5,6) + " ������: " + car_mileage.get(i) + " ���. ��������: -");
        	}
        }
     // �������� ���������� �� ���. ��������� 
        for(int j = car_argument.size() - 1; j > 0; j--) {
        	for(int i = 0; i < j; i++) {
        		if (car_argument.get(i) > car_argument.get(i+1)) {
        			int temp3 = car_argument.get(i);
        			String temp4 = car_sort2.get(i);
        			car_argument.set(i, car_argument.get(i+1));
        			car_argument.set(i+1, temp3);
        			
        			car_sort2.set(i, car_sort2.get(i+1));
        			car_sort2.set(i+1, temp4);
        		}
        	}
        }
        System.out.println("���������� �� ���. ���������");
        for(int i = 0; i < car_sort2.size(); i++) {
        	if(car_sort2.get(i).split("-").length == 3) {
        		System.out.println("��� ����: " + car_sort2.get(i).substring(0,4) + " �����: " + car_sort2.get(i).substring(5,6) + " ������: " + car_mileage.get(i) + " ���. ��������: " + car_sort2.get(i).split("-")[2]);
        	}
        }
        
        
		System.out.println("��������� �������� �� �����1: " + general_class1_sum + " �");
		System.out.println("��������� �������� �� �����1: " + general_class2_sum + " �");
		System.out.println("��������� �������� �� �����1: " + general_class3_sum + " �");
		System.out.println("��������� �������� �� �����1: " + general_class4_sum + " �");
		System.out.println("����� ��������� �������� ���: " + gsm_sum + " �");
		System.out.println("��� ���� ������� ���������� ��������� ��������: " + type_auto_max);
		System.out.println("��� ���� ������� ���������� ��������� ��������: " + type_auto_min);
	}
}
