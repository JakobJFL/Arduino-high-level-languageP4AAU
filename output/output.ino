int led = 5;int sensor = A0;int tempSensor = A1;
void loop() {}
byte uid5() {return uid6();}
void uid7() {byte counter=0;uid9(&counter);}
bool uid23() {byte outputValue=map(analogRead(tempSensor), 0, 1023, 0, 255);if (outputValue>128) {return false;}return true;}
void setup() {pinMode(5,OUTPUT);pinMode(A0,INPUT);pinMode(A1,INPUT);uid7();}
byte uid6() {return map(analogRead(tempSensor), 0, 1023, 0, 255);}
unsigned long timeruid23 = 0;
bool uid23WhileWait(int delayTime) {
  unsigned long startTime = millis();
  timeruid23 = millis();
  while (timeruid23 < startTime+delayTime) {
    timeruid23 = millis();
    if (!uid23()) {
      return true;
    }
  }
  return false;
}
void uid20(float *i) {
  if (*i<30) {
    *i=*i+1;analogWrite(led,*i);
    uid20(&i);
  }
}
uid9();void uid18() {float i=0;}
void uid17() {counter=counter+1;analogWrite(led,counter);uid9();}
void uid16() {analogWrite(led,!digitalRead(led));uid9();}
void uid9(byte *counter) {if (uid5(&counter)1) {uid23WhileWait(1000);uid16(&counter);}if (uid5(&counter)2) {uid23WhileWait(10);uid17(&counter);}if (uid5(&counter)3) {uid23WhileWait(3000);uid18(&counter);}}
