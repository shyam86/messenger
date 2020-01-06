package com.shyam.messenger.database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shyam.messenger.model.Message;
import com.shyam.messenger.model.Profile;

public class DatabaseClass {

	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profile= new HashMap<>();	
	
	
	public static Map<Long, Message> getAllMessages(){
		
		return messages;
	}

	public static Map<String, Profile> getAllProfiles(){
		
		return profile;
	}
}
