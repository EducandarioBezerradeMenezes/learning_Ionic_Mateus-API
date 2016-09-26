# Learning Ionic Mateus

##API Servidora para Aplicativo Lista

Este projeto tem como objetivo, a partir da utilização do framework Spring, criar uma API, utilizando a linguagem de programação Java e a IDE Eclipse, utilizando o plug-in Spring Tool Suite, que serve uma aplicação mobile armazenando informações enviadas por essa aplicação em um banco de dados Postgresql e as enviando de volta a aplicação, esta api também armazena informações de todas as requests feitas pela aplicação também em uma base de dados PostgreSql, a comunicação com a aplicação mobile é feita a partir de mensagens JSON. Para o desenvolvimento desta aplicação foram utilizados:

    • JDK 1.8_101;

    • Eclipse JSE + Spring Tool Suite 4.6 para Windows x64;

    • Framework Spring;

    • JPA 2.1;

    • Postgresql  9.4.1210.

No desenvolvimento desta aplicação foi criada uma classe JavaApiApplication que em seu método main inicializa a API utilizando o Spring Boot , gerenciando as outras classes. Esta aplicação possui também:
	
  •	Models:

    •  Data – informações Strings que serão enviadas pela aplicação;
    
    •  Request – guarda informações que envolvem uma requisição http (Data, IP, Dispositivo, Protocolo, Método,
       Parâmetro e Resposta).

  •	Services:

    •	DataService – armazena as informações de objetos Data em uma base de dados Postgresql;
    
    •	RequestService – armazena as informações de objetos Request em uma base de dados Postgresql.

  •	Controllers:

    •	ControllerData – direciona requisições http envolvendo objetos Data para seus devidos métodos, os
		armazenando em banco de dados quando a aplicação envia uma informação (Método PUT) e os enviando
		para a aplicação (Método GET);
    
    •	ControllerRequest – redireciona requisições http envolvendo o histórico de requisições (retorna o histórico
		de requisições).