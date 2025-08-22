package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * K-Touch device specifications for Android Compose previews.
 *
 * This extension provides K-Touch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KTouch: Any
  get() = object {
      /** K-Touch S5 */
      val S5 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
