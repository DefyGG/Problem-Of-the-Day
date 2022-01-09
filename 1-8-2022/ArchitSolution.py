import math
import sympy as sp


def get_taylor(is_sine: bool, a: int, b: int, degree: int, point: int) -> str:
    final = 0
    x = sp.Symbol('x')
    func = a * sp.sin(b * x) if is_sine else a * sp.cos(b * x)
    for i in range(degree + 1):
        final += func.subs({x: point}) * (x - point) ** i / math.factorial(i)
        func = sp.diff(func)

    return str(final).replace("**", "^")


def main() -> None:
    print("a*sin(b*x) // a*cos(b*x):")
    a = int(input("\ta = "))
    b = int(input("\tb = "))
    degree = int(input("\tWhat degree of polynomial would you like to use? - "))
    point = int(input("\tAround what x-value are you trying to fit the polynomial? - "))
    curve = input("\tAre you attempting to fit a sine or cosine curve? - ")
    if curve in ("cos", "cosine", "c"):
        is_sine = False
    elif curve in ("sin", "sine", "s"):
        is_sine = True
    else:
        print("\nInvalid Input! Fitting Sine Curve")
        is_sine = True

    print(get_taylor(is_sine, a, b, degree, point))


if __name__ == '__main__':
    main()
