package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUMUS device specifications for Android Compose previews.
 *
 * This extension provides LUMUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lumus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lumus: Any
  get() = object {
      /** LUMUS INNOSR545 */
      val INNOSR545 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LUMUS NEOSR620 */
      val NEOSR620 = "spec:width=720,height=1500,unit=px,dpi=320"

  }
