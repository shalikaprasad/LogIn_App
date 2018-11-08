# LogIn_App
*****************************************Main Activity************************************
******************************************************************************************

RelativeLayout rel1, rel2;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rel1.setVisibility(View.VISIBLE);
            rel2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rel1 = (RelativeLayout) findViewById(R.id.rel1);
        rel2 = (RelativeLayout) findViewById(R.id.rel2);

        handler.postDelayed(runnable, 2000); 
    }

*****************************************Button Shape(res/drawable/btn_shape.xml)*************************************
**********************************************************************************************************************

<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <corners
        android:bottomLeftRadius="20dp"
        android:bottomRightRadius="20dp"
        android:topLeftRadius="20dp"
        android:topRightRadius="20dp" />

    <stroke
        android:width="1dp"
        android:color="@color/white" />

</shape>


*****************************************Button Shape(res/drawable/edittext_shape.xml)************************************
**************************************************************************************************************************

<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <corners
        android:bottomLeftRadius="20dp"
        android:bottomRightRadius="20dp"
        android:topLeftRadius="0dp"
        android:topRightRadius="20dp" />

    <stroke
        android:width="1dp"
        android:color="@color/white" />

</shape>

*****************************************Gradiant Color Style(res/drawable/gradiant_bg.xml)************************************
*******************************************************************************************************************************

<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <gradient
        android:angle="0"
        android:endColor="@color/gradStop"
        android:startColor="@color/gradStart"
        android:type="linear" />

</shape>


*****************************************Layout(res/layout/activity_layout.xml)************************************************
*******************************************************************************************************************************



    android:animateLayoutChanges="true"
    android:background="@drawable/gradiant_bg"
  

    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp">

        <ImageView
            android:id="@+id/imgView_logo"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:adjustViewBounds="true"
            android:scaleType="fitCenter"
            android:src="@drawable/ic_twitter" />

        <RelativeLayout
            android:id="@+id/rel1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/imgView_logo"
            android:visibility="gone">

            <TextView
                android:id="@+id/tv_login"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="20dp"
                android:fontFamily="sans-serif-medium"
                android:text="Login"
                android:textColor="@color/white"
                android:textSize="30sp" />

            <LinearLayout
                android:id="@+id/lin1"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_below="@+id/tv_login"
                android:layout_marginTop="20dp"
                android:orientation="vertical">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-light"
                        android:text="Username"
                        android:textAllCaps="true"
                        android:textColor="@color/white"
                        android:textSize="15sp" />

                    <EditText
                        android:layout_width="match_parent"
                        android:layout_height="40dp"
                        android:layout_marginTop="5dp"
                        android:background="@drawable/edittext_shape"
                        android:fontFamily="sans-serif-light"
                        android:paddingLeft="15dp"
                        android:paddingRight="15dp"
                        android:textColor="@color/white"
                        android:textSize="15sp" />

                </LinearLayout>

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="20dp"
                    android:orientation="vertical">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-light"
                        android:text="Password"
                        android:textAllCaps="true"
                        android:textColor="@color/white"
                        android:textSize="15sp" />

                    <EditText
                        android:layout_width="match_parent"
                        android:layout_height="40dp"
                        android:layout_marginTop="5dp"
                        android:background="@drawable/edittext_shape"
                        android:fontFamily="sans-serif-light"
                        android:paddingLeft="15dp"
                        android:paddingRight="15dp"
                        android:textColor="@color/white"
                        android:textSize="15sp" />

                </LinearLayout>

            </LinearLayout>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="40dp"
                android:layout_below="@+id/lin1"
                android:layout_centerHorizontal="true"
                android:layout_marginTop="50dp"
                android:background="@drawable/btn_shape"
                android:fontFamily="sans-serif-medium"
                android:paddingLeft="70dp"
                android:paddingRight="70dp"
                android:text="Login Now"
                android:textAllCaps="false"
                android:textColor="@color/white"
                android:textSize="16sp" />

        </RelativeLayout>

    </RelativeLayout>

    <RelativeLayout
        android:id="@+id/rel2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"
        android:visibility="gone">

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/transparent"
            android:fontFamily="sans-serif"
            android:text="Signup Now"
            android:textAllCaps="true"
            android:textColor="@color/white" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentRight="true"
            android:background="@color/transparent"
            android:fontFamily="sans-serif"
            android:text="Forgot Password?"
            android:textAllCaps="true"
            android:textColor="@color/white" />

    </RelativeLayout>



*****************************************Color(res/values/color.xml)************************************************
*******************************************************************************************************************************

<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#23A7D8</color>
    <color name="colorPrimaryDark">#23A7D8</color>
    <color name="colorAccent">#FFFFFF</color>

    <color name="white">#FFFFFF</color>
    <color name="transparent">#00000000</color>
    <color name="gradStart">#19AA8B</color>
    <color name="gradStop">#23A7D8</color>

</resources>


*****************************************styles(res/values/styles.xml)************************************************
*******************************************************************************************************************************
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

</resources>


