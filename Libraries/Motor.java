
public class Motor {

    /*

        Motorul este una din cele mai esentiale piese din robot.
        In competitia in care participam acestea prezinta niste functii
        asemanatoare cu cele de mai jos.

        Informatii Extra: Motor -> componenta care transforma energia electrica in
                                   energie mecanica
                          Encoder -> componenta electronica care masoara numarul de
                                     rotatii facute de motor si pozitia lui in rotatia curenta

     */

    enum RunMode {
        RUN_WITHOUT_ENCODER, // modul motorului de a merge daca nu are atasat un encoder
                             // folosind acest mod ne este interzis sa folosim functii ca
                             // setVelocity(), setTargetPosition(), getCurrentPosition()

        RUN_WITH_ENCODER,   // modul motorului de a merge cu encoder acesta ne lasa sa
                            // folosim toate functiile motorului dar trebuie conectat
                            // un cablu pt encoder la motor

        RUN_TO_POSITION     // acest mod se activeaza cand vrem ca motorul sa mearga
                            // spre o pozitie predefinita
    }

    public Motor() {
        // costructorul clasei
    }

    public void setPower(double power) {
        // schimba puterea motorului cu variabila power
        // acesta variabila poate lua valori intre [-1, 1]
        // unde 1 inseamna putere maxima si (-1) putere maxima in directia opuse
    }

    public double getPower() {
        // intoarce puterea motorului
    }

    public void setVelocity(double velocity) {
        // schimba viteza motorului cu variabila velocity
    }

    public double getVelocity() {
        // intoarce viteza curenta a motorului
    }

    public void setTargetPosition() {
        // schimba pozitia dorita in care sa ajunga motorul
        // merge doar daca modul de miscare a motorului
        // este RUN_TO_POSITION
    }

    public double getCurrentPosition() {
        // intoarce positia motorului redata de encoderul acestuia
    }

    public void setRunMode(RunMode runMode) {
        // schimba modul de a rula al motorului
    }

}