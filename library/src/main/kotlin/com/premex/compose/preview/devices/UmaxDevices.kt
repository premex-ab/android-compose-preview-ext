package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Umax device specifications for Android Compose previews.
 *
 * This extension provides Umax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Umax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Umax: Any
  get() = object {
      /** Umax 8Qa_3G */
      val _8QA_3G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
