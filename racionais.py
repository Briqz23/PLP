#crio 2 fracoes (objetos) os quais passam pelos metodos de reducefraction e sinais
#faço operacao c eles e eles passam novamente pelo filetro do sinais e reduce fraction no retorno


import math

class Racionais:
    def __init__(self, numerador, denominador):
        self.numerador = numerador
        self.denominador = denominador
        Racionais.reduce_fraction(self)
        Racionais.sinais(self)


    @staticmethod
    def reduce_fraction(racionais):
        gcd = math.gcd(racionais.numerador, racionais.denominador)

        racionais.numerador = racionais.numerador // gcd
        racionais.denominador = racionais.denominador // gcd

    @staticmethod
    def sinais(racionais):
        if (racionais.numerador<0 and racionais.denominador<0) or (racionais.denominador<0 and racionais.numerador>0):
            racionais.numerador, racionais.denominador= racionais.numerador*(-1), racionais.denominador*(-1) 

    def multiplicacao(self, other):
        res_num = self.numerador * other.numerador
        res_den = self.denominador * other.denominador
        return Racionais(res_num, res_den)

    def divisao(self, other):
        res_num = self.numerador * other.denominador
        res_den = self.denominador * other.numerador
        return Racionais(res_num, res_den)

    def soma(self, other):
        res_num = self.numerador *other.denominador + other.numerador * self.denominador
        res_den = self.denominador * other.denominador
        return Racionais(res_num, res_den)

    def divisao(self, other):
        res_num = self.numerador * other.denominador
        res_den = self.denominador * other.numerador
        return Racionais(res_num, res_den)
        
    #python chama automaticamente 
    def __str__(self):
        return f"Fração resultante: {self.numerador}/{self.denominador}"




