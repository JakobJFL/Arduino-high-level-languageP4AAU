int ledStripR = 11;int ledStripG = 10;int ledStripB = 9;int sensorPin = 3;
void loop() {}
void setup() {pinMode(11,OUTPUT);pinMode(10,OUTPUT);pinMode(9,OUTPUT);pinMode(3,INPUT);}
float uid9(float *sensorBias, byte *inputValue) {if (uid18(sensorBias, inputValue, 230)) {return 1;}if (uid18(sensorBias, inputValue, 230)) {return 2;}if (uid18(sensorBias, inputValue, 240)) {return 3;}if (uid18(sensorBias, inputValue, 250)) {return 4;}return 0;}
bool uid18(float *sensorBias, byte *inputValue, byte expected) {return *inputValue-*sensorBias>expected&&*inputValue+*sensorBias<expected;}
float uid6() {float sensorBias=10;byte inputValue=map(analogRead(sensorPin), 0, 1023, 0, 255);return uid9(&sensorBias, &inputValue);}
void uid21() {if (uid6()==1) {uid30();uid21();}if (uid6()==2) {uid31();uid21();}if (uid6()==3) {uid32();uid21();}if (uid6()==4) {uid33();uid21();}}
void uid30() {}
void uid31() {digitalWrite(ledStripR,HIGH);}
void uid32() {}
void uid33() {}
void uid20() {uid21();}
