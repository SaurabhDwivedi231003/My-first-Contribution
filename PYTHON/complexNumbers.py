# Define complex numbers
z1 = 2 + 3j
z2 = 1 - 1j

# Addition
addition_result = z1 + z2
print("Addition Result:", addition_result)

# Subtraction
subtraction_result = z1 - z2
print("Subtraction Result:", subtraction_result)

# Multiplication
multiplication_result = z1 * z2
print("Multiplication Result:", multiplication_result)

# Division
division_result = z1 / z2
print("Division Result:", division_result)

# Conjugate
conjugate_z1 = z1.conjugate()
print("Conjugate of z1:", conjugate_z1)

# Real and Imaginary Parts
real_part_z1 = z1.real
imaginary_part_z1 = z1.imag
print("Real Part of z1:", real_part_z1)
print("Imaginary Part of z1:", imaginary_part_z1)

# Absolute Value (Magnitude)
absolute_value_z1 = abs(z1)
print("Absolute Value of z1:", absolute_value_z1)

# Phase (Angle)
import cmath
phase_z1 = cmath.phase(z1)
print("Phase of z1:", phase_z1)

# Polar Coordinates
polar_coordinates_z1 = cmath.polar(z1)
print("Polar Coordinates of z1:", polar_coordinates_z1)

# Rectangular to Polar Conversion
rectangular_to_polar_z1 = cmath.rect(absolute_value_z1, phase_z1)
print("Rectangular to Polar Conversion of z1:", rectangular_to_polar_z1)

# Polar to Rectangular Conversion
polar_to_rectangular_z1 = cmath.rect(*polar_coordinates_z1)
print("Polar to Rectangular Conversion of z1:", polar_to_rectangular_z1)
