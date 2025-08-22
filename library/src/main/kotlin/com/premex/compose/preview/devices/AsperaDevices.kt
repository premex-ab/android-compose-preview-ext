package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASPERA device specifications for Android Compose previews.
 *
 * This extension provides ASPERA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aspera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aspera: Any
  get() = object {
      /** ASPERA ASPERA_R10 */
      val ASPERA_R10 = "spec:width=720,height=1600,unit=px,dpi=240"

      /** ASPERA R9 */
      val R9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
