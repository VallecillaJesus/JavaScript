const {resolver,resetear,limpiar,init} = require("../funcionalidad");
const fs = require("fs");
document.body.innerHTML = fs.readFileSync("./calculadora.html");

function ejecuarResultado(a,b,op){
    resetear()
    a.click()
    op.click()
    b.click()
    igual.click()
}


describe('Test funcionalidades - No retorno',() => {

    test('Test -Limpiar: no retorno',() => {
        expect(limpiar()).toBeFalsy()
    })

    test('Test -Resetear: no retorno',() => {
        expect(resetear()).toBeFalsy()
    })

    test('Test -Init: no retorno',() => {
        expect(init()).toBeFalsy()
    })
    
    test('Test -Resolver: no retorno',() => {
        expect(resolver()).toBeFalsy()
    })

})

describe("Test funcionalidades", () => {

    describe("Metodo Init -(OnClick) funcionalidades: ", () => {

        describe("OnClik - Numeros", () => {

            test("OnClick - Uno", () => {
                limpiar();
                uno.click();
                expect(resultado.textContent === '1').toBeTruthy();
            })
    
            test("OnClick - Dos", () => {
                limpiar();
                dos.click();
                expect(resultado.textContent === '2').toBeTruthy();
            })
    
            test("OnClick - Tres", () => {
                limpiar();
                tres.click();
                expect(resultado.textContent === '3').toBeTruthy();
            })
    
            test("OnClick - Cuatro", () => {
                limpiar();
                cuatro.click();
                expect(resultado.textContent === '4').toBeTruthy();
            })
    
            test("OnClick - Cinco", () => {
                limpiar();
                cinco.click();
                expect(resultado.textContent === '5').toBeTruthy();
            })
    
            test("OnClick - Seis", () => {
                limpiar();
                seis.click();
                expect(resultado.textContent === '6').toBeTruthy();
            })
    
            test("OnClick - Siete", () => {
                limpiar();
                siete.click();
                expect(resultado.textContent === '7').toBeTruthy();
            })
    
            test("OnClick - Ocho", () => {
                limpiar();
                ocho.click();
                expect(resultado.textContent === '8').toBeTruthy();
            })
    
            test("OnClick - Nueve", () => {
                limpiar();
                nueve.click();
                expect(resultado.textContent === '9').toBeTruthy();
            })
    
            test("OnClick - Cero", () => {
                limpiar();
                cero.click();
                expect(resultado.textContent === '0').toBeTruthy();
            })

        })

        describe("OnClik - Operaciones", () => {

        })

    })

    describe('Metodo Resultado - Funcionalidades', () => {
        describe('Test Suma', () => {
            test('Suma entre ceros', () => {
                ejecuarResultado(cero,cero,suma);
                expect(resultado.textContent === '0').toBeTruthy();
            })

            test('Suma intermedios', () => {
                ejecuarResultado(cinco,cinco,suma);
                expect(resultado.textContent === '10').toBeTruthy();
            })

            test('Suma limites', () => {
                ejecuarResultado(cero,nueve,suma);
                expect(resultado.textContent === '9').toBeTruthy();
            })
        })

        describe('Test Resta', () => {
            test('Resta entre ceros', () => {
                ejecuarResultado(cero,cero,resta);
                expect(resultado.textContent === '0').toBeTruthy();
            })

            test('Resta intermedios', () => {
                ejecuarResultado(cinco,cinco,resta);
                expect(resultado.textContent === '0').toBeTruthy();
            })

            test('Resta limites', () => {
                ejecuarResultado(cero,nueve,resta);
                expect(resultado.textContent === '-9').toBeTruthy();
            })
        })

        describe('Test Multiplicacion', () => {
            test('Multiplicacion entre ceros', () => {
                ejecuarResultado(cero,cero,multiplicacion);
                expect(resultado.textContent === '0').toBeTruthy();
            })

            test('Multiplicacion intermedios', () => {
                ejecuarResultado(cinco,cinco,multiplicacion);
                expect(resultado.textContent === '25').toBeTruthy();
            })

            test('Multiplicacion limites', () => {
                ejecuarResultado(cero,nueve,multiplicacion);
                expect(resultado.textContent === '0').toBeTruthy();
            })
        })

        describe('Test Division', () => {
            test('Division entre ceros', () => {
                ejecuarResultado(cero,cero,division);
                expect(resultado.textContent).toBeTruthy();
            })

            test('Division intermedios', () => {
                ejecuarResultado(cinco,cinco,division);
                expect(resultado.textContent === '1').toBeTruthy();
            })

            test('Division limites', () => {
                ejecuarResultado(cero,nueve,division);
                expect(resultado.textContent === '0').toBeTruthy();
            })
        })
        
    })

    describe("Metodo Resetear -(OnClick) funcionalidades: ", () => {

        test('Onclick - Reset', () => {
            limpiar()
            reset.click()
            expect(resultado.textContent).toEqual('');
        })

    })

})