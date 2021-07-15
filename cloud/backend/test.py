import unittest
import main
from flask import jsonify
results = {
        "harga_1":0.0,
        "harga_2":0.0,
        "harga_3":0.0,
        "harga_4":0.0
    }
json_results = jsonify(str(results))

class TestInput(unittest.TestCase):
    def test_value_input(self):
        self.assertEqual(main.predict([0.889,2]),json_results)
    def test_type_tuple_input(self):
        self.assertEqual(main.predict([0.889,"a"]),json_results)

if __name__ == '__main__':
    unittest.main()