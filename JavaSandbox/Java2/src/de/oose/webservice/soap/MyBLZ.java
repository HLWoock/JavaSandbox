package de.oose.webservice.soap;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import de.oose.webservice.soap.service.blz.BLZService;
import de.oose.webservice.soap.service.blz.BLZServiceLocator;
import de.oose.webservice.soap.service.blz.BLZServicePortType;
import de.oose.webservice.soap.service.blz.DetailsType;

public class MyBLZ {
	public static void main(String[] args) throws ServiceException, RemoteException {
		BLZService serv = new BLZServiceLocator();
		BLZServicePortType port = serv.getBLZServiceSOAP11port_http();
		for (int blz = 20000000; blz < 20050000; blz+=50) {
			try {
				System.out.println(blz);
				DetailsType bank = port.getBank(Integer.toString(blz));
				System.out.println(blz + " " +bank.getBezeichnung() + " " + bank.getPlz() + " " + bank.getOrt());
			} catch (AxisFault ex) {
				
			}
		}
	}
}
