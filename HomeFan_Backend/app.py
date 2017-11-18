from flask import Flask, jsonify
import serial

connect = serial.Serial('/dev/cu.usbmodem1411', baudrate=9600)

app = Flask(__name__)

@app.route('/on', methods=['GET'])
def on():
    connect.write('1'.encode())
    data = dict({"data":"ON"})
    return jsonify(data), 200

@app.route('/off', methods=['GET'])
def off():
    connect.write('2'.encode())
    data = dict({"data":"OFF"})
    return jsonify(data), 200

if __name__ == "__main__":
    app.run('0.0.0.0','3000')