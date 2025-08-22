package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IUSA device specifications for Android Compose previews.
 *
 * This extension provides IUSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IUSA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IUSA: Any
  get() = object {
      /** IUSA TR10CS1_8 */
      val TR10CS1_8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
