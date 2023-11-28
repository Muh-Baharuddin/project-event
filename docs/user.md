# User Api Spec

## Register

Endpoint : POST /api/auth/register/

Request Body :

```json
{
  "email" : "example@gmail.com",
  "username" : "username",
  "password" : "password",
}
```

Response Body (Success) :

```json
{
  "data" : {
    "message": "Create user success"
  }
}
```

Response Body (Failed, 400) :

```json
{
  "errors" : {
    "message": "username already taken, user not found, ...???"
  }
}
```

## Login

Endpoint : POST /api/auth/login/

Request Body :

```json
{
  "username" : "username",
  "password" : "123123"
}
```

Response Body (Success) :

```json
{
  "data" : {
    "token" : "token"
  }
}
```

Response Body (Failed, 400) :

```json
{
  "errors" : {
    "message" : "user not found, ...???"
  }
}
```

## Get User

Endpoint : GET /api/users/

Request Header :

- X-API-TOKEN : token(Mandatory)

Response Body (Success) :

```json
{
  "data" : {
    "id" : "String UUID",
    "username" : "username",
    "name" : "name"
  }
}
```

Response Body (Failed, 401) :

```json
{
  "errors" : {
    "message" : "unauthorize"
  }
}
```
