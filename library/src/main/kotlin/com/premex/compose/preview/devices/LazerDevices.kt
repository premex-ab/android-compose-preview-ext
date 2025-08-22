package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAZER device specifications for Android Compose previews.
 *
 * This extension provides LAZER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lazer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lazer: Any
  get() = object {
      /** LAZER LZ_890 */
      val LZ_890 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
