#define INA 8
#define INB 9

void setup() {
  // put your setup code here, to run once:
  pinMode(INA, OUTPUT);
  pinMode(INB, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  if(Serial.available()){
    char a = Serial.read();
    if(a == '1'){
      digitalWrite(INA, HIGH);
      digitalWrite(INB, LOW);
    }
    if(a == '2'){
      digitalWrite(INA, LOW);
      digitalWrite(INB, LOW);
    }
  }
}

