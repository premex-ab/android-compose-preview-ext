package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PERFORMANCE device specifications for Android Compose previews.
 *
 * This extension provides PERFORMANCE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PERFORMANCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PERFORMANCE: Any
  get() = object {
      /** PERFORMANCE T7 */
      val T7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PERFORMANCE T9 */
      val T9 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
