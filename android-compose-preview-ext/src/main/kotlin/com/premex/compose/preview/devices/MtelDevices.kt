package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mtel device specifications for Android Compose previews.
 *
 * This extension provides mtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mtel: Any
  get() = object {
      /** mtel HP44H-mtel */
      val HP44H_MTEL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
