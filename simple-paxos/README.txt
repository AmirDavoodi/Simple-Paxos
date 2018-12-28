Implementation Configuration File. (config.txt)
There is a "config.txt" file that **NOTE** must be in the same directory from which you execute an agent
(there are some extra parameters one can set - but the defaults are fine as they are)

STARTING DIRECTORY
You can start the process from the PROJECT ROOT directory (the same one the "README.txt" is in)



BUILDING
The project was done in eclipse.
If you want to compile you can open eclipse, import the project and only (Compile) the Paxos profile then run the compiled version of the code using provided bash scripts.


ADDITIONAL CONFI OPTIONS (in the config.txt file)
number_of_acceptors=3
window_size=3

proposer_heartbeat_interval=2
acceptor_heartbeat_interval=3
learner_heartbeat_interval=10

resend_timeout=6100
timeout_phase1and2=1000
process_window_timer=10



I also want to mention that I get help from the two following article which perfectly explained step by step implementation of Paxos Algorithm:

1) Paxos made code (Implementing a high throughput Atomic Broadcast)
2) Paxos Made Simple (Leslie Lamport)

More over paxos implementation of Rui Xin and Haiyang Sun get me the ideas and tricks.


I also want to mention that this project is incomplete. I follow the steps on "Paxos Made Simple (Leslie Lamport)" master thesis but didn't finish due to time limit.
I hope I get the score based on what I coded.

For this step this project is combining clients and proposers and I wanted to disjoint this two but didn't finish. 

Thanks for your time.