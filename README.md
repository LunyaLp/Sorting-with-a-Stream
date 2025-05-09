# Сравнение однопоточной и многопоточной сортировки в Java

🧑‍🎓 *Учебная работа студента 1 курса*

---

## 📌 Описание

Данный проект реализует сравнение производительности **однопоточной** и **многопоточной** сортировки массивов в Java.

Программа создаёт 4 массива:
- `massiv1`, `massiv2` — копии, сортируемые в одном и в двух потоках соответственно.
- `massiv3`, `massiv4` — ещё одна пара, также сортируемая в одном и двух потоках.

### Потоки:
- `FirstThread` — сортирует два массива **в одном потоке**.
- `SecondThread` и `ThirdThread` — сортируют массивы **параллельно**, каждый в своём потоке.

---

## ⚙️ Реализация

- Используется **наивный алгоритм сортировки** (сортировка простыми сравнениями, похожая на пузырьковую).
- Размер массивов задаётся переменной `size` (по умолчанию — 10000).
- Итоговое время выполнения выводится в консоль:
  - Время однопоточной сортировки.
  - Время многопоточной сортировки.
  - Выбор максимального значения между двумя потоками.

---

## 📊 Пример вывода
![image](https://github.com/user-attachments/assets/02aa069d-1144-4ac1-95b8-2391ba14f2e6)
