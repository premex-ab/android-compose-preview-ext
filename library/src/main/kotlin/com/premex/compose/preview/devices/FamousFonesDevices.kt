package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Famous_Fones device specifications for Android Compose previews.
 *
 * This extension provides Famous_Fones device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FamousFones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FamousFones: Any
  get() = object {
      /** Famous_Fones Famous_5 */
      val FAMOUS_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Famous_Fones Famous_5Plus */
      val FAMOUS_5PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** Famous_Fones Famous_Red_5Plus */
      val FAMOUS_RED_5PLUS = "spec:width=720,height=1498,unit=px,dpi=320"

      /** Famous_Fones Famous_TAB_10 */
      val FAMOUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Famous_Fones Red_Royal_Edition */
      val RED_ROYAL_EDITION = "spec:width=720,height=1440,unit=px,dpi=320"

  }
