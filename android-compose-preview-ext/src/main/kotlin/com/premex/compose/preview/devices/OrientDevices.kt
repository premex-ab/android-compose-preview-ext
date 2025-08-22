package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ORIENT device specifications for Android Compose previews.
 *
 * This extension provides ORIENT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orient.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orient: Any
  get() = object {
      /** ORIENT R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ORIENT R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
