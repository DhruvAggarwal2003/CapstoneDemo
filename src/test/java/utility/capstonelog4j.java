package utility;

import org.apache.log4j.Logger;

public class capstonelog4j {
	static Logger log = Logger.getLogger(capstonelog4j.class.getName());
	public void writeLog(String msg) {
		log.info(msg);
	}


}
