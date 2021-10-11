# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.Totalmaxdiameter = 0
        
    
        def currDepth (currnode):   
            if currnode == None:
                return 0
            
            
            leftdepth = currDepth(currnode.left)
            
            
            rightdepth = currDepth(currnode.right)

            

          

            self.Totalmaxdiameter = max(self.Totalmaxdiameter, leftdepth + rightdepth)

            return 1 + max (leftdepth, rightdepth)
        
        
        currDepth(root)
        return self.Totalmaxdiameter
        
        
        
         