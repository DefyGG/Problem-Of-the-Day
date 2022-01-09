from typing import Union

import math
import sympy as sp
from sympy.parsing.sympy_parser import parse_expr, standard_transformations, implicit_multiplication_application, \
    convert_xor, rationalize


def get_taylor(func, degree: int, point: int) -> str:
    final = 0
    x = sp.Symbol('x')

    for i in range(degree + 1):
        final += func.subs({x: point}) * (x - point) ** i / math.factorial(i)
        func = sp.diff(func)

    return str(final).replace("**", "^")


def get_input(prompt: str, is_func: bool) -> Union[sp.core.mul.Mul, int]:
    print(prompt)

    while True:
        try:
            if is_func:
                output = parse_expr(input("\t"),
                                    transformations=standard_transformations + (implicit_multiplication_application,
                                                                                convert_xor, rationalize))
                sp.diff(output)  # Ensures valid input
            else:
                output = int(input("\t"))
        except (ValueError, TypeError):
            print(f"That is not a valid {'function' if is_func else 'integer'}!  Please try again!")
            continue
        else:
            return output


def main() -> None:
    func = get_input("What function would you like to fit? (In terms of x)", True)
    degree = get_input("What degree of polynomial would you like?", False)
    point = get_input("Around which x-value would you like to fit the polynomial?", False)

    print(f"Fitted Polynomial:\n\t{get_taylor(func, degree, point)}")


if __name__ == '__main__':
    main()
