mkdir out

javac -d out src\produits\*.java src\classic\*.java src\contemporary\*.java src\scandinavian\*.java src\factory\*.java src\client\*.java

java -cp out client.Main