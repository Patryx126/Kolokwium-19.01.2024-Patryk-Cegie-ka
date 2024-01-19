// 
rok = [2010, 2015, 2020];
przychod = [42332, 23243, 33244];
koszty = [2323, 2332, 3212];
zyski = [3233, 4323, 5986];
// 
figure
bar(rok, [przychod; koszty; zyski]', 'grouped');
// 
title('Przychody, koszta oraz zysk za lata 2010,2015,2020');
legend('Przychód', 'Koszty', 'Zyski');
// 
xlabel('Rok');
ylabel('Wartość');
//
grid on
