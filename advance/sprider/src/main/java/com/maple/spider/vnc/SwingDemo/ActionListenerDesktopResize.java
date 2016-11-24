package com.maple.spider.vnc.SwingDemo;

import com.maple.spider.vnc.RFBDemo.RFBDemo;
import com.maple.spider.vnc.RFBService.RFBService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.SocketException;
import java.util.Iterator;


public class ActionListenerDesktopResize implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		Iterator<RFBService> it = RFBDemo.rfbClientList.iterator();
		while (it.hasNext()) {

			RFBService rfbClient = it.next();

			if (rfbClient.incrementalFrameBufferUpdate) {

				try {

					rfbClient.sendDesktopSize();

				} catch (SocketException ex) {
					it.remove();
				} catch (IOException ex) {
					ex.printStackTrace();

					it.remove();
				}

			}
		}

	}

}
