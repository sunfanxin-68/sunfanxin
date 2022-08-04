
//数组和ArrayLists只能包含类型相同的值，可声明这些数据结构中都来自super的对象，可用数据结构来储存其子类对象
public Monster dracula, wolfman, evilZombie;
 
dracula = new Vampire();
wolfman = new Werewolf();
evilZombie = new Zombie();
 

 
Monster[] monsters = {dracula, wolfman, evilZombie};
//创建一个Monster类型ArrayList来存储来自任何子Monster类的对象：

