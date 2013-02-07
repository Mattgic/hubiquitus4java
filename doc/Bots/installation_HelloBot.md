## How to run HelloBot

You need to:
 * [install HubotSDK](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/HubotSDK/installation_HubotSDK.md)
 * fill the file _config.txt_
    - the _config.txt_ would look like :
    
```js
      
{
	"type" : "com.mycompany.WordCount",
	"actor" : "urn:localhost:u1", // the login to connect
	"pwd" : "urn:localhost:u1", // the password to connect
	"hserver" : "http://localhost:8080", // the server url you connect to
	"adapters" : [
			{
  				"actor" : "urn:localhost:testChannel" // the channel urn you want to subscribe to
			}
		]
}
```

 * install the jar included in pom.xml
   - Windows with intellij :
	Tool Button(on right side) : Maven Project -> HelloBot -> Lifecycle -> install
   - Linux : 
  	 1. Go to hubiquitus4java/Bots/HelloBot in terminal
  	 2. Type "mvn clean install"
 * run the project
 * Start TestClient (Examples/TestClient), a simple interface for Java hAPI (problem with payload format with Js hAPI)
 * In the TestClient interface, specify a different username from HelloBot (for example urn:localhost:u2), and copy username into password. 
 * fill "Actor" field with HelloBot JID (default : urn:localhost:u1)
 * Any message sent my TestClient such as "Azerty" will be answered by Bot with "Hello Azerty".
