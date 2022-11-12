import math
a = float(input("Insira o valor de a "))
b = float(input("Insira o valor de b "))
c = float(input("Insira o valor de c "))
delta = math.pow(b, 2) - 4 * a * c
print("O valor de delta é "+str(delta))
if delta < 0:
    print("Não existem raízes reais")
elif delta == 0:
    x = -b / 2*a
    print("Só há uma raíz real, cujo valor é "+str(x))
else:
    x1 = (-b + math.sqrt(delta)) / 2*a
    x2 = (-b - math.sqrt(delta)) / 2*a
    print("Os valores das raízes reais são iguais à "+str(x1)+" e à "+str(x2))