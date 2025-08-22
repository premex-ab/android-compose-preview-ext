package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GiONEE device specifications for Android Compose previews.
 *
 * This extension provides GiONEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GiONEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GiONEE: Any
  get() = object {
      /** GiONEE GiONEE_BBL7332 */
      val GIONEE_BBL7332 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_BBL7505 */
      val GIONEE_BBL7505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GiONEE GiONEE_CBL7513 */
      val GIONEE_CBL7513 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_GBL7319 */
      val GIONEE_GBL7319 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_GBL7333 */
      val GIONEE_GBL7333 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_GBL7335 */
      val GIONEE_GBL7335 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_GN9008 */
      val GIONEE_GN9008 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** GiONEE GiONEE_M3 */
      val GIONEE_M3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_WBL7352 */
      val GIONEE_WBL7352 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_WBL7511 */
      val GIONEE_WBL7511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_WBW5612 */
      val GIONEE_WBW5612 = "spec:width=480,height=800,unit=px,dpi=240"

      /** GiONEE GiONEE_WBW5613 */
      val GIONEE_WBW5613 = "spec:width=480,height=854,unit=px,dpi=240"

      /** GiONEE GiONEE_WBW5615 */
      val GIONEE_WBW5615 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_WBW5616 */
      val GIONEE_WBW5616 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GiONEE GiONEE_WBW5617 */
      val GIONEE_WBW5617 = "spec:width=480,height=854,unit=px,dpi=240"

      /** GiONEE GN9006 */
      val GN9006 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GiONEE M5 */
      val M5 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
