# 📦 CepConsultation API

API REST desenvolvida em **Spring Boot** para consulta automatizada de endereços via CEP, integrada diretamente ao serviço **ViaCEP**.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 4.0.0
- Maven
- Spring Web

---

## ⚙️ Como Executar o Projeto

### ✔️ Pré-requisitos
Certifique-se de ter o Java 21 instalado em sua máquina.

### ▶️ Passos

1. Clone o repositório:
   git clone https://github.com/SEU-USUARIO/CepConsultation.git
   cd CepConsultation

2. Execute a aplicação via terminal:

   Linux / macOS:
   ./mvnw spring-boot:run

   Windows:
   .\mvnw.cmd spring-boot:run

A API estará rodando em: http://localhost:8080

---

## 📡 Endpoints da API

### 🔍 Consultar CEP

Retorna os dados detalhados do endereço correspondente ao CEP informado.

- Método: GET
- URL: /CepConsultation/{cep}

Exemplo de requisição:
GET http://localhost:8080/CepConsultation/01001000

Exemplo de resposta:
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}

---

## 📂 Estrutura do Projeto

src/main/java/com/seuprojeto/cepconsultation
- controller
  - CepConsultationController.java (Gerencia as requisições HTTP)
- dto
  - CepResultDto.java (Record que mapeia a resposta JSON do ViaCEP)
- CepConsultationApplication.java (Classe principal de inicialização)

---

## 🛠 Melhorias Recentes

- Correção de erro 500: Implementação do protocolo HTTPS na URL de chamada do ViaCEP para garantir segurança e estabilidade.

---

## 📝 Licença

Este projeto é de livre uso para fins de estudo e aprendizado.
