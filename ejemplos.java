// Forma incorrecta de usar SRP

class Report {
    public void generateReport() {
        // Lógica para generar el reporte
    }
    
    public void printReport() {
        // Lógica para imprimir el reporte
    }
}

//Explicación: La clase Report tiene dos responsabilidades: generar e imprimir el reporte. Un cambio en la impresión podría afectar la generación, creando dependencias innecesarias.

// Forma correcta de usar SRP

class ReportGenerator {
    public void generateReport() {
        // Lógica para generar el reporte
    }
}

class ReportPrinter {
    public void printReport() {
        // Lógica para imprimir el reporte
    }
}

//Explicación: Cada clase se encarga exclusivamente de su función, mejorando la modularidad y la mantenibilidad.
