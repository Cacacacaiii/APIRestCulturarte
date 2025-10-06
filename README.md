# Levantar el docker compose

1. Moverse hasta la carpeta docker-compose/jarYDockerfile y ejecutar "docker build -t gestorpropuestas ." 
2. Volver a la carpeta docker-compose y ejecutar "docker compose up -d "

# Comandos CURL

## Comando curl para conseguir todas las propuestas
curl -u admin:1234 -X GET http://localhost:8080/api/v1/propuestas
### Para conseguir una propuesta en especifico
curl -u admin:1234 -X GET http://localhost:8080/api/v1/propuestas/{titulo}

## Queso
### Con
#### Mas queso

