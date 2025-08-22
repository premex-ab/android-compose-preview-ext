package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Coppernic device specifications for Android Compose previews.
 *
 * This extension provides Coppernic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coppernic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coppernic: Any
  get() = object {
      /** Coppernic C-One_v2 */
      val C_ONE_V2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
