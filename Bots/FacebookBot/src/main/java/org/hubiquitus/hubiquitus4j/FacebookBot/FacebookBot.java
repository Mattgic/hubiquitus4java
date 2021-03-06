/**
 Copyright (c) Novedia Group 2012.
 This file is part of Hubiquitus
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 of the Software, and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies
 or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

 You should have received a copy of the MIT License along with Hubiquitus.
 If not, see <http://opensource.org/licenses/mit-license.php>. 
 
*/


package org.hubiquitus.hubiquitus4j.FacebookBot;

import org.apache.log4j.Logger;
import org.hubiquitus.hapi.client.HClient;
import org.hubiquitus.hapi.hStructures.HMessage;
import org.hubiquitus.hubotsdk.Hubot;

/**
 * 
 * This Bot ask data to Facebook API
 * @author Adel MANI
 *
 */
public class FacebookBot extends Hubot
{

	private static Logger log = Logger.getLogger(FacebookBot.class);
	
	public static void main( String[] args )throws Exception{
		FacebookBot bot  = new FacebookBot();
		bot.start();	
	}
	@Override
	protected void init(HClient hClient) {
		super.init(hClient);
	}

	@Override
	protected void inProcessMessage(HMessage messageIncoming) {
		log.info("-[Facebook] Received message :"+messageIncoming.toString());
	}





}
