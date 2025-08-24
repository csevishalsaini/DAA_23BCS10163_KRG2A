#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class Frequency_of_Elements {
public:
    vector<vector<int>> countFreq(vector<int>& arr) {
        unordered_map<int, int> mp;
        for (int x : arr) {
            mp[x]++;
        }

        vector<vector<int>> ans;
        for (int x : arr) {
            if (mp[x] != 0) {
                ans.push_back({x, mp[x]});
                mp[x] = 0;
            }
        }
        return ans;
    }
};

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    Frequency_of_Elements sol;
    vector<vector<int>> result = sol.countFreq(arr);

    cout << "[";
    for (int i = 0; i < result.size(); i++) {
        cout << "[" << result[i][0] << ", " << result[i][1] << "]";
        if (i != result.size() - 1) cout << ", ";
    }
    cout << "]";

    return 0;
}
