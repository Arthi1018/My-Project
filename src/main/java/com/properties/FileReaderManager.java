package com.properties;

import java.io.IOException;

public class FileReaderManager {

		public ConfigurationReader getInstanceC() throws IOException {
        ConfigurationReader c=new ConfigurationReader();
        return c;
		}
		
		private FileReaderManager() {
		}
		
		public static FileReaderManager getInstanceF() {
	    FileReaderManager frm=new FileReaderManager();
	    return frm;
		}
}
