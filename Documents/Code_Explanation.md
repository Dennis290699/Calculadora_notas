<div align="center">
  <h1 id="Calculadora">Calculator Grades</h1>
</div>

<p>
In the code, the Java programming language is used to create a program that calculates the average, highest grade, and lowest grade from a set of grades entered by the user.

The code is divided into two classes: "Metodos" and "Principal".

## The "Metodos" class

The "Metodos" class contains the necessary methods to perform calculations related to the grades:

- `ingresarNotas`: This method prompts the user to enter the grades one by one. It uses a `for` loop to iterate over the array of grades and utilizes the `Scanner` class to read the grades entered by the user from the standard input.

- `obtenerNotaMasAlta`: This method iterates over the array of grades and finds the highest grade. It initializes the `maxNota` variable with the value of the first grade in the array. Then, it uses a `for` loop to compare each grade in the array with `maxNota` and updates its value if a higher grade is found.

- `obtenerNotaMasBaja`: This method iterates over the array of grades and finds the lowest grade. Similar to `obtenerNotaMasAlta`, it initializes the `minNota` variable with the value of the first grade in the array. It uses a `for` loop to compare each grade in the array with `minNota` and updates its value if a lower grade is found.

- `obtenerPromedio`: This method calculates the average of the grades. It uses a `for` loop to sum all the grades in the array and then divides the total sum by the number of grades to obtain the average.

## The "Principal" class

The "Principal" class contains the `main` method, which is the entry point of the program. Here, the user interaction takes place, and the methods of the "Metodos" class are invoked to perform the grade calculations:

- In the `main` method, an instance of the `Scanner` class is created to read the number of grades that the user wants to enter.

- Next, an array named `notas` is created with the size specified by the user.

- Then, the `ingresarNotas` method of the "Metodos" class is called, passing the `notas` array as an argument. This method prompts the user to enter the grades.

- After entering the grades, the `obtenerPromedio`, `obtenerNotaMasAlta`, and `obtenerNotaMasBaja` methods of the "Metodos" class are invoked, passing the `notas` array as an argument. These methods perform the corresponding calculations and return the results.

- Finally, the obtained results - the average, lowest grade, and highest grade - are printed to the screen.

This program structure allows for the separation of the grade calculation logic in the "Metodos" class and the user interaction in the "Principal" class, which enhances code comprehension and maintenance.

</p>