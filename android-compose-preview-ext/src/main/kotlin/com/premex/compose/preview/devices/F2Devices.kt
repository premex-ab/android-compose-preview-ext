package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * F2 device specifications for Android Compose previews.
 *
 * This extension provides F2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.F2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.F2: Any
  get() = object {
      /** F2 C8Finger */
      val C8FINGER = "spec:width=480,height=800,unit=px,dpi=240"

      /** F2 F80s_plus */
      val F80S_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** F2 i8_ROKR */
      val I8_ROKR = "spec:width=480,height=960,unit=px,dpi=220"

      /** F2 LT5216 */
      val LT5216 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** F2 Z8POCKET */
      val Z8POCKET = "spec:width=480,height=960,unit=px,dpi=240"

  }
