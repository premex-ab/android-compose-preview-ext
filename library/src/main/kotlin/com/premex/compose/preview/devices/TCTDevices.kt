package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TCT device specifications for Android Compose previews.
 *
 * This extension provides TCT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TCT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TCT: Any
  get() = object {
      /** TCT Alpha */
      val ALPHA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCT Beetle_GSM */
      val BEETLE_GSM = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCT California */
      val CALIFORNIA = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCT Diablo */
      val DIABLO = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCT DIABLOXPLUS */
      val DIABLOXPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCT Megane_GSM */
      val MEGANE_GSM = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCT POP7 */
      val POP7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCT Rav4 */
      val RAV4 = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCT SCRIBEPRO */
      val SCRIBEPRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCT Vodafone_875 */
      val VODAFONE_875 = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCT Yaris35_GSM */
      val YARIS35_GSM = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCT YarisL_GSM */
      val YARISL_GSM = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCT YARISXL */
      val YARISXL = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCT YARIS_55 */
      val YARIS_55 = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCT Yaris_M_GSM */
      val YARIS_M_GSM = "spec:width=480,height=800,unit=px,dpi=240"

  }
