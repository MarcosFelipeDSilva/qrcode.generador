# QR Code Generator

Este projeto é uma aplicação Spring Boot para gerar e fazer upload de QR Codes em um bucket S3 da AWS.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework para desenvolvimento da aplicação.
- **Maven**: Gerenciador de dependências e build.
- **Docker**: Para containerização da aplicação.
- **AWS S3**: Armazenamento dos QR Codes gerados.

## Estrutura do Projeto

- `src/main/java`: Código fonte principal.
- `src/main/resources`: Arquivos de configuração, como `application.properties`.
- `Dockerfile`: Configuração para criar a imagem Docker da aplicação.

## Configuração

### Variáveis de Ambiente

Certifique-se de configurar as seguintes variáveis de ambiente no Docker:

- `AWS_ACCESS_KEY_ID`: Chave de acesso da AWS.
- `AWS_SECRET_ACCESS_KEY`: Chave secreta da AWS.
- `AWS_REGION`: Região do bucket S3 (ex.: `sa-east-1`).
- `AWS_BUCKET_NAME`: Nome do bucket S3.

### Arquivo `application.properties`

O arquivo `application.properties` utiliza placeholders para as variáveis de ambiente:

```ini
aws.s3.bucketName=${AWS_BUCKET_NAME}
aws.s3.region=${AWS_REGION}