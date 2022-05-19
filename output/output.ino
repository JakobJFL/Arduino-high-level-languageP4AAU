int led = 5;int sensor = A0;int tempSensor = A1;
void loop() {}
byte uid5() {return uid6();}
void uid7(byte *counter) {byte counter=0;uid9(&counter);}
bool uid16() {byte outputValue=map(analogRead(sensor), 0, 1023, 0, 255);if (outputValue>128) {return false;}return true;}
void setup() {pinMode(5,OUTPUT);pinMode(A0,INPUT);pinMode(A1,INPUT);uid7();}
byte uid6() {return map(analogRead(tempSensor), 0, 1023, 0, 255);}
bool uid16WhileWait(int delayTime) {unsigned long startTime = millis();while (millis() < startTime+delayTime) {if (!uid16()) {return true;}}return false;}void uid15(byte *counter) {*counter=*counter+1;uid9(&counter);}
void uid14(byte *counter) {digitalWrite(led,!digitalRead(led));uid9(&counter);}
void uid9(byte *counter) {if (uid5(&counter)>40) {uid16WhileWait(1000);uid14(&counter);}if (uid5(&counter)>60) {uid16WhileWait(10);uid15(&counter);}}
