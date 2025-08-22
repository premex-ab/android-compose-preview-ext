package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Crosscall device specifications for Android Compose previews.
 *
 * This extension provides Crosscall device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Crosscall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Crosscall: Any
  get() = object {
      /** Crosscall HS8909QC */
      val HS8909QC = "spec:width=480,height=854,unit=px,dpi=240"

      /** Crosscall HS8916QC */
      val HS8916QC = "spec:width=540,height=960,unit=px,dpi=240"

      /** Crosscall L751 */
      val L751 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Crosscall L751_02 */
      val L751_02 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Crosscall L752 */
      val L752 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Crosscall L762 */
      val L762 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Crosscall L768 */
      val L768 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Crosscall L771 */
      val L771 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Crosscall L780 */
      val L780 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Crosscall L790 */
      val L790 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Crosscall L810 */
      val L810 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Crosscall L820 */
      val L820 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
