from racionais import Racionais


def input_valores():
    
    a, b = map(int, input("Numerador e denominador da primeira fração: ").split())
    fracao1 = Racionais(a,b)
    c, d = map(int, input("Numerador e denominador da segunda fração: ").split())
    fracao2 = Racionais(c,d)

    res_soma = fracao1.soma(fracao2)
    print(res_soma)

if __name__ == "__main__":
    input_valores()
