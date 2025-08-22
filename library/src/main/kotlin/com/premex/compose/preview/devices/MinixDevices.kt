package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MINIX device specifications for Android Compose previews.
 *
 * This extension provides MINIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Minix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Minix: Any
  get() = object {
      /** MINIX DV8553 */
      val DV8553 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
