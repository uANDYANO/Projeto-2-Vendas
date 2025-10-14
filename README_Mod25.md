# 🛒 **Projeto Vendas – Back-End Java**

<div align="center">

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)
![JUnit](https://img.shields.io/badge/Test-JUnit%204-red?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

</div>

## 🚀 **Descrição**

O **Projeto Vendas** foi desenvolvido como exercício integrador do **Módulo 25** do curso de **Back-End Java**, reunindo os principais conceitos estudados em módulos anteriores.

O sistema simula a **camada de backend de um sistema de vendas**, aplicando boas práticas de programação orientada a objetos, como:
- Uso de **interfaces e polimorfismo**
- Implementação do **padrão DAO (Data Access Object)**
- Criação de **camada de serviço (`Service`)**
- Utilização de **testes unitários com JUnit**

---

## 🧩 **Estrutura do Projeto**

```
src/
├── dao/
│   ├── IProdutoDao.java           # Interface de acesso a dados
│   ├── ProdutoDao.java            # Implementação principal do DAO
│   └── mocks/
│       └── ProdutoDaoMock.java    # Mock usado para testes unitários
│
├── domain/
│   └── Produto.java               # Classe de domínio que representa o produto
│
├── service/
│   ├── IProdutoService.java       # Interface da camada de serviço
│   └── ProdutoService.java        # Lógica de negócios da aplicação
│
└── test/
    └── ProdutoServiceTest.java    # Testes automatizados (JUnit 4)
```

> 🧱 *A estrutura acima pode variar conforme os nomes de classes utilizados no projeto, mas segue a mesma organização lógica do padrão DAO/Service.*

---

## ⚙️ **Funcionalidades Principais**

| Camada | Método | Descrição |
|--------|---------|-----------|
| **DAO** | `salvar()` | Persiste um produto no sistema |
| | `buscar()` | Localiza produto por ID ou nome |
| | `atualizar()` | Atualiza dados de um produto existente |
| | `excluir()` | Remove um produto cadastrado |
| **Service** | Encapsula as regras de negócio e chama o DAO |
| **Testes** | Valida comportamento com Mock e DAO real |

---

## 🧪 **Testes Unitários**

A classe de testes (`ProdutoServiceTest`) utiliza **JUnit 4** para validar os métodos principais do serviço.

Foram testados os seguintes cenários:
- Inserção de produto com sucesso  
- Atualização e exclusão de produtos  
- Busca por identificador  
- Validação de exceções e comportamentos incorretos  

---

## 🧰 **Tecnologias Utilizadas**

| Tecnologia | Função |
|-------------|--------|
| ☕ **Java 17** | Linguagem principal |
| 🧩 **DAO Pattern** | Abstração da persistência de dados |
| 🧠 **Service Layer** | Camada de lógica de negócio |
| 🧪 **JUnit 4** | Testes unitários automatizados |

---

## 🧭 **Como Executar**

1. **Pré-requisitos:**
   - JDK 17+
   - IDE Java (IntelliJ, Eclipse ou NetBeans)
   - Biblioteca **JUnit 4**

2. **Passos:**
   - Abra o projeto na IDE.
   - Navegue até `src/test/.../ProdutoServiceTest.java`.
   - Clique com o botão direito → **Run 'ProdutoServiceTest'**.
   - Todos os testes devem ficar ✅ **verdes**.

---

## ✍️ **Autor**

Desenvolvido por **Anderson Salviano**  
📧 *andyanodev@gmail.com*  
💼 *Módulo 25 - Curso Back-End Java*

---

## 📄 **Licença**

Projeto desenvolvido exclusivamente para fins **educacionais** como parte do curso de **Back-End Java**.

---

<div align="center">

⭐ *“A prática constante transforma conhecimento em domínio.”*

</div>
