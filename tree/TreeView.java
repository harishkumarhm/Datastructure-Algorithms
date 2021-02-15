package tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class TreeView {
    class QueueObj
    {
        int dist;
        Node node;

        public QueueObj(Node node, int dist)
        {
            this.dist = dist;
            this.node = node;
        }
    }

    public static void main(String[] args)
    {

    }

    public void printTopView(Node root)
    {
        Queue<QueueObj> que = new LinkedList<>();
        Map<Integer, QueueObj> map = new TreeMap<>();
        if(root==null)
            return;
        else{

            que.add(new QueueObj(root, 0));
        }
        while(!que.isEmpty())
        {
            QueueObj tempNode = que.poll();
            if(!map.containsKey(tempNode.dist))
                 map.put(tempNode.dist, tempNode);

            if(tempNode.node.left!=null)
            {
                que.add(new QueueObj(tempNode.node.left, tempNode.dist -1));
            }

            if(tempNode.node.right!=null)
            {
                que.add(new QueueObj(tempNode.node.right, tempNode.dist +1));

            }
        }

      for(Map.Entry<Integer,QueueObj> entry: map.entrySet())
      {
          System.out.println(entry.getValue().node.data);
      }
    }

    public void printBottomView(Node root)
    {
        if(root==null)
            return;

        Queue<QueueObj> que = new LinkedList<>();
        Map<Integer,QueueObj> map = new TreeMap<>();
        que.add(new QueueObj(root, 0));
        while(!que.isEmpty())
        {
            QueueObj temp = que.poll();
            map.put(temp.dist, temp);

            if(temp.node.left!=null)
            {
                que.add(new QueueObj(temp.node.left, temp.dist-1));
            }

            if(temp.node.right!=null)
            {
                que.add(new QueueObj(temp.node.right,temp.dist+1));
            }

        }
        for(Map.Entry<Integer, QueueObj> entry: map.entrySet())
        {
            System.out.println(entry.getValue().node.data);
        }

    }

    public void mirrorTree(Node root)
    {

    }

}
