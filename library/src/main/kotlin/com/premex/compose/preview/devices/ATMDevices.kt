package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATM device specifications for Android Compose previews.
 *
 * This extension provides ATM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATM: Any
  get() = object {
      /** ATM R5 */
      val R5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ATM R5_Pro */
      val R5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ATM X50u */
      val X50U = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
