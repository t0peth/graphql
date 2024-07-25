# GraphQL Server

GraphQL Server is a simple spring boot project for read data from a Postgre database

### Techstack
- Java: 17
- Maven: 3.9.8
- Spring boot: 3.3.2

## Installation

Use [Maven](https://maven.apache.org/download.cgi) to install the project.

```maven
mvn clean install
```
## Test

After running it successfully use the following url to test the project.
```server
http://localhost:8080/graphiql?path=/graphql
```
With the query:
```query
query employeeDetails {
  empInfoById(id: "<your-emp-id>") {
    id
    scale
    salary
    employee {
      id
      name
      email
    }
  }
}
```
### Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[Spicy Coders B.V.](https://spicycoders.nl/)
