## Resource Server:
Implemented Resource server using Spring boot and Oauth2 AutoConfigure.

Refer [Authorization Server](`https://github.com/jinagamvasubabu/Spring-Oauth2-Redis-AuthorizationServer-Docker`) who is responsible of creating tokens with different roles and scopes.


## Features:
* A Beautiful UI to create the clients with the details including ClientId, Client Secret(Bcrypt Password), Access token, Refresh token, ResorcesIds, Scopes and Roles.
* Tokens will be stored in Redis DB.
* MYSQL will be used to store the client credentials
* Docker compatable, just execute startup.sh to start the APP. (Simplified Start)
* Bonus Endpoint to update the ClientSecret or Password
* It has two endpoints with different scopes and different roles, refer: [Endpoints](https://github.com/jinagamvasubabu/Spring-Oauth2-Redis-ResourceServer-Docker/blob/master/src/main/java/com/vasu/ResourceServer/api/SecuredController.java)


## Sample Curl Requests:
```
curl -X GET \
  http://localhost:8083/resource/secure/read \
  -H 'Authorization: Bearer 60122134-e39c-4838-ac29-75441e9d660d' \
  -H 'Cache-Control: no-cache'
```


