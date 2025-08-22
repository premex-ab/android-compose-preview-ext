package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * anyway-go device specifications for Android Compose previews.
 *
 * This extension provides anyway-go device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Anywaygo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Anywaygo: Any
  get() = object {
      /** anyway-go TP1040 */
      val TP1040 = "spec:width=800,height=1332,unit=px,dpi=160"

  }
