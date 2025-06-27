# 📘 Guia Básico — Kotlin

## 🚀 Sobre Kotlin

Kotlin é uma linguagem de programação moderna e concisa, criada pela JetBrains, que roda na **JVM (Java Virtual Machine)** e é totalmente interoperável com Java. É usada tanto para desenvolvimento backend (com frameworks como Spring) quanto para desenvolvimento Android e aplicações multiplataforma (Kotlin Multiplatform).

---

## ✨ Principais características da linguagem Kotlin

### ✅ Declaração de variáveis

Kotlin possui inferência de tipo, ou seja, você pode declarar uma variável sem especificar o tipo se já atribuir um valor:

```kotlin
val nome = "Notebook"   // Inferido como String (imutável)
var preco = 2500.0      // Inferido como Double (mutável)
```

* `val` → cria uma variável **imutável** (similar a `final` no Java).
* `var` → cria uma variável **mutável**, ou seja, o valor pode ser alterado.

Também é possível declarar o tipo explicitamente:

```kotlin
val nome: String = "Notebook"
var preco: Double = 2500.0
```

---

### ✅ Classes e propriedades

No Kotlin, a declaração de classes é muito mais enxuta do que em Java. O construtor primário pode ser declarado diretamente na definição da classe:

```kotlin
class Produto(
    val nome: String,      // só getter
    var preco: Double,     // getter e setter automáticos
    var quantidade: Int
)
```

➡ Getters e setters são gerados automaticamente. Você acessa as propriedades diretamente, sem precisar de métodos como `getNome()` ou `setPreco()`:

```kotlin
println(produto.nome)       // chama o getter
produto.preco = 1999.99     // chama o setter
```

Também é possível personalizar getters e setters:

```kotlin
var nome: String = ""
    get() = field.uppercase()  // sempre retorna o nome em maiúsculas
    set(value) {
        field = value.trim()   // armazena o nome sem espaços extras
    }
```

---

### ✅ Funções

Funções em Kotlin são diretas e concisas:

```kotlin
fun somar(a: Int, b: Int): Int {
    return a + b
}
```

Ou, de forma mais compacta:

```kotlin
fun somar(a: Int, b: Int) = a + b
```

---

### ✅ Controle de fluxo

Kotlin oferece formas modernas de controle de fluxo.

#### `if-else`:

```kotlin
val maior = if (a > b) a else b
```

#### `when` (equivalente ao `switch` do Java, mas mais poderoso):

```kotlin
val desconto = when {
    quantidade <= 10 -> 0.0
    quantidade in 11..20 -> 0.10
    quantidade in 21..50 -> 0.20
    else -> 0.25
}
```

---

### ✅ Inferência de tipo e legibilidade

Kotlin favorece um código mais **limpo e legível**, reduzindo código repetitivo (boilerplate) e melhorando a clareza. O compilador entende os tipos automaticamente na maioria das situações.

---

### ✅ Pacotes e organização

Em Kotlin, você pode declarar o pacote do arquivo no topo, como no Java:

```kotlin
package com.seuprojeto
```

A estrutura de pastas no projeto deve refletir o nome do pacote para manter a organização.

---

### ✅ Interoperabilidade com Java

Kotlin pode utilizar bibliotecas Java normalmente. Você pode misturar arquivos Kotlin e Java no mesmo projeto, o que facilita a migração ou integração com sistemas existentes.

---

## 💡 Por que usar Kotlin?

* ✅ Código mais conciso e seguro contra `NullPointerException` (graças ao sistema de tipos nulos).
* ✅ Ferramentas modernas como `when`, `data class`, `extension functions`, `coroutines`, entre outras.
* ✅ Total compatibilidade com Java.
* ✅ Suporte oficial no Android.

---

> Este README serve como guia introdutório para uso da linguagem Kotlin em exercícios diversos.
