• Upcasting
    • Casting da subclasse para superclasse
    • Uso comum: polimorfismo
• Downcasting
    • Casting da superclasse para subclasse
    • Palavra instanceof
    • Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
Exemplo: https://github.com/acenelio/inheritance2-java

• Classes abstratas
    • São classes que não podem ser instanciadas
    • É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata

• Métodos abstratos
    • São métodos que não possuem implementação.
    • Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação.
    • Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.
    • Notação UML: itálico