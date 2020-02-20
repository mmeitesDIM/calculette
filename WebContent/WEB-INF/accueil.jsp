<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculette</title>
</head>
<body>
   <p>Résultat de l'opération   ${ form.operande1}  ${ form.operateur}  ${ form.operande2} : 
   ${ form.resultat}</p>
   <form method="post" action="accueil">
            <input name ="operande1" type="number" size=3/>
            <select name="operateur" size="1">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="x">x</option>
                <option value="/">/</option>
            </select>
            <input name ="operande2" type="number" size=3/>
            <input type="submit" value="=" />
        </form>
</body>
</html>