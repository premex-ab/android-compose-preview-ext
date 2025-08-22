package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Samsonix device specifications for Android Compose previews.
 *
 * This extension provides Samsonix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samsonix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samsonix: Any
  get() = object {
      /** Samsonix A1250 */
      val A1250 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
