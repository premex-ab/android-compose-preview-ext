package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Postef device specifications for Android Compose previews.
 *
 * This extension provides Postef device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Postef.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Postef: Any
  get() = object {
      /** Postef RAISECOM_M6511 */
      val RAISECOM_M6511 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
