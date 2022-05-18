int ledPin1 = 5;int ledPin2 = 6;int sensorPin = A0;
void loop() {while (uid7()) {digitalWrite(ledPin1,HIGH);digitalWrite(ledPin2,LOW);uid7WhileWait(2000);digitalWrite(ledPin1,LOW);digitalWrite(ledPin2,HIGH);uid7WhileWait(2000);}digitalWrite(ledPin1,LOW);digitalWrite(ledPin2,LOW);}
void setup() {pinMode(5,OUTPUT);pinMode(6,OUTPUT);pinMode(A0,INPUT);}


bool uid7WhileWait(int delayTime) {
  unsigned long startTime = millis();
  while (millis() < startTime+delayTime) {
    if (!uid7()) {
      return true;
      }
    }
   return false;
}

bool uid7() {return map(analogRead(sensorPin), 0, 1023, 0, 255)<128;}
