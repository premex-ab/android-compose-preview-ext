package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wigor device specifications for Android Compose previews.
 *
 * This extension provides Wigor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wigor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wigor: Any
  get() = object {
      /** Wigor V5 */
      val V5 = "spec:width=720,height=1512,unit=px,dpi=320"

  }
