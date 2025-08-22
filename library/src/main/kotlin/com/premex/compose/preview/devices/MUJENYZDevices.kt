package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MUJENYZ device specifications for Android Compose previews.
 *
 * This extension provides MUJENYZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MUJENYZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MUJENYZ: Any
  get() = object {
      /** MUJENYZ A9 */
      val A9 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
