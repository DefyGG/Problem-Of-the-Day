--[[
  This code was written by Lemon Pecan Pie on 1/11/2022.
  The license is the Pie License. Basically, you can use this code in any way you'd like, but you'd have to buy me a pie in exchange. ;)
]]

function calculate_derivative(x)
  if x == 'sin' then
    return 'cos'
  elseif x == 'cos' then
    return '-sin'
  elseif x == '-sin' then
    return '-cos'
  else
    return 'sin'
  end
end

function solve_trig(x)
  if x == 'sin' or x == '-sin' then
    return 0
  elseif x == 'cos' then
    return 1 * a * b
  else
    return -1 * a * b
  end
end

function update_coefficients(coefficients_table)
  print("table length before " .. table.getn(coefficients_table))
  coefficients_table[table.getn(coefficients_table)] = nil
  print("table length after " .. table.getn(coefficients_table))
  for i = table.getn(coefficients_table), 1, -1 do
    print("value before " .. i .. ": " .. coefficients_table[i])
    coefficients_table[i] = coefficients_table[i] * ((table.getn(coefficients_table) + 1) - i)
    print("value after " .. i .. ": " .. coefficients_table[i])
  end
  -- return coefficients_table
end

function get_a_from_user()
  print("Please enter A.")
  a = io.read("*n")
end

function get_b_from_user()
  print("Please enter B.")
  b = io.read("*n")
end

function get_d_from_user()
  print("Please enter the degree.")
  return io.read("*n")
end

function create_unsolved_coefficients()
  answer = {}
  for i = 1, get_d_from_user() do
    answer[i] = 1
  end
  return answer
end

function poly_wants_a_trig()
  unsolved_coefficients = create_unsolved_coefficients()
  print(unsolved_coefficients)
  length = table.getn(unsolved_coefficients)
  solved_coefficients = {}
  left_side = 'sin'
  for i = table.getn(unsolved_coefficients), 1, -1 do
    print(left_side)
    print(unsolved_coefficients)
    solved_coefficients[i] = solve_trig(left_side) / unsolved_coefficients[i]
    print(unsolved_coefficients)
    print(solved_coefficients[i])
    update_coefficients(unsolved_coefficients)
    print(unsolved_coefficients)
    print()
    left_side = calculate_derivative(left_side)
  end
  for i = 1, table.getn(solved_coefficients) do
    print("Coefficient " .. i .. " =")
    print(solved_coefficients[i])
  end
end

function main()
  get_a_from_user()
  get_b_from_user()
  poly_wants_a_trig()
end

main()