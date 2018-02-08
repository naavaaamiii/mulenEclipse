package org.gdg.rocky.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.gdg.rocky.messenger.model.Message;
import org.gdg.rocky.messenger.model.Profile;

import com.gdg.rocky.pojo.OrchardProgramPojo;
import com.gdg.rocky.pojo.OrchardProgramPojo;

public class DataBaseClass {
	
	private static Map<Long, Message> messages = new HashMap();
	private static Map<Long, Profile> profiles = new HashMap();
	
	private static Map<Long,OrchardProgramPojo> campusInfo  = new HashMap();
	
	public static Map<Long, Message> getMessage()
	{
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles()
	{
		return profiles;
	}
	
	public static Map<Long, OrchardProgramPojo> getInformation()
	{
		return campusInfo;
	}

}
