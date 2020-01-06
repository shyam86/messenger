package com.shyam.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shyam.messenger.database.DatabaseClass;
import com.shyam.messenger.model.Profile;

public class ProfileService {

	private static Map<String, Profile> profiles = DatabaseClass.getAllProfiles();
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateMessage(Profile profile) {
		if (profile.getId() <= 0)
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;

	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);

	}

}
