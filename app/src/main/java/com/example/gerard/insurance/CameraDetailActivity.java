package com.example.gerard.insurance;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.SpinnerAdapter;

/**
 * An activity representing a single Camera detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link CameraListActivity}.
 */
public class CameraDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_detail);

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(CameraDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(CameraDetailFragment.ARG_ITEM_ID));
            CameraDetailFragment fragment = new CameraDetailFragment();
            fragment.setArguments(arguments);
            getFragmentManager().beginTransaction()
                    .add(R.id.camera_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpTo(this, new Intent(this, CameraListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public ActionBar getSupportActionBar() {
        return new ActionBar() {
            @Override
            public void setCustomView(View view) {

            }

            @Override
            public void setCustomView(View view, LayoutParams layoutParams) {

            }

            @Override
            public void setCustomView(int i) {

            }

            @Override
            public void setIcon(int i) {

            }

            @Override
            public void setIcon(Drawable drawable) {

            }

            @Override
            public void setLogo(int i) {

            }

            @Override
            public void setLogo(Drawable drawable) {

            }

            @Override
            public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, OnNavigationListener onNavigationListener) {

            }

            @Override
            public void setSelectedNavigationItem(int i) {

            }

            @Override
            public int getSelectedNavigationIndex() {
                return 0;
            }

            @Override
            public int getNavigationItemCount() {
                return 0;
            }

            @Override
            public void setTitle(CharSequence charSequence) {

            }

            @Override
            public void setTitle(int i) {

            }

            @Override
            public void setSubtitle(CharSequence charSequence) {

            }

            @Override
            public void setSubtitle(int i) {

            }

            @Override
            public void setDisplayOptions(int i) {

            }

            @Override
            public void setDisplayOptions(int i, int i1) {

            }

            @Override
            public void setDisplayUseLogoEnabled(boolean b) {

            }

            @Override
            public void setDisplayShowHomeEnabled(boolean b) {

            }

            @Override
            public void setDisplayHomeAsUpEnabled(boolean b) {

            }

            @Override
            public void setDisplayShowTitleEnabled(boolean b) {

            }

            @Override
            public void setDisplayShowCustomEnabled(boolean b) {

            }

            @Override
            public void setBackgroundDrawable(@Nullable Drawable drawable) {

            }

            @Override
            public View getCustomView() {
                return null;
            }

            @Override
            public CharSequence getTitle() {
                return null;
            }

            @Override
            public CharSequence getSubtitle() {
                return null;
            }

            @Override
            public int getNavigationMode() {
                return 0;
            }

            @Override
            public void setNavigationMode(int i) {

            }

            @Override
            public int getDisplayOptions() {
                return 0;
            }

            @Override
            public Tab newTab() {
                return null;
            }

            @Override
            public void addTab(Tab tab) {

            }

            @Override
            public void addTab(Tab tab, boolean b) {

            }

            @Override
            public void addTab(Tab tab, int i) {

            }

            @Override
            public void addTab(Tab tab, int i, boolean b) {

            }

            @Override
            public void removeTab(Tab tab) {

            }

            @Override
            public void removeTabAt(int i) {

            }

            @Override
            public void removeAllTabs() {

            }

            @Override
            public void selectTab(Tab tab) {

            }

            @Override
            public Tab getSelectedTab() {
                return null;
            }

            @Override
            public Tab getTabAt(int i) {
                return null;
            }

            @Override
            public int getTabCount() {
                return 0;
            }

            @Override
            public int getHeight() {
                return 0;
            }

            @Override
            public void show() {

            }

            @Override
            public void hide() {

            }

            @Override
            public boolean isShowing() {
                return false;
            }

            @Override
            public void addOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener) {

            }

            @Override
            public void removeOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener) {

            }
        };
    }
}
