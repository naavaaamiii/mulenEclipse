package com.gdg.rocky;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			if(args.length != 1)
			{
				System.out.println("You need to pass one IP address");
			}
			else{
				String ipAddress = args[0];
				GeoIPService ipService = new GeoIPService();
				GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();        //we will use this method to get instance of GeoIPServiceSoap class
				GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
				System.out.println(geoIp.getCountryName());
			}
		}
		catch(Exception e)
		{
			
		}
		

	}

}
