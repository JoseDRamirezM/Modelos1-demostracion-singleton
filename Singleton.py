# coding=utf-8
class Singleton(object):

    __instance = None
    tipo = None

    def __str__(self):
        return self.tipo

    def __new__(cls):
        if Singleton.__instance is None:
            Singleton.__instance = object.__new__(cls)
        return Singleton.__instance

humano = Singleton()
humano.tipo = "Humano"
print(humano)
animal = Singleton()
animal.tipo = "Animal"
print(animal)

print(humano)
print(animal)