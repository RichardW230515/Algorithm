package cn.bw.leetcode;

import cn.bw.leetcode.common.TreeNode;

public class LCR143子结构判断 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) ||
                isSubStructure(A.left, B) ||
                isSubStructure(A.right, B));
    }
    boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
