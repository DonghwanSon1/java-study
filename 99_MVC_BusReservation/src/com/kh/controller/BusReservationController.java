package com.kh.controller;

import java.util.ArrayList;
import java.util.Arrays;

import com.kh.model.vo.Bus;



public class BusReservationController {
	
	private ArrayList<Bus> myBusList = new ArrayList<>();
	private ArrayList<Bus> busList = new ArrayList<>();
	{
		busList.add(new Bus("09:00", 1234, "�Ϲ�", "����"));
		busList.add(new Bus("09:30", 5678, "���", "����"));
		busList.add(new Bus("10:00", 9101, "�����̾�", "�λ�"));
		busList.add(new Bus("12:00", 1121, "�Ϲ�", "�λ�"));
		busList.add(new Bus("12:30", 3141, "���", "����"));
		busList.add(new Bus("13:00", 5161, "�����̾�", "����"));
		busList.add(new Bus("15:00", 7181, "�Ϲ�", "����"));
		busList.add(new Bus("15:30", 9202, "���", "�λ�"));
		busList.add(new Bus("16:00", 1222, "�����̾�", "����"));
		busList.add(new Bus("18:00", 3242, "�Ϲ�", "����"));
		busList.add(new Bus("18:30", 5262, "���", "����"));
		busList.add(new Bus("19:00", 7282, "�����̾�", "�λ�"));
		busList.add(new Bus("22:00", 9303, "�����̾�", "����"));
		
	}
	
	
public ArrayList<Bus> selectList(){
		
		return busList;
	}
	
	
public ArrayList<Bus> searchBus(String location) {
	ArrayList<Bus> serched = new ArrayList<>();
	
	for(int i = 0; i < busList.size(); i++) {
		if(busList.get(i).getLocation().contains(location)) {
			serched.add(busList.get(i));
		}
	}
	return serched;
	
}	
	 	
	public int bookBus(String location, String busHour) {
		int result = 0;
		
		for(int i = 0; i < busList.size(); i++) {
			if(busList.get(i).getLocation().contains(location) && busList.get(i).getBusHour().contains(busHour)) {
				myBusList.add(busList.get(i));
				result++;
			}
		}
		return result;
		
	}
	
	
	public int deleteBus(int busNum) {
		int result = 0;
		for(int i = 0; i < myBusList.size(); i++) {
			if(myBusList.get(i).getBusNum() == busNum) {
				myBusList.remove(i);
				result++;
			}
		}
		return result;
	}
	
	
	
	public int updateBus(String location, String busHour, String updateLocation, String updateBusHour) {
	int result = 0;
	for(int i = 0; i < myBusList.size(); i++) {
		if(myBusList.get(i).getLocation().contains(location) && myBusList.get(i).getBusHour().contains(busHour)) {
			for(int j = 0; j < busList.size(); j++) {
				if(busList.get(j).getLocation().contains(updateLocation) && busList.get(j).getBusHour().contains(updateBusHour)) {
					myBusList.remove(i);
					myBusList.add(busList.get(j));
					result++;
				}
			}
			
		}	
	}
	return result;
	}
	
	
	
	
	
	public ArrayList<Bus> myBusList(){
		return myBusList;
	}
	
	
	
	
	
	

}