The Buckminster build automatically promotes downloads and updates, so no cron job help is necessary.

The updates can be checked by looking for the new entry on http://www.eclipse.org/modeling/mdt/downloads/?project=ocl
or installing new software from e.g. http://download.eclipse.org/modeling/mdt/ocl/updates/milestones/6.1.0/S201408191307

However operations on composite repositories are not automated, partly because they are sufficiently important to deserve manual attention. 

A new milestone build can be added to the composite repository by:

logon to build.eclipse.org
cd downloads/modeling/mdt/ocl/updates/milestones/6.1.0
ant -f /shared/modeling/tools/promotion/manage-composite.xml add -Dchild.repository=S201408191307 [ -Dcomposite.name="OCL 6.1.0 milestones" ]

(This can be checked by installing new software from e.g. http://download.eclipse.org/modeling/mdt/ocl/updates/milestones/6.1.0)

The Luna aggregator is configured by GIT\org.eclipse.simrel.build\mdt-ocl.b3aggrcon to use an explicit milestone entry

So edit mdt-ocl.b3aggrcon to update 
location="http://download.eclipse.org/modeling/mdt/ocl/updates/milestones/6.1.0/S201408191307"
push to upstream master and start a new build at https://hudson.eclipse.org/hudson/job/simrel.neon.runaggregator/

Once a relese has been promoted update mdt-ocl.b3aggrcon to the final release
location="http://download.eclipse.org/modeling/mdt/ocl/updates/releases/6.1.0"
