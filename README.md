# ➗ Metade ou Dobro em Java

Projeto simples em **Java** para praticar entrada de dados e estruturas condicionais com `if` e `else`.

## 💻 Como funciona

O programa solicita um número ao usuário e verifica o seu valor:

- Se o número for **maior que 10**, o programa calcula a **metade**.
- Caso contrário, o programa calcula o **dobro**.

## 🧪 Exemplos

Se o usuário digitar:

```text
20
```

Saída:

```text
a metade é :10.0
```

Se o usuário digitar:

```text
8
```

Saída:

```text
o dobro é :16.0
```

## 🧠 Código

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num, metade, dobro;

        System.out.println("numero");
        num = scanner.nextDouble();

        if (num > 10) {
            metade = num / 2;
            System.out.println("a metade é :" + metade);
        } else {
            dobro = num * 2;
            System.out.println("o dobro é :" + dobro);
        }
    }
}
```

## 📚 O que estou praticando

Neste exercício estou praticando:

- `Scanner`
- Variáveis do tipo `double`
- Operações matemáticas
- Estrutura `if`
- Estrutura `else`
- Comparação com `>`

Projeto desenvolvido para estudos de **Java e lógica de programação**. ☕
