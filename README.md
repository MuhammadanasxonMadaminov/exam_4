﻿# exam_4
        V1
        1. Kiritilgan sananing hafta kunini aniqlab beruvchi dastur tuzing
        2. Faylga yozilgan ikki sonning yig'indisini boshqa faylga yozing
        3. Telefon raqamini tekshirish uchun regex yozing
        4. Logger yordamida log yozing: ixtiyoriy levelda consolega, fine levelda, filega
        5. Runnable bilan Callable farqlarini ayting?


###  Asosiy farqlari metodlarida va ishlash prinsplari
misol uchun bizga qiymat qaytirishi kerak bo'lsa Callable ishlatamiz 
  aks holda Runnable
## Runnable
```Java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        run();
    }
};
```
## Callable
```Java
Callable<Integer> call= ()->{
    Thread.sleep(1000);
    return 1;
};
```






