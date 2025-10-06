# Levantar el docker compose

1. Moverse hasta la carpeta docker-compose/jarYDockerfile y ejecutar "docker build -t gestorpropuestas ." 
2. Volver a la carpeta docker-compose y ejecutar "docker compose up -d "

# Comandos CURL
## Antes de empezar, los espacios en blanco se hacen %20. Ej:"Pilsen%20Rock"

## Comandos CURL Propuesta
### Para conseguir todas las propuestas
curl -u admin:1234 -X GET http://localhost:60001/api/v1/propuestas
### Para conseguir una propuesta en especifico
curl -u admin:1234 -X GET http://localhost:60001/api/v1/propuestas/{titulo}
### Para ingresar una propuesta
curl -u admin:1234 -X POST http://localhost:60001/api/v1/propuestas \
-H "Content-Type: application/json" \
-d '{
"titulo": " ",
"descripcion": " ",
"imagen": " ",
"lugar": " ",
"fecha": " ",
"precioEntrada": ,
"montoAReunir": ,
"fechaPublicacion": " ",
"categoria": " ",
"historialEstados": " ",
"proponente": " ",
"retornos": " "
}'
### Para actualizar un propuesta
curl -u admin:1234 -X PUT http://localhost:60001/api/v1/propuestas/{titulo} \
-H "Content-Type: application/json" \
-d '{
"titulo": " ",
"descripcion": " ",
"imagen": " ",
"lugar": " ",
"fecha": " ",
"precioEntrada": " ",
"montoAReunir": " ",
"fechaPublicacion": " ",
"categoria": " ",
"historialEstados": " ",
"proponente": {
"nickname": " " 
},
"retornos": " "
}'
### Para eliminar una propuesta
curl -u admin:1234 -X DELETE http://localhost:60001/api/v1/propuestas/{titulo}

## Comandos CURL Colaboraciones
### Para listar colaboraciones de una propuesta
curl -u admin:1234 -X GET http://localhost:60001/api/v1/propuestas/{titulo}/colaboraciones
### Para registrar una colaboracion
curl -u admin:1234 -X POST http://localhost:60001/api/v1/propuestas/Nueva%20Propuesta/colaboraciones \
-H "Content-Type: application/json" \
-d '{
"monto": ,
"retorno": " ",
"fecha": "2025-10-05T20:00:00",
"colaborador": {
"nickname": " "
}
}'
### Para listar colaboraciones de un colaborador
curl -u admin:1234 -X GET "http://localhost:60001/api/v1/colaboraciones?colaboradorNick={nickname}"
### Para eliminar colaboraciones por id
curl -u admin:1234 -X DELETE http://localhost:60001/api/v1/colaboraciones/{id}
### Para conseguir el total de todas las colaboraciones
curl -u admin:1234 -X GET http://localhost:60001/api/v1/colaboraciones/total
### Para conseguir el total de una propuesta especifica
curl -u admin:1234 -X GET "http://localhost:60001/api/v1/colaboraciones/total?propuestaTitulo={titulo}"