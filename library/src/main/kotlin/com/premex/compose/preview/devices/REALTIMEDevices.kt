package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REALTIME device specifications for Android Compose previews.
 *
 * This extension provides REALTIME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REALTIME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REALTIME: Any
  get() = object {
      /** REALTIME RS405 */
      val RS405 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
