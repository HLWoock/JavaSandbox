package de.oose.webservice.soap;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.imageio.ImageIO;
import javax.xml.rpc.ServiceException;

import de.oose.webservice.soap.service.sky.ImgCutoutLocator;
import de.oose.webservice.soap.service.sky.ImgCutoutSoap;

//http://casjobs.sdss.org/dr7/en/tools/chart/navi.asp
public class MySky {
	public static void main(String[] args) throws ServiceException, RemoteException {
		
		try {
			ImgCutoutLocator service = new ImgCutoutLocator();
			ImgCutoutSoap ImgCutoutSoap = service.getImgCutoutSoap();

			double ra    = 19.71425;
			double dec   = -0.9873;
			double scale = 0.8861;
			int    width = 800;
			int    hight = 800;
			String opt   = "G"; // L P O I T B F Q M
			byte[] imageInByte = ImgCutoutSoap.getJpeg(ra, dec, scale, width, hight, opt);
		
			final BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imageInByte));
 
			ImageIO.write(bufferedImage, "jpg", new File("C:\\Users\\HermannW.OOSEDE\\Desktop\\stars.jpg"));
 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
