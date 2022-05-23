int led = 5;int sensor = A0;int tempSensor = A1;
void loop() {}
float kat;void setup() {pinMode(5,OUTPUT);pinMode(A0,INPUT);pinMode(A1,INPUT);uid8();}
byte uid7() {return map(analogRead(tempSensor), 0, 1023, 0, 255);}
byte uid6() {return uid7();}
bool uid17WhileWait(int delayTime) {unsigned long startTime = millis();while (millis() < startTime+delayTime) {if (!uid17()) {return true;}}return false;}void uid10(byte *counter) {if (uid6()>40) {uid17WhileWait(1000);uid15(counter);}if (uid6()>60) {uid17WhileWait(10);uid16(counter);}}
void uid15(byte *counter) {digitalWrite(led,!digitalRead(led));uid10(counter);}
void uid16(byte *counter) {*counter=*counter+1;analogWrite(led,*counter);uid10(counter);}
void uid8() {byte counter=0;uid10(&counter);}
bool uid17() {byte outputValue=map(analogRead(sensor), 0, 1023, 0, 255);if (outputValue>128) {return false;}return true;}
