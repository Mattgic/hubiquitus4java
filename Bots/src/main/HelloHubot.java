/*
 * Copyright (c) Novedia Group 2012.
 *
 *     This file is part of Hubiquitus.
 *
 *     Hubiquitus is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Hubiquitus is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Hubiquitus.  If not, see <http://www.gnu.org/licenses/>.
 */

package main;

import org.hubiquitus.hapi.hStructures.HCommand;
import org.hubiquitus.hapi.hStructures.HMessage;
import org.hubiquitus.hapi.util.HJsonDictionnary;
import org.hubiquitus.hubotsdk.Actor;
import org.json.JSONException;
import org.json.JSONObject;

public class HelloHubot extends Actor{

	public static void main(String[] args) throws Exception{
		HelloHubot hubot = new HelloHubot();
		hubot.start();
		System.out.println("ready");
	}
	
	@Override
	public void inProcessMessage(HMessage messageIncoming) {
		HMessage message = new HMessage();
		message.setChid(messageIncoming.getPublisher());
		message.setType("HJsonObj");
		JSONObject jsonObj = messageIncoming.getPayload().toJSON();
		String name = "Hello ";
		try {
			 name += jsonObj.getString("text");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		HJsonDictionnary payload = new HJsonDictionnary();
		payload.put("text", name);
		message.setPayload(payload);
		put("hubotAdapter",message);
	}
	
	public void inProcessCommand(HCommand commandIncoming) {
		put("HubotAdapter", commandIncoming);
	}

}