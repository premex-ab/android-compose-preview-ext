package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Win device specifications for Android Compose previews.
 *
 * This extension provides Win device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Win.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Win: Any
  get() = object {
      /** Win M3 */
      val M3 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Win M5plus */
      val M5PLUS = "spec:width=720,height=1280,unit=px,dpi=300"

      /** Win N4 */
      val N4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Win N4plus */
      val N4PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Win Q9 */
      val Q9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
