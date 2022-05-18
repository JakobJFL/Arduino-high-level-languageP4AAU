int led = 13;
void loop() {uid3WhileWait(1000);digitalWrite(led,HIGH);uid3WhileWait(1000);digitalWrite(led,LOW);}
bool uid3() {return true;}
void setup() {pinMode(13,OUTPUT);}
bool uid3WhileWait(int delayTime) {unsigned long startTime = millis();while (millis() < startTime+delayTime) {if (!uid3()) {return true;}}return false;}