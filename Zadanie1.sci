// Zadanie 1 a
x = -0.45;
result = asin(x);
disp(result, "Wynik arcsin(-0.45) w radianach to:");

// Zadanie 1 b
A = [7 -2 3; 1 2 4; -2 5 8; 6 -1 0];
matrix_rank = rank(A);
disp(matrix_rank, "Rząd macierzy to:");

// Zadanie 1 c
v = 20;
r = 30;
ad = v^2 / r;
disp(ad, "Wartość ad to:");

// Zadanie 1 d
suma = 0;
for n = 1:40
suma = suma + (n-3) / n^3;
end
disp(suma, "Suma skończona to:");
