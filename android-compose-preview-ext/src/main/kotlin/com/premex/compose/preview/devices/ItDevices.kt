package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * it device specifications for Android Compose previews.
 *
 * This extension provides it device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.It.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.It: Any
  get() = object {
      /** it IT_1101S */
      val IT_1101S = "spec:width=800,height=1280,unit=px,dpi=160"

  }
