#!/usr/bin/env python
# coding: utf-8

# In[6]:


num=[1,2,3]
ch=['a','b','c','d']
res=zip(num,ch)
print(res)
for n,c in res:
    print("%d값은 %s입니다" %(n,c))


# In[7]:


number_list=[number for number in range(1,6)]
number_list


# In[8]:


a_list  =[number for number in range(1,6) if number %2 ==1]
a_list


# In[13]:


rows=range(1,4)
cols=range(1,3)
cells=[(row,col)for row in rows for col in cols]
print(cells)
for haha in cells:
    print(haha)


# In[23]:


a_list=[ 1, 2, 3]
b_list=[ 3, 4, [1,5]]
c_list=[ 5, 6, 7]
all_list=[a_list,b_list,c_list]
print(all_list)
print(all_list[0])
print(all_list[2][0])   # 3번째의 1번째 값 구함

print(all_list[1][1])
print(all_list[2][1])
print(all_list[1][2][1])


# In[26]:


a={"happiness":"행복","sadnes":"슬픔","angry":"분노"}
print(a)
b={True:"참",False:"거짓"}
print(b)


# In[28]:


a=dict(happiness="행복",sadnes="슬픔",angry="분노")
print(a)


# In[57]:


b_list=[['sam','first'], ['jhon','second']]
dict_b=dict(b_list)
print(dict_b)
dict_b['sam']=11111
print(dict_b)
dict_b['sam']="jhon"
print(dict_b)
print('sam' in dict_b)
print(dict_b.get('jhon'))
print(dict_b.get('hey','Not 어쩌구~'))
del dict_b['sam']
print(dict_b)
dict_b.pop('jhon')
dict_b=dict(b_list)
dict_c=dict(b_list)
dict_c['bob']='third'
print(dict_c)


# In[48]:


first={'a':"angry",'b':'bliss'}
second={'b':'bagels','c':'candy'}
{**first, **second}


# In[70]:


#얕은복사
signals={'green':'go','yellow':'go faster','red':['stop','smile']}
signals_copy=signals.copy()
signals['red'][1]=555
print(signals_copy)
print(signals)
print(signals==signals_copy)


# In[71]:


#깊은복사
import copy
signals={'green':'go','yellow':'go faster','red':['stop','smile']}
signals_copy=copy.deepcopy(signals)
signals['red'][1]=555
print(signals_copy)
print(signals)
print(signals==signals_copy)


# In[78]:


word='letters'
letter_counts={letter:word.count(letter) for letter in word}
letter_counts


# In[87]:


def make_a_sound():
    print('quack')
    
print(make_a_sound())
def agree():
    return Ture


# In[91]:


def echo(anything):
    return anything + ' ' +anything
echo('Rumplestiltskin')


# In[94]:


def echo(anything,some):
    return anything + ' , ' + some
echo('Rumplestiltskin','hello')


# In[97]:


def commentary(color):
    if color =='red':
        return"It's a tomato"
    elif color =='green':
        return"It's a green papper"
    elif color =='bee purple':
        return"I don't know"
    else:
        return'hehe'+color+'.'
    
comment=commentary('blue')
print(comment)


# In[118]:


def add_num(a,b):
    return a+b
def min_num(a,b):
    return a-b

num1=input("input num1 : ")
num2=input("input num2 : ")

print(add_num(int(num1),int(num2)))
print(min_num(int(num1),int(num2)))


# In[109]:


def add_num(a,b):
    return a+b
def min_num(a,b):
    return a-b

def input_num():
    num1=input("input num1 : ")
    return num1

in_num1 =input_num()
in_num2 =input_num()

print(input_num(int(in_num1),int(in_num2)))



# In[123]:


def input_data():
    input_id = input("input ID: ")
    input_pw = input("input PW: ")

    if input_id == 'yj':
        if input_pw == 'hehe':
            return "로그인 완료하였습니다."
        else:
            return "비밀번호 오류입니다."
    else:
        return "다시 입력하세요."
    
print(input_data())


# In[ ]:


def login():
    id = input("ID를 입력하세요: ")
    pw = input("PW를 입력하세요: ")

    if id == 'yj' and pw == 'hehe':
        return "로그인 완료하였습니다."
    else:
        return "로그인 실패하였습니다."

result = login()
print(result)


# In[ ]:


def input_data():
    input_id = input("input ID: ")
    input_pw = input("input PW: ")
    return input_id, input_pw
    

login=False
while True:

    for in range(1,6):
        input_id, input_pw= input_data()


# In[124]:


def login():
    correct_id = "myid"
    correct_pw = "mypassword"
    max_attempts = 5
    attempt_count = 0
    
    while True:
        input_id = input("Enter your ID: ")
        input_pw = input("Enter your password: ")
        
        if input_id == correct_id and input_pw == correct_pw:
            print("Login successful!")
            break
        
        attempt_count += 1
        if attempt_count >= max_attempts:
            print("Maximum login attempts exceeded.")
            break
        
        print("Incorrect ID or password. Please try again.")
    
login()


# In[ ]:


def login_for():
    correct_id = "myid"
    correct_pw = "mypassword"
    max_attempts = 5
    
    for attempt_count in range(max_attempts):
        input_id = input("Enter your ID: ")
        input_pw = input("Enter your password: ")
        
        if input_id == correct_id and input_pw == correct_pw:
            print("Login successful!")
            break
        
        if attempt_count == max_attempts - 1:
            print("Maximum login attempts exceeded.")
        else:
            print("Incorrect ID or password. Please try again.")
    
login_for()


# In[ ]:


def login_while():
    correct_id = "myid"
    correct_pw = "mypassword"
    max_attempts = 5
    attempt_count = 0
    
    while attempt_count < max_attempts:
        input_id = input("Enter your ID: ")
        input_pw = input("Enter your password: ")
        
        if input_id == correct_id and input_pw == correct_pw:
            print("Login successful!")
            break
        
        attempt_count += 1
        if attempt_count >= max_attempts:
            print("Maximum login attempts exceeded.")
        else:
            print("Incorrect ID or password. Please try again.")
    
login_while()


# In[ ]:


def input_data():
    input_id = input("input ID: ")
    input_pw = input("input PW: ")
    return input_id, input_pw

login = False
max_attempts = 5

for _ in range(1, max_attempts + 1):
    input_id, input_pw = input_data()

    if input_id == "myid" and input_pw == "mypassword":
        login = True
        print("Login successful!")
        break
    else:
        print("Incorrect ID or password. Please try again.")

if not login:
    print("Maximum login attempts exceeded. Login failed.")


# In[127]:


def works(arg):
    result =[]
    result.append(arg)
    return result
print(works('a'))
print(works('b'))


# In[134]:


def print_args(*args):
    print('Positional tuple:',args)

print_args()
print_args(3)
print_args(4,5,'wait','ee')
args=(3,5,7,8)
print_args(args)


# In[138]:


def print_kwargs(**kwargs):
    print('keyword arguments:',kwargs)
    
print_kwargs()
print_kwargs(wine='merlot',entree='mutton',desert='macaroon')


# In[144]:


def print_data(data,*,start=0,end=100):
    for value in (data[start:end]):
        print(value)
        
data=['a','b','c','d','e','f']
print_data(data)
#data_1='a'
#print_data(data_1)
print_data(data,start=4)

print_data(data,end=2)


# In[157]:


def echo(anything):
    'echo returns its input argument'
    return anything
def print_if_true(thing,check):
    '''Print the first argument if a second argument is true.
The operation is:
    1. Check whethrer the *second* argument is true.
    2. If it is, print the *first* argument.'''
    if check:
        print(thing)
help(echo)
print(echo.__doc__)


# In[169]:


def knights2(saying):
    def inner2():
        return "We are the knights who say: '%s'" % saying
    return inner2
a = knight2('Duck')
b = knight2('Hasenpfeffer')
print(a)
print(b)


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




