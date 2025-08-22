package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aclas device specifications for Android Compose previews.
 *
 * This extension provides Aclas device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aclas.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aclas: Any
  get() = object {
      /** Aclas AO4 */
      val AO4 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
