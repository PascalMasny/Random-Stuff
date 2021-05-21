import numpy as np
  
  
# skipping first row
# converting file data to string
data = np.loadtxt("data.txt", skiprows=0, dtype='str')

n = 0

for _ in data:
    print(data[n])
    n = n + 1
