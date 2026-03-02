# 🏥 HOSPITAL MANAGEMENT SYSTEM  
---

## 🌟 Descripción del Proyecto

💡 **Objetivo:** Simular un hospital completo aplicando:

- **POO:** Encapsulamiento, Herencia, Polimorfismo, Abstracción  
- **Interfaces y Clases Abstractas**  
- **Principios SOLID**  

🧑‍⚕️ **Roles:**  
- Pacientes: Consulta (`ConsultationPatient`) & Ambulancia (`AmbulancePatient`)  
- Médicos: Especialistas (`SpecialistDoctor`) & Estudiantes (`StudentDoctor`)  

✅ Flujo clínico completo  

✅ Diseño limpio, escalable y profesional  

---

## 🧱 Arquitectura Visual (ASCII + Visual)

```text
                       ┌─────────────────────┐
                       │  <<abstract>>       │
                       │     Character       │
                       └──────────┬──────────┘
                                  │
        ┌─────────────────────────┴─────────────────────────┐
        │                                                   │
   ┌─────────────┐                                   ┌─────────────┐
   │  <<abstract>>│                                   │  <<abstract>>│
   │   Patient    │                                   │ MedicalStaff │
   └───────┬─────┘                                   └───────┬─────┘
           │                                               │
   ┌───────┴───────┐                               ┌───────┴───────┐
   │               │                               │               │
┌──────────────┐ ┌──────────────┐           ┌──────────────┐ ┌──────────────┐
│Consultation  │ │ Ambulance    │           │ Specialist   │ │ Student      │
│ Patient      │ │ Patient      │           │ Doctor       │ │ Doctor       │
└──────────────┘ └──────────────┘           └──────────────┘ └──────────────┘

```
---
## 🧬 Interfaces Clave y Métodos

| 🏷 Tipo   | Clase / Interface     | 🔹 Métodos                                    |
| --------- | --------------------- | --------------------------------------------- |
| Pacientes | `CommonPatient`       | admission(), room(), treatment(), discharge() |
|           | `ConsultationActions` | nurseCheckUp(), nextAppointment()             |
|           | `AmbulanceActions`    | operation(), rehabilitation()                 |
| Médicos   | `DoctorCommon`        | weeklyWorkingHours(), eat()                   |
|           | `MedicalInfo`         | vacationDays(), specialty()                   |
|           | `StudentInfo`         | weeklyStudyHours(), currentCourse()           |

---

Character[] hospitalMembers = {cp1, cp2, ap1, ap2, sd1, sd2, st1, st2};

for(Character member : hospitalMembers) {
    member.showInfo();
}

✅ Invocación dinámica

✅ Sustitución segura (Liskov)


✅ Flujo uniforme de ejecución

---
## 🔒 Encapsulamiento 🔑

Todos los atributos son private, con acceso mediante getters y setters:

- private String name;

- public String getName() { return name; }
  
- public void setName(String name) { this.name = name; }

---

## 🏗 Principios SOLID 📐

---

### 🟢 **S — Single Responsibility**
> 🎯 **Una clase, una única responsabilidad.**

Cada módulo debe tener un solo motivo para cambiar.

---

### 🔵 **O — Open/Closed**
> 🚀 **Abierto a extensión, cerrado a modificación.**

Puedes agregar comportamiento sin alterar el código existente.

---

### 🟣 **L — Liskov Substitution**
> 🔄 **Las subclases deben poder sustituir a su clase base.**

El sistema debe funcionar igual usando la clase padre o sus hijas.

---

### 🟠 **I — Interface Segregation**
> 🧩 **Interfaces pequeñas y específicas.**

Es mejor tener varias interfaces enfocadas que una grande y general.

---

### 🔴 **D — Dependency Inversion**
> 🏛 **Depender de abstracciones, no de concreciones.**

El código de alto nivel no debe depender del de bajo nivel.

---
## 📷 Capturas de Pantalla 🖼️

1️⃣ Diseño de clases y superclases.


<img width="791" height="671" alt="Diagrama del Hospital" src="https://github.com/user-attachments/assets/4affb879-d3af-4508-89da-a01cb865e90b" />



---

2️⃣ Salida en Consola

- Flujo completo de pacientes y médicos.
  

<img width="849" height="368" alt="Captura de pantalla 2026-03-02 200156" src="https://github.com/user-attachments/assets/45b450ad-1adb-44f8-b469-07550312ab55" />



<img width="574" height="369" alt="Captura de pantalla 2026-03-02 200222" src="https://github.com/user-attachments/assets/ae31912d-17f9-4394-8cc7-a5eb91924f33" />



<img width="454" height="366" alt="Captura de pantalla 2026-03-02 200253" src="https://github.com/user-attachments/assets/fe35f913-f522-4790-ae57-1ab2d8c4dc76" />




---

## 🖥 Ejecución 🚀

Clonar repositorio

- git clone https://github.com/Mariaregue-spec/Hospital/tree/dev

- Abrir en IntelliJ IDEA o Eclipse

- Ejecutar Main.java
---

## 🚀 Escalabilidad & Mejoras Futuras

- Nuevos tipos de pacientes o médicos

- Gestión de turnos y emergencias

- Integración con base de datos

- Reportes y estadísticas clínicas
