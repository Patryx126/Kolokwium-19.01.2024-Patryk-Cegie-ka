// 
x = linspace(1, 5, 100);
//
f1 = log(2*x);
f2 = 2*x - 3*x + 1;
//
figure
plot(x, f1, 'r', 'LineWidth', 2); // Wykres f1 - kolor czerwony
hold on
plot(x, f2, 'b', 'LineWidth', 2); // Wykres f2 - kolor niebieski
//
title('Wykres funkcji f = ln(2x) i f = 2x^2 - 3x + 1');
legend('f = ln(2x)', 'f = 2x^2 - 3x + 1');
//
grid on
hold off
