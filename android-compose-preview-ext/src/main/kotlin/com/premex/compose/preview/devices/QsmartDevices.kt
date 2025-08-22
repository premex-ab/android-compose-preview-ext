package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QSmart device specifications for Android Compose previews.
 *
 * This extension provides QSmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qsmart: Any
  get() = object {
      /** QSmart Blaze */
      val BLAZE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** QSmart GLi */
      val GLI = "spec:width=480,height=800,unit=px,dpi=240"

      /** QSmart GLi_2020 */
      val GLI_2020 = "spec:width=480,height=800,unit=px,dpi=240"

      /** QSmart GLi_Lite */
      val GLI_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** QSmart Hot_1 */
      val HOT_1 = "spec:width=720,height=1480,unit=px,dpi=320"

      /** QSmart Hot_5 */
      val HOT_5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** QSmart i10_2019 */
      val I10_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart i10_2020 */
      val I10_2020 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart i4i */
      val I4I = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart i7i_2020 */
      val I7I_2020 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QSmart LT950 */
      val LT950 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart MARK_2 */
      val MARK_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart Mark_5 */
      val MARK_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** QSmart QSmart_i5i_2019 */
      val QSMART_I5I_2019 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QSmart QSmart_i6i_2020 */
      val QSMART_I6I_2020 = "spec:width=480,height=854,unit=px,dpi=240"

      /** QSmart QSmart_LT900 */
      val QSMART_LT900 = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart Rocket */
      val ROCKET = "spec:width=600,height=1280,unit=px,dpi=240"

      /** QSmart Rocket_Lite */
      val ROCKET_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** QSmart Rocket_Pro */
      val ROCKET_PRO = "spec:width=600,height=1280,unit=px,dpi=240"

      /** QSmart Smart_8 */
      val SMART_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** QSmart Smart_HD_Pro */
      val SMART_HD_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QSmart Ultra */
      val ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** QSmart View */
      val VIEW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** QSmart View_Max */
      val VIEW_MAX = "spec:width=720,height=1600,unit=px,dpi=280"

      /** QSmart View_Max_Pro */
      val VIEW_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** QSmart VIEW_PRO */
      val VIEW_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** QSmart X10 */
      val X10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QSmart X20 */
      val X20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** QSmart X40 */
      val X40 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
