# **Este é um pequeno projeto de uma API de gerenciamento de pessoas**

## Utilizei no projeto
* **Java-11**
* **Spring**
* **JPA**
* **Lombok**
* **MapStruct**
* **Heroku**

## A API está disponível no Heroku pelo link abaixo.

### [heroku.api.persons.com](https://api-persons-manager.herokuapp.com/api/v1/persons)

### Eu recomendo que você use o Postman para testar a API, ela aceita os métodos POST, GET, DELETE e PUT, tem também um método para busca por ID pelar URL. A única restrição criada é que o CPF não pode se repetir para diferentes registros!

### Este é um exemplo do Json que você pode usar para criar um Person com o POST!

```
{ 
    "firstName": "Marvin",
    "lastName": "Mendes Lopes",
    "cpf": "820.054.210-65",
    "birthDate": "1993-02-20",
    "phones": [
        {
            "type": "MOBILE",
            "number": "999123456"
        }
    ]
}
```
