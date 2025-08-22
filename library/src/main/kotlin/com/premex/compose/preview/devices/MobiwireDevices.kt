package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobiwire device specifications for Android Compose previews.
 *
 * This extension provides Mobiwire device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobiwire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobiwire: Any
  get() = object {
      /** Mobiwire Edjromi */
      val EDJROMI = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire Giyafa */
      val GIYAFA = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire H5032U */
      val H5032U = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire H5111 */
      val H5111 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire H5111L */
      val H5111L = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire H5111L_Mascom */
      val H5111L_MASCOM = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire H5112 */
      val H5112 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire H6681_Pro */
      val H6681_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Mobiwire H6682 */
      val H6682 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Mobiwire H67A1 */
      val H67A1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Mobiwire K5P_4G_U */
      val K5P_4G_U = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobiwire Kicka6 */
      val KICKA6 = "spec:width=720,height=1480,unit=px,dpi=280"

      /** Mobiwire Smart_E25 */
      val SMART_E25 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire Smart_V25 */
      val SMART_V25 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Mobiwire Verda */
      val VERDA = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire V_Lite_2 */
      val V_LITE_2 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobiwire V_Pro_2 */
      val V_PRO_2 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Mobiwire V_Smart_2 */
      val V_SMART_2 = "spec:width=720,height=1560,unit=px,dpi=280"

  }
