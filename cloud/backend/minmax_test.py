from sklearn.preprocessing import MinMaxScaler
import numpy

#input_fit_data = [[0,0,0,25.67,65.7,0,2.91,411],[1,1,1,30.25,87.5,22.05,9.73,30824]]
#output_fit_data = [[1637.76],[115862.16]]

fit_data = [[0,0,0,25.67,65.7,0,2.91,411],[1,1,1,30.25,87.5,22.05,9.73,30824]]
raw_data= [1,0,0,30,77.5,21.05,5.73,7700]
data = numpy.array(raw_data).reshape(1,-1)
print(data)
scaler = MinMaxScaler()
hasil_scale = scaler.fit(fit_data)
print(scaler.data_min_)
# print(scaler.data_max_)
print(scaler.transform(data))