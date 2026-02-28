import time
import random
import multiprocessing as mp

# Ukuran matriks
N = 300   # ubah sesuai kemampuan laptop

# Generate matriks random (list biasa, bukan numpy)
A = [[random.random() for _ in range(N)] for _ in range(N)]
B = [[random.random() for _ in range(N)] for _ in range(N)]

# =========================
# SERIAL VERSION
# =========================
def multiply_serial(A, B):
    N = len(A)
    C = [[0]*N for _ in range(N)]
    
    for i in range(N):
        for j in range(N):
            for k in range(N):
                C[i][j] += A[i][k] * B[k][j]
    
    return C

# =========================
# PARALLEL VERSION
# =========================
def multiply_row(args):
    row_index, A, B = args
    N = len(A)
    row_result = [0]*N
    
    for j in range(N):
        for k in range(N):
            row_result[j] += A[row_index][k] * B[k][j]
    
    return row_result

def multiply_parallel(A, B):
    N = len(A)
    with mp.Pool(mp.cpu_count()) as pool:
        tasks = [(i, A, B) for i in range(N)]
        result = pool.map(multiply_row, tasks)
    return result

if __name__ == "__main__":
    
 #serial
    start_serial = time.time()
    C_serial = multiply_serial(A, B)
    end_serial = time.time()
    serial_time = end_serial - start_serial
    #paralel
    start_parallel = time.time()
    C_parallel = multiply_parallel(A, B)
    end_parallel = time.time()
    parallel_time = end_parallel - start_parallel
    
    print("Waktu Serial  :", serial_time, "detik")
    print("Waktu Paralel :", parallel_time, "detik")
    print("perbedaan       :", serial_time - parallel_time)