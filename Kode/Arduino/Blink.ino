/*
  Blink
  Tænd og sluk en LED for ét sekund, sluk den derefter, og gentag.
 
  Dette kodeksempel stammer fra Arduino's officielle hjemmeside.
  Se referencen i bunden af kodeeksemplet
*/
 
// PIN 13 har en LED forbundet på de fleste Arduino boards.
// Giv den et navn.
int led = 13;

// Setup funktionen køres så snart der klikkes reset:
void setup() {                
  // Initialiser den digitale PIN som et output
  pinMode(led, OUTPUT);     
}

// Denne funktionen er en uendelig løkke
void loop() {
  digitalWrite(led, HIGH);   // Tænder for LED (HIGH indikerer spænding på PIN)
  delay(1000);               // Vent et sekund
  digitalWrite(led, LOW);    // Slukker for LED (LOW indikerer ingen spænding på PIN)
  delay(1000);               // Vent et sekund
}