<%-- 
    Document   : index
    Created on : 05-05-2023, 14:31:13
    Author     : micke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liquidación de sueldo</title>
    </head>
    <body>
       <div style="margin: 24px; padding: 24px; border: 1px solid #eee; border-radius: 2em; color: #546E7A">
        <h1 style="color:#37474f">Bienvenido a liquidación de sueldo!</h1>
        <h3 style="color:#37474f">Favor ingresa los datos solicitados para hacer el cálculo de sueldo líquido</h3>
      <form action="SVLiquidacionSueldo">
          <p>
              <label>Ingrese Usuario </label>
          <input type="text" name="usuario" value="" placeholder="pepito" required/>
          </p>
          <p>
              <label>Ingrese Contraseña </label>
          <input type="password" name="pass" value="" placeholder="pepito" required/>
          </p>
        <p>
            
          <label>Ingrese su sueldo bruto: </label>
          <input type="text" name="sueldo_bruto" value="" placeholder="100.000" required/>
          <span> pesos.</span>
        </p>
        <p>
            <select name="tipo_calculo">
                <option value="bono_mov">
                    Calcular bono movilización
                </option>
                <option value="bono_cum">
                    Calcular bono cumplimiento
                </option>
                <option value="dcto_salud">
                    Calcular descuento salud
                </option>
                <option value="dcto_afp">
                    Calcular descuento AFP
                </option>
                <option value="sueldo_liquido">
                    Calcular sueldo líquido
                </option>
            </select>
        </p>
 

        <input style="color:#fff; padding: 10px 20px; background: #28892b; border: none; border-radius: 3em; cursor: pointer" type="submit" value="CALCULAR →"  name="calcular_interes" />
      </form>
        <P style="text-align: center" >Creado por: @mickequeen - AKA Carol Martínez, Sección 51 </P>
      </div>
    </body>
</html>
