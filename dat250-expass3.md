## Technical problems that I encountered during installation and use of MongoDB and how I resolved them
The powershell script mongodb provide, looks for version 5.0.2 in local dir, rename files and it worked with 4.4 (version we are supposed to use).

## The correct validation of the installation package (https://docs.mongodb.com/manual/tutorial/verify-mongodb-packages/)
![sha256verification](/images/installverify.JPG)

## Relevant results obtained during Experiment 1 (it is not necessary to put a single screenshot on each substep, but at least one significant from each CRUD operation).
![insert](/images/insert.JPG)
![query](/images/query.JPG)
![update](/images/update.JPG)
![delete](/images/delete.JPG)

## Experiment 2 example working and the additional Map-reduce operation (and its result) developed by each of you.
![mapreduce](/images/mapreduce1.JPG)
### My operation:
![map_reduce_dart_points](/images/mapreducedart1.JPG)
![map_reduce_dart_points](/images/mapreducedart2.JPG)

## Reason about why I implemented Map-reduce operation in Experiment 2 is useful and interpret the collection obtained.
My map-reduce operation lets you see each players total dart score over multiple rounds and throws.
Easy to see who is in the lead with the most points.

## Any pending issues with this assignment which I did not manage to solve
Nothing I can think of.
