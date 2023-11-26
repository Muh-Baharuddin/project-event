# User Api Spec

## Register User

Endpoint : POST /api/auth/users/

Request Body :

```json
{
  "username": "username",
  "password": "123123",
  "name": "name"
}
```

Response Body (Success) :

```json
{
  "data": {
    "message": "Create user success"
  }
}
```

Response Body (Failed, 400) :

```json
{
  "errors": {
    "message": "username already taken, user not found, ...???"
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
  "data": {
    "id": "String UUID",
    "username": "username",
    "name": "name"
  }
}
```

Response Body (Failed, 401) :

```json
{
  "errors": {
    "message": "unauthorize"
  }
}
```
