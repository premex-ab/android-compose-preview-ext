package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIME2 device specifications for Android Compose previews.
 *
 * This extension provides TIME2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TIME2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TIME2: Any
  get() = object {
      /** TIME2 TP1060J */
      val TP1060J = "spec:width=800,height=1280,unit=px,dpi=160"

  }
