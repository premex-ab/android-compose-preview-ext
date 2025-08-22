package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RVP device specifications for Android Compose previews.
 *
 * This extension provides RVP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rvp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rvp: Any
  get() = object {
      /** RVP RVPVK808 */
      val RVPVK808 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
