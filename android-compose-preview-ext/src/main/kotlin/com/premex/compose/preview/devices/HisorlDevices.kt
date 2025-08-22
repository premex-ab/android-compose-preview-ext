package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HISORL device specifications for Android Compose previews.
 *
 * This extension provides HISORL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hisorl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hisorl: Any
  get() = object {
      /** HISORL P50 */
      val P50 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL P80-EEA */
      val P80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL P80-ROW */
      val P80_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL T10P */
      val T10P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HISORL T901_EEA */
      val T901_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL T901_ROW */
      val T901_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL TAB10_ROW */
      val TAB10_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** HISORL TAB_10 */
      val TAB_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HISORL TB02_EEA */
      val TB02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL TB02_ROW */
      val TB02_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HISORL Y101P */
      val Y101P = "spec:width=600,height=1024,unit=px,dpi=160"

  }
