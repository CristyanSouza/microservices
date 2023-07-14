<h1 align="center"> 💻 Projeto Microservices </h1>

<p>Projeto simples criado para colocar em prática o aprendizado de arquitetura de microservicos em Java, utilizando Eureka como serviço de discovery e Zuul como API gateway
</p>

<h1 align="center"> 🛠 Tecnologias utilizadas: </h1>

- Java
- Eureka
- Zuul
- Spring MVC
- Spring Data JPA
- Spring Security
- Spring Cloud
- H2 Database

<h1 align="center"> 🎨 Arquitetura do projeto </h1>

O projeto consiste em um sistema de pagamentos, onde um microserviço possui os trabalhadores "workers" e o outro microserviço de pagamento "payments" utiliza informações dos trabalhadores para processar os dados para retorno.
Ambos os serviços, assim como o serviço de autenticação e autorização e o API gateway, serão registrados em um servidor Eureka.

![image](https://github.com/CristyanSouza/microservices/assets/104795862/52bc9de4-7326-41f9-a65a-c36f1cd53e02)


<h1 align="center"> 🚀 Como executar o projeto </h1>

Para utilizar o projeto primeiramente é preciso rodar os serviços que possuem porta fixa, que são:<br>
-hr-config-server (serviço de configurações centralizadas apontando para o repositório https://github.com/CristyanSouza/ms-course-configs)<br>
-hr-eureka-server (servidor discovery)<br>

Após isso já será possível rodar os demais projetos que irão se registrar no servidor Eureka.

<h1 align="center"> 🧭 Utilizando a aplicação </h1>

Para se autenticar será preciso enviar uma requisição para o seguinte endpoint com os parâmetros: <br>

POST http://localhost:8765/hr-oauth/oauth/token <br>
Header: Content-Type application/x-www-form-urlencoded <br>
Basic Auth: <br>
  -Username - myappname123 <br>
  -Password - myappsecret123 <br>

Form:

![Formulario de login](/assets/form.png)

Para login podem ser utilizados os e-mails op@gmail.com ou adm@gmail.com com a senha 123456

A resposta da requisição será o token JWT para enviar no header de cada requisição no padrão "Bearer + token", os endpoints a serem acessados são os seguintes:
<br>
GET http://localhost:8765/hr-worker/workers - Para obter todos os workers<br>
GET http://localhost:8765/hr-worker/workers/{id} - Para obter um trabalhador específico<br>

GET http://localhost:8765/hr-payroll/payments/{workerId}/days/{days} - Receber o pagamento do colaborador com base na quantidade de dias 

O resultado dos endpoints será o seguinte:

![Worker](/assets/worker.png)
![Paymens](/assets/payments.png)


<h1 align="center"> Considerações finais </h1>
Trata-se de um projeto simples, porém extremamente enriquecedor, que me proporcionou um amplo conhecimento, especialmente sobre o conceito de microserviços e alguns componentes essenciais do Spring Cloud, como Eureka, Zuul e Feign Client




